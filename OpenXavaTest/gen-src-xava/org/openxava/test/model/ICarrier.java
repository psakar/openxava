

// File generated by OpenXava: Wed Mar 14 19:23:18 CET 2007
// Archivo generado por OpenXava: Wed Mar 14 19:23:18 CET 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Carrier		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ICarrier  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 	
	String getCalculated() throws RemoteException; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 	
	int getNumber() throws RemoteException;	

	java.util.Collection getFellowCarriersCalculated() throws RemoteException;	

	java.util.Collection getFellowCarriers() throws RemoteException;		

	// References/Referencias 

	// Warehouse : Reference/Referencia
	
	org.openxava.test.model.IWarehouse getWarehouse() throws RemoteException;
	void setWarehouse(org.openxava.test.model.IWarehouse newWarehouse) throws RemoteException; 

	// DrivingLicence : Reference/Referencia
	
	org.openxava.test.model.IDrivingLicence getDrivingLicence() throws RemoteException;
	void setDrivingLicence(org.openxava.test.model.IDrivingLicence newDrivingLicence) throws RemoteException;

	// Methods 
	void translateToEnglish() throws RemoteException; 
	void translate() throws RemoteException; 
	void translateToSpanish() throws RemoteException; 


}