/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

/**
 * Value object for Shipment.
 *
 */
public class ShipmentValue
   extends java.lang.Object
   implements java.io.Serializable 
{
   private int type;
   private boolean typeHasBeenSet = false;
   private java.lang.String description;
   private boolean descriptionHasBeenSet = false;
   private int number;
   private boolean numberHasBeenSet = false;

   public ShipmentValue()
   {
   }

   //TODO Cloneable is better than this !
   public ShipmentValue( ShipmentValue otherValue )
   {
	  this.type = otherValue.type;
	  typeHasBeenSet = true;
	  this.description = otherValue.description;
	  descriptionHasBeenSet = true;
	  this.number = otherValue.number;
	  numberHasBeenSet = true;
   }

   public int getType()
   {
	  return this.type;
   }

   public void setType( int type )
   {
	  this.type = type;
	  typeHasBeenSet = true;
   }

   public boolean typeHasBeenSet(){
	  return typeHasBeenSet;
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

   public String toString()
   {
	  StringBuffer str = new StringBuffer("{");

	  str.append("type=" + getType() + " " + "description=" + getDescription() + " " + "number=" + getNumber());
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
	  if (other instanceof ShipmentValue)
	  {
		 ShipmentValue that = (ShipmentValue) other;
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
	  if (other instanceof ShipmentValue)
	  {
		 ShipmentValue that = (ShipmentValue) other;
		 boolean lEquals = true;
		 lEquals = lEquals && this.type == that.type;
		 if( this.description == null )
		 {
			lEquals = lEquals && ( that.description == null );
		 }
		 else
		 {
			lEquals = lEquals && this.description.equals( that.description );
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
      result = 37*result + (int) type;

      result = 37*result + ((this.description != null) ? this.description.hashCode() : 0);

      result = 37*result + (int) number;

	  return result;
   }

}
