

// File generated by OpenXava: Mon Apr 29 14:27:43 CEST 2013
// Archivo generado por OpenXava: Mon Apr 29 14:27:43 CEST 2013

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Thing		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IThing  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_name = "name"; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 


}