/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Home interface for Seller.
 */
public interface SellerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/Seller";
   public static final String JNDI_NAME="@subcontext@/ejb/org.openxava.test.model/Seller";

   public org.openxava.test.model.SellerRemote create(java.util.Map values)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public org.openxava.test.model.SellerRemote create(org.openxava.test.model.SellerData data)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public org.openxava.test.model.SellerRemote create(org.openxava.test.model.SellerValue value)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public java.util.Collection findByLevel(java.lang.String id)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public java.util.Collection findByBoss(int number)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public org.openxava.test.model.SellerRemote findByNumber(int number)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public org.openxava.test.model.SellerRemote findByPrimaryKey(org.openxava.test.model.SellerKey pk)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}
