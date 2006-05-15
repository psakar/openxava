
// File generated by OpenXava: Thu May 04 19:51:06 CEST 2006
// Archivo generado por OpenXava: Thu May 04 19:51:06 CEST 2006

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Formula		Aggregate/Agregado: FormulaIngredient

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
public class FormulaIngredient implements java.io.Serializable, org.openxava.test.model.IFormulaIngredient {	

	// Constructor
	public FormulaIngredient() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 	
	} 
	
	// Properties/Propiedades 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 

	// References/Referencias 

	private org.openxava.test.model.IIngredient ingredient; 	
	public org.openxava.test.model.IIngredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(org.openxava.test.model.IIngredient newIngredient) {
		if (newIngredient != null && !(newIngredient instanceof org.openxava.test.model.Ingredient)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.ingredient = newIngredient; 
	} 

	private org.openxava.test.model.IIngredient accentuate; 	
	public org.openxava.test.model.IIngredient getAccentuate() {
		return accentuate;
	}
	public void setAccentuate(org.openxava.test.model.IIngredient newIngredient) {
		if (newIngredient != null && !(newIngredient instanceof org.openxava.test.model.Ingredient)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.accentuate = newIngredient; 
	} 

	private org.openxava.test.model.IFormula anotherFormula; 	
	public org.openxava.test.model.IFormula getAnotherFormula() {
		return anotherFormula;
	}
	public void setAnotherFormula(org.openxava.test.model.IFormula newFormula) {
		if (newFormula != null && !(newFormula instanceof org.openxava.test.model.Formula)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.anotherFormula = newFormula; 
	} 

	private org.openxava.test.model.IFormula formula; 	
	public org.openxava.test.model.IFormula getFormula() {
		return formula;
	}
	public void setFormula(org.openxava.test.model.IFormula newFormula) {
		if (newFormula != null && !(newFormula instanceof org.openxava.test.model.Formula)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.formula = newFormula; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Formula").getMetaAggregate("FormulaIngredient"); 	
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