/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Data object for Service.
 */
public class ServiceData
   extends java.lang.Object
   implements java.io.Serializable
{
   private java.lang.Integer _Family;
   private java.lang.String _Description;
   private int number;
   private java.lang.Integer _Detail_type;
   private java.lang.Integer _Detail_subfamily;

   public ServiceData()
   {
   }

   public ServiceData( ServiceData otherData )
   {
      set_Family(otherData.get_Family());
      set_Description(otherData.get_Description());
      setNumber(otherData.getNumber());
      set_Detail_type(otherData.get_Detail_type());
      set_Detail_subfamily(otherData.get_Detail_subfamily());

   }

   public org.openxava.test.ejb.ServiceKey getPrimaryKey() {
     org.openxava.test.ejb.ServiceKey pk = new org.openxava.test.ejb.ServiceKey(this.getNumber());
     return pk;
   }

   public java.lang.Integer get_Family()
   {
      return this._Family;
   }
   public void set_Family( java.lang.Integer _Family )
   {
      this._Family = _Family;
   }

   public java.lang.String get_Description()
   {
      return this._Description;
   }
   public void set_Description( java.lang.String _Description )
   {
      this._Description = _Description;
   }

   public int getNumber()
   {
      return this.number;
   }
   public void setNumber( int number )
   {
      this.number = number;
   }

   public java.lang.Integer get_Detail_type()
   {
      return this._Detail_type;
   }
   public void set_Detail_type( java.lang.Integer _Detail_type )
   {
      this._Detail_type = _Detail_type;
   }

   public java.lang.Integer get_Detail_subfamily()
   {
      return this._Detail_subfamily;
   }
   public void set_Detail_subfamily( java.lang.Integer _Detail_subfamily )
   {
      this._Detail_subfamily = _Detail_subfamily;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("_Family=" + get_Family() + " " + "_Description=" + get_Description() + " " + "number=" + getNumber() + " " + "_Detail_type=" + get_Detail_type() + " " + "_Detail_subfamily=" + get_Detail_subfamily());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof ServiceData )
      {
         ServiceData lTest = (ServiceData) pOther;
         boolean lEquals = true;

         if( this._Family == null )
         {
            lEquals = lEquals && ( lTest._Family == null );
         }
         else
         {
            lEquals = lEquals && this._Family.equals( lTest._Family );
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
         if( this._Detail_type == null )
         {
            lEquals = lEquals && ( lTest._Detail_type == null );
         }
         else
         {
            lEquals = lEquals && this._Detail_type.equals( lTest._Detail_type );
         }
         if( this._Detail_subfamily == null )
         {
            lEquals = lEquals && ( lTest._Detail_subfamily == null );
         }
         else
         {
            lEquals = lEquals && this._Detail_subfamily.equals( lTest._Detail_subfamily );
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

      result = 37*result + ((this._Family != null) ? this._Family.hashCode() : 0);

      result = 37*result + ((this._Description != null) ? this._Description.hashCode() : 0);

      result = 37*result + (int) number;

      result = 37*result + ((this._Detail_type != null) ? this._Detail_type.hashCode() : 0);

      result = 37*result + ((this._Detail_subfamily != null) ? this._Detail_subfamily.hashCode() : 0);

      return result;
   }

}
