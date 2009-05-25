package org.openxava.web.meta;

import java.util.*;



import org.openxava.model.meta.*;
import org.openxava.util.*;
import org.openxava.web.meta.xmlparse.*;

/**
 * 
 * @author Javier Paniza
 */

/*
 * tmp: Editores para colecciones y referencias 
 * - Documentaci�n
 * 		* En view
 * 		* En view-xml
 * 		- En customizing
 *      - �Falta algo? 
 * --- VERSION ---
 * - Colecciones: enmarcable y no enmarcable.  
 * - Comprobar toda la est�tica en todas las plataformas
 * - Documentaci�n (tambi�n XML)
 * 
 * --- VERSION ---
 *   - PROBAR XML
 *   - Suite en Liferay  
 */
public class MetaWebEditors {
		
	private static Map editorsByName; 
	private static Map editorsByType;
	private static Map editorsByStereotype;
	private static Map editorsByModelProperty;
	private static Map editorsByReferenceModel;
	private static MetaEditor editorForReferences;
	
	

	public static void addMetaEditorForType(String type, MetaEditor editor) throws XavaException {
		if (editorsByType == null) {
			throw new XavaException("only_from_parse", "MetaWebEditors.addMetaEditorForType");
		}
		editorsByType.put(type, editor);		
	}

	public static void addMetaEditorForReferenceModel(String model, MetaEditor editor) throws XavaException {
		if (editorsByReferenceModel == null) {
			throw new XavaException("only_from_parse", "MetaWebEditors.addMetaEditorForReferenceModel");
		}
		editorsByReferenceModel.put(model, editor);		
	}
		
	public static void addMetaEditorForStereotype(String stereotype, MetaEditor editor) throws XavaException {		
		if (editorsByStereotype == null) {
			throw new XavaException("only_from_parse", "MetaWebEditors.addMetaEditorForStereotype");
		}
		editorsByStereotype.put(stereotype, editor);		
	}
	
	public static void addMetaEditorForModelProperty(String property, String model, MetaEditor editor) throws XavaException {
		if (editorsByModelProperty == null) {
			throw new XavaException("only_from_parse", "MetaWebEditors.addMetaEditorForModelProperty");
		}
		editorsByModelProperty.put(createPropertyModelKey(property, model), editor);		
	}
	
	public static void addMetaEditor(MetaEditor editor) throws XavaException {
		if (editorsByModelProperty == null) {
			throw new XavaException("only_from_parse", "MetaWebEditors.addMetaEditor");
		}		
		if (!Is.emptyString(editor.getName())) {
			editorsByName.put(editor.getName(), editor);
		}
	}

	
	private static String createPropertyModelKey(String property, String model) {
		return model + "::" + property;
	}
	
	/**
	 * @return Null if no editor registered for the specified type
	 */
	public static MetaEditor getMetaEditorForType(String type)	throws XavaException {
		return (MetaEditor) getEditorsByType().get(type);
	}
	
	/**
	 * @return Null if no editor registered for the model used in references
	 */
	public static MetaEditor getMetaEditorForReferenceModel(String model)	throws XavaException {
		return (MetaEditor) getEditorsByReferenceModel().get(model);
	}
	
	
	
	/**
	 * It's like getMetaEditorForType but extract the type of property. <p>
	 * 
	 * Also it considers valid-values and Enums. 
	 * 
	 * @return Null if no editor registered for the type of the specified property
	 */
	public static MetaEditor getMetaEditorForTypeOfProperty(MetaProperty p)	throws XavaException { 					
		String typeName = p.getType().getName();
		if (p.hasValidValues() && "int".equals(typeName)) typeName=EditorsParser.VALID_VALUES_TYPE;				
		MetaEditor r = (MetaEditor) getMetaEditorForType(typeName);
		if (r == null && p.hasValidValues()) {
			// If it's a valid-values and the type is not int we assume that is a Java 5 Enum 
			r = (MetaEditor) getMetaEditorForType("java.lang.Enum");
			if (r == null) r = (MetaEditor) getMetaEditorForType("Enum");
		}		
		return r;
	}
	
