

// File generated by OpenXava: Fri Jul 07 13:38:56 CEST 2006
// Archivo generado por OpenXava: Fri Jul 07 13:38:56 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IProduct  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	String getPhotos() throws RemoteException;
	void setPhotos(String photos) throws RemoteException; 
	int getFamilyNumber() throws RemoteException;
	void setFamilyNumber(int familyNumber) throws RemoteException; 
	java.math.BigDecimal getUnitPrice() throws RemoteException;
	void setUnitPrice(java.math.BigDecimal unitPrice) throws RemoteException; 
	org.openxava.test.model.Warehouse getWarehouseKey() throws RemoteException;
	void setWarehouseKey(org.openxava.test.model.Warehouse warehouseKey) throws RemoteException; 
	int getSubfamilyNumber() throws RemoteException;
	void setSubfamilyNumber(int subfamilyNumber) throws RemoteException; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	java.math.BigDecimal getUnitPriceInPesetas() throws RemoteException; 	
	long getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 
	void increasePrice() throws RemoteException; 
	BigDecimal getPrice(String country, BigDecimal tariff) throws ProductException, PriceException, RemoteException; 


}