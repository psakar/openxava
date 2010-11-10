

// File generated by OpenXava: Tue Nov 09 12:31:08 CET 2010
// Archivo generado por OpenXava: Tue Nov 09 12:31:08 CET 2010

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Invoice		Java interface for aggregate/Interfaz java para Agregado: InvoiceDetail

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IInvoiceDetail  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_free = "free"; 	
	boolean isFree() throws RemoteException; 	
	public static final String PROPERTY_amount = "amount"; 	
	java.math.BigDecimal getAmount() throws RemoteException; 	
	public static final String PROPERTY_unitPrice = "unitPrice"; 
	java.math.BigDecimal getUnitPrice() throws RemoteException;
	void setUnitPrice(java.math.BigDecimal unitPrice) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException; 	
	public static final String PROPERTY_remarks = "remarks"; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 	
	public static final String PROPERTY_deliveryDate = "deliveryDate"; 
	java.util.Date getDeliveryDate() throws RemoteException;
	void setDeliveryDate(java.util.Date deliveryDate) throws RemoteException; 	
	public static final String PROPERTY_quantity = "quantity"; 
	int getQuantity() throws RemoteException;
	void setQuantity(int quantity) throws RemoteException; 	
	public static final String PROPERTY_serviceType = "serviceType"; 
	int getServiceType() throws RemoteException;
	void setServiceType(int serviceType) throws RemoteException;		

	// References/Referencias 

	// Product : Reference/Referencia
	
	org.openxava.test.model.IProduct getProduct() throws RemoteException;
	void setProduct(org.openxava.test.model.IProduct newProduct) throws RemoteException; 

	// SoldBy : Reference/Referencia
	
	org.openxava.test.model.ISeller getSoldBy() throws RemoteException;
	void setSoldBy(org.openxava.test.model.ISeller newSoldBy) throws RemoteException; 

	// Invoice : Reference/Referencia
	
	org.openxava.test.model.IInvoice getInvoice() throws RemoteException;
	void setInvoice(org.openxava.test.model.IInvoice newInvoice) throws RemoteException;

	// Methods 


}