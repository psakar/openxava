
// File generated by OpenXava: Mon Apr 11 10:36:52 CEST 2005
// Archivo generado por OpenXava: Mon Apr 11 10:36:52 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Entity/Entidad

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
 * @ejb:bean name="Customer" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.ejb/Customer" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.ejb.ICustomer"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Customer" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Collection findBySeller(int number)" query="SELECT OBJECT(o) FROM Customer o WHERE o.seller_number = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findBySeller(int number)" query="SELECT OBJECT(o) FROM Customer o WHERE o.seller_number = ?1 " 	
 * @ejb:finder signature="Collection findByAlternateSeller(int number)" query="SELECT OBJECT(o) FROM Customer o WHERE o.alternateSeller_number = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByAlternateSeller(int number)" query="SELECT OBJECT(o) FROM Customer o WHERE o.alternateSeller_number = ?1 " 	
 * @ejb:finder signature="Customer findByNumber(int number)" query="SELECT OBJECT(o) FROM Customer o WHERE o.number = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Customer findByNumber(int number)" query="SELECT OBJECT(o) FROM Customer o WHERE o.number = ?1" 	
 * @ejb:finder signature="Collection findByNameLike(java.lang.String name)" query="SELECT OBJECT(o) FROM Customer o WHERE o._Name like ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByNameLike(java.lang.String name)" query="SELECT OBJECT(o) FROM Customer o WHERE o._Name like ?1 ORDER BY o._Name desc" 	
 * @ejb:finder signature="Collection findByNameLikeAndrelationWithSeller(java.lang.String name, java.lang.String relationWithSeller)" query="SELECT OBJECT(o) FROM Customer o WHERE o._Name like ?1 and o._RelationWithSeller = ?2" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByNameLikeAndrelationWithSeller(java.lang.String name, java.lang.String relationWithSeller)" query="SELECT OBJECT(o) FROM Customer o WHERE o._Name like ?1 and o._RelationWithSeller = ?2 ORDER BY o._Name desc" 	
 * @ejb:finder signature="Collection findNormalOnes()" query="SELECT OBJECT(o) FROM Customer o WHERE o._Type = 1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findNormalOnes()" query="SELECT OBJECT(o) FROM Customer o WHERE o._Type = 1" 	
 * @ejb:finder signature="Collection findSteadyOnes()" query="SELECT OBJECT(o) FROM Customer o WHERE o._Type = 2" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findSteadyOnes()" query="SELECT OBJECT(o) FROM Customer o WHERE o._Type = 2" 	
 * @ejb:finder signature="Collection findAll()" query="SELECT OBJECT(o) FROM Customer o" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findAll()" query="SELECT OBJECT(o) FROM Customer o" 
 * 
 * @jboss:table-name "XAVATEST_CUSTOMER"
 *
 * @author Javier Paniza
 */
