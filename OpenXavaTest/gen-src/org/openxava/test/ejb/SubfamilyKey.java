/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Primary key for Subfamily.
 */
public class SubfamilyKey
   extends java.lang.Object
   implements java.io.Serializable
{

   public java.lang.String oid;

   public SubfamilyKey()
   {
   }

   public SubfamilyKey( java.lang.String oid )
   {
      this.oid = oid;
   }

   public java.lang.String getOid()
   {
      return oid;
   }

   public void setOid(java.lang.String oid)
   {
      this.oid = oid;
   }

   public int hashCode()
   {
      int _hashCode = 0;
         if (this.oid != null) _hashCode += this.oid.hashCode();

      return _hashCode;
   }

   public boolean equals(Object obj)
   {
      if( !(obj instanceof org.openxava.test.ejb.SubfamilyKey) )
         return false;

      org.openxava.test.ejb.SubfamilyKey pk = (org.openxava.test.ejb.SubfamilyKey)obj;
      boolean eq = true;

      if( obj == null )
      {
         eq = false;
      }
      else
      {
         if( this.oid != null )
         {
            eq = eq && this.oid.equals( pk.getOid() );
         }
         else  // this.oid == null
         {
            eq = eq && ( pk.getOid() == null );
         }
      }

      return eq;
   }

   /** @return String representation of this pk in the form of [.field1.field2.field3]. */
   public String toString()
   {
      StringBuffer toStringValue = new StringBuffer("[.");
         toStringValue.append(this.oid).append('.');
      toStringValue.append(']');
      return toStringValue.toString();
   }

}
