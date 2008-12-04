/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Value object for Invoice.
 *
 */
public class InvoiceValue
   extends java.lang.Object
   implements java.io.Serializable 
{

   private static final long serialVersionUID = 1L;

   private java.lang.String comment;
   private boolean commentHasBeenSet = false;
   private java.util.Date date;
   private boolean dateHasBeenSet = false;
   private boolean paid;
   private boolean paidHasBeenSet = false;
   private java.math.BigDecimal yearDiscount;
   private boolean yearDiscountHasBeenSet = false;
   private int detailsCount;
   private boolean detailsCountHasBeenSet = false;
   private boolean considerable;
   private boolean considerableHasBeenSet = false;
   private java.math.BigDecimal sellerDiscount;
   private boolean sellerDiscountHasBeenSet = false;
   private java.math.BigDecimal amountsSum;
   private boolean amountsSumHasBeenSet = false;
   private java.lang.String importance;
   private boolean importanceHasBeenSet = false;
   private java.math.BigDecimal total;
   private boolean totalHasBeenSet = false;
   private int year;
   private boolean yearHasBeenSet = false;
   private java.math.BigDecimal customerDiscount;
   private boolean customerDiscountHasBeenSet = false;
   private java.math.BigDecimal vatPercentage;
   private boolean vatPercentageHasBeenSet = false;
   private java.math.BigDecimal customerTypeDiscount;
   private boolean customerTypeDiscountHasBeenSet = false;
   private java.math.BigDecimal vat;
   private boolean vatHasBeenSet = false;
   private int number;
   private boolean numberHasBeenSet = false;
   private int customer_number;
   private boolean customer_numberHasBeenSet = false;

   public InvoiceValue()
   {
   }

   //TODO Cloneable is better than this !
   public InvoiceValue( InvoiceValue otherValue )
   {
	  this.comment = otherValue.comment;
	  commentHasBeenSet = true;
	  this.date = otherValue.date;
	  dateHasBeenSet = true;
	  this.paid = otherValue.paid;
	  paidHasBeenSet = true;
	  this.yearDiscount = otherValue.yearDiscount;
	  yearDiscountHasBeenSet = true;
	  this.detailsCount = otherValue.detailsCount;
	  detailsCountHasBeenSet = true;
	  this.considerable = otherValue.considerable;
	  considerableHasBeenSet = true;
	  this.sellerDiscount = otherValue.sellerDiscount;
	  sellerDiscountHasBeenSet = true;
	  this.amountsSum = otherValue.amountsSum;
	  amountsSumHasBeenSet = true;
	  this.importance = otherValue.importance;
	  importanceHasBeenSet = true;
	  this.total = otherValue.total;
	  totalHasBeenSet = true;
	  this.year = otherValue.year;
	  yearHasBeenSet = true;
	  this.customerDiscount = otherValue.customerDiscount;
	  customerDiscountHasBeenSet = true;
	  this.vatPercentage = otherValue.vatPercentage;
	  vatPercentageHasBeenSet = true;
	  this.customerTypeDiscount = otherValue.customerTypeDiscount;
	  customerTypeDiscountHasBeenSet = true;
	  this.vat = otherValue.vat;
	  vatHasBeenSet = true;
	  this.number = otherValue.number;
	  numberHasBeenSet = true;
	  this.customer_number = otherValue.customer_number;
	  customer_numberHasBeenSet = true;
   }

   public java.lang.String getComment()
   {
	  return this.comment;
   }

   public void setComment( java.lang.String comment )
   {
	  this.comment = comment;
	  commentHasBeenSet = true;
   }

   public boolean commentHasBeenSet(){
	  return commentHasBeenSet;
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
   public boolean isPaid()
   {
	  return this.paid;
   }

   public void setPaid( boolean paid )
   {
	  this.paid = paid;
	  paidHasBeenSet = true;
   }

   public boolean paidHasBeenSet(){
	  return paidHasBeenSet;
   }
   public java.math.BigDecimal getYearDiscount()
   {
	  return this.yearDiscount;
   }

   public void setYearDiscount( java.math.BigDecimal yearDiscount )
   {
	  this.yearDiscount = yearDiscount;
	  yearDiscountHasBeenSet = true;
   }

   public boolean yearDiscountHasBeenSet(){
	  return yearDiscountHasBeenSet;
   }
   public int getDetailsCount()
   {
	  return this.detailsCount;
   }

   public void setDetailsCount( int detailsCount )
   {
	  this.detailsCount = detailsCount;
	  detailsCountHasBeenSet = true;
   }

   public boolean detailsCountHasBeenSet(){
	  return detailsCountHasBeenSet;
   }
   public boolean isConsiderable()
   {
	  return this.considerable;
   }

   public void setConsiderable( boolean considerable )
   {
	  this.considerable = considerable;
	  considerableHasBeenSet = true;
   }

   public boolean considerableHasBeenSet(){
	  return considerableHasBeenSet;
   }
   public java.math.BigDecimal getSellerDiscount()
   {
	  return this.sellerDiscount;
   }

   public void setSellerDiscount( java.math.BigDecimal sellerDiscount )
   {
	  this.sellerDiscount = sellerDiscount;
	  sellerDiscountHasBeenSet = true;
   }

   public boolean sellerDiscountHasBeenSet(){
	  return sellerDiscountHasBeenSet;
   }
   public java.math.BigDecimal getAmountsSum()
   {
	  return this.amountsSum;
   }

   public void setAmountsSum( java.math.BigDecimal amountsSum )
   {
	  this.amountsSum = amountsSum;
	  amountsSumHasBeenSet = true;
   }

   public boolean amountsSumHasBeenSet(){
	  return amountsSumHasBeenSet;
   }
   public java.lang.String getImportance()
   {
	  return this.importance;
   }

   public void setImportance( java.lang.String importance )
   {
	  this.importance = importance;
	  importanceHasBeenSet = true;
   }

   public boolean importanceHasBeenSet(){
	  return importanceHasBeenSet;
   }
   public java.math.BigDecimal getTotal()
   {
	  return this.total;
   }

   public void setTotal( java.math.BigDecimal total )
   {
	  this.total = total;
	  totalHasBeenSet = true;
   }

   public boolean totalHasBeenSet(){
	  return totalHasBeenSet;
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
   public java.math.BigDecimal getCustomerDiscount()
   {
	  return this.customerDiscount;
   }

   public void setCustomerDiscount( java.math.BigDecimal customerDiscount )
   {
	  this.customerDiscount = customerDiscount;
	  customerDiscountHasBeenSet = true;
   }

   public boolean customerDiscountHasBeenSet(){
	  return customerDiscountHasBeenSet;
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
   public java.math.BigDecimal getCustomerTypeDiscount()
   {
	  return this.customerTypeDiscount;
   }

   public void setCustomerTypeDiscount( java.math.BigDecimal customerTypeDiscount )
   {
	  this.customerTypeDiscount = customerTypeDiscount;
	  customerTypeDiscountHasBeenSet = true;
   }

   public boolean customerTypeDiscountHasBeenSet(){
	  return customerTypeDiscountHasBeenSet;
   }
   public java.math.BigDecimal getVat()
   {
	  return this.vat;
   }

   public void setVat( java.math.BigDecimal vat )
   {
	  this.vat = vat;
	  vatHasBeenSet = true;
   }

   public boolean vatHasBeenSet(){
	  return vatHasBeenSet;
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

	  str.append("comment=" + getComment() + " " + "date=" + getDate() + " " + "paid=" + isPaid() + " " + "yearDiscount=" + getYearDiscount() + " " + "detailsCount=" + getDetailsCount() + " " + "considerable=" + isConsiderable() + " " + "sellerDiscount=" + getSellerDiscount() + " " + "amountsSum=" + getAmountsSum() + " " + "importance=" + getImportance() + " " + "total=" + getTotal() + " " + "year=" + getYear() + " " + "customerDiscount=" + getCustomerDiscount() + " " + "vatPercentage=" + getVatPercentage() + " " + "customerTypeDiscount=" + getCustomerTypeDiscount() + " " + "vat=" + getVat() + " " + "number=" + getNumber() + " " + "customer_number=" + getCustomer_number());
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
	  ret = ret && yearHasBeenSet;
	  ret = ret && numberHasBeenSet;
	  return ret;
   }

   public boolean equals(Object other)
   {
      if (this == other)
         return true;
	  if ( ! hasIdentity() ) return false;
	  if (other instanceof InvoiceValue)
	  {
		 InvoiceValue that = (InvoiceValue) other;
		 if ( ! that.hasIdentity() ) return false;
		 boolean lEquals = true;
		 lEquals = lEquals && this.year == that.year;
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
	  if (other instanceof InvoiceValue)
	  {
		 InvoiceValue that = (InvoiceValue) other;
		 boolean lEquals = true;
		 if( this.comment == null )
		 {
			lEquals = lEquals && ( that.comment == null );
		 }
		 else
		 {
			lEquals = lEquals && this.comment.equals( that.comment );
		 }
		 if( this.date == null )
		 {
			lEquals = lEquals && ( that.date == null );
		 }
		 else
		 {
			lEquals = lEquals && this.date.equals( that.date );
		 }
		 lEquals = lEquals && this.paid == that.paid;
		 if( this.yearDiscount == null )
		 {
			lEquals = lEquals && ( that.yearDiscount == null );
		 }
		 else
		 {
			lEquals = lEquals && this.yearDiscount.equals( that.yearDiscount );
		 }
		 lEquals = lEquals && this.detailsCount == that.detailsCount;
		 lEquals = lEquals && this.considerable == that.considerable;
		 if( this.sellerDiscount == null )
		 {
			lEquals = lEquals && ( that.sellerDiscount == null );
		 }
		 else
		 {
			lEquals = lEquals && this.sellerDiscount.equals( that.sellerDiscount );
		 }
		 if( this.amountsSum == null )
		 {
			lEquals = lEquals && ( that.amountsSum == null );
		 }
		 else
		 {
			lEquals = lEquals && this.amountsSum.equals( that.amountsSum );
		 }
		 if( this.importance == null )
		 {
			lEquals = lEquals && ( that.importance == null );
		 }
		 else
		 {
			lEquals = lEquals && this.importance.equals( that.importance );
		 }
		 if( this.total == null )
		 {
			lEquals = lEquals && ( that.total == null );
		 }
		 else
		 {
			lEquals = lEquals && this.total.equals( that.total );
		 }
		 if( this.customerDiscount == null )
		 {
			lEquals = lEquals && ( that.customerDiscount == null );
		 }
		 else
		 {
			lEquals = lEquals && this.customerDiscount.equals( that.customerDiscount );
		 }
		 if( this.vatPercentage == null )
		 {
			lEquals = lEquals && ( that.vatPercentage == null );
		 }
		 else
		 {
			lEquals = lEquals && this.vatPercentage.equals( that.vatPercentage );
		 }
		 if( this.customerTypeDiscount == null )
		 {
			lEquals = lEquals && ( that.customerTypeDiscount == null );
		 }
		 else
		 {
			lEquals = lEquals && this.customerTypeDiscount.equals( that.customerTypeDiscount );
		 }
		 if( this.vat == null )
		 {
			lEquals = lEquals && ( that.vat == null );
		 }
		 else
		 {
			lEquals = lEquals && this.vat.equals( that.vat );
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
      result = 37*result + ((this.comment != null) ? this.comment.hashCode() : 0);

      result = 37*result + ((this.date != null) ? this.date.hashCode() : 0);

      result = 37*result + (paid ? 0 : 1);

      result = 37*result + ((this.yearDiscount != null) ? this.yearDiscount.hashCode() : 0);

      result = 37*result + (int) detailsCount;

      result = 37*result + (considerable ? 0 : 1);

      result = 37*result + ((this.sellerDiscount != null) ? this.sellerDiscount.hashCode() : 0);

      result = 37*result + ((this.amountsSum != null) ? this.amountsSum.hashCode() : 0);

      result = 37*result + ((this.importance != null) ? this.importance.hashCode() : 0);

      result = 37*result + ((this.total != null) ? this.total.hashCode() : 0);

      result = 37*result + (int) year;

      result = 37*result + ((this.customerDiscount != null) ? this.customerDiscount.hashCode() : 0);

      result = 37*result + ((this.vatPercentage != null) ? this.vatPercentage.hashCode() : 0);

      result = 37*result + ((this.customerTypeDiscount != null) ? this.customerTypeDiscount.hashCode() : 0);

      result = 37*result + ((this.vat != null) ? this.vat.hashCode() : 0);

      result = 37*result + (int) number;

      result = 37*result + (int) customer_number;

	  return result;
   }

}
