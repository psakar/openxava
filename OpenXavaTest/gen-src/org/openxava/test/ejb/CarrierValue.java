/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Value object for Carrier.
 *
 */
public class CarrierValue
   extends java.lang.Object
   implements java.io.Serializable 
{

   private static final long serialVersionUID = 1L;

   private java.lang.String remarks;
   private boolean remarksHasBeenSet = false;
   private java.lang.String calculated;
   private boolean calculatedHasBeenSet = false;
   private java.lang.String name;
   private boolean nameHasBeenSet = false;
   private int number;
   private boolean numberHasBeenSet = false;
   private int warehouse_zoneNumber;
   private boolean warehouse_zoneNumberHasBeenSet = false;
   private java.lang.Integer warehouse_number;
   private boolean warehouse_numberHasBeenSet = false;
   private java.lang.String drivingLicence_type;
   private boolean drivingLicence_typeHasBeenSet = false;
   private int drivingLicence_level;
   private boolean drivingLicence_levelHasBeenSet = false;

   public CarrierValue()
   {
   }

   //TODO Cloneable is better than this !
   public CarrierValue( CarrierValue otherValue )
   {
	  this.remarks = otherValue.remarks;
	  remarksHasBeenSet = true;
	  this.calculated = otherValue.calculated;
	  calculatedHasBeenSet = true;
	  this.name = otherValue.name;
	  nameHasBeenSet = true;
	  this.number = otherValue.number;
	  numberHasBeenSet = true;
	  this.warehouse_zoneNumber = otherValue.warehouse_zoneNumber;
	  warehouse_zoneNumberHasBeenSet = true;
	  this.warehouse_number = otherValue.warehouse_number;
	  warehouse_numberHasBeenSet = true;
	  this.drivingLicence_type = otherValue.drivingLicence_type;
	  drivingLicence_typeHasBeenSet = true;
	  this.drivingLicence_level = otherValue.drivingLicence_level;
	  drivingLicence_levelHasBeenSet = true;
   }

   public java.lang.String getRemarks()
   {
	  return this.remarks;
   }

   public void setRemarks( java.lang.String remarks )
   {
	  this.remarks = remarks;
	  remarksHasBeenSet = true;
   }

   public boolean remarksHasBeenSet(){
	  return remarksHasBeenSet;
   }
   public java.lang.String getCalculated()
   {
	  return this.calculated;
   }

   public void setCalculated( java.lang.String calculated )
   {
	  this.calculated = calculated;
	  calculatedHasBeenSet = true;
   }

   public boolean calculatedHasBeenSet(){
	  return calculatedHasBeenSet;
   }
   public java.lang.String getName()
   {
	  return this.name;
   }

   public void setName( java.lang.String name )
   {
	  this.name = name;
	  nameHasBeenSet = true;
   }

   public boolean nameHasBeenSet(){
	  return nameHasBeenSet;
   }
   public int getNumber()
   {
	  return this.number;
   }

   public void setNumber( int number )
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
   public java.lang.String getDrivingLicence_type()
   {
	  return this.drivingLicence_type;
   }

   public void setDrivingLicence_type( java.lang.String drivingLicence_type )
   {
	  this.drivingLicence_type = drivingLicence_type;
	  drivingLicence_typeHasBeenSet = true;
   }

   public boolean drivingLicence_typeHasBeenSet(){
	  return drivingLicence_typeHasBeenSet;
   }
   public int getDrivingLicence_level()
   {
	  return this.drivingLicence_level;
   }

   public void setDrivingLicence_level( int drivingLicence_level )
   {
	  this.drivingLicence_level = drivingLicence_level;
	  drivingLicence_levelHasBeenSet = true;
   }

   public boolean drivingLicence_levelHasBeenSet(){
	  return drivingLicence_levelHasBeenSet;
   }

   public String toString()
   {
	  StringBuffer str = new StringBuffer("{");

	  str.append("remarks=" + getRemarks() + " " + "calculated=" + getCalculated() + " " + "name=" + getName() + " " + "number=" + getNumber() + " " + "warehouse_zoneNumber=" + getWarehouse_zoneNumber() + " " + "warehouse_number=" + getWarehouse_number() + " " + "drivingLicence_type=" + getDrivingLicence_type() + " " + "drivingLicence_level=" + getDrivingLicence_level());
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
	  return ret;
   }

   public boolean equals(Object other)
   {
      if (this == other)
         return true;
	  if ( ! hasIdentity() ) return false;
	  if (other instanceof CarrierValue)
	  {
		 CarrierValue that = (CarrierValue) other;
		 if ( ! that.hasIdentity() ) return false;
		 boolean lEquals = true;

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
	  if (other instanceof CarrierValue)
	  {
		 CarrierValue that = (CarrierValue) other;
		 boolean lEquals = true;
		 if( this.remarks == null )
		 {
			lEquals = lEquals && ( that.remarks == null );
		 }
		 else
		 {
			lEquals = lEquals && this.remarks.equals( that.remarks );
		 }
		 if( this.calculated == null )
		 {
			lEquals = lEquals && ( that.calculated == null );
		 }
		 else
		 {
			lEquals = lEquals && this.calculated.equals( that.calculated );
		 }
		 if( this.name == null )
		 {
			lEquals = lEquals && ( that.name == null );
		 }
		 else
		 {
			lEquals = lEquals && this.name.equals( that.name );
		 }
		 lEquals = lEquals && this.number == that.number;
		 lEquals = lEquals && this.warehouse_zoneNumber == that.warehouse_zoneNumber;
		 if( this.warehouse_number == null )
		 {
			lEquals = lEquals && ( that.warehouse_number == null );
		 }
		 else
		 {
			lEquals = lEquals && this.warehouse_number.equals( that.warehouse_number );
		 }
		 if( this.drivingLicence_type == null )
		 {
			lEquals = lEquals && ( that.drivingLicence_type == null );
		 }
		 else
		 {
			lEquals = lEquals && this.drivingLicence_type.equals( that.drivingLicence_type );
		 }
		 lEquals = lEquals && this.drivingLicence_level == that.drivingLicence_level;

		 return lEquals;
	  }
	  else
	  {
		 return false;
	  }
   }

   public int hashCode(){
	  int result = 17;
      result = 37*result + ((this.remarks != null) ? this.remarks.hashCode() : 0);

      result = 37*result + ((this.calculated != null) ? this.calculated.hashCode() : 0);

      result = 37*result + ((this.name != null) ? this.name.hashCode() : 0);

      result = 37*result + (int) number;

      result = 37*result + (int) warehouse_zoneNumber;

      result = 37*result + ((this.warehouse_number != null) ? this.warehouse_number.hashCode() : 0);

      result = 37*result + ((this.drivingLicence_type != null) ? this.drivingLicence_type.hashCode() : 0);

      result = 37*result + (int) drivingLicence_level;

	  return result;
   }

}
