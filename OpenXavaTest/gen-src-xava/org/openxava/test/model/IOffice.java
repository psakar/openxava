

// File generated by OpenXava: Thu Feb 02 10:38:08 CET 2006
// Archivo generado por OpenXava: Thu Feb 02 10:38:08 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Office		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IOffice  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	int getReceptionist() throws RemoteException;
	void setReceptionist(int receptionist) throws RemoteException; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 
	int getZoneNumber() throws RemoteException;
	void setZoneNumber(int zoneNumber) throws RemoteException; 	
	int getNumber() throws RemoteException;		

	// References/Referencias 

	// OfficeManager : Reference/Referencia
	
	org.openxava.test.model.IClerk getOfficeManager() throws RemoteException;
	void setOfficeManager(org.openxava.test.model.IClerk newOfficeManager) throws RemoteException; 

	// DefaultCarrier : Reference/Referencia
	
	org.openxava.test.model.ICarrier getDefaultCarrier() throws RemoteException;
	void setDefaultCarrier(org.openxava.test.model.ICarrier newDefaultCarrier) throws RemoteException; 

	// MainWarehouse : Reference/Referencia
	
	org.openxava.test.model.IWarehouse getMainWarehouse() throws RemoteException;
	void setMainWarehouse(org.openxava.test.model.IWarehouse newMainWarehouse) throws RemoteException;

	// Methods 


}