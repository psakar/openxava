package org.openxava.web.taglib;

import javax.servlet.jsp.tagext.*;

import org.openxava.controller.meta.*;
import org.openxava.util.*;

/**
 * @since 5.8
 * @author Javier Paniza
 */
public class ActionTagBase extends TagSupport implements IActionTag {
	
	private String action;
	private String argv;
	
	protected String getTooltip(MetaAction metaAction) {  
		String description = getActionDescription(metaAction);
		StringBuffer result = new StringBuffer();
		result.append(metaAction.getKeystroke());
		if (result.length() > 0 && !Is.emptyString(description)) result.append(" - ");
		result.append(description);
		return result.toString();
	}
	
	protected String getActionDescription(MetaAction metaAction) {
		return metaAction.getDescription();
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String string) {
		action = string;
	}

	public String getArgv() {
		return argv;
	}

	public void setArgv(String string) {
		argv = string;		
	}


}
