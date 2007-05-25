/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Value object for Invoice2.
 *
 */
public class Invoice2Value
   extends java.lang.Object
   implements java.io.Serializable 
{

   private static final long serialVersionUID = 1L;

   private java.math.BigDecimal vatPercentage;
   private boolean vatPercentageHasBeenSet = false;
   private int number;
   private boolean numberHasBeenSet = false;
   private int year;
   private boolean yearHasBeenSet = false;
   private java.util.Date date;
   private boolean dateHasBeenSet = false;
   private int customer_number;
   private boolean customer_numberHasBeenSet = false;

   public Invoice2Value()
   {
   }

   //TODO Cloneable is better than this !
   public Invoice2Value( Invoice2Value otherValue )
   {
	  this.vatPercentage = otherValue.vatPercentage;
	  vatPercentageHasBeenSet = true;
	  this.number = otherValue.number;
	  numberHasBeenSet = true;
	  this.year = otherValue.year;
	  yearHasBeenSet = true;
	  this.date = otherValue.date;
	  dateHasBeenSet = true;
	  this.customer_number = otherValue.customer_number;
	  customer_numberHasBeenSet = true;
   }

   public java.math.BigDecimal getVatPercentage()
   {
	  return this.vatPercentage;
   }

   public void setVatPercentage( java.math.BigDecimal vatPercentage )
   {
	  this.vatPercentage = vatPercentage;
	  vatPercentageHasBeenSet = true;
   }

   public boolean vatPercentageHasBeenSet(){
	  return vatPercentageHasBeenSet;
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
   public int getYear()
   {
	  return this.year;
   }

   public void setYear( int year )
   {
	  this.year = year;
	  yearHasBeenSet = true;
   }

   public boolean yearHasBeenSet(){
	  return yearHasBeenSet;
   }
   public java.util.Date getDate()
   {
	  return this.date;
   }

   public void setDate( java.util.Date date )
   {
	  this.date = date;
	  dateHasBeenSet = true;
   }

   public boolean dateHasBeenSet(){
	  return dateHasBeenSet;
   }
   public int getCustomer_number()
   {
	  return this.customer_number;
   }

   public void setCustomer_number( int customer_number )
   {
	  this.customer_number = customer_number;
	  customer_numberHasBeenSet = true;
   }

   public boolean customer_numberHasBeenSet(){
	  return customer_numberHasBeenSet;
   }

   public String toString()
   {
	  StringBuffer str = new StringBuffer("{");

	  str.append("vatPercentage=" + getVatPercentage() + " " + "number=" + getNumber() + " " + "year=" + getYear() + " " + "date=" + getDate() + " " + "customer_number=" + getCustomer_number());
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
	  ret = ret && yearHasBeenSet;
	  return ret;
   }

   public boolean equals(Object other)
   {
      if (this == other)
         return true;
	  if ( ! hasIdentity() ) return false;
	  if (other instanceof Invoice2Value)
	  {
		 Invoice2Value that = (Invoice2Value) other;
		 if ( ! that.hasIdentity() ) return false;
		 boolean lEquals = true;
		 lEquals = lEquals && this.number == that.number;
		 lEquals = lEquals && this.year == that.year;

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
	  if (other instanceof Invoice2Value)
	  {
		 Invoice2Value that = (Invoice2Value) other;
		 boolean lEquals = true;
		 if( this.vatPercentage == null )
		 {
			lEquals = lEquals && ( that.vatPercentage == null );
		 }
		 else
		 {
			lEquals = lEquals && this.vatPercentage.equals( that.vatPercentage );
		 }
		 if( this.date == null )
		 {
			lEquals = lEquals && ( that.date == null );
		 }
		 else
		 {
			lEquals = lEquals && this.date.equals( that.date );
		 }
		 lEquals = lEquals && this.customer_number == that.customer_number;

		 return lEquals;
	  }
	  else
	  {
		 return false;
	  }
   }

   public int hashCode(){
	  int result = 17;
      result = 37*result + ((this.vatPercentage != null) ? this.vatPercentage.hashCode() : 0);

      result = 37*result + (int) number;

      result = 37*result + (int) year;

      result = 37*result + ((this.date != null) ? this.date.hashCode() : 0);

      result = 37*result + (int) customer_number;

	  return result;
   }

}
