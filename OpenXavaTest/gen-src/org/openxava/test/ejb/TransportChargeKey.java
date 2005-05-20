/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.ejb;

import java.util.*;

import org.openxava.util.*;

/**
 * Primary key for TransportCharge.
 */
public class TransportChargeKey
   extends java.lang.Object
   implements java.io.Serializable
{

   public int delivery_number;
   public int delivery_type_number;
   public int delivery_invoice_year;
   public int delivery_invoice_number;

   public TransportChargeKey()
   {
   }

   public TransportChargeKey( int delivery_number,int delivery_type_number,int delivery_invoice_year,int delivery_invoice_number )
   {
      this.delivery_number = delivery_number;
      this.delivery_type_number = delivery_type_number;
      this.delivery_invoice_year = delivery_invoice_year;
      this.delivery_invoice_number = delivery_invoice_number;
   }

   public int getDelivery_number()
   {
      return delivery_number;
   }
   public int getDelivery_type_number()
   {
      return delivery_type_number;
   }
   public int getDelivery_invoice_year()
   {
      return delivery_invoice_year;
   }
   public int getDelivery_invoice_number()
   {
      return delivery_invoice_number;
   }

   public void setDelivery_number(int delivery_number)
   {
      this.delivery_number = delivery_number;
   }
   public void setDelivery_type_number(int delivery_type_number)
   {
      this.delivery_type_number = delivery_type_number;
   }
   public void setDelivery_invoice_year(int delivery_invoice_year)
   {
      this.delivery_invoice_year = delivery_invoice_year;
   }
   public void setDelivery_invoice_number(int delivery_invoice_number)
   {
      this.delivery_invoice_number = delivery_invoice_number;
   }

   public int hashCode()
   {
      int _hashCode = 0;
         _hashCode += (int)this.delivery_number;
         _hashCode += (int)this.delivery_type_number;
         _hashCode += (int)this.delivery_invoice_year;
         _hashCode += (int)this.delivery_invoice_number;

      return _hashCode;
   }

   public boolean equals(Object obj)
   {
      if( !(obj instanceof org.openxava.test.ejb.TransportChargeKey) )
         return false;

      org.openxava.test.ejb.TransportChargeKey pk = (org.openxava.test.ejb.TransportChargeKey)obj;
      boolean eq = true;

      if( obj == null )
      {
         eq = false;
      }
      else
      {
         eq = eq && this.delivery_number == pk.delivery_number;
         eq = eq && this.delivery_type_number == pk.delivery_type_number;
         eq = eq && this.delivery_invoice_year == pk.delivery_invoice_year;
         eq = eq && this.delivery_invoice_number == pk.delivery_invoice_number;
      }

      return eq;
   }

   /**
    * Create from a string with the format of toString() method
    */
   public static TransportChargeKey createFromString(String string) throws IllegalArgumentException, IllegalAccessException {
      StringTokenizer st = new StringTokenizer(string, "[.]");
      TransportChargeKey key = new TransportChargeKey();
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
