/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

/**
 * Value object for Driver.
 *
 */
public class DriverValue
   extends java.lang.Object
   implements java.io.Serializable 
{

   private static final long serialVersionUID = 1L;

   private java.lang.String type;
   private boolean typeHasBeenSet = false;
   private java.lang.String name;
   private boolean nameHasBeenSet = false;
   private int number;
   private boolean numberHasBeenSet = false;
   private java.lang.String drivingLicence_type;
   private boolean drivingLicence_typeHasBeenSet = false;
   private int drivingLicence_level;
   private boolean drivingLicence_levelHasBeenSet = false;

   public DriverValue()
   {
   }

   //TODO Cloneable is better than this !
   public DriverValue( DriverValue otherValue )
   {
	  this.type = otherValue.type;
	  typeHasBeenSet = true;
	  this.name = otherValue.name;
	  nameHasBeenSet = true;
	  this.number = otherValue.number;
	  numberHasBeenSet = true;
	  this.drivingLicence_type = otherValue.drivingLicence_type;
	  drivingLicence_typeHasBeenSet = true;
	  this.drivingLicence_level = otherValue.drivingLicence_level;
	  drivingLicence_levelHasBeenSet = true;
   }

   public java.lang.String getType()
   {
	  return this.type;
   }

   public void setType( java.lang.String type )
   {
	  this.type = type;
	  typeHasBeenSet = true;
   }

   public boolean typeHasBeenSet(){
	  return typeHasBeenSet;
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

	  str.append("type=" + getType() + " " + "name=" + getName() + " " + "number=" + getNumber() + " " + "drivingLicence_type=" + getDrivingLicence_type() + " " + "drivingLicence_level=" + getDrivingLicence_level());
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
	  if (other instanceof DriverValue)
	  {
		 DriverValue that = (DriverValue) other;
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
	  if (other instanceof DriverValue)
	  {
		 DriverValue that = (DriverValue) other;
		 boolean lEquals = true;
		 if( this.type == null )
		 {
			lEquals = lEquals && ( that.type == null );
		 }
		 else
		 {
			lEquals = lEquals && this.type.equals( that.type );
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
      result = 37*result + ((this.type != null) ? this.type.hashCode() : 0);

      result = 37*result + ((this.name != null) ? this.name.hashCode() : 0);

      result = 37*result + (int) number;

      result = 37*result + ((this.drivingLicence_type != null) ? this.drivingLicence_type.hashCode() : 0);

      result = 37*result + (int) drivingLicence_level;

	  return result;
   }

}
