

// File generated by OpenXava: Tue Apr 19 13:51:49 CEST 2005
// Archivo generado por OpenXava: Tue Apr 19 13:51:49 CEST 2005

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Invoice		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.ejb;

import java.math.*;
import java.rmi.RemoteException;


public interface IInvoice  {	

	// Properties/Propiedades 
	String getComment() throws RemoteException;
	void setComment(String comment) throws RemoteException; 
	java.util.Date getDate() throws RemoteException;
	void setDate(java.util.Date date) throws RemoteException; 
	boolean isPaid() throws RemoteException;
	void setPaid(boolean paid) throws RemoteException; 	
	java.math.BigDecimal getYearDiscount() throws RemoteException; 	
	int getDetailsCount() throws RemoteException; 	
	java.math.BigDecimal getAmountsSum() throws RemoteException; 	
	java.math.BigDecimal getSellerDiscount() throws RemoteException; 	
	String getImportance() throws RemoteException; 	
	int getYear() throws RemoteException; 	
	java.math.BigDecimal getCustomerDiscount() throws RemoteException; 
	java.math.BigDecimal getVatPercentage() throws RemoteException;
	void setVatPercentage(java.math.BigDecimal vatPercentage) throws RemoteException; 	
	java.math.BigDecimal getCustomerTypeDiscount() throws RemoteException; 	
	java.math.BigDecimal getVat() throws RemoteException; 	
	int getNumber() throws RemoteException;	

	java.util.Collection getDetails() throws RemoteException; 
	void addToDeliveries(org.openxava.test.ejb.Delivery newElement) throws RemoteException;
	void removeFromDeliveries(org.openxava.test.ejb.Delivery toRemove) throws RemoteException;	

	java.util.Collection getDeliveries() throws RemoteException;		

	// References/Referencias 

	// Customer : Reference/Referencia
	
	org.openxava.test.ejb.Customer getCustomer() throws RemoteException;
	void setCustomer(org.openxava.test.ejb.Customer newCustomer) throws RemoteException;
	
	org.openxava.test.ejb.CustomerKey getCustomerKey() throws RemoteException;
	void setCustomerKey(org.openxava.test.ejb.CustomerKey key) throws RemoteException;

	// Methods 


}