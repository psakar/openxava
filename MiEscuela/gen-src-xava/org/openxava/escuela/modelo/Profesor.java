
// File generated by OpenXava: Tue Aug 01 18:16:41 CEST 2006
// Archivo generado por OpenXava: Tue Aug 01 18:16:41 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Profesor		Entity/Entidad

package org.openxava.escuela.modelo;

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
public class Profesor implements java.io.Serializable, org.openxava.escuela.modelo.IProfesor {	

	// Constructor
	public Profesor() {
		initMembers();
	} 

	private void initMembers() { 
		setCodigo(null); 
		setNombre(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter nombreConverter;
	private org.openxava.converters.IConverter getNombreConverter() {
		if (nombreConverter == null) {
			try {
				nombreConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("nombre");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "nombre"));
			}
			
		}	
		return nombreConverter;
	} 
	private java.lang.String nombre;
	private java.lang.String get_Nombre() {
		return nombre;
	}
	private void set_Nombre(java.lang.String newNombre) {
		this.nombre = newNombre;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getNombre() {
		try {
			return (String) getNombreConverter().toJava(get_Nombre());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Nombre", "Profesor", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setNombre(String newNombre) {
		try { 
			set_Nombre((java.lang.String) getNombreConverter().toDB(newNombre));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Nombre", "Profesor", "String"));
		}		
	} 
	private String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String newCodigo) {
		this.codigo = newCodigo;
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Profesor findByCodigo(java.lang.String codigo) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) {
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Profesor as o where o.codigo = :arg0"); 
			query.setParameter("arg0", codigo); 
 			try {
				return (Profesor) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Profesor"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			} 
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Profesor as o where o.codigo = :arg0"); 
			query.setParameter("arg0", codigo); 
			Profesor r = (Profesor) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Profesor"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Profesor").getMetaEntity(); 	
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