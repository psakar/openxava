

// File generated by OpenXava: Mon Oct 18 09:51:06 CEST 2010
// Archivo generado por OpenXava: Mon Oct 18 09:51:06 CEST 2010

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Service		Java interface for aggregate/Interfaz java para Agregado: AdditionalDetail

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IAdditionalDetail  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_counter = "counter"; 	
	int getCounter() throws RemoteException; 	
	public static final String PROPERTY_subfamily = "subfamily"; 
	int getSubfamily() throws RemoteException;
	void setSubfamily(int subfamily) throws RemoteException;		

	// References/Referencias 

	// Service : Reference/Referencia
	
	org.openxava.test.model.IService getService() throws RemoteException;
	void setService(org.openxava.test.model.IService newService) throws RemoteException; 

	// Type : Reference/Referencia
	
	org.openxava.test.model.IServiceType getType() throws RemoteException;
	void setType(org.openxava.test.model.IServiceType newType) throws RemoteException;

	// Methods 


}