

// File generated by OpenXava: Tue Aug 16 09:26:05 CEST 2005
// Archivo generado por OpenXava: Tue Aug 16 09:26:05 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: FilterBySubfamily		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface IFilterBySubfamily  {	

	// Properties/Propiedades 	
	String getOid() throws RemoteException;		

	// References/Referencias 

	// SubfamilyTo : Reference/Referencia
	
	org.openxava.test.ejb.Subfamily2 getSubfamilyTo() throws RemoteException;
	void setSubfamilyTo(org.openxava.test.ejb.Subfamily2 newSubfamilyTo) throws RemoteException;
	
	org.openxava.test.ejb.Subfamily2Key getSubfamilyToKey() throws RemoteException;
	void setSubfamilyToKey(org.openxava.test.ejb.Subfamily2Key key) throws RemoteException; 

	// Subfamily : Reference/Referencia
	
	org.openxava.test.ejb.Subfamily2 getSubfamily() throws RemoteException;
	void setSubfamily(org.openxava.test.ejb.Subfamily2 newSubfamily) throws RemoteException;
	
	org.openxava.test.ejb.Subfamily2Key getSubfamilyKey() throws RemoteException;
	void setSubfamilyKey(org.openxava.test.ejb.Subfamily2Key key) throws RemoteException;

	// Methods 


}