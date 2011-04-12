
// File generated by OpenXava: Mon Apr 11 14:05:49 CEST 2011
// Archivo generado por OpenXava: Mon Apr 11 14:05:49 CEST 2011

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Aggregate/Agregado: DeliveryPlace

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
public class DeliveryPlace implements java.io.Serializable, org.openxava.test.model.IDeliveryPlace {	

	// Constructor
	public DeliveryPlace() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(0); 
		setName(null); 
		setAddress(null); 
		setRemarks(null); 	
	} 
	
	// Properties/Propiedades 
	private int oid;
	public int getOid() {
		return oid;
	}
	public void setOid(int newOid) {
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
	public String getRemarks() {
		try {
			return (String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "DeliveryPlace", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setRemarks(String newRemarks) {
		try { 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "DeliveryPlace", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter addressConverter;
	private org.openxava.converters.IConverter getAddressConverter() {
		if (addressConverter == null) {
			try {
				addressConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("address");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "address"));
			}
			
		}	
		return addressConverter;
	} 
	private java.lang.String address;
	private java.lang.String get_Address() {
		return address;
	}
	private void set_Address(java.lang.String newAddress) {
		this.address = newAddress;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getAddress() {
		try {
			return (String) getAddressConverter().toJava(get_Address());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address", "DeliveryPlace", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setAddress(String newAddress) {
		try { 
			set_Address((java.lang.String) getAddressConverter().toDB(newAddress));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Address", "DeliveryPlace", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String name;
	private java.lang.String get_Name() {
		return name;
	}
	private void set_Name(java.lang.String newName) {
		this.name = newName;
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "DeliveryPlace", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "DeliveryPlace", "String"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.ICustomer customer; 	
	public org.openxava.test.model.ICustomer getCustomer() {
		if (customer != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				customer.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return customer;
	}
	public void setCustomer(org.openxava.test.model.ICustomer newCustomer) {
		if (newCustomer != null && !(newCustomer instanceof org.openxava.test.model.Customer)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.customer = newCustomer; 
	} 

	private org.openxava.test.model.IWarehouse preferredWarehouse; 	
	public org.openxava.test.model.IWarehouse getPreferredWarehouse() {
		if (preferredWarehouse != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				preferredWarehouse.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return preferredWarehouse;
	}
	public void setPreferredWarehouse(org.openxava.test.model.IWarehouse newWarehouse) {
		if (newWarehouse != null && !(newWarehouse instanceof org.openxava.test.model.Warehouse)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.preferredWarehouse = newWarehouse; 
	} 

	// Colecciones/Collections 
	private java.util.Collection receptionists;
	public java.util.Collection getReceptionists() {
		return receptionists;
	}
	public void setReceptionists(java.util.Collection receptionists) {
		this.receptionists = receptionists;
	} 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Customer").getMetaAggregate("DeliveryPlace"); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "DeliveryPlace"));
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