/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Remote interface for Formula.
 */
public interface FormulaRemote
   extends org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IFormula
{

   public java.lang.String getRecipe(  )
      throws java.rmi.RemoteException;

   public void setRecipe( java.lang.String newRecipe )
      throws java.rmi.RemoteException;

   public java.lang.String getOid(  )
      throws java.rmi.RemoteException;

   public java.lang.String getName(  )
      throws java.rmi.RemoteException;

   public void setName( java.lang.String newName )
      throws java.rmi.RemoteException;

   public java.util.Collection getIngredients(  )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.FormulaData getData(  )
      throws java.rmi.RemoteException;

   public void setData( org.openxava.test.model.FormulaData data )
      throws java.rmi.RemoteException;

   public org.openxava.test.model.FormulaValue getFormulaValue(  )
      throws java.rmi.RemoteException;

   public void setFormulaValue( org.openxava.test.model.FormulaValue value )
      throws java.rmi.RemoteException;

}
