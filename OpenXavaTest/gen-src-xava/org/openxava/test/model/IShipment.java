

// File generated by OpenXava: Fri May 25 12:16:03 CEST 2007
// Archivo generado por OpenXava: Fri May 25 12:16:03 CEST 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Shipment		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IShipment  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	java.sql.Timestamp getTime() throws RemoteException;
	void setTime(java.sql.Timestamp time) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	int getNumber() throws RemoteException; 	
	int getType() throws RemoteException; 	
	int getMode() throws RemoteException;		

	// References/Referencias 

	// CustomerContactPerson : Reference/Referencia
	
	org.openxava.test.model.ICustomerContactPerson getCustomerContactPerson() throws RemoteException;
	void setCustomerContactPerson(org.openxava.test.model.ICustomerContactPerson newCustomerContactPerson) throws RemoteException;

	// Methods 


}