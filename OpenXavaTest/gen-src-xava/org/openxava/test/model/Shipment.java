
// File generated by OpenXava: Thu Jan 12 16:59:34 CET 2006
// Archivo generado por OpenXava: Thu Jan 12 16:59:34 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Shipment		Entity/Entidad

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
public class Shipment implements java.io.Serializable, org.openxava.test.model.IShipment {	
	
	// Properties/Propiedades 
	private org.openxava.converters.IConverter typeConverter;
	private org.openxava.converters.IConverter getTypeConverter() {
		if (typeConverter == null) {
			try {
				typeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("type");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "type"));
			}
			
		}	
		return typeConverter;
	} 
	private java.lang.String type;
	private java.lang.String get_Type() {
		return type;
	}
	private void set_Type(java.lang.String newType) {
		this.type = newType;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getType() {
		try {
			return ((Integer) getTypeConverter().toJava(get_Type())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Type", "Shipment", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setType(int newType) {
		try { 
			set_Type((java.lang.String) getTypeConverter().toDB(new Integer(newType)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Type", "Shipment", "int"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Shipment", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Shipment", "String"));
		}		
	} 
	private int mode;
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		this.mode = newMode;
	} 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll() {
 		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Shipment as o"); 
 		org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Shipment as o"); 
 		return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery);
 	} 


	private MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Shipment").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() { 
		return "Shipment::" + type + "::" + mode + "::" + number;
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}