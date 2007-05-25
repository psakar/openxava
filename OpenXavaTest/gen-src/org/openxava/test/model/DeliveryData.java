/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Data object for Delivery.
 */
public class DeliveryData
   extends java.lang.Object
   implements java.io.Serializable
{

   private static final long serialVersionUID = 1L;
   private java.lang.String _Incidents;
   private java.lang.String _DriverType;
   private java.lang.String _Distance;
   private java.lang.String _Description;
   private java.lang.String _Vehicle;
   private java.lang.String _Remarks;
   private int number;
   private java.lang.String _Employee;
   private int date_day;
   private int date_month;
   private int date_year;
   private int _Invoice_year;
   private int _Invoice_number;
   private java.lang.String _Shipment_type;
   private java.lang.Integer _Shipment_mode;
   private java.lang.Integer _Shipment_number;
   private java.lang.Integer _Carrier_number;
   private int _Type_number;

   public DeliveryData()
   {
   }

   public DeliveryData( DeliveryData otherData )
   {
      set_Incidents(otherData.get_Incidents());
      set_DriverType(otherData.get_DriverType());
      set_Distance(otherData.get_Distance());
      set_Description(otherData.get_Description());
      set_Vehicle(otherData.get_Vehicle());
      set_Remarks(otherData.get_Remarks());
      setNumber(otherData.getNumber());
      set_Employee(otherData.get_Employee());
      setDate_day(otherData.getDate_day());
      setDate_month(otherData.getDate_month());
      setDate_year(otherData.getDate_year());
      set_Invoice_year(otherData.get_Invoice_year());
      set_Invoice_number(otherData.get_Invoice_number());
      set_Shipment_type(otherData.get_Shipment_type());
      set_Shipment_mode(otherData.get_Shipment_mode());
      set_Shipment_number(otherData.get_Shipment_number());
      set_Carrier_number(otherData.get_Carrier_number());
      set_Type_number(otherData.get_Type_number());

   }

   public org.openxava.test.model.DeliveryKey getPrimaryKey() {
     org.openxava.test.model.DeliveryKey pk = new org.openxava.test.model.DeliveryKey(this.getNumber(),this.get_Invoice_year(),this.get_Invoice_number(),this.get_Type_number());
     return pk;
   }

   public java.lang.String get_Incidents()
   {
      return this._Incidents;
   }
   public void set_Incidents( java.lang.String _Incidents )
   {
      this._Incidents = _Incidents;
   }

   public java.lang.String get_DriverType()
   {
      return this._DriverType;
   }
   public void set_DriverType( java.lang.String _DriverType )
   {
      this._DriverType = _DriverType;
   }

   public java.lang.String get_Distance()
   {
      return this._Distance;
   }
   public void set_Distance( java.lang.String _Distance )
   {
      this._Distance = _Distance;
   }

   public java.lang.String get_Description()
   {
      return this._Description;
   }
   public void set_Description( java.lang.String _Description )
   {
      this._Description = _Description;
   }

   public java.lang.String get_Vehicle()
   {
      return this._Vehicle;
   }
   public void set_Vehicle( java.lang.String _Vehicle )
   {
      this._Vehicle = _Vehicle;
   }

   public java.lang.String get_Remarks()
   {
      return this._Remarks;
   }
   public void set_Remarks( java.lang.String _Remarks )
   {
      this._Remarks = _Remarks;
   }

   public int getNumber()
   {
      return this.number;
   }
   public void setNumber( int number )
   {
      this.number = number;
   }

   public java.lang.String get_Employee()
   {
      return this._Employee;
   }
   public void set_Employee( java.lang.String _Employee )
   {
      this._Employee = _Employee;
   }

   public int getDate_day()
   {
      return this.date_day;
   }
   public void setDate_day( int date_day )
   {
      this.date_day = date_day;
   }

   public int getDate_month()
   {
      return this.date_month;
   }
   public void setDate_month( int date_month )
   {
      this.date_month = date_month;
   }

   public int getDate_year()
   {
      return this.date_year;
   }
   public void setDate_year( int date_year )
   {
      this.date_year = date_year;
   }

   public int get_Invoice_year()
   {
      return this._Invoice_year;
   }
   public void set_Invoice_year( int _Invoice_year )
   {
      this._Invoice_year = _Invoice_year;
   }

   public int get_Invoice_number()
   {
      return this._Invoice_number;
   }
   public void set_Invoice_number( int _Invoice_number )
   {
      this._Invoice_number = _Invoice_number;
   }

   public java.lang.String get_Shipment_type()
   {
      return this._Shipment_type;
   }
   public void set_Shipment_type( java.lang.String _Shipment_type )
   {
      this._Shipment_type = _Shipment_type;
   }

   public java.lang.Integer get_Shipment_mode()
   {
      return this._Shipment_mode;
   }
   public void set_Shipment_mode( java.lang.Integer _Shipment_mode )
   {
      this._Shipment_mode = _Shipment_mode;
   }

   public java.lang.Integer get_Shipment_number()
   {
      return this._Shipment_number;
   }
   public void set_Shipment_number( java.lang.Integer _Shipment_number )
   {
      this._Shipment_number = _Shipment_number;
   }

   public java.lang.Integer get_Carrier_number()
   {
      return this._Carrier_number;
   }
   public void set_Carrier_number( java.lang.Integer _Carrier_number )
   {
      this._Carrier_number = _Carrier_number;
   }

   public int get_Type_number()
   {
      return this._Type_number;
   }
   public void set_Type_number( int _Type_number )
   {
      this._Type_number = _Type_number;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("_Incidents=" + get_Incidents() + " " + "_DriverType=" + get_DriverType() + " " + "_Distance=" + get_Distance() + " " + "_Description=" + get_Description() + " " + "_Vehicle=" + get_Vehicle() + " " + "_Remarks=" + get_Remarks() + " " + "number=" + getNumber() + " " + "_Employee=" + get_Employee() + " " + "date_day=" + getDate_day() + " " + "date_month=" + getDate_month() + " " + "date_year=" + getDate_year() + " " + "_Invoice_year=" + get_Invoice_year() + " " + "_Invoice_number=" + get_Invoice_number() + " " + "_Shipment_type=" + get_Shipment_type() + " " + "_Shipment_mode=" + get_Shipment_mode() + " " + "_Shipment_number=" + get_Shipment_number() + " " + "_Carrier_number=" + get_Carrier_number() + " " + "_Type_number=" + get_Type_number());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof DeliveryData )
      {
         DeliveryData lTest = (DeliveryData) pOther;
         boolean lEquals = true;

         if( this._Incidents == null )
         {
            lEquals = lEquals && ( lTest._Incidents == null );
         }
         else
         {
            lEquals = lEquals && this._Incidents.equals( lTest._Incidents );
         }
         if( this._DriverType == null )
         {
            lEquals = lEquals && ( lTest._DriverType == null );
         }
         else
         {
            lEquals = lEquals && this._DriverType.equals( lTest._DriverType );
         }
         if( this._Distance == null )
         {
            lEquals = lEquals && ( lTest._Distance == null );
         }
         else
         {
            lEquals = lEquals && this._Distance.equals( lTest._Distance );
         }
         if( this._Description == null )
         {
            lEquals = lEquals && ( lTest._Description == null );
         }
         else
         {
            lEquals = lEquals && this._Description.equals( lTest._Description );
         }
         if( this._Vehicle == null )
         {
            lEquals = lEquals && ( lTest._Vehicle == null );
         }
         else
         {
            lEquals = lEquals && this._Vehicle.equals( lTest._Vehicle );
         }
         if( this._Remarks == null )
         {
            lEquals = lEquals && ( lTest._Remarks == null );
         }
         else
         {
            lEquals = lEquals && this._Remarks.equals( lTest._Remarks );
         }
         lEquals = lEquals && this.number == lTest.number;
         if( this._Employee == null )
         {
            lEquals = lEquals && ( lTest._Employee == null );
         }
         else
         {
            lEquals = lEquals && this._Employee.equals( lTest._Employee );
         }
         lEquals = lEquals && this.date_day == lTest.date_day;
         lEquals = lEquals && this.date_month == lTest.date_month;
         lEquals = lEquals && this.date_year == lTest.date_year;
         lEquals = lEquals && this._Invoice_year == lTest._Invoice_year;
         lEquals = lEquals && this._Invoice_number == lTest._Invoice_number;
         if( this._Shipment_type == null )
         {
            lEquals = lEquals && ( lTest._Shipment_type == null );
         }
         else
         {
            lEquals = lEquals && this._Shipment_type.equals( lTest._Shipment_type );
         }
         if( this._Shipment_mode == null )
         {
            lEquals = lEquals && ( lTest._Shipment_mode == null );
         }
         else
         {
            lEquals = lEquals && this._Shipment_mode.equals( lTest._Shipment_mode );
         }
         if( this._Shipment_number == null )
         {
            lEquals = lEquals && ( lTest._Shipment_number == null );
         }
         else
         {
            lEquals = lEquals && this._Shipment_number.equals( lTest._Shipment_number );
         }
         if( this._Carrier_number == null )
         {
            lEquals = lEquals && ( lTest._Carrier_number == null );
         }
         else
         {
            lEquals = lEquals && this._Carrier_number.equals( lTest._Carrier_number );
         }
         lEquals = lEquals && this._Type_number == lTest._Type_number;

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

      result = 37*result + ((this._Incidents != null) ? this._Incidents.hashCode() : 0);

      result = 37*result + ((this._DriverType != null) ? this._DriverType.hashCode() : 0);

      result = 37*result + ((this._Distance != null) ? this._Distance.hashCode() : 0);

      result = 37*result + ((this._Description != null) ? this._Description.hashCode() : 0);

      result = 37*result + ((this._Vehicle != null) ? this._Vehicle.hashCode() : 0);

      result = 37*result + ((this._Remarks != null) ? this._Remarks.hashCode() : 0);

      result = 37*result + (int) number;

      result = 37*result + ((this._Employee != null) ? this._Employee.hashCode() : 0);

      result = 37*result + (int) date_day;

      result = 37*result + (int) date_month;

      result = 37*result + (int) date_year;

      result = 37*result + (int) _Invoice_year;

      result = 37*result + (int) _Invoice_number;

      result = 37*result + ((this._Shipment_type != null) ? this._Shipment_type.hashCode() : 0);

      result = 37*result + ((this._Shipment_mode != null) ? this._Shipment_mode.hashCode() : 0);

      result = 37*result + ((this._Shipment_number != null) ? this._Shipment_number.hashCode() : 0);

      result = 37*result + ((this._Carrier_number != null) ? this._Carrier_number.hashCode() : 0);

      result = 37*result + (int) _Type_number;

      return result;
   }

}
