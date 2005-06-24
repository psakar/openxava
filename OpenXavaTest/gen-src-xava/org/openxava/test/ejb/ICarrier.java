

// File generated by OpenXava: Fri Jun 24 13:40:01 CEST 2005
// Archivo generado por OpenXava: Fri Jun 24 13:40:01 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Carrier		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface ICarrier  {	

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
	
	org.openxava.test.ejb.Warehouse getWarehouse() throws RemoteException;
	void setWarehouse(org.openxava.test.ejb.Warehouse newWarehouse) throws RemoteException;
	
	org.openxava.test.ejb.WarehouseKey getWarehouseKey() throws RemoteException;
	void setWarehouseKey(org.openxava.test.ejb.WarehouseKey key) throws RemoteException; 

	// DrivingLicence : Reference/Referencia
	
	org.openxava.test.ejb.DrivingLicence getDrivingLicence() throws RemoteException;
	void setDrivingLicence(org.openxava.test.ejb.DrivingLicence newDrivingLicence) throws RemoteException;
	
	org.openxava.test.ejb.DrivingLicenceKey getDrivingLicenceKey() throws RemoteException;
	void setDrivingLicenceKey(org.openxava.test.ejb.DrivingLicenceKey key) throws RemoteException;

	// Methods 
	void translate() throws RemoteException; 


}