
// File generated by OpenXava: Thu Apr 06 13:16:36 CEST 2006
// Archivo generado por OpenXava: Thu Apr 06 13:16:36 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product2		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Product2 implements java.io.Serializable, org.openxava.test.model.IProduct2 {	

	// Constructor
	public Product2() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setPhotos(null); 
		setUnitPrice(null); 	
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
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "photos"));
			}
			
		}	
		return photosConverter;
	} 
	private java.lang.String photos;
	private java.lang.String get_Photos() {
		return photos;
	}
	private void set_Photos(java.lang.String newPhotos) {
		this.photos = newPhotos;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getPhotos() {
		try {
			return (String) getPhotosConverter().toJava(get_Photos());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photos", "Product2", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setPhotos(String newPhotos) {
		try { 
			set_Photos((java.lang.String) getPhotosConverter().toDB(newPhotos));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photos", "Product2", "String"));
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
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "unitPrice"));
			}
			
		}	
		return unitPriceConverter;
	} 
	private java.math.BigDecimal unitPrice;
	private java.math.BigDecimal get_UnitPrice() {
		return unitPrice;
	}
	private void set_UnitPrice(java.math.BigDecimal newUnitPrice) {
		this.unitPrice = newUnitPrice;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getUnitPrice() {
		try {
			return (java.math.BigDecimal) getUnitPriceConverter().toJava(get_UnitPrice());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product2", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setUnitPrice(java.math.BigDecimal newUnitPrice) {
		try { 
			set_UnitPrice((java.math.BigDecimal) getUnitPriceConverter().toDB(newUnitPrice));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product2", "java.math.BigDecimal"));
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
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "description"));
			}
			
		}	
		return descriptionConverter;
	} 
	private java.lang.String description;
	private java.lang.String get_Description() {
		return description;
	}
	private void set_Description(java.lang.String newDescription) {
		this.description = newDescription;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getDescription() {
		try {
			return (String) getDescriptionConverter().toJava(get_Description());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product2", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setDescription(String newDescription) {
		try { 
			set_Description((java.lang.String) getDescriptionConverter().toDB(newDescription));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product2", "String"));
		}		
	} 	
	/**
	 * 
	 * 
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
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "UnitPriceInPesetas", "Product2", ex.getLocalizedMessage()));
		} 		
	}
	public void setUnitPriceInPesetas(java.math.BigDecimal newUnitPriceInPesetas) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private long number;
	public long getNumber() {
		return number;
	}
	public void setNumber(long newNumber) {
		this.number = newNumber;
	} 

	// References/Referencias 

	private org.openxava.test.model.IWarehouse warehouse; 	
	public org.openxava.test.model.IWarehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(org.openxava.test.model.IWarehouse newWarehouse) {
		if (newWarehouse != null && !(newWarehouse instanceof org.openxava.test.model.Warehouse)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.warehouse = newWarehouse; 
	} 

	private org.openxava.test.model.IFamily2 family; 	
	public org.openxava.test.model.IFamily2 getFamily() {
		return family;
	}
	public void setFamily(org.openxava.test.model.IFamily2 newFamily2) {
		if (newFamily2 != null && !(newFamily2 instanceof org.openxava.test.model.Family2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.family = newFamily2; 
	} 

	private org.openxava.test.model.ISubfamily2 subfamily; 	
	public org.openxava.test.model.ISubfamily2 getSubfamily() {
		return subfamily;
	}
	public void setSubfamily(org.openxava.test.model.ISubfamily2 newSubfamily2) {
		if (newSubfamily2 != null && !(newSubfamily2 instanceof org.openxava.test.model.Subfamily2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.subfamily = newSubfamily2; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
 		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product2 as o where 1 = 1"); 
 		org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Product2 as o where 1 = 1"); 
 		return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Product2 findByNumber(long number) throws javax.ejb.ObjectNotFoundException {
 		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product2 as o where o.number = :arg0"); 
		query.setParameter("arg0", new Long(number)); 
		Product2 r = (Product2) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Product2"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product2").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		StringBuffer toStringValue = new StringBuffer("[.");
		java.lang.reflect.Field [] fields = getClass().getDeclaredFields();
		Arrays.sort(fields, FieldComparator.getInstance());
		for (int i=0; i < fields.length; i++) {
			try {
				if (getMetaModel().isKey(fields[i].getName())) {
					toStringValue.append(fields[i].get(this)).append('.');
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
				toStringValue.append(" ").append('.');
			}
		}
		toStringValue.append(']');
		return toStringValue.toString();
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}