/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Home interface for FilterBySubfamily.
 */
public interface FilterBySubfamilyHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/FilterBySubfamily";
   public static final String JNDI_NAME="@subcontext@/ejb/org.openxava.test.ejb/FilterBySubfamily";

   public org.openxava.test.ejb.FilterBySubfamily create(java.util.Map values)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public org.openxava.test.ejb.FilterBySubfamily create(org.openxava.test.ejb.FilterBySubfamilyData data)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public org.openxava.test.ejb.FilterBySubfamily create(org.openxava.test.ejb.FilterBySubfamilyValue value)
      throws javax.ejb.CreateException,org.openxava.validators.ValidationException,java.rmi.RemoteException;

   public java.util.Collection findBySubfamily(int number)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public org.openxava.test.ejb.FilterBySubfamily findByPrimaryKey(org.openxava.test.ejb.FilterBySubfamilyKey pk)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}
