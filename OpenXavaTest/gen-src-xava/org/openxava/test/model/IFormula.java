

// File generated by OpenXava: Thu Nov 09 12:22:50 CET 2006
// Archivo generado por OpenXava: Thu Nov 09 12:22:50 CET 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Formula		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IFormula  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	String getOid() throws RemoteException; 
	java.lang.String getRecipe() throws RemoteException;
	void setRecipe(java.lang.String recipe) throws RemoteException; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException;	

	java.util.Collection getIngredients() throws RemoteException;		

	// References/Referencias

	// Methods 


}