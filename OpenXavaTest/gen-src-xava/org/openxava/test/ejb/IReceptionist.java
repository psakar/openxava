

// File generated by OpenXava: Thu Mar 10 18:03:52 CET 2005
// Archivo generado por OpenXava: Thu Mar 10 18:03:52 CET 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Java interface for aggregate/Interfaz java para Agregado: Receptionist

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface IReceptionist {	

	// Properties/Propiedades 	
	int getOid() throws RemoteException; 
	String getName() throws RemoteException;
	void setName(String Name) throws RemoteException;		

	// References/Referencias 

	// DeliveryPlace : Reference/Referencia
	
	org.openxava.test.ejb.DeliveryPlace getDeliveryPlace() throws RemoteException;
	void setDeliveryPlace(org.openxava.test.ejb.DeliveryPlace newDeliveryPlace) throws RemoteException;
	
	org.openxava.test.ejb.DeliveryPlaceKey getDeliveryPlaceKey() throws RemoteException;
	void setDeliveryPlaceKey(org.openxava.test.ejb.DeliveryPlaceKey key) throws RemoteException;

	// Methods 


}