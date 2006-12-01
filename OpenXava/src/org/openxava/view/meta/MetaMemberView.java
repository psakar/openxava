package org.openxava.view.meta;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A little minimum common denominator for 
 * <code>MetaPropertyView</code> and <code>MetaReferenceView</code>. <p>
 * 
 * @author Javier Paniza
 */

public class MetaMemberView {
	
	private Collection actionsNames;
	private Collection alwaysEnabledActionsNames; 
	
	private Log log = LogFactory.getLog(MetaMemberView.class);
	
	public void addActionName(String actionName) {
		if (actionsNames == null) actionsNames = new ArrayList();
		actionsNames.add(actionName);
	}
	public Collection getActionsNames() {		
		return actionsNames==null?Collections.EMPTY_LIST:actionsNames;
	}
	
	public void addAlwaysEnabledActionName(String actionName) {
		if (alwaysEnabledActionsNames == null) alwaysEnabledActionsNames = new ArrayList();
		alwaysEnabledActionsNames.add(actionName);
	}
	public Collection getAlwaysEnabledActionsNames() {		
		return alwaysEnabledActionsNames==null?Collections.EMPTY_LIST:alwaysEnabledActionsNames;
	}		
	
}
