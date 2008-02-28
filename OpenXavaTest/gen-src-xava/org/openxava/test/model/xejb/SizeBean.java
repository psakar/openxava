
// File generated by OpenXava: Wed Feb 27 16:26:02 CET 2008
// Archivo generado por OpenXava: Wed Feb 27 16:26:02 CET 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Size		Entity/Entidad

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
 * @ejb:bean name="Size" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Size" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.ISize"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Size" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Size findById(int id)" query="SELECT OBJECT(o) FROM Size o WHERE o.id = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Size findById(int id)" query="SELECT OBJECT(o) FROM Size o WHERE o.id = ?1" 
 * 
 * @jboss:table-name "XAVATEST.SIZE"
 *
 * @author Javier Paniza
 */
abstract public class SizeBean extends EJBReplicableBase 
			implements org.openxava.test.model.ISize, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.SizeKey ejbCreate(Map values) 
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
	} 
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.SizeKey ejbCreate(org.openxava.test.model.SizeData data) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setData(data); 
		setId(data.getId()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.SizeData data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.SizeKey ejbCreate(org.openxava.test.model.SizeValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setSizeValue(value); 
		setId(value.getId()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.SizeValue value) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	public void ejbLoad() {
		creating = false;
		modified = false; 
	}
	
	public void ejbStore() {
		if (creating) {
			creating = false;
			return;
		}
		if (!modified) return; 
		
		modified = false;
	} 	
	

	public void ejbRemove() throws RemoveException { 						
	} 	
	
	// Properties/Propiedades 
	/**
	 * @ejb:interface-method
	 * @ejb:persistent-field
	 * @ejb:pk-field
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 *
	 * @jboss:column-name "ID"
	 */
	public abstract int getId();
	/**
	  * 
	  */
	public abstract void setId(int newId); 
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Size", "String"));
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
			throw new EJBException(XavaResources.getString("generator.conversion_error", "Name", "Size", "String"));
		}		
	} 

	// Colecciones/Collections		

	// References/Referencias 

	// Methods/Metodos 

	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Size").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.SizeData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.SizeData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.SizeValue getSizeValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setSizeValue(org.openxava.test.model.SizeValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setId(0); 
		setName(null); 	
	} 		
}