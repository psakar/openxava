

// File generated by OpenXava: Fri Nov 30 13:12:46 CET 2012
// Archivo generado por OpenXava: Fri Nov 30 13:12:46 CET 2012

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Ranges		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IRanges  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_numberFrom = "numberFrom"; 
	int getNumberFrom() throws RemoteException;
	void setNumberFrom(int numberFrom) throws RemoteException; 	
	public static final String PROPERTY_type = "type"; 
	int getType() throws RemoteException;
	void setType(int type) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException; 	
	public static final String PROPERTY_dateFrom = "dateFrom"; 
	java.util.Date getDateFrom() throws RemoteException;
	void setDateFrom(java.util.Date dateFrom) throws RemoteException; 	
	public static final String PROPERTY_numberTo = "numberTo"; 
	int getNumberTo() throws RemoteException;
	void setNumberTo(int numberTo) throws RemoteException; 	
	public static final String PROPERTY_dateTo = "dateTo"; 
	java.util.Date getDateTo() throws RemoteException;
	void setDateTo(java.util.Date dateTo) throws RemoteException;		

	// References/Referencias

	// Methods 


}