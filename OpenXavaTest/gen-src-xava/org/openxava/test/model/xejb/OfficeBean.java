
// File generated by OpenXava: Tue Apr 15 17:29:09 CEST 2008
// Archivo generado por OpenXava: Tue Apr 15 17:29:09 CEST 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Office		Entity/Entidad

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
 * @ejb:bean name="Office" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Office" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IOffice"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Office" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Collection findByOfficeManager(int zoneNumber, int officeNumber, int number)" query="SELECT OBJECT(o) FROM Office o WHERE o._ZoneNumber = ?1 AND o.number = ?2 AND o._OfficeManager_number = ?3 ORDER BY o.number" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByOfficeManager(int zoneNumber, int officeNumber, int number)" query="SELECT OBJECT(o) FROM Office o WHERE o._ZoneNumber = ?1 AND o.number = ?2 AND o._OfficeManager_number = ?3 ORDER BY o.number" 	
 * @ejb:finder signature="Collection findByDefaultCarrier(java.lang.Integer number)" query="SELECT OBJECT(o) FROM Office o WHERE o._DefaultCarrier_number = ?1 ORDER BY o.number" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByDefaultCarrier(java.lang.Integer number)" query="SELECT OBJECT(o) FROM Office o WHERE o._DefaultCarrier_number = ?1 ORDER BY o.number" 	
 * @ejb:finder signature="Collection findByMainWarehouse(int zoneNumber, java.lang.Integer number)" query="SELECT OBJECT(o) FROM Office o WHERE o._ZoneNumber = ?1 AND o._MainWarehouse_number = ?2 ORDER BY o.number" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByMainWarehouse(int zoneNumber, java.lang.Integer number)" query="SELECT OBJECT(o) FROM Office o WHERE o._ZoneNumber = ?1 AND o._MainWarehouse_number = ?2 ORDER BY o.number" 	
 * @ejb:finder signature="Office findByNumber(int number)" query="SELECT OBJECT(o) FROM Office o WHERE o.number = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Office findByNumber(int number)" query="SELECT OBJECT(o) FROM Office o WHERE o.number = ?1" 
 * 
 * @jboss:table-name "XAVATEST.OFFICE"
 *
 * @author Javier Paniza
 */
