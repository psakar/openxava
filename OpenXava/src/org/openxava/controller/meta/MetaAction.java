package org.openxava.controller.meta;


import java.util.*;

import org.openxava.actions.*;
import org.openxava.util.*;
import org.openxava.util.meta.*;


public class MetaAction extends MetaElement {
	
	public static final int NEVER = 0;
	public static final int IF_POSSIBLE = 1;
	public static final int ALMOST_ALWAYS = 2;
	public static final int ALWAYS = 4;

	private boolean hidden = false;
	private Collection metaSets;
	private String qualifiedName;
	private String method;
	private String image;
	private String keystroke;
	private String mode;	
	private String className;
	private Collection metaUseObjects;
	private MetaController metaController;
	private int byDefault;
	private boolean onInit;
	
	public MetaAction() {
	}
	
	public MetaAction(String name) {
		setName(name);
	}
	
	public String getQualifiedName() {
		if (qualifiedName == null) {
			if (metaController == null) qualifiedName = getName();
			else qualifiedName = getMetaController().getName() + "." + getName();
		}	 
		return qualifiedName;
	}
	
	public void setName(String newName) {
		qualifiedName = null;
		super.setName(newName);
	}

	public String getKeystroke() {
		return keystroke;
	}
	public void setKeystroke(String keystroke) {
		this.keystroke = keystroke;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String imagen) {
		this.image = imagen;
	}

	public String getMethod() {
		if (Is.emptyString(method)) return getName();
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public String getLabel(Locale locale) {
		return Labels.removeUnderlined(super.getLabel(locale));		
	}

	public char getMnemonic() {
		String label = super.getLabel();
		int idxSub = label.indexOf('_');
		if (idxSub >= 0) {
			int idxMnemonic = idxSub + 1;
			if (idxMnemonic < label.length()) {
				return label.charAt(idxMnemonic);
			}			
		}		
		return 0;
	}
	
	public boolean equals(Object action) {
		if (!(action instanceof MetaAction)) return false; // It also discards the nulls
		return getName().equals(((MetaAction) action).getName());
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String string) {
		className = string;
	}
	
	public boolean usesObjects() {
		return metaUseObjects != null && !metaUseObjects.isEmpty();
	}
	
	public Collection getMetaUseObjects() {		
		if (!usesObjects()) return Collections.EMPTY_LIST;
		return metaUseObjects;
	}

	public void addMetaUseObject(MetaUseObject object) {
		if (metaUseObjects == null) metaUseObjects = new ArrayList();
		metaUseObjects.add(object);		
	}

	public MetaController getMetaController() {
		return metaController;
	}
	public void setMetaController(MetaController controller) {
		metaController = controller;
		qualifiedName = null;
	}
	
	public String getControllerName() {
		return metaController==null?"":metaController.getName();
	}
	
	public boolean hasImage() {
		return !Is.emptyString(this.image);
	}

	public void _addMetaSet(MetaSet metaSet) {
		if (metaSets == null) {
			metaSets = new ArrayList();
		}
		metaSets.add(metaSet);		
	}
	
	public IAction createAction() throws XavaException {
		try {
			Object o = Class.forName(getClassName()).newInstance();
			if (!(o instanceof IAction)) {
				throw new XavaException("implements_required", getClassName(), IAction.class.getName());
			}
			IAction calculator = (IAction) o;
			if (hasMetaSets()) {
				assignPropertyValues(calculator);
			}						
			return calculator;
		}
		catch (XavaException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new XavaException("create_action_error", getClassName());
		}
	}
	
	public boolean hasMetaSets() {
		return metaSets != null;
	}

	private void assignPropertyValues(IAction action) throws Exception {
		PropertiesManager mp = new PropertiesManager(action);
		Iterator it = getMetaSets().iterator();
		while (it.hasNext()) {
			MetaSet metaSet = (MetaSet) it.next();
			mp.executeSetFromString(metaSet.getPropertyName(), metaSet.getValue());			
		}		
	}

	public Collection getMetaSets() {
		return metaSets==null?new ArrayList():metaSets;
	}

	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean b) {
		hidden = b;
	}

	public String getMode() {
		return mode;
	}
	public void setMode(String string) {
		mode = string;
	}

	public int getByDefault() {
		return byDefault;
	}
	public void setByDefault(int i) {
		byDefault = i;
	}
	
	public String getId() {
		return getQualifiedName();
	}

	public boolean isOnInit() {
		return onInit;
	}
	public void setOnInit(boolean b) {
		onInit = b;
	}

}
