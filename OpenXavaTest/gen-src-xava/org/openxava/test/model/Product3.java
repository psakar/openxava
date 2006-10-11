
// File generated by OpenXava: Wed Oct 11 10:07:29 CEST 2006
// Archivo generado por OpenXava: Wed Oct 11 10:07:29 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product3		Entity/Entidad

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
public class Product3 implements java.io.Serializable, org.openxava.test.model.IProduct3 {	

	// Constructor
	public Product3() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setComments(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter commentsConverter;
	private org.openxava.converters.IConverter getCommentsConverter() {
		if (commentsConverter == null) {
			try {
				commentsConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("comments");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "comments"));
			}
			
		}	
		return commentsConverter;
	} 
	private java.lang.String comments;
	private java.lang.String get_Comments() {
		return comments;
	}
	private void set_Comments(java.lang.String newComments) {
		this.comments = newComments;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getComments() {
		try {
			return (java.lang.String) getCommentsConverter().toJava(get_Comments());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comments", "Product3", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setComments(java.lang.String newComments) {
		try { 
			set_Comments((java.lang.String) getCommentsConverter().toDB(newComments));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comments", "Product3", "java.lang.String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product3", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product3", "String"));
		}		
	} 
	private long number;
	public long getNumber() {
		return number;
	}
	public void setNumber(long newNumber) {
		this.number = newNumber;
	} 

	// References/Referencias  	
	// Subfamily1 : Aggregate/Agregado 
	public org.openxava.test.model.SubfamilyInfo getSubfamily1() {
		org.openxava.test.model.SubfamilyInfo r = new org.openxava.test.model.SubfamilyInfo(); 
		r.setFamily(getSubfamily1_family()); 
		r.setSubfamily(getSubfamily1_subfamily());		
		return r;
	} 	 
	public void setSubfamily1(org.openxava.test.model.SubfamilyInfo newSubfamily1) throws java.rmi.RemoteException { 	
		if (newSubfamily1 == null) newSubfamily1 = new org.openxava.test.model.SubfamilyInfo();		
		setSubfamily1_family(newSubfamily1.getFamily());		
		setSubfamily1_subfamily(newSubfamily1.getSubfamily());			
	} 

	private org.openxava.test.model.IFamily2 subfamily1_family; 	
	public org.openxava.test.model.IFamily2 getSubfamily1_family() {
		if (subfamily1_family != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				subfamily1_family.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return subfamily1_family;
	}
	public void setSubfamily1_family(org.openxava.test.model.IFamily2 newFamily2) {
		if (newFamily2 != null && !(newFamily2 instanceof org.openxava.test.model.Family2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.subfamily1_family = newFamily2; 
	} 

	private org.openxava.test.model.ISubfamily2 subfamily1_subfamily; 	
	public org.openxava.test.model.ISubfamily2 getSubfamily1_subfamily() {
		if (subfamily1_subfamily != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				subfamily1_subfamily.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return subfamily1_subfamily;
	}
	public void setSubfamily1_subfamily(org.openxava.test.model.ISubfamily2 newSubfamily2) {
		if (newSubfamily2 != null && !(newSubfamily2 instanceof org.openxava.test.model.Subfamily2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.subfamily1_subfamily = newSubfamily2; 
	} 

	private org.openxava.test.model.IFamily family; 	
	public org.openxava.test.model.IFamily getFamily() {
		if (family != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				family.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return family;
	}
	public void setFamily(org.openxava.test.model.IFamily newFamily) {
		if (newFamily != null && !(newFamily instanceof org.openxava.test.model.Family)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.family = newFamily; 
	}  	
	// Subfamily2 : Aggregate/Agregado 
	public org.openxava.test.model.SubfamilyInfo getSubfamily2() {
		org.openxava.test.model.SubfamilyInfo r = new org.openxava.test.model.SubfamilyInfo(); 
		r.setFamily(getSubfamily2_family()); 
		r.setSubfamily(getSubfamily2_subfamily());		
		return r;
	} 	 
	public void setSubfamily2(org.openxava.test.model.SubfamilyInfo newSubfamily2) throws java.rmi.RemoteException { 	
		if (newSubfamily2 == null) newSubfamily2 = new org.openxava.test.model.SubfamilyInfo();		
		setSubfamily2_family(newSubfamily2.getFamily());		
		setSubfamily2_subfamily(newSubfamily2.getSubfamily());			
	} 

	private org.openxava.test.model.IFamily2 subfamily2_family; 	
	public org.openxava.test.model.IFamily2 getSubfamily2_family() {
		if (subfamily2_family != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				subfamily2_family.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return subfamily2_family;
	}
	public void setSubfamily2_family(org.openxava.test.model.IFamily2 newFamily2) {
		if (newFamily2 != null && !(newFamily2 instanceof org.openxava.test.model.Family2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.subfamily2_family = newFamily2; 
	} 

	private org.openxava.test.model.ISubfamily2 subfamily2_subfamily; 	
	public org.openxava.test.model.ISubfamily2 getSubfamily2_subfamily() {
		if (subfamily2_subfamily != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				subfamily2_subfamily.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return subfamily2_subfamily;
	}
	public void setSubfamily2_subfamily(org.openxava.test.model.ISubfamily2 newSubfamily2) {
		if (newSubfamily2 != null && !(newSubfamily2 instanceof org.openxava.test.model.Subfamily2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.subfamily2_subfamily = newSubfamily2; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Product3 findByNumber(long number) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Product3 as o where o.number = :arg0"); 
			query.setParameter("arg0", new Long(number)); 
 			try {
				return (Product3) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Product3"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product3 as o where o.number = :arg0"); 
			query.setParameter("arg0", new Long(number)); 
			Product3 r = (Product3) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Product3"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product3").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Product3"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}