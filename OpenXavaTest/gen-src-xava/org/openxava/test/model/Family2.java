
// File generated by OpenXava: Thu Apr 21 19:35:03 CEST 2005
// Archivo generado por OpenXava: Thu Apr 21 19:35:03 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Family2		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Family2 implements java.io.Serializable {	
	
	// Properties/Propiedades 
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Family2", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Family2", "String"));
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

	// Colecciones/Collections 
	
	private MetaModel metaModel;
	private MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Family2").getMetaEntity(); 	
		}
		return metaModel;
	}
}