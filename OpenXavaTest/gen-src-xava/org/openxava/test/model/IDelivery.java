

// File generated by OpenXava: Wed Apr 05 09:29:03 CEST 2006
// Archivo generado por OpenXava: Wed Apr 05 09:29:03 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Delivery		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IDelivery  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	java.util.Date getDateAsLabel() throws RemoteException; 
	int getDistance() throws RemoteException;
	void setDistance(int distance) throws RemoteException; 
	java.lang.String getIncidents() throws RemoteException;
	void setIncidents(java.lang.String incidents) throws RemoteException; 
	String getDriverType() throws RemoteException;
	void setDriverType(String driverType) throws RemoteException; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 
	String getEmployee() throws RemoteException;
	void setEmployee(String employee) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 
	String getVehicle() throws RemoteException;
	void setVehicle(String vehicle) throws RemoteException; 	
	String getTransportMode() throws RemoteException; 
	java.util.Date getDate() throws RemoteException;
	void setDate(java.util.Date date) throws RemoteException; 	
	int getNumber() throws RemoteException;	

	java.util.Collection getDetails() throws RemoteException;		

	// References/Referencias 

	// Type : Reference/Referencia
	
	org.openxava.test.model.IDeliveryType getType() throws RemoteException;
	void setType(org.openxava.test.model.IDeliveryType newType) throws RemoteException; 

	// Shipment : Reference/Referencia
	
	org.openxava.test.model.IShipment getShipment() throws RemoteException;
	void setShipment(org.openxava.test.model.IShipment newShipment) throws RemoteException; 

	// Carrier : Reference/Referencia
	
	org.openxava.test.model.ICarrier getCarrier() throws RemoteException;
	void setCarrier(org.openxava.test.model.ICarrier newCarrier) throws RemoteException; 

	// Invoice : Reference/Referencia
	
	org.openxava.test.model.IInvoice getInvoice() throws RemoteException;
	void setInvoice(org.openxava.test.model.IInvoice newInvoice) throws RemoteException;

	// Methods 


}