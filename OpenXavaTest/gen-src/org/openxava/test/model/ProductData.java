/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Data object for Product.
 */
public class ProductData
   extends java.lang.Object
   implements java.io.Serializable
{

   private static final long serialVersionUID = 1L;
   private java.lang.String _Photos;
   private java.lang.Integer _SubfamilyNumber;
   private int warehouseZoneNumber;
   private java.lang.Integer warehouseNumber;
   private java.lang.String _Description;
   private java.math.BigDecimal _UnitPrice;
   private java.lang.String _Remarks;
   private long number;
   private java.lang.Integer _FamilyNumber;

   public ProductData()
   {
   }

   public ProductData( ProductData otherData )
   {
      set_Photos(otherData.get_Photos());
      set_SubfamilyNumber(otherData.get_SubfamilyNumber());
      setWarehouseZoneNumber(otherData.getWarehouseZoneNumber());
      setWarehouseNumber(otherData.getWarehouseNumber());
      set_Description(otherData.get_Description());
      set_UnitPrice(otherData.get_UnitPrice());
      set_Remarks(otherData.get_Remarks());
      setNumber(otherData.getNumber());
      set_FamilyNumber(otherData.get_FamilyNumber());

   }

   public org.openxava.test.model.ProductKey getPrimaryKey() {
     org.openxava.test.model.ProductKey pk = new org.openxava.test.model.ProductKey(this.getNumber());
     return pk;
   }

   public java.lang.String get_Photos()
   {
      return this._Photos;
   }
   public void set_Photos( java.lang.String _Photos )
   {
      this._Photos = _Photos;
   }

   public java.lang.Integer get_SubfamilyNumber()
   {
      return this._SubfamilyNumber;
   }
   public void set_SubfamilyNumber( java.lang.Integer _SubfamilyNumber )
   {
      this._SubfamilyNumber = _SubfamilyNumber;
   }

   public int getWarehouseZoneNumber()
   {
      return this.warehouseZoneNumber;
   }
   public void setWarehouseZoneNumber( int warehouseZoneNumber )
   {
      this.warehouseZoneNumber = warehouseZoneNumber;
   }

   public java.lang.Integer getWarehouseNumber()
   {
      return this.warehouseNumber;
   }
   public void setWarehouseNumber( java.lang.Integer warehouseNumber )
   {
      this.warehouseNumber = warehouseNumber;
   }

   public java.lang.String get_Description()
   {
      return this._Description;
   }
   public void set_Description( java.lang.String _Description )
   {
      this._Description = _Description;
   }

   public java.math.BigDecimal get_UnitPrice()
   {
      return this._UnitPrice;
   }
   public void set_UnitPrice( java.math.BigDecimal _UnitPrice )
   {
      this._UnitPrice = _UnitPrice;
   }

   public java.lang.String get_Remarks()
   {
      return this._Remarks;
   }
   public void set_Remarks( java.lang.String _Remarks )
   {
      this._Remarks = _Remarks;
   }

   public long getNumber()
   {
      return this.number;
   }
   public void setNumber( long number )
   {
      this.number = number;
   }

   public java.lang.Integer get_FamilyNumber()
   {
      return this._FamilyNumber;
   }
   public void set_FamilyNumber( java.lang.Integer _FamilyNumber )
   {
      this._FamilyNumber = _FamilyNumber;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("_Photos=" + get_Photos() + " " + "_SubfamilyNumber=" + get_SubfamilyNumber() + " " + "warehouseZoneNumber=" + getWarehouseZoneNumber() + " " + "warehouseNumber=" + getWarehouseNumber() + " " + "_Description=" + get_Description() + " " + "_UnitPrice=" + get_UnitPrice() + " " + "_Remarks=" + get_Remarks() + " " + "number=" + getNumber() + " " + "_FamilyNumber=" + get_FamilyNumber());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof ProductData )
      {
         ProductData lTest = (ProductData) pOther;
         boolean lEquals = true;

         if( this._Photos == null )
         {
            lEquals = lEquals && ( lTest._Photos == null );
         }
         else
         {
            lEquals = lEquals && this._Photos.equals( lTest._Photos );
         }
         if( this._SubfamilyNumber == null )
         {
            lEquals = lEquals && ( lTest._SubfamilyNumber == null );
         }
         else
         {
            lEquals = lEquals && this._SubfamilyNumber.equals( lTest._SubfamilyNumber );
         }
         lEquals = lEquals && this.warehouseZoneNumber == lTest.warehouseZoneNumber;
         if( this.warehouseNumber == null )
         {
            lEquals = lEquals && ( lTest.warehouseNumber == null );
         }
         else
         {
            lEquals = lEquals && this.warehouseNumber.equals( lTest.warehouseNumber );
         }
         if( this._Description == null )
         {
            lEquals = lEquals && ( lTest._Description == null );
         }
         else
         {
            lEquals = lEquals && this._Description.equals( lTest._Description );
         }
         if( this._UnitPrice == null )
         {
            lEquals = lEquals && ( lTest._UnitPrice == null );
         }
         else
         {
            lEquals = lEquals && this._UnitPrice.equals( lTest._UnitPrice );
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
         if( this._FamilyNumber == null )
         {
            lEquals = lEquals && ( lTest._FamilyNumber == null );
         }
         else
         {
            lEquals = lEquals && this._FamilyNumber.equals( lTest._FamilyNumber );
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

      result = 37*result + ((this._Photos != null) ? this._Photos.hashCode() : 0);

      result = 37*result + ((this._SubfamilyNumber != null) ? this._SubfamilyNumber.hashCode() : 0);

      result = 37*result + (int) warehouseZoneNumber;

      result = 37*result + ((this.warehouseNumber != null) ? this.warehouseNumber.hashCode() : 0);

      result = 37*result + ((this._Description != null) ? this._Description.hashCode() : 0);

      result = 37*result + ((this._UnitPrice != null) ? this._UnitPrice.hashCode() : 0);

      result = 37*result + ((this._Remarks != null) ? this._Remarks.hashCode() : 0);

      result = 37*result + (int)(number^(number>>>32));

      result = 37*result + ((this._FamilyNumber != null) ? this._FamilyNumber.hashCode() : 0);

      return result;
   }

}
