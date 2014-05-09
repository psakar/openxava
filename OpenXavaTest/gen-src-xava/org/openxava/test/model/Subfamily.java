
// File generated by OpenXava: Thu May 08 21:37:02 CEST 2014
// Archivo generado por OpenXava: Thu May 08 21:37:02 CEST 2014

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Subfamily		Entity/Entidad

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
public class Subfamily implements java.io.Serializable, org.openxava.test.model.ISubfamily {	

	// Constructor
	public Subfamily() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 
		setNumber(0); 
		setFamilyNumber(0); 
		setFamily(null); 
		setDescription(null); 
		setRemarks(null); 	
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Subfamily", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Subfamily", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter familyConverter;
	private org.openxava.converters.IConverter getFamilyConverter() {
		if (familyConverter == null) {
			try {
				familyConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("family");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "family"));
			}
			
		}	
		return familyConverter;
	} 
	private java.lang.String family;
	private java.lang.String get_Family() {
		return family;
	}
	private void set_Family(java.lang.String newFamily) {
		this.family = newFamily;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getFamily() {
		try {
			return (String) getFamilyConverter().toJava(get_Family());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Family", "Subfamily", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setFamily(String newFamily) {
		try { 
			set_Family((java.lang.String) getFamilyConverter().toDB(newFamily));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Family", "Subfamily", "String"));
		}		
	} 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 
	private static org.openxava.converters.IConverter remarksConverter;
	private org.openxava.converters.IConverter getRemarksConverter() {
		if (remarksConverter == null) {
			try {
				remarksConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("remarks");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "remarks"));
			}
			
		}	
		return remarksConverter;
	} 
	private java.lang.String remarks;
	private java.lang.String get_Remarks() {
		return remarks;
	}
	private void set_Remarks(java.lang.String newRemarks) {
		this.remarks = newRemarks;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getRemarks() {
		try {
			return (java.lang.String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Subfamily", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setRemarks(java.lang.String newRemarks) {
		try { 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Subfamily", "java.lang.String"));
		}		
	} 
	private static org.openxava.converters.IConverter numberConverter;
	private org.openxava.converters.IConverter getNumberConverter() {
		if (numberConverter == null) {
			try {
				numberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("number");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "number"));
			}
			
		}	
		return numberConverter;
	} 
	private java.lang.Integer number;
	private java.lang.Integer get_Number() {
		return number;
	}
	private void set_Number(java.lang.Integer newNumber) {
		this.number = newNumber;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getNumber() {
		try {
			return ((Integer) getNumberConverter().toJava(get_Number())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Number", "Subfamily", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setNumber(int newNumber) {
		try { 
			set_Number((java.lang.Integer) getNumberConverter().toDB(new Integer(newNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Number", "Subfamily", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter familyNumberConverter;
	private org.openxava.converters.IConverter getFamilyNumberConverter() {
		if (familyNumberConverter == null) {
			try {
				familyNumberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("familyNumber");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "familyNumber"));
			}
			
		}	
		return familyNumberConverter;
	} 
	private java.lang.Integer familyNumber;
	private java.lang.Integer get_FamilyNumber() {
		return familyNumber;
	}
	private void set_FamilyNumber(java.lang.Integer newFamilyNumber) {
		this.familyNumber = newFamilyNumber;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getFamilyNumber() {
		try {
			return ((Integer) getFamilyNumberConverter().toJava(get_FamilyNumber())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FamilyNumber", "Subfamily", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setFamilyNumber(int newFamilyNumber) {
		try { 
			set_FamilyNumber((java.lang.Integer) getFamilyNumberConverter().toDB(new Integer(newFamilyNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FamilyNumber", "Subfamily", "int"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Subfamily findByOid(java.lang.String oid) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Subfamily as o where o.oid = :arg0"); 
			query.setParameter("arg0", oid); 
 			try {
				return (Subfamily) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Subfamily"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Subfamily as o where o.oid = :arg0"); 
			query.setParameter("arg0", oid); 
			Subfamily r = (Subfamily) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Subfamily"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Subfamily").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Subfamily"));
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