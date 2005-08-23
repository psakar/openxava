/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Data object for Product3.
 */
public class Product3Data
   extends java.lang.Object
   implements java.io.Serializable
{
   private java.lang.String _Comments;
   private java.lang.String _Description;
   private long number;
   private java.lang.String _Subfamily1_family_oid;
   private java.lang.String _Subfamily1_subfamily_oid;
   private java.lang.String _Family_oid;
   private java.lang.String _Subfamily2_family_oid;
   private java.lang.String _Subfamily2_subfamily_oid;

   public Product3Data()
   {
   }

   public Product3Data( Product3Data otherData )
   {
      set_Comments(otherData.get_Comments());
      set_Description(otherData.get_Description());
      setNumber(otherData.getNumber());
      set_Subfamily1_family_oid(otherData.get_Subfamily1_family_oid());
      set_Subfamily1_subfamily_oid(otherData.get_Subfamily1_subfamily_oid());
      set_Family_oid(otherData.get_Family_oid());
      set_Subfamily2_family_oid(otherData.get_Subfamily2_family_oid());
      set_Subfamily2_subfamily_oid(otherData.get_Subfamily2_subfamily_oid());

   }

   public org.openxava.test.ejb.Product3Key getPrimaryKey() {
     org.openxava.test.ejb.Product3Key pk = new org.openxava.test.ejb.Product3Key(this.getNumber());
     return pk;
   }

   public java.lang.String get_Comments()
   {
      return this._Comments;
   }
   public void set_Comments( java.lang.String _Comments )
   {
      this._Comments = _Comments;
   }

   public java.lang.String get_Description()
   {
      return this._Description;
   }
   public void set_Description( java.lang.String _Description )
   {
      this._Description = _Description;
   }

   public long getNumber()
   {
      return this.number;
   }
   public void setNumber( long number )
   {
      this.number = number;
   }

   public java.lang.String get_Subfamily1_family_oid()
   {
      return this._Subfamily1_family_oid;
   }
   public void set_Subfamily1_family_oid( java.lang.String _Subfamily1_family_oid )
   {
      this._Subfamily1_family_oid = _Subfamily1_family_oid;
   }

   public java.lang.String get_Subfamily1_subfamily_oid()
   {
      return this._Subfamily1_subfamily_oid;
   }
   public void set_Subfamily1_subfamily_oid( java.lang.String _Subfamily1_subfamily_oid )
   {
      this._Subfamily1_subfamily_oid = _Subfamily1_subfamily_oid;
   }

   public java.lang.String get_Family_oid()
   {
      return this._Family_oid;
   }
   public void set_Family_oid( java.lang.String _Family_oid )
   {
      this._Family_oid = _Family_oid;
   }

   public java.lang.String get_Subfamily2_family_oid()
   {
      return this._Subfamily2_family_oid;
   }
   public void set_Subfamily2_family_oid( java.lang.String _Subfamily2_family_oid )
   {
      this._Subfamily2_family_oid = _Subfamily2_family_oid;
   }

   public java.lang.String get_Subfamily2_subfamily_oid()
   {
      return this._Subfamily2_subfamily_oid;
   }
   public void set_Subfamily2_subfamily_oid( java.lang.String _Subfamily2_subfamily_oid )
   {
      this._Subfamily2_subfamily_oid = _Subfamily2_subfamily_oid;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("_Comments=" + get_Comments() + " " + "_Description=" + get_Description() + " " + "number=" + getNumber() + " " + "_Subfamily1_family_oid=" + get_Subfamily1_family_oid() + " " + "_Subfamily1_subfamily_oid=" + get_Subfamily1_subfamily_oid() + " " + "_Family_oid=" + get_Family_oid() + " " + "_Subfamily2_family_oid=" + get_Subfamily2_family_oid() + " " + "_Subfamily2_subfamily_oid=" + get_Subfamily2_subfamily_oid());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof Product3Data )
      {
         Product3Data lTest = (Product3Data) pOther;
         boolean lEquals = true;

         if( this._Comments == null )
         {
            lEquals = lEquals && ( lTest._Comments == null );
         }
         else
         {
            lEquals = lEquals && this._Comments.equals( lTest._Comments );
         }
         if( this._Description == null )
         {
            lEquals = lEquals && ( lTest._Description == null );
         }
         else
         {
            lEquals = lEquals && this._Description.equals( lTest._Description );
         }
         lEquals = lEquals && this.number == lTest.number;
         if( this._Subfamily1_family_oid == null )
         {
            lEquals = lEquals && ( lTest._Subfamily1_family_oid == null );
         }
         else
         {
            lEquals = lEquals && this._Subfamily1_family_oid.equals( lTest._Subfamily1_family_oid );
         }
         if( this._Subfamily1_subfamily_oid == null )
         {
            lEquals = lEquals && ( lTest._Subfamily1_subfamily_oid == null );
         }
         else
         {
            lEquals = lEquals && this._Subfamily1_subfamily_oid.equals( lTest._Subfamily1_subfamily_oid );
         }
         if( this._Family_oid == null )
         {
            lEquals = lEquals && ( lTest._Family_oid == null );
         }
         else
         {
            lEquals = lEquals && this._Family_oid.equals( lTest._Family_oid );
         }
         if( this._Subfamily2_family_oid == null )
         {
            lEquals = lEquals && ( lTest._Subfamily2_family_oid == null );
         }
         else
         {
            lEquals = lEquals && this._Subfamily2_family_oid.equals( lTest._Subfamily2_family_oid );
         }
         if( this._Subfamily2_subfamily_oid == null )
         {
            lEquals = lEquals && ( lTest._Subfamily2_subfamily_oid == null );
         }
         else
         {
            lEquals = lEquals && this._Subfamily2_subfamily_oid.equals( lTest._Subfamily2_subfamily_oid );
         }

         return lEquals;
      }
      else
      {
         return false;
      }
   }

   public int hashCode()
   {
      int result = 17;

      result = 37*result + ((this._Comments != null) ? this._Comments.hashCode() : 0);

      result = 37*result + ((this._Description != null) ? this._Description.hashCode() : 0);

      result = 37*result + (int)(number^(number>>>32));

      result = 37*result + ((this._Subfamily1_family_oid != null) ? this._Subfamily1_family_oid.hashCode() : 0);

      result = 37*result + ((this._Subfamily1_subfamily_oid != null) ? this._Subfamily1_subfamily_oid.hashCode() : 0);

      result = 37*result + ((this._Family_oid != null) ? this._Family_oid.hashCode() : 0);

      result = 37*result + ((this._Subfamily2_family_oid != null) ? this._Subfamily2_family_oid.hashCode() : 0);

      result = 37*result + ((this._Subfamily2_subfamily_oid != null) ? this._Subfamily2_subfamily_oid.hashCode() : 0);

      return result;
   }

}
