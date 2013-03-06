
// File generated by OpenXava: Tue Mar 05 13:22:49 CET 2013
// Archivo generado por OpenXava: Tue Mar 05 13:22:49 CET 2013

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Ranges		Entity/Entidad

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
public class Ranges implements java.io.Serializable, org.openxava.test.model.IRanges {	

	// Constructor
	public Ranges() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 
		setType(0); 
		setNumberFrom(0); 
		setNumberTo(0); 
		setDateFrom(null); 
		setDateTo(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter numberFromConverter;
	private org.openxava.converters.IConverter getNumberFromConverter() {
		if (numberFromConverter == null) {
			try {
				numberFromConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("numberFrom");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "numberFrom"));
			}
			
		}	
		return numberFromConverter;
	} 
	private java.lang.Integer numberFrom;
	private java.lang.Integer get_NumberFrom() {
		return numberFrom;
	}
	private void set_NumberFrom(java.lang.Integer newNumberFrom) {
		this.numberFrom = newNumberFrom;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getNumberFrom() {
		try {
			return ((Integer) getNumberFromConverter().toJava(get_NumberFrom())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "NumberFrom", "Ranges", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setNumberFrom(int newNumberFrom) {
		try { 
			set_NumberFrom((java.lang.Integer) getNumberFromConverter().toDB(new Integer(newNumberFrom)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "NumberFrom", "Ranges", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter typeConverter;
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
	private java.lang.Integer type;
	private java.lang.Integer get_Type() {
		return type;
	}
	private void set_Type(java.lang.Integer newType) {
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Type", "Ranges", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setType(int newType) {
		try { 
			set_Type((java.lang.Integer) getTypeConverter().toDB(new Integer(newType)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Type", "Ranges", "int"));
		}		
	} 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 
	private static org.openxava.converters.IConverter dateFromConverter;
	private org.openxava.converters.IConverter getDateFromConverter() {
		if (dateFromConverter == null) {
			try {
				dateFromConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("dateFrom");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "dateFrom"));
			}
			
		}	
		return dateFromConverter;
	} 
	private java.sql.Date dateFrom;
	private java.sql.Date get_DateFrom() {
		return dateFrom;
	}
	private void set_DateFrom(java.sql.Date newDateFrom) {
		this.dateFrom = newDateFrom;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.util.Date getDateFrom() {
		try {
			return (java.util.Date) getDateFromConverter().toJava(get_DateFrom());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DateFrom", "Ranges", "java.util.Date"));
		}
	}
	
	/**
	 * 
	 */
	public void setDateFrom(java.util.Date newDateFrom) {
		try { 
			set_DateFrom((java.sql.Date) getDateFromConverter().toDB(newDateFrom));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DateFrom", "Ranges", "java.util.Date"));
		}		
	} 
	private static org.openxava.converters.IConverter numberToConverter;
	private org.openxava.converters.IConverter getNumberToConverter() {
		if (numberToConverter == null) {
			try {
				numberToConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("numberTo");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "numberTo"));
			}
			
		}	
		return numberToConverter;
	} 
	private java.lang.Integer numberTo;
	private java.lang.Integer get_NumberTo() {
		return numberTo;
	}
	private void set_NumberTo(java.lang.Integer newNumberTo) {
		this.numberTo = newNumberTo;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getNumberTo() {
		try {
			return ((Integer) getNumberToConverter().toJava(get_NumberTo())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "NumberTo", "Ranges", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setNumberTo(int newNumberTo) {
		try { 
			set_NumberTo((java.lang.Integer) getNumberToConverter().toDB(new Integer(newNumberTo)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "NumberTo", "Ranges", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter dateToConverter;
	private org.openxava.converters.IConverter getDateToConverter() {
		if (dateToConverter == null) {
			try {
				dateToConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("dateTo");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "dateTo"));
			}
			
		}	
		return dateToConverter;
	} 
	private java.sql.Date dateTo;
	private java.sql.Date get_DateTo() {
		return dateTo;
	}
	private void set_DateTo(java.sql.Date newDateTo) {
		this.dateTo = newDateTo;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.util.Date getDateTo() {
		try {
			return (java.util.Date) getDateToConverter().toJava(get_DateTo());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DateTo", "Ranges", "java.util.Date"));
		}
	}
	
	/**
	 * 
	 */
	public void setDateTo(java.util.Date newDateTo) {
		try { 
			set_DateTo((java.sql.Date) getDateToConverter().toDB(newDateTo));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DateTo", "Ranges", "java.util.Date"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Ranges findByOid(java.lang.String oid) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Ranges as o where o.oid = :arg0"); 
			query.setParameter("arg0", oid); 
 			try {
				return (Ranges) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Ranges"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Ranges as o where o.oid = :arg0"); 
			query.setParameter("arg0", oid); 
			Ranges r = (Ranges) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Ranges"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Ranges").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Ranges"));
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