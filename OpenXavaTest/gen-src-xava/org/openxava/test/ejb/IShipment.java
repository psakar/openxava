

// File generated by OpenXava: Tue Mar 29 10:25:49 CEST 2005
// Archivo generado por OpenXava: Tue Mar 29 10:25:49 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Shipment		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface IShipment  {	

	// Properties/Propiedades 	
	int getType() throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	int getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 


}