

// File generated by OpenXava: Thu Aug 01 14:06:30 CEST 2013
// Archivo generado por OpenXava: Thu Aug 01 14:06:30 CEST 2013

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: DrivingLicence		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IDrivingLicence  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_level = "level"; 	
	int getLevel() throws RemoteException; 	
	public static final String PROPERTY_type = "type"; 	
	String getType() throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException;		

	// References/Referencias

	// Methods 


}