abstract public class CustomerBean extends EJBReplicableBase 
			implements org.openxava.test.ejb.ICustomer, EntityBean {	
			
	private boolean creating = false;		

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.ejb.CustomerKey ejbCreate(Map values) 
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
	public org.openxava.test.ejb.CustomerKey ejbCreate(org.openxava.test.ejb.CustomerData data) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		setData(data); 
		setNumber(data.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.ejb.CustomerData data) 
		throws
			CreateException,
			ValidationException {			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.ejb.CustomerKey ejbCreate(org.openxava.test.ejb.CustomerValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		setCustomerValue(value); 
		setNumber(value.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.ejb.CustomerValue value) 
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
	private org.openxava.converters.IntegerNumberConverter typeConverter;
	private org.openxava.converters.IntegerNumberConverter getTypeConverter() {
		if (typeConverter == null) {
			try {
				typeConverter = (org.openxava.converters.IntegerNumberConverter) 
					getMetaModel().getMapping().getConverter("type");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "type"));
			}
			
		}	
		return typeConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "TYPE"
	 */
	public abstract java.lang.Integer get_Type();
	public abstract void set_Type(java.lang.Integer newType); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getType() {
		try {
			return ((Integer) getTypeConverter().toJava(get_Type())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Type", "Customer", "int"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setType(int newType) {
		try {
			set_Type((java.lang.Integer) getTypeConverter().toDB(new Integer(newType)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Type", "Customer", "int"));
		}		
	} 
	private org.openxava.converters.TrimStringConverter remarksConverter;
	private org.openxava.converters.TrimStringConverter getRemarksConverter() {
		if (remarksConverter == null) {
			try {
				remarksConverter = (org.openxava.converters.TrimStringConverter) 
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
	public java.lang.String getRemarks() {
		try {
			return (java.lang.String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Remarks", "Customer", "java.lang.String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setRemarks(java.lang.String newRemarks) {
		try {
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Remarks", "Customer", "java.lang.String"));
		}		
	} 
	private org.openxava.converters.TrimStringConverter relationWithSellerConverter;
	private org.openxava.converters.TrimStringConverter getRelationWithSellerConverter() {
		if (relationWithSellerConverter == null) {
			try {
				relationWithSellerConverter = (org.openxava.converters.TrimStringConverter) 
					getMetaModel().getMapping().getConverter("relationWithSeller");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "relationWithSeller"));
			}
			
		}	
		return relationWithSellerConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "RELATIONSELLER"
	 */
	public abstract java.lang.String get_RelationWithSeller();
	public abstract void set_RelationWithSeller(java.lang.String newRelationWithSeller); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getRelationWithSeller() {
		try {
			return (String) getRelationWithSellerConverter().toJava(get_RelationWithSeller());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "RelationWithSeller", "Customer", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setRelationWithSeller(String newRelationWithSeller) {
		try {
			set_RelationWithSeller((java.lang.String) getRelationWithSellerConverter().toDB(newRelationWithSeller));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "RelationWithSeller", "Customer", "String"));
		}		
	} 
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * 
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "PHOTO"
	 */
	public abstract byte[] getPhoto();
	/**
	  * @ejb:interface-method
	  */
	public abstract void setPhoto(byte[] newPhoto); 
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Customer", "String"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Customer", "String"));
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

	private org.openxava.test.ejb.DeliveryPlaceHome deliveryPlacesHome; 

	/**
	 * @ejb:interface-method
	 */
	public java.util.Collection getDeliveryPlaces() {		
		try {
			return getDeliveryPlacesHome().findByCustomer(getNumber());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_collection_elements_error", "DeliveryPlaces", "Customer"));
		}
	}
		
	private org.openxava.test.ejb.DeliveryPlaceHome getDeliveryPlacesHome() throws Exception{
		if (deliveryPlacesHome == null) {
			deliveryPlacesHome = (org.openxava.test.ejb.DeliveryPlaceHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.ejb/DeliveryPlace"),
			 		org.openxava.test.ejb.DeliveryPlaceHome.class);			 		
		}
		return deliveryPlacesHome;
	}		

	// References/Referencias 

	// Seller : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.ejb.Seller getSeller() {
		try {		
			return getSellerHome().findByPrimaryKey(getSellerKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Seller", "Customer"));
		}		
	}	
	/**
	 * @ejb:interface-method
	 */
	public void setSeller(org.openxava.test.ejb.Seller newSeller) {
		try {	
			if (newSeller == null) setSellerKey(null);
			else setSellerKey((org.openxava.test.ejb.SellerKey) newSeller.getPrimaryKey());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Seller", "Customer"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.ejb.SellerKey getSellerKey() {				
			org.openxava.test.ejb.SellerKey key = new org.openxava.test.ejb.SellerKey(); 
			key.number = getSeller_number();		
			return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setSellerKey(org.openxava.test.ejb.SellerKey key) {
		if (key == null) {
			key = new org.openxava.test.ejb.SellerKey();
		} 
		setSeller_number(key.number);		
		
	}
	/**		
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * 
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @jboss:column-name "SELLER_NUMBER"
	 */
	public abstract int getSeller_number();
	public abstract void setSeller_number(int newSeller_number); 

	private org.openxava.test.ejb.SellerHome sellerHome;	
	private org.openxava.test.ejb.SellerHome getSellerHome() throws Exception{
		if (sellerHome == null) {
			sellerHome = (org.openxava.test.ejb.SellerHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.ejb/Seller"),
			 		org.openxava.test.ejb.SellerHome.class);			 		
		}
		return sellerHome;
	} 

	// AlternateSeller : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.ejb.Seller getAlternateSeller() {
		try {		
			return getAlternateSellerHome().findByPrimaryKey(getAlternateSellerKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "AlternateSeller", "Customer"));
		}		
	}	
	/**
	 * @ejb:interface-method
	 */
	public void setAlternateSeller(org.openxava.test.ejb.Seller newAlternateSeller) {
		try {	
			if (newAlternateSeller == null) setAlternateSellerKey(null);
			else setAlternateSellerKey((org.openxava.test.ejb.SellerKey) newAlternateSeller.getPrimaryKey());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "AlternateSeller", "Customer"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.ejb.SellerKey getAlternateSellerKey() {				
			org.openxava.test.ejb.SellerKey key = new org.openxava.test.ejb.SellerKey(); 
			key.number = getAlternateSeller_number();		
			return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setAlternateSellerKey(org.openxava.test.ejb.SellerKey key) {
		if (key == null) {
			key = new org.openxava.test.ejb.SellerKey();
		} 
		setAlternateSeller_number(key.number);		
		
	}
	/**		
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * 
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @jboss:column-name "ALTERNATESELLER_NUMBER"
	 */
	public abstract int getAlternateSeller_number();
	public abstract void setAlternateSeller_number(int newAlternateSeller_number); 

	private org.openxava.test.ejb.SellerHome alternateSellerHome;	
	private org.openxava.test.ejb.SellerHome getAlternateSellerHome() throws Exception{
		if (alternateSellerHome == null) {
			alternateSellerHome = (org.openxava.test.ejb.SellerHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.ejb/Seller"),
			 		org.openxava.test.ejb.SellerHome.class);			 		
		}
		return alternateSellerHome;
	}  	
	// Address : Aggregate/Agregado 
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */ 
	public org.openxava.test.ejb.Address getAddress() {
		org.openxava.test.ejb.Address r = new org.openxava.test.ejb.Address();		
		r.setZipCode(getAddress_zipCode());		
		r.setStreet(getAddress_street());		
		r.setCity(getAddress_city()); 
		r.setState(getAddress_state());		
		return r;
	} 	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */ 	 
	public void setAddress(org.openxava.test.ejb.Address newAddress) { 
		if (newAddress == null) newAddress = new org.openxava.test.ejb.Address();		
		setAddress_zipCode(newAddress.getZipCode());		
		setAddress_street(newAddress.getStreet());		
		setAddress_city(newAddress.getCity());		
		setAddress_state(newAddress.getState());			
	} 
	private org.openxava.converters.IntegerStringConverter address_zipCodeConverter;
	private org.openxava.converters.IntegerStringConverter getAddress_zipCodeConverter() {
		if (address_zipCodeConverter == null) {
			try {
				address_zipCodeConverter = (org.openxava.converters.IntegerStringConverter) 
					getMetaModel().getMapping().getConverter("address_zipCode");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "address_zipCode"));
			}
			
		}	
		return address_zipCodeConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "ZIPCODE"
	 */
	public abstract java.lang.String get_Address_zipCode();
	public abstract void set_Address_zipCode(java.lang.String newAddress_zipCode); 	
	
	/**
	 * 
	 * 
	 */
	private int getAddress_zipCode() {
		try {
			return ((Integer) getAddress_zipCodeConverter().toJava(get_Address_zipCode())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Address_zipCode", "Address", "int"));
		}
	}
	
	/**
	 * 
	 */
	private void setAddress_zipCode(int newAddress_zipCode) {
		try {
			set_Address_zipCode((java.lang.String) getAddress_zipCodeConverter().toDB(new Integer(newAddress_zipCode)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Address_zipCode", "Address", "int"));
		}		
	} 
	/**
	 * 
	 * @ejb:persistent-field
	 * 
	 * 
	 *
	 * @jboss:column-name "STREET"
	 */
	public abstract String getAddress_street();
	/**
	  * 
	  */
	public abstract void setAddress_street(String newAddress_street); 
	/**
	 * 
	 * @ejb:persistent-field
	 * 
	 * 
	 *
	 * @jboss:column-name "CITY"
	 */
	public abstract String getAddress_city();
	/**
	  * 
	  */
	public abstract void setAddress_city(String newAddress_city); 

	// Address_state : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.ejb.State getAddress_state() {
		try {		
			return getAddress_stateHome().findByPrimaryKey(getAddress_stateKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Address_state", "Address"));
		}		
	}	
	/**
	 * @ejb:interface-method
	 */
	public void setAddress_state(org.openxava.test.ejb.State newAddress_state) {
		try {	
			if (newAddress_state == null) setAddress_stateKey(null);
			else setAddress_stateKey((org.openxava.test.ejb.StateKey) newAddress_state.getPrimaryKey());
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Address_state", "Address"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.ejb.StateKey getAddress_stateKey() {				
			org.openxava.test.ejb.StateKey key = new org.openxava.test.ejb.StateKey(); 
			key.id = getAddress_state_id();		
			return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setAddress_stateKey(org.openxava.test.ejb.StateKey key) {
		if (key == null) {
			key = new org.openxava.test.ejb.StateKey();
		} 
		setAddress_state_id(key.id);		
		
	}
	/**		
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * 
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @jboss:column-name "STATE"
	 */
	public abstract String getAddress_state_id();
	public abstract void setAddress_state_id(String newAddress_state_id); 

	private org.openxava.test.ejb.StateHome address_stateHome;	
	private org.openxava.test.ejb.StateHome getAddress_stateHome() throws Exception{
		if (address_stateHome == null) {
			address_stateHome = (org.openxava.test.ejb.StateHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.ejb/State"),
			 		org.openxava.test.ejb.StateHome.class);			 		
		}
		return address_stateHome;
	} 
	// Methods/Metodos 

	private MetaModel metaModel;
	private MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Customer").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.ejb.CustomerData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.ejb.CustomerData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.ejb.CustomerValue getCustomerValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setCustomerValue(org.openxava.test.ejb.CustomerValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	}
	
	private void initMembers() { 
		setNumber(0); 
		setName(null); 
		setType(0); 
		setPhoto(null); 
		setRemarks(null); 
		setRelationWithSeller(null); 
	}
		
}