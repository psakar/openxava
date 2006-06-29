
// File generated by OpenXava: Thu Jun 29 11:44:28 CEST 2006
// Archivo generado por OpenXava: Thu Jun 29 11:44:28 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product2		Entity/Entidad

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
 * @ejb:bean name="Product2" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Product2" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IProduct2"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Product2" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Collection findByWarehouse(int zoneNumber, java.lang.Integer number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o._Warehouse_zoneNumber = ?1 AND o._Warehouse_number = ?2 " view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByWarehouse(int zoneNumber, java.lang.Integer number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o._Warehouse_zoneNumber = ?1 AND o._Warehouse_number = ?2 " 	
 * @ejb:finder signature="Collection findByFamily(int number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o._Family_number = ?1 " view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findByFamily(int number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o._Family_number = ?1 " 	
 * @ejb:finder signature="Collection findBySubfamily(int number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o._Subfamily_number = ?1 " view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findBySubfamily(int number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o._Subfamily_number = ?1 " 	
 * @ejb:finder signature="Collection findAll()" query="SELECT OBJECT(o) FROM Product2 o WHERE 1 = 1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findAll()" query="SELECT OBJECT(o) FROM Product2 o WHERE 1 = 1" 	
 * @ejb:finder signature="Product2 findByNumber(long number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o.number = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Product2 findByNumber(long number)" query="SELECT OBJECT(o) FROM Product2 o WHERE o.number = ?1" 
 * 
 * @jboss:table-name "XAVATEST_PRODUCT"
 *
 * @author Javier Paniza
 */
abstract public class Product2Bean extends EJBReplicableBase 
			implements org.openxava.test.model.IProduct2, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.Product2Key ejbCreate(Map values) 
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
	public org.openxava.test.model.Product2Key ejbCreate(org.openxava.test.model.Product2Data data) 
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
	public void ejbPostCreate(org.openxava.test.model.Product2Data data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.Product2Key ejbCreate(org.openxava.test.model.Product2Value value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setProduct2Value(value); 
		setNumber(value.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.Product2Value value) 
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
	private static org.openxava.converters.IConverter photosConverter;
	private org.openxava.converters.IConverter getPhotosConverter() {
		if (photosConverter == null) {
			try {
				photosConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("photos");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "photos"));
			}
			
		}	
		return photosConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "PHOTOS"
	 */
	public abstract java.lang.String get_Photos();
	public abstract void set_Photos(java.lang.String newPhotos); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getPhotos() {
		try {
			return (String) getPhotosConverter().toJava(get_Photos());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Photos", "Product2", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setPhotos(String newPhotos) {
		try { 
			this.modified = true; 
			set_Photos((java.lang.String) getPhotosConverter().toDB(newPhotos));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Photos", "Product2", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter unitPriceConverter;
	private org.openxava.converters.IConverter getUnitPriceConverter() {
		if (unitPriceConverter == null) {
			try {
				unitPriceConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("unitPrice");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "unitPrice"));
			}
			
		}	
		return unitPriceConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "UNITPRICE"
	 */
	public abstract java.math.BigDecimal get_UnitPrice();
	public abstract void set_UnitPrice(java.math.BigDecimal newUnitPrice); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public java.math.BigDecimal getUnitPrice() {
		try {
			return (java.math.BigDecimal) getUnitPriceConverter().toJava(get_UnitPrice());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product2", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setUnitPrice(java.math.BigDecimal newUnitPrice) {
		try { 
			this.modified = true; 
			set_UnitPrice((java.math.BigDecimal) getUnitPriceConverter().toDB(newUnitPrice));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product2", "java.math.BigDecimal"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Description", "Product2", "String"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Description", "Product2", "String"));
		}		
	} 	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public java.math.BigDecimal getUnitPriceInPesetas() { 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		} 		
		try {			
			org.openxava.test.calculators.EurosToPesetasCalculator unitPriceInPesetasCalculator= (org.openxava.test.calculators.EurosToPesetasCalculator)
				getMetaModel().getMetaProperty("unitPriceInPesetas").getMetaCalculator().createCalculator();  	
			
			unitPriceInPesetasCalculator.setEuros(getUnitPrice()); 
			return (java.math.BigDecimal) unitPriceInPesetasCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.calculate_value_error", "UnitPriceInPesetas", "Product2", ex.getLocalizedMessage()));
		} 
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 		
	}
	public void setUnitPriceInPesetas(java.math.BigDecimal newUnitPriceInPesetas) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "NUMBER"
	 */
	public abstract long getNumber();
	/**
	  * 
	  */
	public abstract void setNumber(long newNumber); 

	// Colecciones/Collections		

	// References/Referencias 

	// Warehouse : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.IWarehouse getWarehouse() {
		try {		
			return getWarehouseHome().findByPrimaryKey(getWarehouseKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Warehouse", "Product2"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseRemote getWarehouseRemote() {
		return (org.openxava.test.model.WarehouseRemote) getWarehouse();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setWarehouse(org.openxava.test.model.IWarehouse newWarehouse) { 
		this.modified = true; 
		try {	
			if (newWarehouse == null) setWarehouseKey(null);
			else {
				if (newWarehouse instanceof org.openxava.test.model.Warehouse) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.WarehouseRemote remote = (org.openxava.test.model.WarehouseRemote) newWarehouse;
				setWarehouseKey((org.openxava.test.model.WarehouseKey) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Warehouse", "Product2"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseKey getWarehouseKey() {				
		org.openxava.test.model.WarehouseKey key = new org.openxava.test.model.WarehouseKey(); 
		key.zoneNumber = getWarehouse_zoneNumber(); 
		key._Number = get_Warehouse_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setWarehouseKey(org.openxava.test.model.WarehouseKey key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.WarehouseKey(); 
			setWarehouse_zoneNumber(key.zoneNumber); 
			setWarehouse_number(key._Number);					
		}
		else { 
			setWarehouse_zoneNumber(key.zoneNumber); 
			set_Warehouse_number(key._Number);		
		}
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "ZONE"
	 */
	public abstract int get_Warehouse_zoneNumber();
	public abstract void set_Warehouse_zoneNumber(int newWarehouse_zoneNumber);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getWarehouse_zoneNumber() { 
		return get_Warehouse_zoneNumber(); 
	}
	public void setWarehouse_zoneNumber(int newWarehouse_zoneNumber) { 
		set_Warehouse_zoneNumber(newWarehouse_zoneNumber); 	
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "WAREHOUSE"
	 */
	public abstract java.lang.Integer get_Warehouse_number();
	public abstract void set_Warehouse_number(java.lang.Integer newWarehouse_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public java.lang.Integer getWarehouse_number() { 
		return get_Warehouse_number(); 
	}
	public void setWarehouse_number(java.lang.Integer newWarehouse_number) { 
		set_Warehouse_number(newWarehouse_number); 	
	} 

	private org.openxava.test.model.WarehouseHome warehouseHome;	
	private org.openxava.test.model.WarehouseHome getWarehouseHome() throws Exception{
		if (warehouseHome == null) {
			warehouseHome = (org.openxava.test.model.WarehouseHome) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Warehouse"),
			 		org.openxava.test.model.WarehouseHome.class);			 		
		}
		return warehouseHome;
	} 

	// Family : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.IFamily2 getFamily() {
		try {		
			return getFamilyHome().findByPrimaryKey(getFamilyKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Family", "Product2"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.Family2Remote getFamilyRemote() {
		return (org.openxava.test.model.Family2Remote) getFamily();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setFamily(org.openxava.test.model.IFamily2 newFamily) { 
		this.modified = true; 
		try {	
			if (newFamily == null) setFamilyKey(null);
			else {
				if (newFamily instanceof org.openxava.test.model.Family2) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.Family2Remote remote = (org.openxava.test.model.Family2Remote) newFamily;
				setFamilyKey((org.openxava.test.model.Family2Key) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Family", "Product2"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.Family2Key getFamilyKey() {				
		org.openxava.test.model.Family2Key key = new org.openxava.test.model.Family2Key(); 
		key.number = getFamily_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setFamilyKey(org.openxava.test.model.Family2Key key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.Family2Key(); 
			setFamily_number(key.number);					
		}
		else { 
			setFamily_number(key.number);		
		}
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "FAMILY"
	 */
	public abstract int get_Family_number();
	public abstract void set_Family_number(int newFamily_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getFamily_number() { 
		return get_Family_number(); 
	}
	public void setFamily_number(int newFamily_number) { 
		set_Family_number(newFamily_number); 	
	} 

	private org.openxava.test.model.Family2Home familyHome;	
	private org.openxava.test.model.Family2Home getFamilyHome() throws Exception{
		if (familyHome == null) {
			familyHome = (org.openxava.test.model.Family2Home) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Family2"),
			 		org.openxava.test.model.Family2Home.class);			 		
		}
		return familyHome;
	} 

	// Subfamily : Entity reference/Referencia a entidad
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.ISubfamily2 getSubfamily() {
		try {		
			return getSubfamilyHome().findByPrimaryKey(getSubfamilyKey());
		}
		catch (ObjectNotFoundException ex) {
			return null;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("get_reference_error", "Subfamily", "Product2"));
		}		
	}	
	
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.Subfamily2Remote getSubfamilyRemote() {
		return (org.openxava.test.model.Subfamily2Remote) getSubfamily();
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setSubfamily(org.openxava.test.model.ISubfamily2 newSubfamily) { 
		this.modified = true; 
		try {	
			if (newSubfamily == null) setSubfamilyKey(null);
			else {
				if (newSubfamily instanceof org.openxava.test.model.Subfamily2) {
					throw new IllegalArgumentException(XavaResources.getString("pojo_to_ejb_illegal"));
				}
				org.openxava.test.model.Subfamily2Remote remote = (org.openxava.test.model.Subfamily2Remote) newSubfamily;
				setSubfamilyKey((org.openxava.test.model.Subfamily2Key) remote.getPrimaryKey());
			}	
		}
		catch (IllegalArgumentException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("set_reference_error", "Subfamily", "Product2"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.Subfamily2Key getSubfamilyKey() {				
		org.openxava.test.model.Subfamily2Key key = new org.openxava.test.model.Subfamily2Key(); 
		key.number = getSubfamily_number();		
		return key;
	}	
	
	/**
	 * @ejb:interface-method
	 */
	public void setSubfamilyKey(org.openxava.test.model.Subfamily2Key key) { 
		this.modified = true; 		
		if (key == null) {
			key = new org.openxava.test.model.Subfamily2Key(); 
			setSubfamily_number(key.number);					
		}
		else { 
			setSubfamily_number(key.number);		
		}
	}
	/**		
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "SUBFAMILY"
	 */
	public abstract int get_Subfamily_number();
	public abstract void set_Subfamily_number(int newSubfamily_number);

	/**		
	 * @ejb:interface-method
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 */
	public int getSubfamily_number() { 
		return get_Subfamily_number(); 
	}
	public void setSubfamily_number(int newSubfamily_number) { 
		set_Subfamily_number(newSubfamily_number); 	
	} 

	private org.openxava.test.model.Subfamily2Home subfamilyHome;	
	private org.openxava.test.model.Subfamily2Home getSubfamilyHome() throws Exception{
		if (subfamilyHome == null) {
			subfamilyHome = (org.openxava.test.model.Subfamily2Home) PortableRemoteObject.narrow(
			 		BeansContext.get().lookup("ejb/org.openxava.test.model/Subfamily2"),
			 		org.openxava.test.model.Subfamily2Home.class);			 		
		}
		return subfamilyHome;
	} 

	// Methods/Metodos 

	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product2").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.Product2Data getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.Product2Data data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.Product2Value getProduct2Value();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setProduct2Value(org.openxava.test.model.Product2Value value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setPhotos(null); 
		setUnitPrice(null); 
		setWarehouseKey(null); 
		setFamilyKey(null); 
		setSubfamilyKey(null); 	
	} 		
}