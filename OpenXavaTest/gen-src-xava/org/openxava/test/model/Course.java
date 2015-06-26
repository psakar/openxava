
// File generated by OpenXava: Thu Jun 25 13:27:33 CEST 2015
// Archivo generado por OpenXava: Thu Jun 25 13:27:33 CEST 2015

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Course		Entity/Entidad

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
public class Course implements java.io.Serializable, org.openxava.test.model.ICourse {	

	// Constructor
	public Course() {
		initMembers();
	} 

	private void initMembers() { 
		setYear(0); 
		setNumber(0); 
		setDescription(null); 
		setDtype(null); 	
	} 
	
	// Properties/Propiedades 
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Course", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Course", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter dtypeConverter;
	private org.openxava.converters.IConverter getDtypeConverter() {
		if (dtypeConverter == null) {
			try {
				dtypeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("dtype");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "dtype"));
			}
			
		}	
		return dtypeConverter;
	} 
	private java.lang.String dtype;
	private java.lang.String get_Dtype() {
		return dtype;
	}
	private void set_Dtype(java.lang.String newDtype) {
		this.dtype = newDtype;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getDtype() {
		try {
			return (String) getDtypeConverter().toJava(get_Dtype());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Dtype", "Course", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setDtype(String newDtype) {
		try { 
			set_Dtype((java.lang.String) getDtypeConverter().toDB(newDtype));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Dtype", "Course", "String"));
		}		
	} 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int newYear) {
		this.year = newYear;
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Course findByYearNumber(int year,int number) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Course as o where o.year = :arg0 and number = :arg1"); 
			query.setParameter("arg0", new Integer(year)); 
			query.setParameter("arg1", new Integer(number)); 
 			try {
				return (Course) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Course"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Course as o where o.year = :arg0 and number = :arg1"); 
			query.setParameter("arg0", new Integer(year)); 
			query.setParameter("arg1", new Integer(number)); 
			Course r = (Course) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Course"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Course").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Course"));
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