

// File generated by OpenXava: Mon Apr 18 19:15:29 CEST 2005
// Archivo generado por OpenXava: Mon Apr 18 19:15:29 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Subfamily2		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface ISubfamily2  {	

	// Properties/Propiedades 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	int getNumber() throws RemoteException;		

	// References/Referencias 

	// Family : Reference/Referencia
	
	org.openxava.test.ejb.Family2 getFamily() throws RemoteException;
	void setFamily(org.openxava.test.ejb.Family2 newFamily) throws RemoteException;
	
	org.openxava.test.ejb.Family2Key getFamilyKey() throws RemoteException;
	void setFamilyKey(org.openxava.test.ejb.Family2Key key) throws RemoteException;

	// Methods 


}