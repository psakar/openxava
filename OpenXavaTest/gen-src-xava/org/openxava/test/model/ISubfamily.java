

// File generated by OpenXava: Mon Mar 06 11:23:05 CET 2017
// Archivo generado por OpenXava: Mon Mar 06 11:23:05 CET 2017

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Subfamily		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ISubfamily  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_family = "family"; 
	String getFamily() throws RemoteException;
	void setFamily(String family) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException; 	
	public static final String PROPERTY_remarks = "remarks"; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 
	int getNumber() throws RemoteException;
	void setNumber(int number) throws RemoteException; 	
	public static final String PROPERTY_familyNumber = "familyNumber"; 
	int getFamilyNumber() throws RemoteException;
	void setFamilyNumber(int familyNumber) throws RemoteException;		

	// References/Referencias

	// Methods 


}