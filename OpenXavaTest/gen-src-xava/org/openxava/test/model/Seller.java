
// File generated by OpenXava: Tue Aug 16 09:26:53 CEST 2005
// Archivo generado por OpenXava: Tue Aug 16 09:26:53 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Seller		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Seller implements java.io.Serializable {	
	
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
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String _name;
	private java.lang.String get_Name() {
		return _name;
	}
	private void set_Name(java.lang.String newName) {
		this._name = newName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Seller", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setName(String newName) {
		try { 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Seller", "String"));
		}		
	} 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 

	// References/Referencias 
	private SellerLevel level;
	public SellerLevel getLevel() {
		return level;
	}
	public void setLevel(SellerLevel newSellerLevel) {
		this.level = newSellerLevel;
	} 
	private Seller boss;
	public Seller getBoss() {
		return boss;
	}
	public void setBoss(Seller newSeller) {
		this.boss = newSeller;
	} 

	// Colecciones/Collections 
	private java.util.Collection customers;
	public java.util.Collection getCustomers() {
		return customers;
	}
	public void setCustomers(java.util.Collection customers) {
		this.customers = customers;
	} 
	
	private MetaModel metaModel;
	private MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Seller").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() { 
		return "Seller::" + number;
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}