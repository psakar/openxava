

// File generated by OpenXava: Wed Jul 27 12:15:13 CEST 2011
// Archivo generado por OpenXava: Wed Jul 27 12:15:13 CEST 2011

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Course		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ICourse  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_year = "year"; 	
	int getYear() throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_dtype = "dtype"; 
	String getDtype() throws RemoteException;
	void setDtype(String dtype) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException;		

	// References/Referencias

	// Methods 


}