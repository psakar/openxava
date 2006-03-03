
// File generated by OpenXava: Fri Mar 03 16:35:33 CET 2006
// Archivo generado por OpenXava: Fri Mar 03 16:35:33 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Aggregate/Agregado: DeliveryPlace

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
 * @ejb:bean name="DeliveryPlace" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/DeliveryPlace" reentrant="true" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IDeliveryPlace"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="DeliveryPlace" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Collection findByCustomer(int number)" query="SELECT OBJECT(o) FROM DeliveryPlace o WHERE o._Customer_number = ?1 " view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByCustomer(int number)" query="SELECT OBJECT(o) FROM DeliveryPlace o WHERE o._Customer_number = ?1 " 	
 * @ejb:finder signature="Collection findByPreferredWarehouse(java.lang.Integer number, int zoneNumber)" query="SELECT OBJECT(o) FROM DeliveryPlace o WHERE o._PreferredWarehouse_number = ?1 AND o._PreferredWarehouse_zoneNumber = ?2 " view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByPreferredWarehouse(java.lang.Integer number, int zoneNumber)" query="SELECT OBJECT(o) FROM DeliveryPlace o WHERE o._PreferredWarehouse_number = ?1 AND o._PreferredWarehouse_zoneNumber = ?2 " 
 * 
 * @jboss:table-name "XAVATEST_DELIVERYPLACE"
 *
 * @author Javier Paniza
 */
