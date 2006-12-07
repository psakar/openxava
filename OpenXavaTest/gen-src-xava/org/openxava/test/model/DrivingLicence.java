
// File generated by OpenXava: Thu Dec 07 11:45:15 CET 2006
// Archivo generado por OpenXava: Thu Dec 07 11:45:15 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: DrivingLicence		Entity/Entidad

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
public class DrivingLicence implements java.io.Serializable, org.openxava.test.model.IDrivingLicence {	

	// Constructor
	public DrivingLicence() {
		initMembers();
	} 

	private void initMembers() { 
		setType(null); 
		setLevel(0); 
		setDescription(null); 	
	} 
	
	// Properties/Propiedades 
	private int level;
	public int getLevel() {
		return level;
	}
	public void setLevel(int newLevel) {
		this.level = newLevel;
	} 
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String newType) {
		this.type = newType;
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "DrivingLicence", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "DrivingLicence", "String"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static DrivingLicence findByTypeLevel(java.lang.String type,int level) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from DrivingLicence as o where o.type = :arg0 and level = :arg1"); 
			query.setParameter("arg0", type); 
			query.setParameter("arg1", new Integer(level)); 
 			try {
				return (DrivingLicence) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "DrivingLicence"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from DrivingLicence as o where o.type = :arg0 and level = :arg1"); 
			query.setParameter("arg0", type); 
			query.setParameter("arg1", new Integer(level)); 
			DrivingLicence r = (DrivingLicence) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "DrivingLicence"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("DrivingLicence").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "DrivingLicence"));
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