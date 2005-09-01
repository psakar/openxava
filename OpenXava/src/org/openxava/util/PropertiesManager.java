package org.openxava.util;

import java.beans.*;
import java.lang.reflect.*;
import java.util.*;

/**
 * Manages with reflection the properties of a object. <p> 
 *
 * Excludes automatically the property <code>class</code> of <code>Object</code>
 * and the indexed properties with no indexed access.<br>
 *
 * @author  Javier Paniza
 */

public class PropertiesManager implements java.io.Serializable {

	private transient Map propertyDescriptors;
	private Object object;
	private Class theClass;

	public PropertiesManager() {
	}

	/**
	 * Constructor from a the class of the object to manage. <o> 
	 *
	 * This initial value can change in the life of <code>this</code>.
	 */
	public PropertiesManager(Class theClass) {
		this.theClass = theClass;
	}
	

	/**
	 * Constructor from the object to manage. <p> 
	 *
	 * @param object  Object to manage
	 */
	public PropertiesManager(Object object) {
		this.object = object;
	}
	
	/**
	 * Gets the value of the indicated property. <p>
	 *
	 * <p>Precondition</b>
	 * <ul>
	 * <li> <tt>this.object != null</tt>
	 * <li> <tt>this.hasGetter(propertyName)</tt>
	 * </ul>
	 *
	 * @param propertyName  Property name to obtain its value
	 * @return Value of the property
	 * @exception InvocationTargetException  Excepci�n originated by the original access method
	 * @exception PropertiesManagerException  Some unexpected problem
	 */
	public Object executeGet(String propertyName)
		throws InvocationTargetException, PropertiesManagerException {
		try {
			PropertyDescriptor pd = getPropertyDescriptor(propertyName);
			Method met = pd.getReadMethod();
			if (met == null) {
				throw new PropertiesManagerException(
					XavaResources.getString("write_only_property", propertyName, getTheClass()));
			}
			return met.invoke(object, null);
		}
		catch (PropertiesManagerException ex) {
			throw ex;
		}
		catch (InvocationTargetException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new PropertiesManagerException(
					XavaResources.getString("get_property_error", propertyName));
		}
	}
	
	/**
	 * Gets a group of property values in a map. <p> 
	 *
	 * <p>Precondition</b>
	 * <ul>
	 * <li> <tt>this.object != null</tt>
	 * </ul>
	 *
	 * @param properties  Names of properties to get, separated by colon (:).
	 * 		The properties must to exist in the object. If properties is null
	 * 		a empty map is returned.
	 * @return  Map with <tt>String propertyName:Object value</tt>. Not null.
	 * @exception InvocationTargetException  Exception originated by original access method
	 * @exception PropertiesManagerException  Some unexpected problem
	 */
	public Map executeGets(String properties)
		throws InvocationTargetException, PropertiesManagerException {
		Map rs = new HashMap();
		if (properties == null)
			return rs;
		Iterator iproperties =
			stringToArrayString(properties).iterator();
		while (iproperties.hasNext()) {
			String name = (String) iproperties.next();
			Object value = executeGet(name);
			rs.put(name, value);
		}
		return rs;
	}
	
	/**
	 * Update property. <p>
	 *
	 * <p>Precondition</b>
	 * <ul>
	 * <li> <tt>this.object != null</tt>
	 * </ul>   
	 *
	 * @param propertyName Property name to update
	 * @param value  New value for property. Has to be of compatible type. If value is a Map
	 * 		and the property type is not a map then convert the map in an object of the property
	 * 		type.
	 * @exception InvocationTargetException  Excepction originated from original access method
	 * @exception PropertiesManagerException  Any unexpected problem
	 */
	public void executeSet(String propertyName, Object value)
		throws InvocationTargetException, PropertiesManagerException {
		Method met = null;
		PropertyDescriptor pd = null; 	
		try {
			pd = getPropertyDescriptor(propertyName);
			met = pd.getWriteMethod();
			if (met == null) {
				throw new PropertiesManagerException(
						XavaResources.getString("read_only_property", propertyName, getTheClass()));
			}

			if (value == null && pd.getPropertyType().isPrimitive()) {
				value = nullToDefaultValue(pd.getPropertyType());
			}
			else if (value instanceof Map && !Map.class.isAssignableFrom(pd.getPropertyType())) {
				value = mapToObject(pd.getPropertyType(), (Map) value);
			}
			Object[] arg = { value };

			met.invoke(object, arg);
		}
		catch (PropertiesManagerException ex) {
			throw ex;
		}
		catch (IllegalArgumentException ex) {			
			Object number = tryConvertInNumber(pd.getPropertyType(), value);  			
			if (number != null) {
				Object [] arg = { number };
				try {
					met.invoke(object, arg);
				}
				catch (Exception ex2) {
					ex.printStackTrace();
					throw new PropertiesManagerException(
							XavaResources.getString("set_property_error", propertyName));
				}				
			}
			else {
				throw ex;
			} 			
		}
		catch (InvocationTargetException ex) {
			throw ex; 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new PropertiesManagerException(
					XavaResources.getString("set_property_error", propertyName));
		}
	}

