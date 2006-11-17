
// File generated by OpenXava: Fri Nov 17 13:21:10 CET 2006
// Archivo generado por OpenXava: Fri Nov 17 13:21:10 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Service		Entity/Entidad

package org.openxava.test.model.xejb;

import java.util.*;
import java.math.*;
import javax.ejb.*;
import javax.rmi.PortableRemoteObject;

import org.openxava.ejbx.*;
import org.openxava.util.*;
import org.openxava.component.*;
import org.openxava.model.meta.*;
import org.openxava.validators.ValidationException;

import org.openxava.test.model.*;


/**
 * @ejb:bean name="Service" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Service" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IService"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Service" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Service findByNumber(int number)" query="SELECT OBJECT(o) FROM Service o WHERE o.number = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Service findByNumber(int number)" query="SELECT OBJECT(o) FROM Service o WHERE o.number = ?1" 
 * 
 * @jboss:table-name "XAVATEST_SERVICE"
 *
 * @author Javier Paniza
 */
abstract public class ServiceBean extends EJBReplicableBase 
			implements org.openxava.test.model.IService, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.ServiceKey ejbCreate(Map values) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
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
	public org.openxava.test.model.ServiceKey ejbCreate(org.openxava.test.model.ServiceData data) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setData(data); 
		setNumber(data.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.ServiceData data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.ServiceKey ejbCreate(org.openxava.test.model.ServiceValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setServiceValue(value); 
		setNumber(value.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.ServiceValue value) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	public void ejbLoad() {
		creating = false;
		modified = false; 
	}
	
	public void ejbStore() {
		if (creating) {
			creating = false;
			return;
		}
		if (!modified) return; 
		
		modified = false;
	} 	
	

	public void ejbRemove() throws RemoveException { 						
	} 	
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter familyConverter;
	private org.openxava.converters.IConverter getFamilyConverter() {
		if (familyConverter == null) {
			try {
				familyConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("family");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "family"));
			}
			
		}	
		return familyConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "FAMILY"
	 */
	public abstract java.lang.Integer get_Family();
	public abstract void set_Family(java.lang.Integer newFamily); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getFamily() {
		try {
			return ((Integer) getFamilyConverter().toJava(get_Family())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Family", "Service", "int"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setFamily(int newFamily) {
		try { 
			this.modified = true; 
			set_Family((java.lang.Integer) getFamilyConverter().toDB(new Integer(newFamily)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Family", "Service", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter descriptionConverter;
	private org.openxava.converters.IConverter getDescriptionConverter() {
		if (descriptionConverter == null) {
			try {
				descriptionConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("description");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "description"));
			}
			
		}	
		return descriptionConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "DESCRIPTION"
	 */
	public abstract java.lang.String get_Description();
	public abstract void set_Description(java.lang.String newDescription); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getDescription() {
		try {
			return (String) getDescriptionConverter().toJava(get_Description());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Description", "Service", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setDescription(String newDescription) {
		try { 
			this.modified = true; 
			set_Description((java.lang.String) getDescriptionConverter().toDB(newDescription));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Description", "Service", "String"));
		}		
	} 
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "NUMBER"
	 */
	public abstract int getNumber();
	/**
	  * 
	  */
	public abstract void setNumber(int newNumber); 

	// Colecciones/Collections	

	private org.openxava.test.model.AdditionalDetailHome additionalDetailsHome; 
	/**
	 * @ejb:interface-method
	 */
	public java.util.Collection getAdditionalDetails() {		
		try {
			return getAdditionalDetailsHome().findByService(getNumber());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_collection_elements_error", "AdditionalDetails", "Service"));
		}
	}
		
	private org.openxava.test.model.AdditionalDetailHome getAdditionalDetailsHome() throws Exception{
		if (additionalDetailsHome == null) {
			additionalDetailsHome = (org.openxava.test.model.AdditionalDetailHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/AdditionalDetail"),
			 		org.openxava.test.model.AdditionalDetailHome.class);			 		
		}
		return additionalDetailsHome;
	}		

	// References/Referencias  	
	// Detail : Aggregate/Agregado 
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */ 
	public org.openxava.test.model.Detail getDetail() {
		org.openxava.test.model.Detail r = new org.openxava.test.model.Detail();		
		r.setFree(isDetail_free());		
		r.setType(getDetail_type());		
		r.setSubfamily(getDetail_subfamily()); 
		r.setTypeRef(getDetail_typeRef());		
		return r;
	} 	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */ 	 
	public void setDetail(org.openxava.test.model.Detail newDetail) throws java.rmi.RemoteException { 
		this.modified = true; 	
		if (newDetail == null) newDetail = new org.openxava.test.model.Detail();		
		setDetail_free(newDetail.getFree());		
		setDetail_type(newDetail.getType());		
		setDetail_subfamily(newDetail.getSubfamily());		
		setDetail_typeRef(newDetail.getTypeRef());			
	} 
	private static org.openxava.converters.IConverter detail_freeConverter;
	private org.openxava.converters.IConverter getDetail_freeConverter() {
		if (detail_freeConverter == null) {
			try {
				detail_freeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("detail_free");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "detail_free"));
			}
			
		}	
		return detail_freeConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "FREE"
	 */
	public abstract java.lang.Integer get_Detail_free();
	public abstract void set_Detail_free(java.lang.Integer newDetail_free); 	
	
	/**
	 * 
	 * 
	 */
	private boolean isDetail_free() {
		try {
			return ((Boolean) getDetail_freeConverter().toJava(get_Detail_free())).booleanValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Detail_free", "Detail", "boolean"));
		}
	}
	
	/**
	 * 
	 */
	private void setDetail_free(boolean newDetail_free) {
		try { 
			this.modified = true; 
			set_Detail_free((java.lang.Integer) getDetail_freeConverter().toDB(new Boolean(newDetail_free)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Detail_free", "Detail", "boolean"));
		}		
	} 
	private static org.openxava.converters.IConverter detail_typeConverter;
	private org.openxava.converters.IConverter getDetail_typeConverter() {
		if (detail_typeConverter == null) {
			try {
				detail_typeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("detail_type");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "detail_type"));
			}
			
		}	
		return detail_typeConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "TYPE"
	 */
	public abstract java.lang.Integer get_Detail_type();
	public abstract void set_Detail_type(java.lang.Integer newDetail_type); 	
	
	/**
	 * 
	 * 
	 */
	private int getDetail_type() {
		try {
			return ((Integer) getDetail_typeConverter().toJava(get_Detail_type())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Detail_type", "Detail", "int"));
		}
	}
	
	/**
	 * 
	 */
	private void setDetail_type(int newDetail_type) {
		try { 
			this.modified = true; 
			set_Detail_type((java.lang.Integer) getDetail_typeConverter().toDB(new Integer(newDetail_type)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Detail_type", "Detail", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter detail_subfamilyConverter;
	private org.openxava.converters.IConverter getDetail_subfamilyConverter() {
		if (detail_subfamilyConverter == null) {
			try {
				detail_subfamilyConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("detail_subfamily");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "detail_subfamily"));
			}
			
		}	
		return detail_subfamilyConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "SUBFAMILY"
	 */
	public abstract java.lang.Integer get_Detail_subfamily();
	public abstract void set_Detail_subfamily(java.lang.Integer newDetail_subfamily); 	
	
	/**
	 * 
	 * 
	 */
	private int getDetail_subfamily() {
		try {
			return ((Integer) getDetail_subfamilyConverter().toJava(get_Detail_subfamily())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Detail_subfamily", "Detail", "int"));
		}
	}
	
	/**
	 * 
	 */
	private void setDetail_subfamily(int newDetail_subfamily) {
		try { 
			this.modified = true; 
			set_Detail_subfamily((java.lang.Integer) getDetail_subfamilyConverter().toDB(new Integer(newDetail_subfamily)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Detail_subfamily", "Detail", "int"));
		}		
	} 

	// Detail_typeRef : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.IServiceType getDetail_typeRef() {
		try {		
			return getDetail_typeRefHome().findByPrimaryKey(getDetail_typeRefKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Detail_typeRef", "Detail"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ServiceTypeRemote getDetail_typeRefRemote() {
		return (org.openxava.test.model.ServiceTypeRemote) getDetail_typeRef();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setDetail_typeRef(org.openxava.test.model.IServiceType newDetail_typeRef) { 
		this.modified = true; 
		try {	
			if (newDetail_typeRef == null) setDetail_typeRefKey(null);
			else {
				if (newDetail_typeRef instanceof org.openxava.test.model.ServiceType) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.ServiceTypeRemote remote = (org.openxava.test.model.ServiceTypeRemote) newDetail_typeRef;
				setDetail_typeRefKey((org.openxava.test.model.ServiceTypeKey) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Detail_typeRef", "Detail"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ServiceTypeKey getDetail_typeRefKey() {				
		org.openxava.test.model.ServiceTypeKey key = new org.openxava.test.model.ServiceTypeKey(); 
		key.number = getDetail_typeRef_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setDetail_typeRefKey(org.openxava.test.model.ServiceTypeKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.ServiceTypeKey(); 
			setDetail_typeRef_number(key.number);					
		}
		else { 
			setDetail_typeRef_number(key.number);		
		}
	}
	/**		
	 * @ejb:interface-method
	 *
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getDetail_typeRef_number() {
		return getDetail_type();
	}
	public void setDetail_typeRef_number(int Detail_typeRef_number) {
	} 

	private org.openxava.test.model.ServiceTypeHome detail_typeRefHome;	
	private org.openxava.test.model.ServiceTypeHome getDetail_typeRefHome() throws Exception{
		if (detail_typeRefHome == null) {
			detail_typeRefHome = (org.openxava.test.model.ServiceTypeHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/ServiceType"),
			 		org.openxava.test.model.ServiceTypeHome.class);			 		
		}
		return detail_typeRefHome;
	} 

	// Methods/Metodos 

	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Service").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.ServiceData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.ServiceData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.ServiceValue getServiceValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setServiceValue(org.openxava.test.model.ServiceValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setFamily(0); 	
	} 		
}