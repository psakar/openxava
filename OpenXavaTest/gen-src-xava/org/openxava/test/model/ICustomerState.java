

// File generated by OpenXava: Tue Dec 13 12:49:17 CET 2011
// Archivo generado por OpenXava: Tue Dec 13 12:49:17 CET 2011

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Java interface for aggregate/Interfaz java para Agregado: CustomerState

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ICustomerState  extends org.openxava.model.IModel {	

	// Properties/Propiedades		

	// References/Referencias 

	// State : Reference/Referencia
	
	org.openxava.test.model.IState getState() throws RemoteException;
	void setState(org.openxava.test.model.IState newState) throws RemoteException; 

	// Customer : Reference/Referencia
	
	org.openxava.test.model.ICustomer getCustomer() throws RemoteException;
	void setCustomer(org.openxava.test.model.ICustomer newCustomer) throws RemoteException;

	// Methods 


}