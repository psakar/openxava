

// File generated by OpenXava: Wed Sep 14 14:32:42 CEST 2011
// Archivo generado por OpenXava: Wed Sep 14 14:32:42 CEST 2011

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: ServiceInvoice		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IServiceInvoice  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_amount = "amount"; 
	java.math.BigDecimal getAmount() throws RemoteException;
	void setAmount(java.math.BigDecimal amount) throws RemoteException; 	
	public static final String PROPERTY_year = "year"; 
	int getYear() throws RemoteException;
	void setYear(int year) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	java.lang.String getDescription() throws RemoteException;
	void setDescription(java.lang.String description) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 
	int getNumber() throws RemoteException;
	void setNumber(int number) throws RemoteException;		

	// References/Referencias

	// Methods 


}