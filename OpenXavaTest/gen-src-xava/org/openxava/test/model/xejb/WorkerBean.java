
// File generated by OpenXava: Wed Jun 04 12:16:09 CEST 2008
// Archivo generado por OpenXava: Wed Jun 04 12:16:09 CEST 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Worker		Entity/Entidad

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
 * @ejb:bean name="Worker" type="CMP" jndi-name="@subcontext@/ejb/org.openxava.test.model/Worker" reentrant="false" view-type="remote"
 * @ejb:interface extends="org.openxava.ejbx.EJBReplicable, org.openxava.test.model.IWorker"
 * @ejb:data-object extends="java.lang.Object"
 * @ejb:home extends="javax.ejb.EJBHome"
 * @ejb:pk extends="java.lang.Object"
 *
 * @ejb.value-object name="Worker" match="persistentCalculatedAndAggregate"
 *   
 * @ejb:env-entry name="DATA_SOURCE" type="java.lang.String" value="jdbc/DataSource"
 * @ejb:resource-ref  res-name="jdbc/DataSource" res-type="javax.sql.DataSource"  res-auth="Container" jndi-name="jdbc/@datasource@"
 * @jboss:resource-ref  res-ref-name="jdbc/DataSource" resource-name="jdbc/DataSource"
 * 	
 * @ejb:finder signature="Worker findById(java.lang.Integer id)" query="SELECT OBJECT(o) FROM Worker o WHERE o.id = ?1" view-type="remote" result-type-mapping="Remote"
 * @jboss:query signature="Worker findById(java.lang.Integer id)" query="SELECT OBJECT(o) FROM Worker o WHERE o.id = ?1" 
 * 
 * @jboss:table-name "WORKER"
 *
 * @author Javier Paniza
 */
abstract public class WorkerBean extends EJBReplicableBase 
			implements org.openxava.test.model.IWorker, EntityBean {	
			
	private boolean creating = false;		
	private boolean modified = false;

	// Create 

	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.WorkerKey ejbCreate(Map values) 
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
	public org.openxava.test.model.WorkerKey ejbCreate(org.openxava.test.model.WorkerData data) 
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
	public void ejbPostCreate(org.openxava.test.model.WorkerData data) 
		throws
			CreateException,
			ValidationException { 			
	}
	
	
	/**
	 * @ejb:create-method
	 */	 
	public org.openxava.test.model.WorkerKey ejbCreate(org.openxava.test.model.WorkerValue value) 
		throws
			CreateException,
			ValidationException {
		initMembers();	
		creating = true;	
		modified = false;
		setWorkerValue(value); 
		setId(value.getId()); 
			
		return null;
	} 
	public void ejbPostCreate(org.openxava.test.model.WorkerValue value) 
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
	public abstract Integer getId();
	/**
	  * 
	  */
	public abstract void setId(Integer newId); 
	private static org.openxava.converters.IConverter nickNameConverter;
	private org.openxava.converters.IConverter getNickNameConverter() {
		if (nickNameConverter == null) {
			try {
				nickNameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("nickName");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "nickName"));
			}
			
		}	
		return nickNameConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "NICKNAME"
	 */
	public abstract java.lang.String get_NickName();
	public abstract void set_NickName(java.lang.String newNickName); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getNickName() {
		try {
			return (String) getNickNameConverter().toJava(get_NickName());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "NickName", "Worker", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setNickName(String newNickName) {
		try { 
			this.modified = true; 
			set_NickName((java.lang.String) getNickNameConverter().toDB(newNickName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "NickName", "Worker", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter fullNameConverter;
	private org.openxava.converters.IConverter getFullNameConverter() {
		if (fullNameConverter == null) {
			try {
				fullNameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("fullName");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new EJBException(XavaResources.getString("generator.create_converter_error", "fullName"));
			}
			
		}	
		return fullNameConverter;
	} 
	/**	 
	 * @ejb:persistent-field
	 * 
	 * @jboss:column-name "FULLNAME"
	 */
	public abstract java.lang.String get_FullName();
	public abstract void set_FullName(java.lang.String newFullName); 	
	
	/**
	 * @ejb.value-object match="persistentCalculatedAndAggregate"
	 * @ejb:interface-method
	 */
	public String getFullName() {
		try {
			return (String) getFullNameConverter().toJava(get_FullName());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "FullName", "Worker", "String"));
		}
	}
	
	/**
	 * @ejb:interface-method
	 */
	public void setFullName(String newFullName) {
		try { 
			this.modified = true; 
			set_FullName((java.lang.String) getFullNameConverter().toDB(newFullName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new EJBException(XavaResources.getString("generator.conversion_error", "FullName", "Worker", "String"));
		}		
	} 

	// Colecciones/Collections		

	// References/Referencias 

	// Methods/Metodos 

	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Worker").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.WorkerData getData();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setData(org.openxava.test.model.WorkerData data);
	
	/**
	 * @ejb:interface-method
	 */	
	public abstract org.openxava.test.model.WorkerValue getWorkerValue();		
	
	/**
	 * @ejb:interface-method
	 */		
	public abstract void setWorkerValue(org.openxava.test.model.WorkerValue value);
	
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
	}
	public void unsetEntityContext() {
		super.unsetEntityContext();
	} 

	private void initMembers() { 
		setId(null); 
		setNickName(null); 
		setFullName(null); 	
	} 		
}