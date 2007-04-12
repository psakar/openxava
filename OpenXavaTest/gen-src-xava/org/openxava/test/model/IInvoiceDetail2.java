

// File generated by OpenXava: Wed Apr 11 10:24:28 CEST 2007
// Archivo generado por OpenXava: Wed Apr 11 10:24:28 CEST 2007

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Invoice2		Java interface for aggregate/Interfaz java para Agregado: InvoiceDetail2

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IInvoiceDetail2  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	java.math.BigDecimal getAmount() throws RemoteException; 
	java.math.BigDecimal getUnitPrice() throws RemoteException;
	void setUnitPrice(java.math.BigDecimal unitPrice) throws RemoteException; 	
	String getOid() throws RemoteException; 
	int getQuantity() throws RemoteException;
	void setQuantity(int quantity) throws RemoteException;		

	// References/Referencias 

	// Product : Reference/Referencia
	
	org.openxava.test.model.IProduct getProduct() throws RemoteException;
	void setProduct(org.openxava.test.model.IProduct newProduct) throws RemoteException; 

	// Invoice2 : Reference/Referencia
	
	org.openxava.test.model.IInvoice2 getInvoice2() throws RemoteException;
	void setInvoice2(org.openxava.test.model.IInvoice2 newInvoice2) throws RemoteException;

	// Methods 


}