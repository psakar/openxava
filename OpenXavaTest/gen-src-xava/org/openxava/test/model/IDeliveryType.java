

// File generated by OpenXava: Wed Nov 26 19:38:07 CET 2008
// Archivo generado por OpenXava: Wed Nov 26 19:38:07 CET 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: DeliveryType		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IDeliveryType  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException;	

	java.util.Collection getDeliveries() throws RemoteException;		

	// References/Referencias

	// Methods 


}