
// File generated by OpenXava: Wed Sep 13 12:31:29 CEST 2006
// Archivo generado por OpenXava: Wed Sep 13 12:31:29 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Warehouse		Entity/Entidad

package org.openxava.test.model.xejb;

import java.util.*;
import java.math.*;
import javax.ejb.*;
import javax.rmi.PortableRemoteObject;

import org.openxava.ejbx.*;
import org.openxava.util.*;
import org.openxava.component.*;
import org.openxava.model.meta.*;
import org.openxava.validators.ValidationException;

import org.openxava.test.model.*;


/**
 * @ejb:bean name="Warehouse" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Warehouse" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IWarehouse"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Warehouse" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Warehouse findByZoneNumberNumber(int zoneNumber,java.lang.Integer number)" query="SELECT OBJECT(o) FROM Warehouse o WHERE o.zoneNumber = ?1 and o._Number = ?2" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Warehouse findByZoneNumberNumber(int zoneNumber,java.lang.Integer number)" query="SELECT OBJECT(o) FROM Warehouse o WHERE o.zoneNumber = ?1 and o._Number = ?2" 
 * 
 * @jboss:table-name "XAVATEST_WAREHOUSE"
 *
 * @author Javier Paniza
 */
abstract public class WarehouseBean extends EJBReplicableBase 
			implements org.openxava.test.model.IWarehouse, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.WarehouseKey ejbCreate(Map values) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		executeSets(values); 
			
		return null;
	} 
	public void ejbPostCreate(Map values) 
		throws
			CreateException,
			ValidationException { 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		}
		try { 		
			org.openxava.tracking.AccessTrackingCalculator calculator0= (org.openxava.tracking.AccessTrackingCalculator)
				getMetaModel().getMetaCalculatorPostCreate(0).createCalculator(); 
			calculator0.setModel(this); 
			calculator0.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "Warehouse", ex.getLocalizedMessage()));
		}
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 
	} 
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.WarehouseKey ejbCreate(org.openxava.test.model.WarehouseData data) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setData(data); 
		setZoneNumber(data.getZoneNumber());  
		set_Number(data.get_Number()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.WarehouseData data) 
		throws
			CreateException,
			ValidationException { 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		}
		try { 		
			org.openxava.tracking.AccessTrackingCalculator calculator0= (org.openxava.tracking.AccessTrackingCalculator)
				getMetaModel().getMetaCalculatorPostCreate(0).createCalculator(); 
			calculator0.setModel(this); 
			calculator0.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "Warehouse", ex.getLocalizedMessage()));
		}
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.WarehouseKey ejbCreate(org.openxava.test.model.WarehouseValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setWarehouseValue(value); 
		setZoneNumber(value.getZoneNumber()); 
		setNumber(value.getNumber()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.WarehouseValue value) 
		throws
			CreateException,
			ValidationException { 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		}
		try { 		
			org.openxava.tracking.AccessTrackingCalculator calculator0= (org.openxava.tracking.AccessTrackingCalculator)
				getMetaModel().getMetaCalculatorPostCreate(0).createCalculator(); 
			calculator0.setModel(this); 
			calculator0.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_create_error", "Warehouse", ex.getLocalizedMessage()));
		}
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 			
	}
	
	public void ejbLoad() {
		creating = false;
		modified = false; 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		}
		try { 		
			org.openxava.tracking.AccessTrackingCalculator calculator0= (org.openxava.tracking.AccessTrackingCalculator)
				getMetaModel().getMetaCalculatorPostLoad(0).createCalculator(); 
			calculator0.setModel(this); 
			calculator0.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_load_error", "Warehouse", ex.getLocalizedMessage()));
		}
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 
	}
	
	public void ejbStore() {
		if (creating) {
			creating = false;
			return;
		}
		if (!modified) return; 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		}
		try { 		
			org.openxava.tracking.AccessTrackingCalculator calculator0= (org.openxava.tracking.AccessTrackingCalculator)
				getMetaModel().getMetaCalculatorPostModify(0).createCalculator(); 
			calculator0.setModel(this); 
			calculator0.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_modify_error", "Warehouse", ex.getLocalizedMessage()));
		}
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 
		
		modified = false;
	} 	
	

	public void ejbRemove() throws RemoveException { 
		boolean cmtActivated = false;
		if (!org.openxava.hibernate.XHibernate.isCmt()) {
			org.openxava.hibernate.XHibernate.setCmt(true);
			cmtActivated = true;
		}
		try { 		
			org.openxava.tracking.AccessTrackingCalculator calculator0= (org.openxava.tracking.AccessTrackingCalculator)
				getMetaModel().getMetaCalculatorPreRemove(0).createCalculator(); 
			calculator0.setModel(this); 
			calculator0.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("entity_remove_error", "Warehouse", ex.getLocalizedMessage()));
		}
		finally {
			if (cmtActivated) {
				org.openxava.hibernate.XHibernate.setCmt(false);
			}
		} 						
	} 	
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "NAME"
	 */
	public abstract java.lang.String get_Name();
	public abstract void set_Name(java.lang.String newName); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Warehouse", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setName(String newName) {
		try { 
			this.modified = true; 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Warehouse", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter numberConverter;
	private org.openxava.converters.IConverter getNumberConverter() {
		if (numberConverter == null) {
			try {
				numberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("number");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "number"));
			}
			
		}	
		return numberConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @jboss:column-name "NUMBER"
	 */
	public abstract java.lang.Integer get_Number();
	public abstract void set_Number(java.lang.Integer newNumber); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public int getNumber() {
		try {
			return ((Integer) getNumberConverter().toJava(get_Number())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Number", "Warehouse", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setNumber(int newNumber) {
		try { 
			this.modified = true; 
			set_Number((java.lang.Integer) getNumberConverter().toDB(new Integer(newNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Number", "Warehouse", "int"));
		}		
	} 
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "ZONE"
	 */
	public abstract int getZoneNumber();
	/**
	  * 
	  */
	public abstract void setZoneNumber(int newZoneNumber); 

	// Colecciones/Collections		

	// References/Referencias 

	// Methods/Metodos 

	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Warehouse").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.WarehouseData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.WarehouseData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.WarehouseValue getWarehouseValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setWarehouseValue(org.openxava.test.model.WarehouseValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setZoneNumber(0); 
		setNumber(0); 
		setName(null); 	
	} 		
}