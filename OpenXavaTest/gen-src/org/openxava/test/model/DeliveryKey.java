/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model;

import java.util.*;

import org.openxava.util.*;

/**
 * Primary key for Delivery.
 */
public class DeliveryKey
   extends java.lang.Object
   implements java.io.Serializable
{

   private static final long serialVersionUID = 1L;

   public int number;
   public int _Type_number;
   public int _Invoice_year;
   public int _Invoice_number;

   public DeliveryKey()
   {
   }

   public DeliveryKey( int number,int _Type_number,int _Invoice_year,int _Invoice_number )
   {
      this.number = number;
      this._Type_number = _Type_number;
      this._Invoice_year = _Invoice_year;
      this._Invoice_number = _Invoice_number;
   }

   public int getNumber()
   {
      return number;
   }
   public int get_Type_number()
   {
      return _Type_number;
   }
   public int get_Invoice_year()
   {
      return _Invoice_year;
   }
   public int get_Invoice_number()
   {
      return _Invoice_number;
   }

   public void setNumber(int number)
   {
      this.number = number;
   }
   public void set_Type_number(int _Type_number)
   {
      this._Type_number = _Type_number;
   }
   public void set_Invoice_year(int _Invoice_year)
   {
      this._Invoice_year = _Invoice_year;
   }
   public void set_Invoice_number(int _Invoice_number)
   {
      this._Invoice_number = _Invoice_number;
   }

   public int hashCode()
   {
      int _hashCode = 0;
         _hashCode += (int)this.number;
         _hashCode += (int)this._Type_number;
         _hashCode += (int)this._Invoice_year;
         _hashCode += (int)this._Invoice_number;

      return _hashCode;
   }

   public boolean equals(Object obj)
   {
      if( !(obj instanceof org.openxava.test.model.DeliveryKey) )
         return false;

      org.openxava.test.model.DeliveryKey pk = (org.openxava.test.model.DeliveryKey)obj;
      boolean eq = true;

      if( obj == null )
      {
         eq = false;
      }
      else
      {
         eq = eq && this.number == pk.number;
         eq = eq && this._Type_number == pk._Type_number;
         eq = eq && this._Invoice_year == pk._Invoice_year;
         eq = eq && this._Invoice_number == pk._Invoice_number;
      }

      return eq;
   }

   /**
    * Create from a string with the format of toString() method
    */
   public static DeliveryKey createFromString(String string) throws IllegalArgumentException, IllegalAccessException {
      StringTokenizer st = new StringTokenizer(string, "[.]");
      DeliveryKey key = new DeliveryKey();
      java.lang.reflect.Field [] fields = key.getClass().getFields();
      Arrays.sort(fields, FieldComparator.getInstance());
      for (int i = 0; i < fields.length; i++) {
         String v = st.nextToken();
         Class type = fields[i].getType();
         Object value = null;
         if (!type.equals(String.class)) {
            value = Strings.toObject(type, v);
         }
         else {
            value = string;
         }
         fields[i].set(key, value);
      }
      return key;
   }

   /** @return String representation of this pk in the form of [.field1.field2.field3]. */
   public String toString()
   {
      StringBuffer toStringValue = new StringBuffer("[.");
      java.lang.reflect.Field [] fields = getClass().getFields();
      Arrays.sort(fields, FieldComparator.getInstance());
      for (int i=0; i < fields.length; i++) {
      	try {
      	 	toStringValue.append(fields[i].get(this)).append('.');
      	}
      	catch (IllegalAccessException ex) {
      	 	ex.printStackTrace();
      	 	toStringValue.append(" ").append('.');
      	}
      }
      toStringValue.append(']');
      return toStringValue.toString();
   }

}
