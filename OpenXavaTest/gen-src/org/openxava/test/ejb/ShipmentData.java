/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Data object for Shipment.
 */
public class ShipmentData
   extends java.lang.Object
   implements java.io.Serializable
{
   private java.lang.Integer _Type;
   private java.lang.String _Description;
   private int number;

   public ShipmentData()
   {
   }

   public ShipmentData( ShipmentData otherData )
   {
      set_Type(otherData.get_Type());
      set_Description(otherData.get_Description());
      setNumber(otherData.getNumber());

   }

   public org.openxava.test.ejb.ShipmentKey getPrimaryKey() {
     org.openxava.test.ejb.ShipmentKey pk = new org.openxava.test.ejb.ShipmentKey(this.get_Type(),this.getNumber());
     return pk;
   }

   public java.lang.Integer get_Type()
   {
      return this._Type;
   }
   public void set_Type( java.lang.Integer _Type )
   {
      this._Type = _Type;
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

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("_Type=" + get_Type() + " " + "_Description=" + get_Description() + " " + "number=" + getNumber());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof ShipmentData )
      {
         ShipmentData lTest = (ShipmentData) pOther;
         boolean lEquals = true;

         if( this._Type == null )
         {
            lEquals = lEquals && ( lTest._Type == null );
         }
         else
         {
            lEquals = lEquals && this._Type.equals( lTest._Type );
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

      result = 37*result + ((this._Type != null) ? this._Type.hashCode() : 0);

      result = 37*result + ((this._Description != null) ? this._Description.hashCode() : 0);

      result = 37*result + (int) number;

      return result;
   }

}
