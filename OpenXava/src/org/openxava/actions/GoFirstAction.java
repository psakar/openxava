package org.openxava.actions;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openxava.tab.*;

/**
 * @author Javier Paniza
 */

public class GoFirstAction extends BaseAction {
			
	private Map key;
	private transient Tab tab;
	private static Log log = LogFactory.getLog(GoFirstAction.class);
	
	public void executeBefore() throws Exception {
		key = (Map) tab.getTableModel().getObjectAt(0);
	}	

	public void execute() throws Exception {		
	}

	public Tab getTab() {
		return tab;
	}

	public void setTab(Tab web) {
		tab = web;
	}

}
