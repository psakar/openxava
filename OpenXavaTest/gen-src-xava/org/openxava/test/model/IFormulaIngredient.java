

// File generated by OpenXava: Mon Jun 18 10:15:25 CEST 2007
// Archivo generado por OpenXava: Mon Jun 18 10:15:25 CEST 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Formula		Java interface for aggregate/Interfaz java para Agregado: FormulaIngredient

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IFormulaIngredient  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	String getOid() throws RemoteException;		

	// References/Referencias 

	// Accentuate : Reference/Referencia
	
	org.openxava.test.model.IIngredient getAccentuate() throws RemoteException;
	void setAccentuate(org.openxava.test.model.IIngredient newAccentuate) throws RemoteException; 

	// Ingredient : Reference/Referencia
	
	org.openxava.test.model.IIngredient getIngredient() throws RemoteException;
	void setIngredient(org.openxava.test.model.IIngredient newIngredient) throws RemoteException; 

	// Formula : Reference/Referencia
	
	org.openxava.test.model.IFormula getFormula() throws RemoteException;
	void setFormula(org.openxava.test.model.IFormula newFormula) throws RemoteException; 

	// AnotherFormula : Reference/Referencia
	
	org.openxava.test.model.IFormula getAnotherFormula() throws RemoteException;
	void setAnotherFormula(org.openxava.test.model.IFormula newAnotherFormula) throws RemoteException;

	// Methods 


}