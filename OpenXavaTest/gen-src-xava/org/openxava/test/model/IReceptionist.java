

// File generated by OpenXava: Wed Sep 21 17:49:21 CEST 2005
// Archivo generado por OpenXava: Wed Sep 21 17:49:21 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Java interface for aggregate/Interfaz java para Agregado: Receptionist

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IReceptionist  {	

	// Properties/Propiedades 	
	int getOid() throws RemoteException; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException;		

	// References/Referencias 

	// DeliveryPlace : Reference/Referencia
	
	org.openxava.test.model.IDeliveryPlace getDeliveryPlace() throws RemoteException;
	void setDeliveryPlace(org.openxava.test.model.IDeliveryPlace newDeliveryPlace) throws RemoteException;

	// Methods 


}