

// File generated by OpenXava: Fri Sep 02 08:47:59 CEST 2005
// Archivo generado por OpenXava: Fri Sep 02 08:47:59 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: FilterBySubfamily		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IFilterBySubfamily  {	

	// Properties/Propiedades 	
	String getOid() throws RemoteException;		

	// References/Referencias 

	// SubfamilyTo : Reference/Referencia
	
	org.openxava.test.model.ISubfamily2 getSubfamilyTo() throws RemoteException;
	void setSubfamilyTo(org.openxava.test.model.ISubfamily2 newSubfamilyTo) throws RemoteException; 

	// Subfamily : Reference/Referencia
	
	org.openxava.test.model.ISubfamily2 getSubfamily() throws RemoteException;
	void setSubfamily(org.openxava.test.model.ISubfamily2 newSubfamily) throws RemoteException;

	// Methods 


}