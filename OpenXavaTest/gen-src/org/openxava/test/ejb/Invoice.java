/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Remote interface for Invoice.
 */
public interface Invoice
   extends org.openxava.ejbx.EJBReplicable, org.openxava.test.ejb.IInvoice
{

   public java.lang.String getComment(  )
      throws java.rmi.RemoteException;

   public void setComment( java.lang.String newComment )
      throws java.rmi.RemoteException;

   public java.util.Date getDate(  )
      throws java.rmi.RemoteException;

   public void setDate( java.util.Date newDate )
      throws java.rmi.RemoteException;

   public boolean isPaid(  )
      throws java.rmi.RemoteException;

   public void setPaid( boolean newPaid )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getYearDiscount(  )
      throws java.rmi.RemoteException;

   public int getDetailsCount(  )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getAmountsSum(  )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getSellerDiscount(  )
      throws java.rmi.RemoteException;

   public java.lang.String getImportance(  )
      throws java.rmi.RemoteException;

   public int getYear(  )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getCustomerDiscount(  )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getVatPercentage(  )
      throws java.rmi.RemoteException;

   public void setVatPercentage( java.math.BigDecimal newVatPercentage )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getCustomerTypeDiscount(  )
      throws java.rmi.RemoteException;

   public java.math.BigDecimal getVat(  )
      throws java.rmi.RemoteException;

   public int getNumber(  )
      throws java.rmi.RemoteException;

   public java.util.Collection getDetails(  )
      throws java.rmi.RemoteException;

   public void addToDeliveries( org.openxava.test.ejb.Delivery newElement )
      throws java.rmi.RemoteException;

   public void removeFromDeliveries( org.openxava.test.ejb.Delivery toRemove )
      throws java.rmi.RemoteException;

   public java.util.Collection getDeliveries(  )
      throws java.rmi.RemoteException;

   public org.openxava.test.ejb.Customer getCustomer(  )
      throws java.rmi.RemoteException;

   public void setCustomer( org.openxava.test.ejb.Customer newCustomer )
      throws java.rmi.RemoteException;

   public org.openxava.test.ejb.CustomerKey getCustomerKey(  )
      throws java.rmi.RemoteException;

   public void setCustomerKey( org.openxava.test.ejb.CustomerKey key )
      throws java.rmi.RemoteException;

   public int getCustomer_number(  )
      throws java.rmi.RemoteException;

   public org.openxava.test.ejb.InvoiceData getData(  )
      throws java.rmi.RemoteException;

   public void setData( org.openxava.test.ejb.InvoiceData data )
      throws java.rmi.RemoteException;

   public org.openxava.test.ejb.InvoiceValue getInvoiceValue(  )
      throws java.rmi.RemoteException;

   public void setInvoiceValue( org.openxava.test.ejb.InvoiceValue value )
      throws java.rmi.RemoteException;

}