	private Object mapToObject(Class propertyType, Map values) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, PropertiesManagerException {
		Class objectClass = null;
		if (propertyType.isInterface()) {
			String className = Strings.change(propertyType.getName(), ".I", ".");
			objectClass = Class.forName(className);
		}
		else {
			objectClass = propertyType;
		}
		Object object = objectClass.newInstance();
		PropertiesManager pm = new PropertiesManager(object);
		pm.executeSets(values);
		return object;
	}

	/**
	 * Update property from a string, making needed conversions. <p>
	 *
	 * <p>Precondition</b>
	 * <ul>
	 * <li> <tt>this.object != null</tt>
	 * </ul>   
	 *
	 * @param propertyName  Name of property to update
	 * @param value  New value for property. Must to be a compatible type or a string
	 * 		parseable to a compatible type.
	 * @exception InvocationTargetException  Exception from original access method
	 * @exception PropertiesManagerException  Any unexpected problem
	 */
	public void executeSetFromString(String propertyName, Object value)
		throws InvocationTargetException, PropertiesManagerException {
		try {
			PropertyDescriptor pd = getPropertyDescriptor(propertyName);
			Method met = pd.getWriteMethod();
			if (met == null) {
				throw new PropertiesManagerException(
						XavaResources.getString("read_only_property", propertyName, getTheClass()));
			}

			if (value == null && pd.getPropertyType().isPrimitive()) {
				value = nullToDefaultValue(pd.getPropertyType());
			}
			Class type = pd.getPropertyType();
			if (value instanceof String && !type.equals(String.class)) {
				value = Strings.toObject(type, (String) value);
			}
			Object[] arg = { value };

			met.invoke(object, arg);
		}
		catch (PropertiesManagerException ex) {
			throw ex;
		}
		catch (InvocationTargetException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new PropertiesManagerException(
					XavaResources.getString("set_property_error", propertyName));
		}
	}

	private Object nullToDefaultValue(Class type) {
		if (type.equals(java.lang.Integer.TYPE)) {
			return new Integer(0);
		}
		else if (type.equals(java.lang.Long.TYPE)) {
			return new Long(0);
		}
		else if (type.equals(java.lang.Short.TYPE)) {
			return new Short((short) 0);
		}
		else if (type.equals(java.lang.Boolean.TYPE)) {
			return new Boolean(false);
		}
		else if (type.equals(java.lang.Double.TYPE)) {
			return new Double(0);
		}
		else if (type.equals(java.lang.Float.TYPE)) {
			return new Float(0);
		}
		else if (type.equals(java.lang.Byte.TYPE)) {
			return new Byte((byte) 0);
		}
		return null;
	}

	/**
	 * Sets property values from a map. <p> 
	 *
	 * <p>Precondition</b>
	 * <ul>
	 * <li> <tt>this.object != null</tt>
	 * <li> <tt>this.hasSetter(propertyName)</tt>   
	 * </ul>   
	 * Supports nested Maps. <br>
	 * 
	 * @param properties Map with <tt>String propertyName:Object value</tt>.
	 *                               Null is assumed as empty map
	 * @exception InvocationTargetException  Excepcion from original access method
	 * @exception PropertiesManagerException  Any unexpected method
	 */
	public void executeSets(Map properties)
		throws InvocationTargetException, PropertiesManagerException {
		if (properties == null)
			return;
		Iterator ipro = properties.entrySet().iterator();
		while (ipro.hasNext()) {
			Map.Entry e = (Map.Entry) ipro.next();
			executeSet((String) e.getKey(), e.getValue());
		}
	}

	/**
	 * Sets property values from a map, trying to convert strings to value of
	 * valid type for properties. <p> 
	 *
	 * <p>Precondition</b>
	 * <ul>
	 * <li> <tt>this.object != null</tt>
	 * <li> <tt>this.hasSetter(propertyName)</tt>   
	 * </ul>   
	 *
	 * @param properties Map with <tt>String propertyName:Object value</tt>.
	 *                               Null is assumed as empty map
	 * @exception InvocationTargetException  Excepcion from original access method
	 * @exception PropertiesManagerException  Any unexpected method
	 */
	public void executeSetsFromStrings(Map properties)
		throws InvocationTargetException, PropertiesManagerException {
		if (properties == null)
			return;
		Iterator ipro = properties.entrySet().iterator();
		while (ipro.hasNext()) {
			Map.Entry e = (Map.Entry) ipro.next();
			executeSetFromString((String) e.getKey(), e.getValue());
		}
	}

	/**
	 * If the property exists.
	 */
	public boolean exists(String propertyName)
		throws PropertiesManagerException {
		return getPropertyDescriptors().containsKey(propertyName);
	}
	
	private Class getTheClass() {
		if (theClass == null) {
			if (object == null) {
				throw new IllegalStateException(XavaResources.getString("properties_manager_object_required"));
			}
			theClass = object.getClass();
		}
		return theClass;
	}
	
