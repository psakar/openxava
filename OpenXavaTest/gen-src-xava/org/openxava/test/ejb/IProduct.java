

// File generated by OpenXava: Tue Mar 01 17:31:54 CET 2005
// Archivo generado por OpenXava: Tue Mar 01 17:31:54 CET 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface IProduct {	

	// Properties/Propiedades 
	int getFamilyNumber() throws RemoteException;
	void setFamilyNumber(int FamilyNumber) throws RemoteException; 
	java.math.BigDecimal getUnitPrice() throws RemoteException;
	void setUnitPrice(java.math.BigDecimal UnitPrice) throws RemoteException; 
	org.openxava.test.ejb.WarehouseKey getWarehouseKey() throws RemoteException;
	void setWarehouseKey(org.openxava.test.ejb.WarehouseKey WarehouseKey) throws RemoteException; 
	int getSubfamilyNumber() throws RemoteException;
	void setSubfamilyNumber(int SubfamilyNumber) throws RemoteException; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String Remarks) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String Description) throws RemoteException; 	
	java.math.BigDecimal getUnitPriceInPesetas() throws RemoteException; 	
	long getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 
	void increasePrice() throws RemoteException; 
	BigDecimal getPrice(String country, BigDecimal tariff) throws ProductException, PriceException, RemoteException; 


}