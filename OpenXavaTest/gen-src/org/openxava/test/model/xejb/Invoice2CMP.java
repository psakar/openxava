/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model.xejb;

/**
 * CMP layer for Invoice2.
 */
public abstract class Invoice2CMP
   extends org.openxava.test.model.xejb.Invoice2Bean
   implements javax.ejb.EntityBean
{

   public org.openxava.test.model.Invoice2Data getData()
   {
      org.openxava.test.model.Invoice2Data dataHolder = null;
      try
      {
         dataHolder = new org.openxava.test.model.Invoice2Data();

         dataHolder.set_VatPercentage( get_VatPercentage() );
         dataHolder.setNumber( getNumber() );
         dataHolder.setYear( getYear() );
         dataHolder.set_Date( get_Date() );
         dataHolder.set_Customer_number( get_Customer_number() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   public void setData( org.openxava.test.model.Invoice2Data dataHolder )
   {
      try
      {
         set_VatPercentage( dataHolder.get_VatPercentage() );
         set_Date( dataHolder.get_Date() );
         set_Customer_number( dataHolder.get_Customer_number() );

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

      Invoice2Value = null;
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

   private org.openxava.test.model.Invoice2Value Invoice2Value = null;

   public org.openxava.test.model.Invoice2Value getInvoice2Value()
   {
      Invoice2Value = new org.openxava.test.model.Invoice2Value();
      try
         {
            Invoice2Value.setVatPercentage( getVatPercentage() );
            Invoice2Value.setNumber( getNumber() );
            Invoice2Value.setYear( getYear() );
            Invoice2Value.setDate( getDate() );
            Invoice2Value.setCustomer_number( getCustomer_number() );

         }
         catch (Exception e)
         {
            throw new javax.ejb.EJBException(e);
         }

	  return Invoice2Value;
   }

   public void setInvoice2Value( org.openxava.test.model.Invoice2Value valueHolder )
   {

	  try
	  {
		 setVatPercentage( valueHolder.getVatPercentage() );
		 setDate( valueHolder.getDate() );
		 setCustomer_number( valueHolder.getCustomer_number() );

	  }
	  catch (Exception e)
	  {
		 throw new javax.ejb.EJBException(e);
	  }
   }

/* Value Objects END */

   public abstract java.math.BigDecimal get_VatPercentage() ;

   public abstract void set_VatPercentage( java.math.BigDecimal _VatPercentage ) ;

   public abstract int getNumber() ;

   public abstract void setNumber( int number ) ;

   public abstract int getYear() ;

   public abstract void setYear( int year ) ;

   public abstract java.sql.Date get_Date() ;

   public abstract void set_Date( java.sql.Date _Date ) ;

   public abstract int get_Customer_number() ;

   public abstract void set_Customer_number( int _Customer_number ) ;

}
