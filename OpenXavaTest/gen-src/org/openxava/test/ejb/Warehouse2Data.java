/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Data object for Warehouse2.
 */
public class Warehouse2Data
   extends java.lang.Object
   implements java.io.Serializable
{
   private java.lang.String _Name;
   private java.lang.Integer _Number;
   private int zoneNumber;

   public Warehouse2Data()
   {
   }

   public Warehouse2Data( Warehouse2Data otherData )
   {
      set_Name(otherData.get_Name());
      set_Number(otherData.get_Number());
      setZoneNumber(otherData.getZoneNumber());

   }

   public org.openxava.test.ejb.Warehouse2Key getPrimaryKey() {
     org.openxava.test.ejb.Warehouse2Key pk = new org.openxava.test.ejb.Warehouse2Key(this.get_Number(),this.getZoneNumber());
     return pk;
   }

   public java.lang.String get_Name()
   {
      return this._Name;
   }
   public void set_Name( java.lang.String _Name )
   {
      this._Name = _Name;
   }

   public java.lang.Integer get_Number()
   {
      return this._Number;
   }
   public void set_Number( java.lang.Integer _Number )
   {
      this._Number = _Number;
   }

   public int getZoneNumber()
   {
      return this.zoneNumber;
   }
   public void setZoneNumber( int zoneNumber )
   {
      this.zoneNumber = zoneNumber;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("_Name=" + get_Name() + " " + "_Number=" + get_Number() + " " + "zoneNumber=" + getZoneNumber());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof Warehouse2Data )
      {
         Warehouse2Data lTest = (Warehouse2Data) pOther;
         boolean lEquals = true;

         if( this._Name == null )
         {
            lEquals = lEquals && ( lTest._Name == null );
         }
         else
         {
            lEquals = lEquals && this._Name.equals( lTest._Name );
         }
         if( this._Number == null )
         {
            lEquals = lEquals && ( lTest._Number == null );
         }
         else
         {
            lEquals = lEquals && this._Number.equals( lTest._Number );
         }
         lEquals = lEquals && this.zoneNumber == lTest.zoneNumber;

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

      result = 37*result + ((this._Name != null) ? this._Name.hashCode() : 0);

      result = 37*result + ((this._Number != null) ? this._Number.hashCode() : 0);

      result = 37*result + (int) zoneNumber;

      return result;
   }

}
