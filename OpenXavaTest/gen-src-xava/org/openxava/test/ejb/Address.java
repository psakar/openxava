

// File generated by OpenXava: Thu Jun 16 10:32:59 CEST 2005
// Archivo generado por OpenXava: Thu Jun 16 10:32:59 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR

package org.openxava.test.ejb;

public class Address implements java.io.Serializable, org.openxava.test.ejb.IWithCity {

	// Attributes/Atributos 
	private int zipCode; 
	private String street; 
	private String city; 
	private org.openxava.test.ejb.State state;



	// Properties/Propiedades 
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int newZipCode) {
		this.zipCode = newZipCode;
	} 
	public String getStreet() {
		return street;
	}
	public void setStreet(String newStreet) {
		this.street = newStreet;
	} 
	public String getCity() {
		return city;
	}
	public void setCity(String newCity) {
		this.city = newCity;
	}

	// References 
	public org.openxava.test.ejb.State getState() {
		return state;
	}
	public void setState(org.openxava.test.ejb.State newState) {
		this.state = newState;
	}
	

}