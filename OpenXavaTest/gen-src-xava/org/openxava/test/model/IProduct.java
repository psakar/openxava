

// File generated by OpenXava: Tue Dec 02 16:39:39 CET 2008
// Archivo generado por OpenXava: Tue Dec 02 16:39:39 CET 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IProduct  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_photos = "photos"; 
	String getPhotos() throws RemoteException;
	void setPhotos(String photos) throws RemoteException; 	
	public static final String PROPERTY_familyNumber = "familyNumber"; 
	int getFamilyNumber() throws RemoteException;
	void setFamilyNumber(int familyNumber) throws RemoteException; 	
	public static final String PROPERTY_unitPrice = "unitPrice"; 
	java.math.BigDecimal getUnitPrice() throws RemoteException;
	void setUnitPrice(java.math.BigDecimal unitPrice) throws RemoteException; 	
	public static final String PROPERTY_warehouseKey = "warehouseKey"; 
	org.openxava.test.model.Warehouse getWarehouseKey() throws RemoteException;
	void setWarehouseKey(org.openxava.test.model.Warehouse warehouseKey) throws RemoteException; 	
	public static final String PROPERTY_subfamilyNumber = "subfamilyNumber"; 
	int getSubfamilyNumber() throws RemoteException;
	void setSubfamilyNumber(int subfamilyNumber) throws RemoteException; 	
	public static final String PROPERTY_remarks = "remarks"; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_unitPriceInPesetas = "unitPriceInPesetas"; 	
	java.math.BigDecimal getUnitPriceInPesetas() throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 	
	long getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 
	void increasePrice() throws RemoteException; 
	BigDecimal getPrice(String country, BigDecimal tariff) throws ProductException, PriceException, RemoteException; 


}