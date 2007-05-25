/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Remote interface for Shipment.
 */
public interface ShipmentRemote
   extends org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IShipment
{

   public java.sql.Timestamp getTime(  )
      throws java.rmi.RemoteException;

   public void setTime( java.sql.Timestamp newTime )
      throws java.rmi.RemoteException;

   public java.lang.String getDescription(  )
      throws java.rmi.RemoteException;

   public void setDescription( java.lang.String newDescription )
      throws java.rmi.RemoteException;

   public int getNumber(  )
      throws java.rmi.RemoteException;

   public int getType(  )
      throws java.rmi.RemoteException;

   public int getMode(  )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.ICustomerContactPerson getCustomerContactPerson(  )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.CustomerContactPersonRemote getCustomerContactPersonRemote(  )
      throws java.rmi.RemoteException;

   public void setCustomerContactPerson( org.openxava.test.model.ICustomerContactPerson newCustomerContactPerson )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.CustomerContactPersonKey getCustomerContactPersonKey(  )
      throws java.rmi.RemoteException;

   public void setCustomerContactPersonKey( org.openxava.test.model.CustomerContactPersonKey key )
      throws java.rmi.RemoteException;

   public int getCustomerContactPerson_customer_number(  )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.ShipmentData getData(  )
      throws java.rmi.RemoteException;

   public void setData( org.openxava.test.model.ShipmentData data )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.ShipmentValue getShipmentValue(  )
      throws java.rmi.RemoteException;

   public void setShipmentValue( org.openxava.test.model.ShipmentValue value )
      throws java.rmi.RemoteException;

}
