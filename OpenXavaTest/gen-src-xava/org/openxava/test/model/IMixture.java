

// File generated by OpenXava: Thu May 11 14:55:18 CEST 2017
// Archivo generado por OpenXava: Thu May 11 14:55:18 CEST 2017

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Mixture		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IMixture  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_fullDescription = "fullDescription"; 	
	String getFullDescription() throws RemoteException; 	
	public static final String PROPERTY_colorName2 = "colorName2"; 	
	String getColorName2() throws RemoteException; 	
	public static final String PROPERTY_colorName1 = "colorName1"; 	
	String getColorName1() throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException;		

	// References/Referencias

	// Methods 


}