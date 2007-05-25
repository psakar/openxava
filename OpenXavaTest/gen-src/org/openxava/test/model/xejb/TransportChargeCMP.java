/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model.xejb;

/**
 * CMP layer for TransportCharge.
 */
public abstract class TransportChargeCMP
   extends org.openxava.test.model.xejb.TransportChargeBean
   implements javax.ejb.EntityBean
{

   public org.openxava.test.model.TransportChargeData getData()
   {
      org.openxava.test.model.TransportChargeData dataHolder = null;
      try
      {
         dataHolder = new org.openxava.test.model.TransportChargeData();

         dataHolder.set_Amount( get_Amount() );
         dataHolder.set_Delivery_number( get_Delivery_number() );
         dataHolder.set_Delivery_invoice_year( get_Delivery_invoice_year() );
         dataHolder.set_Delivery_invoice_number( get_Delivery_invoice_number() );
         dataHolder.set_Delivery_type_number( get_Delivery_type_number() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   public void setData( org.openxava.test.model.TransportChargeData dataHolder )
   {
      try
      {
         set_Amount( dataHolder.get_Amount() );

      }
      catch (Exception e)
      {
         throw new javax.ejb.EJBException(e);
      }
   }

   public void ejbLoad() 
   {
      super.ejbLoad();
   }

   public void ejbStore() 
   {
         super.ejbStore();
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

      TransportChargeValue = null;
   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() 
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

 /* Value Objects BEGIN */

   private org.openxava.test.model.TransportChargeValue TransportChargeValue = null;

   public org.openxava.test.model.TransportChargeValue getTransportChargeValue()
   {
      TransportChargeValue = new org.openxava.test.model.TransportChargeValue();
      try
         {
            TransportChargeValue.setAmount( getAmount() );
            TransportChargeValue.setDelivery_number( getDelivery_number() );
            TransportChargeValue.setDelivery_invoice_year( getDelivery_invoice_year() );
            TransportChargeValue.setDelivery_invoice_number( getDelivery_invoice_number() );
            TransportChargeValue.setDelivery_type_number( getDelivery_type_number() );

         }
         catch (Exception e)
         {
            throw new javax.ejb.EJBException(e);
         }

	  return TransportChargeValue;
   }

   public void setTransportChargeValue( org.openxava.test.model.TransportChargeValue valueHolder )
   {

	  try
	  {
		 setAmount( valueHolder.getAmount() );
		 setDelivery_number( valueHolder.getDelivery_number() );
		 setDelivery_invoice_year( valueHolder.getDelivery_invoice_year() );
		 setDelivery_invoice_number( valueHolder.getDelivery_invoice_number() );
		 setDelivery_type_number( valueHolder.getDelivery_type_number() );

	  }
	  catch (Exception e)
	  {
		 throw new javax.ejb.EJBException(e);
	  }
   }

/* Value Objects END */

   public abstract java.math.BigDecimal get_Amount() ;

   public abstract void set_Amount( java.math.BigDecimal _Amount ) ;

   public abstract int get_Delivery_number() ;

   public abstract void set_Delivery_number( int _Delivery_number ) ;

   public abstract int get_Delivery_invoice_year() ;

   public abstract void set_Delivery_invoice_year( int _Delivery_invoice_year ) ;

   public abstract int get_Delivery_invoice_number() ;

   public abstract void set_Delivery_invoice_number( int _Delivery_invoice_number ) ;

   public abstract int get_Delivery_type_number() ;

   public abstract void set_Delivery_type_number( int _Delivery_type_number ) ;

}
