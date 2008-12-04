/*
 * Generated by XDoclet - Do not edit!
 */
package org.openxava.test.model.xejb;

/**
 * CMP layer for Office.
 */
public abstract class OfficeCMP
   extends org.openxava.test.model.xejb.OfficeBean
   implements javax.ejb.EntityBean
{

   public org.openxava.test.model.OfficeData getData()
   {
      org.openxava.test.model.OfficeData dataHolder = null;
      try
      {
         dataHolder = new org.openxava.test.model.OfficeData();

         dataHolder.set_Receptionist( get_Receptionist() );
         dataHolder.set_Name( get_Name() );
         dataHolder.set_ZoneNumber( get_ZoneNumber() );
         dataHolder.setNumber( getNumber() );
         dataHolder.set_OfficeManager_number( get_OfficeManager_number() );
         dataHolder.set_DefaultCarrier_number( get_DefaultCarrier_number() );
         dataHolder.set_MainWarehouse_number( get_MainWarehouse_number() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   public void setData( org.openxava.test.model.OfficeData dataHolder )
   {
      try
      {
         set_Receptionist( dataHolder.get_Receptionist() );
         set_Name( dataHolder.get_Name() );
         set_ZoneNumber( dataHolder.get_ZoneNumber() );
         set_OfficeManager_number( dataHolder.get_OfficeManager_number() );
         set_DefaultCarrier_number( dataHolder.get_DefaultCarrier_number() );
         set_MainWarehouse_number( dataHolder.get_MainWarehouse_number() );

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

      OfficeValue = null;
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

   private org.openxava.test.model.OfficeValue OfficeValue = null;

   public org.openxava.test.model.OfficeValue getOfficeValue()
   {
      OfficeValue = new org.openxava.test.model.OfficeValue();
      try
         {
            OfficeValue.setReceptionist( getReceptionist() );
            OfficeValue.setName( getName() );
            OfficeValue.setZoneNumber( getZoneNumber() );
            OfficeValue.setNumber( getNumber() );
            OfficeValue.setOfficeManager_zoneNumber( getOfficeManager_zoneNumber() );
            OfficeValue.setOfficeManager_officeNumber( getOfficeManager_officeNumber() );
            OfficeValue.setOfficeManager_number( getOfficeManager_number() );
            OfficeValue.setDefaultCarrier_number( getDefaultCarrier_number() );
            OfficeValue.setMainWarehouse_zoneNumber( getMainWarehouse_zoneNumber() );
            OfficeValue.setMainWarehouse_number( getMainWarehouse_number() );

         }
         catch (Exception e)
         {
            throw new javax.ejb.EJBException(e);
         }

	  return OfficeValue;
   }

   public void setOfficeValue( org.openxava.test.model.OfficeValue valueHolder )
   {

	  try
	  {
		 setReceptionist( valueHolder.getReceptionist() );
		 setName( valueHolder.getName() );
		 setZoneNumber( valueHolder.getZoneNumber() );
		 setOfficeManager_zoneNumber( valueHolder.getOfficeManager_zoneNumber() );
		 setOfficeManager_officeNumber( valueHolder.getOfficeManager_officeNumber() );
		 setOfficeManager_number( valueHolder.getOfficeManager_number() );
		 setDefaultCarrier_number( valueHolder.getDefaultCarrier_number() );
		 setMainWarehouse_zoneNumber( valueHolder.getMainWarehouse_zoneNumber() );
		 setMainWarehouse_number( valueHolder.getMainWarehouse_number() );

	  }
	  catch (Exception e)
	  {
		 throw new javax.ejb.EJBException(e);
	  }
   }

/* Value Objects END */

   public abstract java.lang.Integer get_Receptionist() ;

   public abstract void set_Receptionist( java.lang.Integer _Receptionist ) ;

   public abstract java.lang.String get_Name() ;

   public abstract void set_Name( java.lang.String _Name ) ;

   public abstract java.lang.Integer get_ZoneNumber() ;

   public abstract void set_ZoneNumber( java.lang.Integer _ZoneNumber ) ;

   public abstract int getNumber() ;

   public abstract void setNumber( int number ) ;

   public abstract int get_OfficeManager_number() ;

   public abstract void set_OfficeManager_number( int _OfficeManager_number ) ;

   public abstract java.lang.Integer get_DefaultCarrier_number() ;

   public abstract void set_DefaultCarrier_number( java.lang.Integer _DefaultCarrier_number ) ;

   public abstract java.lang.Integer get_MainWarehouse_number() ;

   public abstract void set_MainWarehouse_number( java.lang.Integer _MainWarehouse_number ) ;

}
