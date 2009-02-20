

// File generated by OpenXava: Fri Feb 20 17:12:33 CET 2009
// Archivo generado por OpenXava: Fri Feb 20 17:12:33 CET 2009

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Service		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IService  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_family = "family"; 
	int getFamily() throws RemoteException;
	void setFamily(int family) throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException;	

	java.util.Collection getAdditionalDetails() throws RemoteException;		

	// References/Referencias  	
	// Detail : Aggregate 
	
	org.openxava.test.model.Detail getDetail() throws RemoteException;
	void setDetail(org.openxava.test.model.Detail newDetail) throws RemoteException; 

	// Invoice : Reference/Referencia
	
	org.openxava.test.model.IServiceInvoice getInvoice() throws RemoteException;
	void setInvoice(org.openxava.test.model.IServiceInvoice newInvoice) throws RemoteException;

	// Methods 


}