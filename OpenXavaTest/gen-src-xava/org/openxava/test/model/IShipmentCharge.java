

// File generated by OpenXava: Thu Jan 18 11:35:02 CET 2007
// Archivo generado por OpenXava: Thu Jan 18 11:35:02 CET 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: ShipmentCharge		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IShipmentCharge  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	java.math.BigDecimal getAmount() throws RemoteException;
	void setAmount(java.math.BigDecimal amount) throws RemoteException; 	
	String getOid() throws RemoteException; 
	int getMode() throws RemoteException;
	void setMode(int mode) throws RemoteException;		

	// References/Referencias 

	// Shipment : Reference/Referencia
	
	org.openxava.test.model.IShipment getShipment() throws RemoteException;
	void setShipment(org.openxava.test.model.IShipment newShipment) throws RemoteException;

	// Methods 


}