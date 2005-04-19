/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Primary key for Family.
 */
public class FamilyKey
   extends java.lang.Object
   implements java.io.Serializable
{

   public java.lang.String oid;

   public FamilyKey()
   {
   }

   public FamilyKey( java.lang.String oid )
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
      if( !(obj instanceof org.openxava.test.ejb.FamilyKey) )
         return false;

      org.openxava.test.ejb.FamilyKey pk = (org.openxava.test.ejb.FamilyKey)obj;
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
      java.lang.reflect.Field [] fields = getClass().getFields();
      for (int i=0; i < fields.length; i++) {
      	try {
      	 	toStringValue.append(fields[i].get(this)).append('.');
      	}
      	catch (IllegalAccessException ex) {
      	 	ex.printStackTrace();
      	 	toStringValue.append(" ").append('.');
      	}
      }
      toStringValue.append(']');
      return toStringValue.toString();
   }

}
