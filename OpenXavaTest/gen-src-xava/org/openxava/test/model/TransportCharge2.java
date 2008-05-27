
// File generated by OpenXava: Tue May 27 10:58:49 CEST 2008
// Archivo generado por OpenXava: Tue May 27 10:58:49 CEST 2008

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: TransportCharge2		Entity/Entidad

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
public class TransportCharge2 implements java.io.Serializable, org.openxava.test.model.ITransportCharge2 {	

	// Constructor
	public TransportCharge2() {
		initMembers();
	} 

	private void initMembers() { 
		setYear(0); 
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Amount", "TransportCharge2", "java.math.BigDecimal"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Amount", "TransportCharge2", "java.math.BigDecimal"));
		}		
	} 
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int newYear) {
		this.year = newYear;
	} 

	// References/Referencias 

	private org.openxava.test.model.IDelivery delivery; 
	private java.lang.Integer delivery_invoice_number; 
	private java.lang.Integer delivery_number; 
	private java.lang.Integer delivery_type_number; 	
	public org.openxava.test.model.IDelivery getDelivery() {
		if (delivery != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				delivery.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return delivery;
	}
	public void setDelivery(org.openxava.test.model.IDelivery newDelivery) throws RemoteException{
		if (newDelivery != null && !(newDelivery instanceof org.openxava.test.model.Delivery)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.delivery = newDelivery; 
		this.delivery_invoice_number = newDelivery == null?null:new Integer(newDelivery.getInvoice().getNumber()); 
		this.delivery_number = newDelivery == null?null:new Integer(newDelivery.getNumber()); 
		this.delivery_type_number = newDelivery == null?null:new Integer(newDelivery.getType().getNumber()); 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from TransportCharge2 as o"); 
 			return query.getResultList();  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from TransportCharge2 as o"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from TransportCharge2 as o"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("TransportCharge2").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "TransportCharge2"));
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