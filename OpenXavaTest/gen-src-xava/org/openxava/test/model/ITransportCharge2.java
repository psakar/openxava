

// File generated by OpenXava: Fri Jun 22 18:13:55 CEST 2007
// Archivo generado por OpenXava: Fri Jun 22 18:13:55 CEST 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: TransportCharge2		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ITransportCharge2  extends org.openxava.model.IModel {	

	// Properties/Propiedades 
	java.math.BigDecimal getAmount() throws RemoteException;
	void setAmount(java.math.BigDecimal amount) throws RemoteException; 	
	int getYear() throws RemoteException;		

	// References/Referencias 

	// Delivery : Reference/Referencia
	
	org.openxava.test.model.IDelivery getDelivery() throws RemoteException;
	void setDelivery(org.openxava.test.model.IDelivery newDelivery) throws RemoteException;

	// Methods 


}