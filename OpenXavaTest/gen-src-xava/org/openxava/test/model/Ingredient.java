
// File generated by OpenXava: Tue May 30 10:40:40 CEST 2006
// Archivo generado por OpenXava: Tue May 30 10:40:40 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Ingredient		Entity/Entidad

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
public class Ingredient implements java.io.Serializable, org.openxava.test.model.IIngredient {	

	// Constructor
	public Ingredient() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 
		setName(null); 	
	} 
	
	// Properties/Propiedades 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
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
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String name;
	private java.lang.String get_Name() {
		return name;
	}
	private void set_Name(java.lang.String newName) {
		this.name = newName;
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Ingredient", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Ingredient", "String"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.IIngredient partOf; 	
	public org.openxava.test.model.IIngredient getPartOf() {
		if (partOf != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				partOf.toString();
			}
			catch (org.hibernate.ObjectNotFoundException ex) {
				return null;
			}
			catch (NullPointerException ex) {
				return null;
			}			
		}	
		return partOf;
	}
	public void setPartOf(org.openxava.test.model.IIngredient newIngredient) {
		if (newIngredient != null && !(newIngredient instanceof org.openxava.test.model.Ingredient)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.partOf = newIngredient; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Ingredient findByOid(java.lang.String oid) throws javax.ejb.ObjectNotFoundException {
 		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Ingredient as o where o.oid = :arg0"); 
		query.setParameter("arg0", oid); 
		Ingredient r = (Ingredient) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Ingredient"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Ingredient").getMetaEntity(); 	
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