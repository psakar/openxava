
// File generated by OpenXava: Tue Jan 24 17:00:18 CET 2006
// Archivo generado por OpenXava: Tue Jan 24 17:00:18 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product		Entity/Entidad

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
 * @ejb:bean name="Product" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Product" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IProduct"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Product" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Collection findAll()" query="SELECT OBJECT(o) FROM Product o WHERE 1 = 1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Collection findAll()" query="SELECT OBJECT(o) FROM Product o WHERE 1 = 1" 
 * 
 * @jboss:table-name "XAVATEST_PRODUCT"
 *
 * @author Javier Paniza
 */
abstract public class ProductBean extends EJBReplicableBase 
			implements org.openxava.test.model.IProduct, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.ProductKey ejbCreate(Map values) 
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
	public org.openxava.test.model.ProductKey ejbCreate(org.openxava.test.model.ProductData data) 
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
	public void ejbPostCreate(org.openxava.test.model.ProductData data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.ProductKey ejbCreate(org.openxava.test.model.ProductValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setProductValue(value); 
		setNumber(value.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.ProductValue value) 
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
	private org.openxava.converters.IConverter familyNumberConverter;
	private org.openxava.converters.IConverter getFamilyNumberConverter() {
		if (familyNumberConverter == null) {
			try {
				familyNumberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("familyNumber");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "familyNumber"));
			}
			
		}	
		return familyNumberConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "FAMILY"
	 */
	public abstract java.lang.Integer get_FamilyNumber();
	public abstract void set_FamilyNumber(java.lang.Integer newFamilyNumber); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getFamilyNumber() {
		try {
			return ((Integer) getFamilyNumberConverter().toJava(get_FamilyNumber())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "FamilyNumber", "Product", "int"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setFamilyNumber(int newFamilyNumber) {
		try { 
			this.modified = true; 
			set_FamilyNumber((java.lang.Integer) getFamilyNumberConverter().toDB(new Integer(newFamilyNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "FamilyNumber", "Product", "int"));
		}		
	} 
	private org.openxava.converters.IConverter unitPriceConverter;
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product", "java.math.BigDecimal"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product", "java.math.BigDecimal"));
		}		
	} 
		/**
	 * @ejb:interface-method
	 */
	public org.openxava.test.model.WarehouseKey getWarehouseKey() {
		org.openxava.test.model.WarehouseKey key = new org.openxava.test.model.WarehouseKey();
		key._Number = getWarehouseNumber();
		key.zoneNumber = getWarehouseZoneNumber();
		return key;
	}

	/**
	 * @ejb:interface-method
	 */
	public void setWarehouseKey(org.openxava.test.model.WarehouseKey warehouseKey) {
		setWarehouseNumber(warehouseKey._Number);
		setWarehouseZoneNumber(warehouseKey.zoneNumber);
	}
	
	/**	
	 * @ejb:persistent-field
	 *
	 * @jboss:column-name "ZONE"
	 */
	public abstract int getWarehouseZoneNumber();
	public abstract void setWarehouseZoneNumber(int newWarehouseZoneNumber);

	
	/**
	 * @ejb:persistent-field
	 *
	 * @jboss:column-name "WAREHOUSE"
	 */
	public abstract Integer getWarehouseNumber();
	public abstract void setWarehouseNumber(Integer newWarehouseNumber);
	 
	private org.openxava.converters.IConverter subfamilyNumberConverter;
	private org.openxava.converters.IConverter getSubfamilyNumberConverter() {
		if (subfamilyNumberConverter == null) {
			try {
				subfamilyNumberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("subfamilyNumber");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "subfamilyNumber"));
			}
			
		}	
		return subfamilyNumberConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "SUBFAMILY"
	 */
	public abstract java.lang.Integer get_SubfamilyNumber();
	public abstract void set_SubfamilyNumber(java.lang.Integer newSubfamilyNumber); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getSubfamilyNumber() {
		try {
			return ((Integer) getSubfamilyNumberConverter().toJava(get_SubfamilyNumber())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "SubfamilyNumber", "Product", "int"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setSubfamilyNumber(int newSubfamilyNumber) {
		try { 
			this.modified = true; 
			set_SubfamilyNumber((java.lang.Integer) getSubfamilyNumberConverter().toDB(new Integer(newSubfamilyNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "SubfamilyNumber", "Product", "int"));
		}		
	} 
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
	public java.lang.String getRemarks() {
		try {
			return (java.lang.String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Remarks", "Product", "java.lang.String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setRemarks(java.lang.String newRemarks) {
		try { 
			this.modified = true; 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Remarks", "Product", "java.lang.String"));
		}		
	} 
	private org.openxava.converters.IConverter descriptionConverter;
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Description", "Product", "String"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Description", "Product", "String"));
		}		
	} 	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public java.math.BigDecimal getUnitPriceInPesetas() {
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
			throw new EJBException(XavaResources.getString("generator.calculate_value_error", "UnitPriceInPesetas", "Product", ex.getLocalizedMessage()));
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

	// Methods/Metodos 
	/**
	 * @ejb:interface-method
	 */
	public void increasePrice()  {
		try { 		
			org.openxava.test.calculators.IncreasePriceCalculator increasePriceCalculator = (org.openxava.test.calculators.IncreasePriceCalculator)
				getMetaModel().getMetaMethod("increasePrice").getMetaCalculator().createCalculator(); 
				increasePriceCalculator.setEntity(this); 
			increasePriceCalculator.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("method_execution_error", "increasePrice", "Product"));
		}
	} 
	/**
	 * @ejb:interface-method
	 */
	public BigDecimal getPrice(String country, BigDecimal tariff) throws ProductException, PriceException {
		try { 		
			org.openxava.test.calculators.ExportPriceCalculator getPriceCalculator = (org.openxava.test.calculators.ExportPriceCalculator)
				getMetaModel().getMetaMethod("getPrice").getMetaCalculator().createCalculator();  	
			getPriceCalculator.setEuros(getUnitPrice()); 		
			getPriceCalculator.setCountry(country); 		
			getPriceCalculator.setTariff(tariff); 
			return (BigDecimal) getPriceCalculator.calculate(); 
		}
		catch (ProductException ex) {
			throw ex; 
		}
		catch (PriceException ex) {
			throw ex; 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("method_execution_error", "getPrice", "Product"));
		}
	} 

	private MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.ProductData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.ProductData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.ProductValue getProductValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setProductValue(org.openxava.test.model.ProductValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	}
	
	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setFamilyNumber(0); 
		setSubfamilyNumber(0); 
		setUnitPrice(null); 
		setRemarks(null); 	
	}
		
}