

// File generated by OpenXava: Tue Dec 02 16:39:39 CET 2008
// Archivo generado por OpenXava: Tue Dec 02 16:39:39 CET 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: AverageSpeed		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IAverageSpeed  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_speed = "speed"; 
	int getSpeed() throws RemoteException;
	void setSpeed(int speed) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException;		

	// References/Referencias 

	// Vehicle : Reference/Referencia
	
	org.openxava.test.model.IVehicle getVehicle() throws RemoteException;
	void setVehicle(org.openxava.test.model.IVehicle newVehicle) throws RemoteException; 

	// Driver : Reference/Referencia
	
	org.openxava.test.model.IDriver getDriver() throws RemoteException;
	void setDriver(org.openxava.test.model.IDriver newDriver) throws RemoteException;

	// Methods 


}