abstract public class DeliveryPlaceBean extends EJBReplicableBase 
			implements org.openxava.test.model.IDeliveryPlace, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */ 
	public org.openxava.test.model.DeliveryPlaceKey ejbCreate(org.openxava.test.model.CustomerRemote container, int counter, Map values) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		executeSets(values); 
		org.openxava.test.model.CustomerKey containerKey = null;
		try {
			containerKey = (org.openxava.test.model.CustomerKey) container.getPrimaryKey();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("obtain_primary_key_error_on_create", "Customer", "DeliveryPlace"));
		} 
		setCustomer_number(containerKey.number); 
		try { 	
			org.openxava.calculators.UUIDCalculator oidCalculator = (org.openxava.calculators.UUIDCalculator)
				getMetaModel().getMetaProperty("oid").getMetaCalculatorDefaultValue().createCalculator(); 
			oidCalculator.setEntity(this); 
			setOid((String) oidCalculator.calculate()); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "DeliveryPlace", ex.getLocalizedMessage()));
		} 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.CustomerRemote container, int counter, Map values) 
		throws
			CreateException,
			ValidationException { 
	} 
	/**
	 * @ejb:create-method
	 */
	public org.openxava.test.model.DeliveryPlaceKey ejbCreate(org.openxava.test.model.CustomerKey containerKey, int counter, Map values)	
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;
		modified = false;
		executeSets(values); 
		setCustomer_number(containerKey.number); 
		try { 	
			org.openxava.calculators.UUIDCalculator oidCalculator = (org.openxava.calculators.UUIDCalculator)
				getMetaModel().getMetaProperty("oid").getMetaCalculatorDefaultValue().createCalculator(); 
			oidCalculator.setEntity(this); 
			setOid((String) oidCalculator.calculate()); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "DeliveryPlace", ex.getLocalizedMessage()));
		} 
			
		return null;
	}

	public void ejbPostCreate(org.openxava.test.model.CustomerKey containerKey, int counter, Map values)	
		throws
			CreateException,
			ValidationException { 
	} 
	
	/**
	 * @ejb:create-method
	 */ 
	public org.openxava.test.model.DeliveryPlaceKey ejbCreate(org.openxava.test.model.CustomerRemote container, int counter, org.openxava.test.model.DeliveryPlaceData data) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setData(data); 
		org.openxava.test.model.CustomerKey containerKey = null;
		try {
			containerKey = (org.openxava.test.model.CustomerKey) container.getPrimaryKey();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("obtain_primary_key_error_on_create", "Customer", "DeliveryPlace"));
		} 
		setCustomer_number(containerKey.number); 
		try { 	
			org.openxava.calculators.UUIDCalculator oidCalculator= (org.openxava.calculators.UUIDCalculator)
				getMetaModel().getMetaProperty("oid").getMetaCalculatorDefaultValue().createCalculator(); 
			oidCalculator.setEntity(this); 
			setOid((String) oidCalculator.calculate()); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "DeliveryPlace", ex.getLocalizedMessage()));
		} 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.CustomerRemote container, int counter, org.openxava.test.model.DeliveryPlaceData data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */ 
	public org.openxava.test.model.DeliveryPlaceKey ejbCreate(org.openxava.test.model.CustomerRemote container, int counter, org.openxava.test.model.DeliveryPlaceValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setDeliveryPlaceValue(value); 
		setOid(value.getOid()); 
		org.openxava.test.model.CustomerKey containerKey = null;
		try {
			containerKey = (org.openxava.test.model.CustomerKey) container.getPrimaryKey();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("obtain_primary_key_error_on_create", "Customer", "DeliveryPlace"));
		} 
		setCustomer_number(containerKey.number); 
		try { 	
			org.openxava.calculators.UUIDCalculator oidCalculator = (org.openxava.calculators.UUIDCalculator)
				getMetaModel().getMetaProperty("oid").getMetaCalculatorDefaultValue().createCalculator(); 
			oidCalculator.setEntity(this); 
			setOid((String) oidCalculator.calculate()); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "DeliveryPlace", ex.getLocalizedMessage()));
		} 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.CustomerRemote container, int counter, org.openxava.test.model.DeliveryPlaceValue value) 
		throws
			CreateException,
			ValidationException { 			
	}	 
	/**
	 * @ejb:create-method
	 */
	public org.openxava.test.model.DeliveryPlaceKey ejbCreate(org.openxava.test.model.CustomerKey containerKey, int counter, org.openxava.test.model.DeliveryPlaceValue value)
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;
		modified = false;
		setDeliveryPlaceValue(value); 
		setOid(value.getOid());
		setCustomer_number(containerKey.number); 
		try { 
			org.openxava.calculators.UUIDCalculator oidCalculator= (org.openxava.calculators.UUIDCalculator)
				getMetaModel().getMetaProperty("oid").getMetaCalculatorDefaultValue().createCalculator(); 
			oidCalculator.setEntity(this); 
			setOid((String) oidCalculator.calculate());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "DeliveryPlace", ex.getLocalizedMessage()));
		} 
		return null;					

	} 
	public void ejbPostCreate(org.openxava.test.model.CustomerKey containerKey, int counter, org.openxava.test.model.DeliveryPlaceValue value)	
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
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "OID"
	 */
	public abstract String getOid();
	/**
	  * 
	  */
	public abstract void setOid(String newOid); 
	private org.openxava.converters.IConverter remarksConverter;
	private org.openxava.converters.IConverter getRemarksConverter() {
		if (remarksConverter == null) {
			try {
				remarksConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("remarks");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "remarks"));
			}
			
		}	
		return remarksConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "REMARKS"
	 */
	public abstract java.lang.String get_Remarks();
	public abstract void set_Remarks(java.lang.String newRemarks); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getRemarks() {
		try {
			return (String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Remarks", "DeliveryPlace", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setRemarks(String newRemarks) {
		try { 
			this.modified = true; 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Remarks", "DeliveryPlace", "String"));
		}		
	} 
	private org.openxava.converters.IConverter addressConverter;
	private org.openxava.converters.IConverter getAddressConverter() {
		if (addressConverter == null) {
			try {
				addressConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("address");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "address"));
			}
			
		}	
		return addressConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "ADDRESS"
	 */
	public abstract java.lang.String get_Address();
	public abstract void set_Address(java.lang.String newAddress); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getAddress() {
		try {
			return (String) getAddressConverter().toJava(get_Address());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Address", "DeliveryPlace", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setAddress(String newAddress) {
		try { 
			this.modified = true; 
			set_Address((java.lang.String) getAddressConverter().toDB(newAddress));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Address", "DeliveryPlace", "String"));
		}		
	} 
	private org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "DeliveryPlace", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setName(String newName) {
		try { 
			this.modified = true; 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "DeliveryPlace", "String"));
		}		
	} 

	// Colecciones/Collections	

	private org.openxava.test.model.ReceptionistHome receptionistsHome; 
	/**
	 * @ejb:interface-method
	 */
	public java.util.Collection getReceptionists() {		
		try {
			return getReceptionistsHome().findByDeliveryPlace(getOid());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_collection_elements_error", "Receptionists", "DeliveryPlace"));
		}
	}
		
	private org.openxava.test.model.ReceptionistHome getReceptionistsHome() throws Exception{
		if (receptionistsHome == null) {
			receptionistsHome = (org.openxava.test.model.ReceptionistHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Receptionist"),
			 		org.openxava.test.model.ReceptionistHome.class);			 		
		}
		return receptionistsHome;
	}		

	// References/Referencias 

	// Customer : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ICustomer getCustomer() {
		try {		
			return getCustomerHome().findByPrimaryKey(getCustomerKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Customer", "DeliveryPlace"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.CustomerRemote getCustomerRemote() {
		return (org.openxava.test.model.CustomerRemote) getCustomer();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setCustomer(org.openxava.test.model.ICustomer newCustomer) { 
		this.modified = true; 
		try {	
			if (newCustomer == null) setCustomerKey(null);
			else {
				org.openxava.test.model.CustomerRemote remote = (org.openxava.test.model.CustomerRemote) newCustomer;
				setCustomerKey((org.openxava.test.model.CustomerKey) remote.getPrimaryKey());
			}	
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Customer", "DeliveryPlace"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.CustomerKey getCustomerKey() {				
		org.openxava.test.model.CustomerKey key = new org.openxava.test.model.CustomerKey(); 
		key.number = getCustomer_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setCustomerKey(org.openxava.test.model.CustomerKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.CustomerKey();
		} 
		setCustomer_number(key.number);		
		
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "CUSTOMER"
	 */
	public abstract int get_Customer_number();
	public abstract void set_Customer_number(int newCustomer_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getCustomer_number() { 
		return get_Customer_number(); 
	}
	public void setCustomer_number(int newCustomer_number) { 
		set_Customer_number(newCustomer_number); 	
	} 

	private org.openxava.test.model.CustomerHome customerHome;	
	private org.openxava.test.model.CustomerHome getCustomerHome() throws Exception{
		if (customerHome == null) {
			customerHome = (org.openxava.test.model.CustomerHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Customer"),
			 		org.openxava.test.model.CustomerHome.class);			 		
		}
		return customerHome;
	} 

	// PreferredWarehouse : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.IWarehouse getPreferredWarehouse() {
		try {		
			return getPreferredWarehouseHome().findByPrimaryKey(getPreferredWarehouseKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "PreferredWarehouse", "DeliveryPlace"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseRemote getPreferredWarehouseRemote() {
		return (org.openxava.test.model.WarehouseRemote) getPreferredWarehouse();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setPreferredWarehouse(org.openxava.test.model.IWarehouse newPreferredWarehouse) { 
		this.modified = true; 
		try {	
			if (newPreferredWarehouse == null) setPreferredWarehouseKey(null);
			else {
				org.openxava.test.model.WarehouseRemote remote = (org.openxava.test.model.WarehouseRemote) newPreferredWarehouse;
				setPreferredWarehouseKey((org.openxava.test.model.WarehouseKey) remote.getPrimaryKey());
			}	
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "PreferredWarehouse", "DeliveryPlace"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseKey getPreferredWarehouseKey() {				
		org.openxava.test.model.WarehouseKey key = new org.openxava.test.model.WarehouseKey(); 
		key._Number = getPreferredWarehouse_number(); 
		key.zoneNumber = getPreferredWarehouse_zoneNumber();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setPreferredWarehouseKey(org.openxava.test.model.WarehouseKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.WarehouseKey();
		} 
		setPreferredWarehouse_number(key._Number); 
		setPreferredWarehouse_zoneNumber(key.zoneNumber);		
		
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "WAREHOUSE_ZONE"
	 */
	public abstract int get_PreferredWarehouse_zoneNumber();
	public abstract void set_PreferredWarehouse_zoneNumber(int newPreferredWarehouse_zoneNumber);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getPreferredWarehouse_zoneNumber() { 
		return get_PreferredWarehouse_zoneNumber(); 
	}
	public void setPreferredWarehouse_zoneNumber(int newPreferredWarehouse_zoneNumber) { 
		set_PreferredWarehouse_zoneNumber(newPreferredWarehouse_zoneNumber); 	
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "WAREHOUSE_NUMBER"
	 */
	public abstract java.lang.Integer get_PreferredWarehouse_number();
	public abstract void set_PreferredWarehouse_number(java.lang.Integer newPreferredWarehouse_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public java.lang.Integer getPreferredWarehouse_number() { 
		return get_PreferredWarehouse_number(); 
	}
	public void setPreferredWarehouse_number(java.lang.Integer newPreferredWarehouse_number) { 
		set_PreferredWarehouse_number(newPreferredWarehouse_number); 	
	} 

	private org.openxava.test.model.WarehouseHome preferredWarehouseHome;	
	private org.openxava.test.model.WarehouseHome getPreferredWarehouseHome() throws Exception{
		if (preferredWarehouseHome == null) {
			preferredWarehouseHome = (org.openxava.test.model.WarehouseHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Warehouse"),
			 		org.openxava.test.model.WarehouseHome.class);			 		
		}
		return preferredWarehouseHome;
	} 

	// Methods/Metodos 

	private MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Customer").getMetaAggregate("DeliveryPlace"); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.DeliveryPlaceData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.DeliveryPlaceData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.DeliveryPlaceValue getDeliveryPlaceValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setDeliveryPlaceValue(org.openxava.test.model.DeliveryPlaceValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setOid(null); 
		setName(null); 
		setAddress(null); 
		setRemarks(null); 
		setCustomerKey(null); 
		setPreferredWarehouseKey(null); 	
	} 		
}