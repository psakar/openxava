
// File generated by OpenXava: Thu Jul 21 11:24:18 CEST 2016
// Archivo generado por OpenXava: Thu Jul 21 11:24:18 CEST 2016

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: AverageSpeed		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class AverageSpeed implements java.io.Serializable, org.openxava.test.model.IAverageSpeed {	

	// Constructor
	public AverageSpeed() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 
		setSpeed(0); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter speedConverter;
	private org.openxava.converters.IConverter getSpeedConverter() {
		if (speedConverter == null) {
			try {
				speedConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("speed");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "speed"));
			}
			
		}	
		return speedConverter;
	} 
	private java.lang.Integer speed;
	private java.lang.Integer get_Speed() {
		return speed;
	}
	private void set_Speed(java.lang.Integer newSpeed) {
		this.speed = newSpeed;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getSpeed() {
		try {
			return ((Integer) getSpeedConverter().toJava(get_Speed())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Speed", "AverageSpeed", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setSpeed(int newSpeed) {
		try { 
			set_Speed((java.lang.Integer) getSpeedConverter().toDB(new Integer(newSpeed)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Speed", "AverageSpeed", "int"));
		}		
	} 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 

	// References/Referencias 

	private org.openxava.test.model.IVehicle vehicle; 	
	public org.openxava.test.model.IVehicle getVehicle() {
		if (vehicle != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				vehicle.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return vehicle;
	}
	public void setVehicle(org.openxava.test.model.IVehicle newVehicle) {
		if (newVehicle != null && !(newVehicle instanceof org.openxava.test.model.Vehicle)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.vehicle = newVehicle; 
	} 

	private org.openxava.test.model.IDriver driver; 	
	public org.openxava.test.model.IDriver getDriver() {
		if (driver != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				driver.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return driver;
	}
	public void setDriver(org.openxava.test.model.IDriver newDriver) {
		if (newDriver != null && !(newDriver instanceof org.openxava.test.model.Driver)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.driver = newDriver; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static AverageSpeed findByOid(java.lang.String oid) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from AverageSpeed as o where o.oid = :arg0"); 
		query.setParameter("arg0", oid); 
		AverageSpeed r = (AverageSpeed) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "AverageSpeed"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("AverageSpeed").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "AverageSpeed"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}