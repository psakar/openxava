
// File generated by OpenXava: Fri May 19 10:22:45 CEST 2006
// Archivo generado por OpenXava: Fri May 19 10:22:45 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Aggregate/Agregado: CustomerState

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
public class CustomerState implements java.io.Serializable, org.openxava.test.model.ICustomerState {	

	// Constructor
	public CustomerState() {
		initMembers();
	} 

	private void initMembers() { 	
	} 
	
	// Properties/Propiedades 

	// References/Referencias 

	private org.openxava.test.model.IState state; 	
	public org.openxava.test.model.IState getState() {
		if (state != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				state.toString();
			}
			catch (org.hibernate.ObjectNotFoundException ex) {
				return null;
			}
			catch (NullPointerException ex) {
				return null;
			}			
		}	
		return state;
	}
	public void setState(org.openxava.test.model.IState newState) {
		if (newState != null && !(newState instanceof org.openxava.test.model.State)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.state = newState; 
	} 

	private org.openxava.test.model.ICustomer customer; 	
	public org.openxava.test.model.ICustomer getCustomer() {
		if (customer != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				customer.toString();
			}
			catch (org.hibernate.ObjectNotFoundException ex) {
				return null;
			}
			catch (NullPointerException ex) {
				return null;
			}			
		}	
		return customer;
	}
	public void setCustomer(org.openxava.test.model.ICustomer newCustomer) {
		if (newCustomer != null && !(newCustomer instanceof org.openxava.test.model.Customer)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.customer = newCustomer; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Customer").getMetaAggregate("CustomerState"); 	
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