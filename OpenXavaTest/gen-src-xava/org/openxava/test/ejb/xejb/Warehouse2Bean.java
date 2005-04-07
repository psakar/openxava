
// File generated by OpenXava: Thu Apr 07 11:10:37 CEST 2005
// Archivo generado por OpenXava: Thu Apr 07 11:10:37 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Warehouse2		Entity/Entidad

package org.openxava.test.ejb.xejb;

import java.util.*;
import java.math.*;
import javax.ejb.*;
import javax.rmi.PortableRemoteObject;

import org.openxava.ejbx.*;
import org.openxava.util.*;
import org.openxava.component.*;
import org.openxava.model.meta.*;
import org.openxava.validators.ValidationException;

import org.openxava.test.ejb.*;


/**
 * @ejb:bean name="Warehouse2" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.ejb/Warehouse2" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.ejb.IWarehouse2"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Warehouse2" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 
 * 
 * @jboss:table-name "XAVATEST_WAREHOUSE"
 *
 * @author Javier Paniza
 */
abstract public class Warehouse2Bean extends EJBReplicableBase 
			implements org.openxava.test.ejb.IWarehouse2, EntityBean {	
			
	private boolean creating = false;		

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.ejb.Warehouse2Key ejbCreate(Map values) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		executeSets(values); 
			
		return null;
	} 
	public void ejbPostCreate(Map values) 
		throws
			CreateException,
			ValidationException { 
	} 
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.ejb.Warehouse2Key ejbCreate(org.openxava.test.ejb.Warehouse2Data data) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		setData(data);  
		set_Number(data.get_Number()); 
		setZoneNumber(data.getZoneNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.ejb.Warehouse2Data data) 
		throws
			CreateException,
			ValidationException {			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.ejb.Warehouse2Key ejbCreate(org.openxava.test.ejb.Warehouse2Value value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		setWarehouse2Value(value); 
		setNumber(value.getNumber()); 
		setZoneNumber(value.getZoneNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.ejb.Warehouse2Value value) 
		throws
			CreateException,
			ValidationException {			
	}
	
	public void ejbLoad() {
		creating = false;
	}
	
	public void ejbStore() {
		if (creating) {
			creating = false;
			return;
		}			
	} 	
	
	// Properties/Propiedades 
	private org.openxava.converters.TrimStringConverter nameConverter;
	private org.openxava.converters.TrimStringConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.TrimStringConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "NAME"
	 */
	public abstract java.lang.String get_Name();
	public abstract void set_Name(java.lang.String newName); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Warehouse2", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setName(String newName) {
		try {
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Warehouse2", "String"));
		}		
	} 
	private org.openxava.converters.IntegerNumberConverter numberConverter;
	private org.openxava.converters.IntegerNumberConverter getNumberConverter() {
		if (numberConverter == null) {
			try {
				numberConverter = (org.openxava.converters.IntegerNumberConverter) 
					getMetaModel().getMapping().getConverter("number");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "number"));
			}
			
		}	
		return numberConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @jboss:column-name "NUMBER"
	 */
	public abstract java.lang.Integer get_Number();
	public abstract void set_Number(java.lang.Integer newNumber); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getNumber() {
		try {
			return ((Integer) getNumberConverter().toJava(get_Number())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Number", "Warehouse2", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setNumber(int newNumber) {
		try {
			set_Number((java.lang.Integer) getNumberConverter().toDB(new Integer(newNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Number", "Warehouse2", "int"));
		}		
	} 
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "ZONE"
	 */
	public abstract int getZoneNumber();
	/**
	  * 
	  */
	public abstract void setZoneNumber(int newZoneNumber); 

	// Colecciones/Collections		

	// References/Referencias 
	// Methods/Metodos 

	private MetaModel metaModel;
	private MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Warehouse2").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.ejb.Warehouse2Data getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.ejb.Warehouse2Data data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.ejb.Warehouse2Value getWarehouse2Value();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setWarehouse2Value(org.openxava.test.ejb.Warehouse2Value value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	}
	
	private void initMembers() { 
		setZoneNumber(0); 
		setNumber(0); 
		setName(null); 
	}
		
}