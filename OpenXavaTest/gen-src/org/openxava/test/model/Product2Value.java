/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Value object for Product2.
 *
 */
public class Product2Value
   extends java.lang.Object
   implements java.io.Serializable 
{

   private static final long serialVersionUID = 1L;

   private java.lang.String photos;
   private boolean photosHasBeenSet = false;
   private java.math.BigDecimal unitPrice;
   private boolean unitPriceHasBeenSet = false;
   private java.lang.String description;
   private boolean descriptionHasBeenSet = false;
   private java.math.BigDecimal unitPriceInPesetas;
   private boolean unitPriceInPesetasHasBeenSet = false;
   private long number;
   private boolean numberHasBeenSet = false;
   private int warehouse_zoneNumber;
   private boolean warehouse_zoneNumberHasBeenSet = false;
   private java.lang.Integer warehouse_number;
   private boolean warehouse_numberHasBeenSet = false;
   private int family_number;
   private boolean family_numberHasBeenSet = false;
   private int subfamily_number;
   private boolean subfamily_numberHasBeenSet = false;
   private java.lang.String formula_oid;
   private boolean formula_oidHasBeenSet = false;

   public Product2Value()
   {
   }

   //TODO Cloneable is better than this !
   public Product2Value( Product2Value otherValue )
   {
	  this.photos = otherValue.photos;
	  photosHasBeenSet = true;
	  this.unitPrice = otherValue.unitPrice;
	  unitPriceHasBeenSet = true;
	  this.description = otherValue.description;
	  descriptionHasBeenSet = true;
	  this.unitPriceInPesetas = otherValue.unitPriceInPesetas;
	  unitPriceInPesetasHasBeenSet = true;
	  this.number = otherValue.number;
	  numberHasBeenSet = true;
	  this.warehouse_zoneNumber = otherValue.warehouse_zoneNumber;
	  warehouse_zoneNumberHasBeenSet = true;
	  this.warehouse_number = otherValue.warehouse_number;
	  warehouse_numberHasBeenSet = true;
	  this.family_number = otherValue.family_number;
	  family_numberHasBeenSet = true;
	  this.subfamily_number = otherValue.subfamily_number;
	  subfamily_numberHasBeenSet = true;
	  this.formula_oid = otherValue.formula_oid;
	  formula_oidHasBeenSet = true;
   }

   public java.lang.String getPhotos()
   {
	  return this.photos;
   }

   public void setPhotos( java.lang.String photos )
   {
	  this.photos = photos;
	  photosHasBeenSet = true;
   }

   public boolean photosHasBeenSet(){
	  return photosHasBeenSet;
   }
   public java.math.BigDecimal getUnitPrice()
   {
	  return this.unitPrice;
   }

   public void setUnitPrice( java.math.BigDecimal unitPrice )
   {
	  this.unitPrice = unitPrice;
	  unitPriceHasBeenSet = true;
   }

   public boolean unitPriceHasBeenSet(){
	  return unitPriceHasBeenSet;
   }
   public java.lang.String getDescription()
   {
	  return this.description;
   }

   public void setDescription( java.lang.String description )
   {
	  this.description = description;
	  descriptionHasBeenSet = true;
   }

   public boolean descriptionHasBeenSet(){
	  return descriptionHasBeenSet;
   }
   public java.math.BigDecimal getUnitPriceInPesetas()
   {
	  return this.unitPriceInPesetas;
   }

   public void setUnitPriceInPesetas( java.math.BigDecimal unitPriceInPesetas )
   {
	  this.unitPriceInPesetas = unitPriceInPesetas;
	  unitPriceInPesetasHasBeenSet = true;
   }

   public boolean unitPriceInPesetasHasBeenSet(){
	  return unitPriceInPesetasHasBeenSet;
   }
   public long getNumber()
   {
	  return this.number;
   }

   public void setNumber( long number )
   {
	  this.number = number;
	  numberHasBeenSet = true;
   }

   public boolean numberHasBeenSet(){
	  return numberHasBeenSet;
   }
   public int getWarehouse_zoneNumber()
   {
	  return this.warehouse_zoneNumber;
   }

   public void setWarehouse_zoneNumber( int warehouse_zoneNumber )
   {
	  this.warehouse_zoneNumber = warehouse_zoneNumber;
	  warehouse_zoneNumberHasBeenSet = true;
   }

   public boolean warehouse_zoneNumberHasBeenSet(){
	  return warehouse_zoneNumberHasBeenSet;
   }
   public java.lang.Integer getWarehouse_number()
   {
	  return this.warehouse_number;
   }

   public void setWarehouse_number( java.lang.Integer warehouse_number )
   {
	  this.warehouse_number = warehouse_number;
	  warehouse_numberHasBeenSet = true;
   }

   public boolean warehouse_numberHasBeenSet(){
	  return warehouse_numberHasBeenSet;
   }
   public int getFamily_number()
   {
	  return this.family_number;
   }

   public void setFamily_number( int family_number )
   {
	  this.family_number = family_number;
	  family_numberHasBeenSet = true;
   }

   public boolean family_numberHasBeenSet(){
	  return family_numberHasBeenSet;
   }
   public int getSubfamily_number()
   {
	  return this.subfamily_number;
   }

   public void setSubfamily_number( int subfamily_number )
   {
	  this.subfamily_number = subfamily_number;
	  subfamily_numberHasBeenSet = true;
   }

   public boolean subfamily_numberHasBeenSet(){
	  return subfamily_numberHasBeenSet;
   }
   public java.lang.String getFormula_oid()
   {
	  return this.formula_oid;
   }

   public void setFormula_oid( java.lang.String formula_oid )
   {
	  this.formula_oid = formula_oid;
	  formula_oidHasBeenSet = true;
   }

   public boolean formula_oidHasBeenSet(){
	  return formula_oidHasBeenSet;
   }

   public String toString()
   {
	  StringBuffer str = new StringBuffer("{");

	  str.append("photos=" + getPhotos() + " " + "unitPrice=" + getUnitPrice() + " " + "description=" + getDescription() + " " + "unitPriceInPesetas=" + getUnitPriceInPesetas() + " " + "number=" + getNumber() + " " + "warehouse_zoneNumber=" + getWarehouse_zoneNumber() + " " + "warehouse_number=" + getWarehouse_number() + " " + "family_number=" + getFamily_number() + " " + "subfamily_number=" + getSubfamily_number() + " " + "formula_oid=" + getFormula_oid());
	  str.append('}');

	  return(str.toString());
   }

   /**
    * A Value Object has an identity if the attributes making its Primary Key have all been set. An object without identity is never equal to any other object.
    *
    * @return true if this instance has an identity.
    */
   protected boolean hasIdentity()
   {
	  boolean ret = true;
	  ret = ret && numberHasBeenSet;
	  return ret;
   }

   public boolean equals(Object other)
   {
      if (this == other)
         return true;
	  if ( ! hasIdentity() ) return false;
	  if (other instanceof Product2Value)
	  {
		 Product2Value that = (Product2Value) other;
		 if ( ! that.hasIdentity() ) return false;
		 boolean lEquals = true;
		 lEquals = lEquals && this.number == that.number;

		 lEquals = lEquals && isIdentical(that);

		 return lEquals;
	  }
	  else
	  {
		 return false;
	  }
   }

   public boolean isIdentical(Object other)
   {
	  if (other instanceof Product2Value)
	  {
		 Product2Value that = (Product2Value) other;
		 boolean lEquals = true;
		 if( this.photos == null )
		 {
			lEquals = lEquals && ( that.photos == null );
		 }
		 else
		 {
			lEquals = lEquals && this.photos.equals( that.photos );
		 }
		 if( this.unitPrice == null )
		 {
			lEquals = lEquals && ( that.unitPrice == null );
		 }
		 else
		 {
			lEquals = lEquals && this.unitPrice.equals( that.unitPrice );
		 }
		 if( this.description == null )
		 {
			lEquals = lEquals && ( that.description == null );
		 }
		 else
		 {
			lEquals = lEquals && this.description.equals( that.description );
		 }
		 if( this.unitPriceInPesetas == null )
		 {
			lEquals = lEquals && ( that.unitPriceInPesetas == null );
		 }
		 else
		 {
			lEquals = lEquals && this.unitPriceInPesetas.equals( that.unitPriceInPesetas );
		 }
		 lEquals = lEquals && this.warehouse_zoneNumber == that.warehouse_zoneNumber;
		 if( this.warehouse_number == null )
		 {
			lEquals = lEquals && ( that.warehouse_number == null );
		 }
		 else
		 {
			lEquals = lEquals && this.warehouse_number.equals( that.warehouse_number );
		 }
		 lEquals = lEquals && this.family_number == that.family_number;
		 lEquals = lEquals && this.subfamily_number == that.subfamily_number;
		 if( this.formula_oid == null )
		 {
			lEquals = lEquals && ( that.formula_oid == null );
		 }
		 else
		 {
			lEquals = lEquals && this.formula_oid.equals( that.formula_oid );
		 }

		 return lEquals;
	  }
	  else
	  {
		 return false;
	  }
   }

   public int hashCode(){
	  int result = 17;
      result = 37*result + ((this.photos != null) ? this.photos.hashCode() : 0);

      result = 37*result + ((this.unitPrice != null) ? this.unitPrice.hashCode() : 0);

      result = 37*result + ((this.description != null) ? this.description.hashCode() : 0);

      result = 37*result + ((this.unitPriceInPesetas != null) ? this.unitPriceInPesetas.hashCode() : 0);

      result = 37*result + (int)(number^(number>>>32));

      result = 37*result + (int) warehouse_zoneNumber;

      result = 37*result + ((this.warehouse_number != null) ? this.warehouse_number.hashCode() : 0);

      result = 37*result + (int) family_number;

      result = 37*result + (int) subfamily_number;

      result = 37*result + ((this.formula_oid != null) ? this.formula_oid.hashCode() : 0);

	  return result;
   }

}
