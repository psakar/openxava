
// File generated by OpenXava: Tue May 09 10:22:32 CEST 2006
// Archivo generado por OpenXava: Tue May 09 10:22:32 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: TransportCharge		Entity/Entidad

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
public class TransportCharge implements java.io.Serializable, org.openxava.test.model.ITransportCharge {	

	// Constructor
	public TransportCharge() {
		initMembers();
	} 

	private void initMembers() { 
		setAmount(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter amountConverter;
	private org.openxava.converters.IConverter getAmountConverter() {
		if (amountConverter == null) {
			try {
				amountConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("amount");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "amount"));
			}
			
		}	
		return amountConverter;
	} 
	private java.math.BigDecimal amount;
	private java.math.BigDecimal get_Amount() {
		return amount;
	}
	private void set_Amount(java.math.BigDecimal newAmount) {
		this.amount = newAmount;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getAmount() {
		try {
			return (java.math.BigDecimal) getAmountConverter().toJava(get_Amount());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Amount", "TransportCharge", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setAmount(java.math.BigDecimal newAmount) {
		try { 
			set_Amount((java.math.BigDecimal) getAmountConverter().toDB(newAmount));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Amount", "TransportCharge", "java.math.BigDecimal"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.IDelivery delivery; 	
	public org.openxava.test.model.IDelivery getDelivery() {
		if (delivery != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				delivery.toString();
			}
			catch (org.hibernate.ObjectNotFoundException ex) {
				return null;
			}
			catch (NullPointerException ex) {
				return null;
			}			
		}	
		return delivery;
	}
	public void setDelivery(org.openxava.test.model.IDelivery newDelivery) {
		if (newDelivery != null && !(newDelivery instanceof org.openxava.test.model.Delivery)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.delivery = newDelivery; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
 		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from TransportCharge as o"); 
 		org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from TransportCharge as o"); 
 		return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("TransportCharge").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		StringBuffer toStringValue = new StringBuffer("[.");
		java.lang.reflect.Field [] fields = getClass().getDeclaredFields();
		Arrays.sort(fields, FieldComparator.getInstance());
		for (int i=0; i < fields.length; i++) {
			try {
				if (getMetaModel().isKey(fields[i].getName())) {
					toStringValue.append(fields[i].get(this)).append('.');
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
				toStringValue.append(" ").append('.');
			}
		}
		toStringValue.append(']');
		return toStringValue.toString();
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}