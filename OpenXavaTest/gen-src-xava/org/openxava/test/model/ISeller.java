

// File generated by OpenXava: Fri Sep 23 17:12:43 CEST 2005
// Archivo generado por OpenXava: Fri Sep 23 17:12:43 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Seller		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ISeller  {	

	// Properties/Propiedades 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 	
	int getNumber() throws RemoteException; 
	void addToCustomers(org.openxava.test.model.ICustomer newElement) throws RemoteException;
	void removeFromCustomers(org.openxava.test.model.ICustomer toRemove) throws RemoteException;	

	java.util.Collection getCustomers() throws RemoteException;		

	// References/Referencias 

	// Level : Reference/Referencia
	
	org.openxava.test.model.ISellerLevel getLevel() throws RemoteException;
	void setLevel(org.openxava.test.model.ISellerLevel newLevel) throws RemoteException; 

	// Boss : Reference/Referencia
	
	org.openxava.test.model.ISeller getBoss() throws RemoteException;
	void setBoss(org.openxava.test.model.ISeller newBoss) throws RemoteException;

	// Methods 


}