	/**
	 * @return Null if no editor registered for the specified stereotype
	 */
	public static MetaEditor getMetaEditorForStereotype(String stereotype)	throws XavaException {
		return (MetaEditor) getEditorsByStereotype().get(stereotype);
	}
	
	
	/**
	 * @return Null if no editor registered for the specified property/model
	 */
	public static MetaEditor getMetaEditorForModelProperty(String property, String model) throws XavaException {
		return (MetaEditor) getEditorsByModelProperty().get(createPropertyModelKey(property, model));
	}
	
	/**
	 * @return Null if no editor registered with the name
	 */
	public static MetaEditor getMetaEditorByName(String name) throws XavaException {
		return (MetaEditor) getEditorsByName().get(name);
	}	
		
	private static Map getEditorsByType() throws XavaException {
		if (editorsByType == null) {
			initMaps();
			EditorsParser.setupEditors();
		}
		return editorsByType;
	}
	
	private static Map getEditorsByReferenceModel() throws XavaException { 
		if (editorsByReferenceModel == null) {
			initMaps();
			EditorsParser.setupEditors();
		}
		return editorsByReferenceModel;
	}
	
	
	private static Map getEditorsByStereotype() throws XavaException {
		if (editorsByStereotype == null) {
			initMaps();
			EditorsParser.setupEditors();								
		}	
		return editorsByStereotype;
	}
	
	private static Map getEditorsByModelProperty() throws XavaException {
		if (editorsByModelProperty == null) {
			initMaps();
			EditorsParser.setupEditors();
		}
		return editorsByModelProperty;
	}
	
	private static Map getEditorsByName() throws XavaException {
		if (editorsByName == null) {
			initMaps();
			EditorsParser.setupEditors();
		}
		return editorsByName;
	}	
		
	private static void initMaps() {
		editorsByType = new HashMap();
		editorsByStereotype = new HashMap();
		editorsByModelProperty = new HashMap();
		editorsByName = new HashMap();
		editorsByReferenceModel = new HashMap(); 
	}

	
	/**	 
	 * @return Not null
	 * @throws ElementNotFoundException If no editor for property	 
	 */
	public static MetaEditor getMetaEditorFor(MetaProperty p) throws ElementNotFoundException, XavaException {							
		if (p.hasMetaModel()) {			
			MetaEditor r = (MetaEditor) getMetaEditorForModelProperty(p.getName(), p.getMetaModel().getName());
			if (r != null) {				
				return r;				
			}
		}				
		if (p.hasStereotype()) {			
			MetaEditor r = (MetaEditor) getMetaEditorForStereotype(p.getStereotype());				
			if (r != null) {				
				return r;
			}
		}		
		MetaEditor r = (MetaEditor) getMetaEditorForTypeOfProperty(p);		
		if (r == null) {
			throw new ElementNotFoundException("editor_not_found", p.getId());
		}		
		return r;
	}
	
	public static MetaEditor getMetaEditorFor(MetaReference ref) throws ElementNotFoundException, XavaException {							
		MetaEditor r = (MetaEditor) getMetaEditorForReferenceModel(ref.getReferencedModelName());		
		if (r == null) {
			if (editorForReferences == null) {
				throw new ElementNotFoundException("editor_for_references_required");
			}
			return editorForReferences; 
		}		
		return r;
	}
	
	public static MetaEditor getMetaEditorFor(MetaMember member) throws ElementNotFoundException, XavaException { 
		if (member instanceof MetaProperty) return getMetaEditorFor((MetaProperty) member);
		if (member instanceof MetaReference) return getMetaEditorFor((MetaReference) member);
		throw new ElementNotFoundException("editor_not_found", member.getId());
	}

	public static void addMetaEditorForReferences(MetaEditor editor) { 
		editorForReferences = editor; 		
	}
	
}