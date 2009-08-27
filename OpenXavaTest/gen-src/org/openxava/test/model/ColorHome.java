/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Home interface for Color.
 */
public interface ColorHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/Color";
   public static final String JNDI_NAME="@subcontext@/ejb/org.openxava.test.model/Color";

   public org.openxava.test.model.ColorRemote create(java.util.Map values)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public org.openxava.test.model.ColorRemote create(org.openxava.test.model.ColorData data)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public org.openxava.test.model.ColorRemote create(org.openxava.test.model.ColorValue value)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public org.openxava.test.model.ColorRemote findByNumber(java.lang.Integer number)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public org.openxava.test.model.ColorRemote findByPrimaryKey(org.openxava.test.model.ColorKey pk)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}
