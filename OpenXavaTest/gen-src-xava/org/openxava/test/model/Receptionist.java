
// File generated by OpenXava: Tue Nov 08 13:33:12 CET 2005
// Archivo generado por OpenXava: Tue Nov 08 13:33:12 CET 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Aggregate/Agregado: Receptionist

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
public class Receptionist implements java.io.Serializable, org.openxava.test.model.IReceptionist {	
	
	// Properties/Propiedades 
	private int oid;
	public int getOid() {
		return oid;
	}
	public void setOid(int newOid) {
		this.oid = newOid;
	} 
	private org.openxava.converters.TrimStringConverter nameConverter;
	private org.openxava.converters.TrimStringConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.TrimStringConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String _name;
	private java.lang.String get_Name() {
		return _name;
	}
	private void set_Name(java.lang.String newName) {
		this._name = newName;
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Receptionist", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Receptionist", "String"));
		}		
	} 

	// References/Referencias 
	private org.openxava.test.model.IDeliveryPlace deliveryPlace;
	public org.openxava.test.model.IDeliveryPlace getDeliveryPlace() {
		return deliveryPlace;
	}
	public void setDeliveryPlace(org.openxava.test.model.IDeliveryPlace newDeliveryPlace) {
		this.deliveryPlace = newDeliveryPlace;
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	private MetaModel metaModel;
	private MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Customer").getMetaAggregate("Receptionist"); 	
		}
		return metaModel;
	}
	
	public String toString() { 
		return "Receptionist::" + oid;
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}