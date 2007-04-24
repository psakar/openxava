/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model.xejb;

/**
 * CMP layer for FilterBySubfamily.
 */
public abstract class FilterBySubfamilyCMP
   extends org.openxava.test.model.xejb.FilterBySubfamilyBean
   implements javax.ejb.EntityBean
{

   public org.openxava.test.model.FilterBySubfamilyData getData()
   {
      org.openxava.test.model.FilterBySubfamilyData dataHolder = null;
      try
      {
         dataHolder = new org.openxava.test.model.FilterBySubfamilyData();

         dataHolder.set_SubfamilyTo_number( get_SubfamilyTo_number() );
         dataHolder.set_Subfamily_number( get_Subfamily_number() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   public void setData( org.openxava.test.model.FilterBySubfamilyData dataHolder )
   {
      try
      {
         set_SubfamilyTo_number( dataHolder.get_SubfamilyTo_number() );
         set_Subfamily_number( dataHolder.get_Subfamily_number() );

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

      FilterBySubfamilyValue = null;
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

   private org.openxava.test.model.FilterBySubfamilyValue FilterBySubfamilyValue = null;

   public org.openxava.test.model.FilterBySubfamilyValue getFilterBySubfamilyValue()
   {
      FilterBySubfamilyValue = new org.openxava.test.model.FilterBySubfamilyValue();
      try
         {
            FilterBySubfamilyValue.setSubfamilyTo_number( getSubfamilyTo_number() );
            FilterBySubfamilyValue.setSubfamily_number( getSubfamily_number() );

         }
         catch (Exception e)
         {
            throw new javax.ejb.EJBException(e);
         }

	  return FilterBySubfamilyValue;
   }

   public void setFilterBySubfamilyValue( org.openxava.test.model.FilterBySubfamilyValue valueHolder )
   {

	  try
	  {
		 setSubfamilyTo_number( valueHolder.getSubfamilyTo_number() );
		 setSubfamily_number( valueHolder.getSubfamily_number() );

	  }
	  catch (Exception e)
	  {
		 throw new javax.ejb.EJBException(e);
	  }
   }

/* Value Objects END */

   public abstract int get_SubfamilyTo_number() ;

   public abstract void set_SubfamilyTo_number( int _SubfamilyTo_number ) ;

   public abstract int get_Subfamily_number() ;

   public abstract void set_Subfamily_number( int _Subfamily_number ) ;

}