	/**
	 * Names of all properties managed by <code>this</code>. <p>
	 * 
	 * @return Not null
	 */
	public String[] getPropertiesNames()
		throws PropertiesManagerException {
		Map pd = getPropertyDescriptors();
		int c = pd.size();
		String[] result = new String[c];
		Iterator it = pd.keySet().iterator();
		for (int i = 0; i < c; i++) {
			result[i] = (String) it.next();
		}
		return result;
	}
	
	/**
	 * Names of all properties managed by <code>this</code> with <i>setter</i> method. <p>
	 * 
	 * @return Not null
	 */
	public String[] getWritablesPropertiesNames()
		throws PropertiesManagerException {
		Map pd = getPropertyDescriptors();
		int c = pd.size();
		Collection result = new ArrayList();
		Iterator it = pd.keySet().iterator();
		for (int i = 0; i < c; i++) {
			String name = (String) it.next();
			if (hasSetter(name)) {
				result.add(name);
			}
		}
		String[] rs = new String[result.size()];
		result.toArray(rs);
		return rs;
	}
	
	/**
	 * Names of all properties managed by <code>this</code> with <i>getter</i> method. <p>
	 * 
	 * @return Not null
	 */
	public String[] getReadablesPropertiesNames()
		throws PropertiesManagerException {
		Map pd = getPropertyDescriptors();
		int c = pd.size();
		Collection result = new ArrayList();
		Iterator it = pd.keySet().iterator();
		for (int i = 0; i < c; i++) {
			String name = (String) it.next();
			if (hasGetter(name)) {
				result.add(name);
			}
		}
		String[] rs = new String[result.size()];
		result.toArray(rs);
		return rs;
	}
	
	/**
	 * Object of which the properties are handled.
	 */
	public java.lang.Object getObject() {
		return object;
	}
	
	public PropertyDescriptor getPropertyDescriptor(String propertyName)
		throws PropertiesManagerException {
		PropertyDescriptor rs =
			(PropertyDescriptor) getPropertyDescriptors().get(propertyName);
		if (rs == null) {
			throw new PropertiesManagerException(
				XavaResources.getString("property_not_found", propertyName, getTheClass().getName())); 
		}
		return rs;
	}
	
	private Map getPropertyDescriptors() throws PropertiesManagerException {
		if (propertyDescriptors == null) {
			try {
				propertyDescriptors = new HashMap();
				BeanInfo info = Introspector.getBeanInfo(getTheClass());
				PropertyDescriptor[] pds = info.getPropertyDescriptors();
				for (int i = 0; i < pds.length; i++) {
					if (!(pds[i].getName().equals("class")
						|| pds[i].getPropertyType() == null)) {
						propertyDescriptors.put(pds[i].getName(), pds[i]);
					}
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new PropertiesManagerException(XavaResources.getString("properties_manager_properties_error"));
			}
		}
		return propertyDescriptors;
	}
	
	/**
	 * Object of which the properties are handled.
	 */
	public void setObject(java.lang.Object newObject) {
		if (theClass == null || !theClass.isInstance(newObject)) {
			theClass = null;
			propertyDescriptors = null;
		}
		object = newObject;
	}
	
	// of String
	// assert(properties)
	private Collection stringToArrayString(String properties) {
		Collection rs = new Vector();
		StringTokenizer st = new StringTokenizer(properties, ":");
		while (st.hasMoreTokens()) {
			rs.add(st.nextToken());
		}
		return rs;
	}
	
	/**
	 * If the property has <i>getter</i>. <p>
	 */
	public boolean hasGetter(String propertyName)
		throws PropertiesManagerException {
		return getPropertyDescriptor(propertyName).getReadMethod() != null;
	}
	
	/**
	 * If the property has <i>setter</i>. <p>
	 */
	public boolean hasSetter(String propertyName)
		throws PropertiesManagerException {
		return getPropertyDescriptor(propertyName).getWriteMethod() != null;
	}
	
	private Object tryConvertInNumber(Class type, Object o)  {
		if (!(o instanceof Number)) return null;
		Number value = (Number) o;		
		if (type.equals(int.class)) {
			return new Integer(value.intValue());
		}
		else if (type.equals(Integer.class)) {
			return new Integer(value.intValue());
		}
		else if (type.equals(long.class)) {
			return new Long(value.longValue());
		}
		else if (type.equals(Long.class)) {
			return new Long(value.longValue());
		}
		else if (type.equals(float.class)) {
			return new Float(value.floatValue());
		}
		else if (type.equals(Float.class)) {
			return new Float(value.floatValue());
		}
		else if (type.equals(double.class)) {
			return new Double(value.doubleValue());
		}
		else if (type.equals(Double.class)) {
			return new Double(value.doubleValue());
		}
		else if (type.equals(short.class)) {
			return new Short(value.shortValue());
		}
		else if (type.equals(Short.class)) {
			return new Short(value.shortValue());
		}
		else if (type.equals(byte.class)) {
			return new Byte(value.byteValue());
		}
		else if (type.equals(Byte.class)) {
			return new Byte(value.byteValue());
		}
		return null;
	}
	
}
