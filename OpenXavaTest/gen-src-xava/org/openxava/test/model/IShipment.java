

// File generated by OpenXava: Thu Jun 29 11:44:28 CEST 2006
// Archivo generado por OpenXava: Thu Jun 29 11:44:28 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Shipment		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IShipment  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	int getType() throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	int getMode() throws RemoteException; 	
	int getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 


}