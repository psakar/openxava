

// File generated by OpenXava: Fri Jun 15 10:38:55 CEST 2007
// Archivo generado por OpenXava: Fri Jun 15 10:38:55 CEST 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Ingredient		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IIngredient  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	String getOid() throws RemoteException; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException;		

	// References/Referencias 

	// PartOf : Reference/Referencia
	
	org.openxava.test.model.IIngredient getPartOf() throws RemoteException;
	void setPartOf(org.openxava.test.model.IIngredient newPartOf) throws RemoteException;

	// Methods 


}