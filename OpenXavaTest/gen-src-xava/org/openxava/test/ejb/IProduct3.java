

// File generated by OpenXava: Mon Apr 18 19:15:28 CEST 2005
// Archivo generado por OpenXava: Mon Apr 18 19:15:28 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product3		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface IProduct3  {	

	// Properties/Propiedades 
	java.lang.String getComments() throws RemoteException;
	void setComments(java.lang.String comments) throws RemoteException; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	long getNumber() throws RemoteException;		

	// References/Referencias 

	// Family : Reference/Referencia
	
	org.openxava.test.ejb.Family getFamily() throws RemoteException;
	void setFamily(org.openxava.test.ejb.Family newFamily) throws RemoteException;
	
	org.openxava.test.ejb.FamilyKey getFamilyKey() throws RemoteException;
	void setFamilyKey(org.openxava.test.ejb.FamilyKey key) throws RemoteException;

	// Methods 


}