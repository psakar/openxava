
// File generated by OpenXava: Wed Apr 06 16:46:55 CEST 2005
// Archivo generado por OpenXava: Wed Apr 06 16:46:55 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product3		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Product3 implements java.io.Serializable {	
	
	// Properties/Propiedades 
	private org.openxava.converters.TrimStringConverter commentsConverter;
	private org.openxava.converters.TrimStringConverter getCommentsConverter() {
		if (commentsConverter == null) {
			try {
				commentsConverter = (org.openxava.converters.TrimStringConverter) 
					getMetaModel().getMapping().getConverter("comments");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "comments"));
			}
			
		}	
		return commentsConverter;
	} 
	private java.lang.String _comments;
	private java.lang.String get_Comments() {
		return _comments;
	}
	private void set_Comments(java.lang.String newComments) {
		this._comments = newComments;
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
	private org.openxava.converters.TrimStringConverter descriptionConverter;
	private org.openxava.converters.TrimStringConverter getDescriptionConverter() {
		if (descriptionConverter == null) {
			try {
				descriptionConverter = (org.openxava.converters.TrimStringConverter) 
					getMetaModel().getMapping().getConverter("description");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "description"));
			}
			
		}	
		return descriptionConverter;
	} 
	private java.lang.String _description;
	private java.lang.String get_Description() {
		return _description;
	}
	private void set_Description(java.lang.String newDescription) {
		this._description = newDescription;
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
	private Family family;
	public Family getFamily() {
		return family;
	}
	public void setFamily(Family newFamily) {
		this.family = newFamily;
	} 

	// Colecciones/Collections 
	
	private MetaModel metaModel;
	private MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product3").getMetaEntity(); 	
		}
		return metaModel;
	}
}