abstract public class OfficeBean extends EJBReplicableBase 
			implements org.openxava.test.model.IOffice, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.OfficeKey ejbCreate(Map values) 
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
	public org.openxava.test.model.OfficeKey ejbCreate(org.openxava.test.model.OfficeData data) 
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
	public void ejbPostCreate(org.openxava.test.model.OfficeData data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.OfficeKey ejbCreate(org.openxava.test.model.OfficeValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setOfficeValue(value); 
		setNumber(value.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.OfficeValue value) 
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
	private static org.openxava.converters.IConverter receptionistConverter;
	private org.openxava.converters.IConverter getReceptionistConverter() {
		if (receptionistConverter == null) {
			try {
				receptionistConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("receptionist");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "receptionist"));
			}
			
		}	
		return receptionistConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "RECEPTIONIST_OID"
	 */
	public abstract java.lang.Integer get_Receptionist();
	public abstract void set_Receptionist(java.lang.Integer newReceptionist); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getReceptionist() {
		try {
			return ((Integer) getReceptionistConverter().toJava(get_Receptionist())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Receptionist", "Office", "int"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setReceptionist(int newReceptionist) {
		try { 
			this.modified = true; 
			set_Receptionist((java.lang.Integer) getReceptionistConverter().toDB(new Integer(newReceptionist)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Receptionist", "Office", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter nameConverter;
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Office", "String"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Office", "String"));
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
	private static org.openxava.converters.IConverter zoneNumberConverter;
	private org.openxava.converters.IConverter getZoneNumberConverter() {
		if (zoneNumberConverter == null) {
			try {
				zoneNumberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("zoneNumber");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "zoneNumber"));
			}
			
		}	
		return zoneNumberConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "ZONE"
	 */
	public abstract java.lang.Integer get_ZoneNumber();
	public abstract void set_ZoneNumber(java.lang.Integer newZoneNumber); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getZoneNumber() {
		try {
			return ((Integer) getZoneNumberConverter().toJava(get_ZoneNumber())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "ZoneNumber", "Office", "int"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setZoneNumber(int newZoneNumber) {
		try { 
			this.modified = true; 
			set_ZoneNumber((java.lang.Integer) getZoneNumberConverter().toDB(new Integer(newZoneNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "ZoneNumber", "Office", "int"));
		}		
	} 

	// Colecciones/Collections		

	// References/Referencias 

	// OfficeManager : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.IClerk getOfficeManager() {
		try {		
			return getOfficeManagerHome().findByPrimaryKey(getOfficeManagerKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "OfficeManager", "Office"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ClerkRemote getOfficeManagerRemote() {
		return (org.openxava.test.model.ClerkRemote) getOfficeManager();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setOfficeManager(org.openxava.test.model.IClerk newOfficeManager) { 
		this.modified = true; 
		try {	
			if (newOfficeManager == null) setOfficeManagerKey(null);
			else {
				if (newOfficeManager instanceof org.openxava.test.model.Clerk) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.ClerkRemote remote = (org.openxava.test.model.ClerkRemote) newOfficeManager;
				setOfficeManagerKey((org.openxava.test.model.ClerkKey) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "OfficeManager", "Office"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ClerkKey getOfficeManagerKey() {				
		org.openxava.test.model.ClerkKey key = new org.openxava.test.model.ClerkKey(); 
		key.zoneNumber = getOfficeManager_zoneNumber(); 
		key.officeNumber = getOfficeManager_officeNumber(); 
		key.number = getOfficeManager_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setOfficeManagerKey(org.openxava.test.model.ClerkKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.ClerkKey(); 
			setOfficeManager_zoneNumber(key.zoneNumber); 
			setOfficeManager_officeNumber(key.officeNumber); 
			setOfficeManager_number(key.number);					
		}
		else { 
			setOfficeManager_zoneNumber(key.zoneNumber); 
			setOfficeManager_officeNumber(key.officeNumber); 
			setOfficeManager_number(key.number);		
		}
	}
	/**		
	 * @ejb:interface-method
	 *
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getOfficeManager_zoneNumber() {
		return getZoneNumber();
	}
	public void setOfficeManager_zoneNumber(int OfficeManager_zoneNumber) {
	}
	/**		
	 * @ejb:interface-method
	 *
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getOfficeManager_officeNumber() {
		return getNumber();
	}
	public void setOfficeManager_officeNumber(int OfficeManager_officeNumber) {
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "MANAGER_NUMBER"
	 */
	public abstract int get_OfficeManager_number();
	public abstract void set_OfficeManager_number(int newOfficeManager_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getOfficeManager_number() { 
		return get_OfficeManager_number(); 
	}
	public void setOfficeManager_number(int newOfficeManager_number) { 
		set_OfficeManager_number(newOfficeManager_number); 	
	} 

	private org.openxava.test.model.ClerkHome officeManagerHome;	
	private org.openxava.test.model.ClerkHome getOfficeManagerHome() throws Exception{
		if (officeManagerHome == null) {
			officeManagerHome = (org.openxava.test.model.ClerkHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Clerk"),
			 		org.openxava.test.model.ClerkHome.class);			 		
		}
		return officeManagerHome;
	} 

	// DefaultCarrier : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ICarrier getDefaultCarrier() {
		try {		
			return getDefaultCarrierHome().findByPrimaryKey(getDefaultCarrierKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "DefaultCarrier", "Office"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.CarrierRemote getDefaultCarrierRemote() {
		return (org.openxava.test.model.CarrierRemote) getDefaultCarrier();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setDefaultCarrier(org.openxava.test.model.ICarrier newDefaultCarrier) { 
		this.modified = true; 
		try {	
			if (newDefaultCarrier == null) setDefaultCarrierKey(null);
			else {
				if (newDefaultCarrier instanceof org.openxava.test.model.Carrier) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.CarrierRemote remote = (org.openxava.test.model.CarrierRemote) newDefaultCarrier;
				setDefaultCarrierKey((org.openxava.test.model.CarrierKey) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "DefaultCarrier", "Office"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.CarrierKey getDefaultCarrierKey() {				
		org.openxava.test.model.CarrierKey key = new org.openxava.test.model.CarrierKey(); 
		key._Number = get_DefaultCarrier_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setDefaultCarrierKey(org.openxava.test.model.CarrierKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.CarrierKey(); 
			setDefaultCarrier_number(key._Number);					
		}
		else { 
			set_DefaultCarrier_number(key._Number);		
		}
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "CARRIER_NUMBER"
	 */
	public abstract java.lang.Integer get_DefaultCarrier_number();
	public abstract void set_DefaultCarrier_number(java.lang.Integer newDefaultCarrier_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public java.lang.Integer getDefaultCarrier_number() { 
		return get_DefaultCarrier_number(); 
	}
	public void setDefaultCarrier_number(java.lang.Integer newDefaultCarrier_number) { 
		set_DefaultCarrier_number(newDefaultCarrier_number); 	
	} 

	private org.openxava.test.model.CarrierHome defaultCarrierHome;	
	private org.openxava.test.model.CarrierHome getDefaultCarrierHome() throws Exception{
		if (defaultCarrierHome == null) {
			defaultCarrierHome = (org.openxava.test.model.CarrierHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Carrier"),
			 		org.openxava.test.model.CarrierHome.class);			 		
		}
		return defaultCarrierHome;
	} 

	// MainWarehouse : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.IWarehouse getMainWarehouse() {
		try {		
			return getMainWarehouseHome().findByPrimaryKey(getMainWarehouseKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "MainWarehouse", "Office"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseRemote getMainWarehouseRemote() {
		return (org.openxava.test.model.WarehouseRemote) getMainWarehouse();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setMainWarehouse(org.openxava.test.model.IWarehouse newMainWarehouse) { 
		this.modified = true; 
		try {	
			if (newMainWarehouse == null) setMainWarehouseKey(null);
			else {
				if (newMainWarehouse instanceof org.openxava.test.model.Warehouse) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.WarehouseRemote remote = (org.openxava.test.model.WarehouseRemote) newMainWarehouse;
				setMainWarehouseKey((org.openxava.test.model.WarehouseKey) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "MainWarehouse", "Office"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseKey getMainWarehouseKey() {				
		org.openxava.test.model.WarehouseKey key = new org.openxava.test.model.WarehouseKey(); 
		key.zoneNumber = getMainWarehouse_zoneNumber(); 
		key._Number = get_MainWarehouse_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setMainWarehouseKey(org.openxava.test.model.WarehouseKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.WarehouseKey(); 
			setMainWarehouse_zoneNumber(key.zoneNumber); 
			setMainWarehouse_number(key._Number);					
		}
		else { 
			setMainWarehouse_zoneNumber(key.zoneNumber); 
			set_MainWarehouse_number(key._Number);		
		}
	}
	/**		
	 * @ejb:interface-method
	 *
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getMainWarehouse_zoneNumber() {
		return getZoneNumber();
	}
	public void setMainWarehouse_zoneNumber(int MainWarehouse_zoneNumber) {
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "WAREHOUSE_NUMBER"
	 */
	public abstract java.lang.Integer get_MainWarehouse_number();
	public abstract void set_MainWarehouse_number(java.lang.Integer newMainWarehouse_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public java.lang.Integer getMainWarehouse_number() { 
		return get_MainWarehouse_number(); 
	}
	public void setMainWarehouse_number(java.lang.Integer newMainWarehouse_number) { 
		set_MainWarehouse_number(newMainWarehouse_number); 	
	} 

	private org.openxava.test.model.WarehouseHome mainWarehouseHome;	
	private org.openxava.test.model.WarehouseHome getMainWarehouseHome() throws Exception{
		if (mainWarehouseHome == null) {
			mainWarehouseHome = (org.openxava.test.model.WarehouseHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Warehouse"),
			 		org.openxava.test.model.WarehouseHome.class);			 		
		}
		return mainWarehouseHome;
	} 

	// Methods/Metodos 

	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Office").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.OfficeData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.OfficeData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.OfficeValue getOfficeValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setOfficeValue(org.openxava.test.model.OfficeValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setNumber(0); 
		setZoneNumber(0); 
		setName(null); 
		setReceptionist(0); 
		setOfficeManagerKey(null); 
		setDefaultCarrierKey(null); 
		setMainWarehouseKey(null); 	
	} 		
}