

// File generated by OpenXava: Wed Jan 18 11:38:35 CET 2006
// Archivo generado por OpenXava: Wed Jan 18 11:38:35 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Subfamily2		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ISubfamily2  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	int getNumber() throws RemoteException;		

	// References/Referencias 

	// Family : Reference/Referencia
	
	org.openxava.test.model.IFamily2 getFamily() throws RemoteException;
	void setFamily(org.openxava.test.model.IFamily2 newFamily) throws RemoteException;

	// Methods 
	java.util.Collection getProductsValues() throws RemoteException; 


}