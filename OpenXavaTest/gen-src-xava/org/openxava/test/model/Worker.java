
// File generated by OpenXava: Tue Mar 05 13:22:48 CET 2013
// Archivo generado por OpenXava: Tue Mar 05 13:22:48 CET 2013

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Worker		Entity/Entidad

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
public class Worker implements java.io.Serializable, org.openxava.test.model.IWorker {	

	// Constructor
	public Worker() {
		initMembers();
	} 

	private void initMembers() { 
		setId(null); 
		setNickName(null); 
		setFullName(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter fullNameConverter;
	private org.openxava.converters.IConverter getFullNameConverter() {
		if (fullNameConverter == null) {
			try {
				fullNameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("fullName");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "fullName"));
			}
			
		}	
		return fullNameConverter;
	} 
	private java.lang.String fullName;
	private java.lang.String get_FullName() {
		return fullName;
	}
	private void set_FullName(java.lang.String newFullName) {
		this.fullName = newFullName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getFullName() {
		try {
			return (String) getFullNameConverter().toJava(get_FullName());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FullName", "Worker", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setFullName(String newFullName) {
		try { 
			set_FullName((java.lang.String) getFullNameConverter().toDB(newFullName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FullName", "Worker", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter nickNameConverter;
	private org.openxava.converters.IConverter getNickNameConverter() {
		if (nickNameConverter == null) {
			try {
				nickNameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("nickName");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "nickName"));
			}
			
		}	
		return nickNameConverter;
	} 
	private java.lang.String nickName;
	private java.lang.String get_NickName() {
		return nickName;
	}
	private void set_NickName(java.lang.String newNickName) {
		this.nickName = newNickName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getNickName() {
		try {
			return (String) getNickNameConverter().toJava(get_NickName());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "NickName", "Worker", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setNickName(String newNickName) {
		try { 
			set_NickName((java.lang.String) getNickNameConverter().toDB(newNickName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "NickName", "Worker", "String"));
		}		
	} 
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer newId) {
		this.id = newId;
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Worker findById(java.lang.Integer id) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Worker as o where o.id = :arg0"); 
			query.setParameter("arg0", id); 
 			try {
				return (Worker) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Worker"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Worker as o where o.id = :arg0"); 
			query.setParameter("arg0", id); 
			Worker r = (Worker) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Worker"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Worker").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Worker"));
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