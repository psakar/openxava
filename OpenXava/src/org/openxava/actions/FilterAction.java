package org.openxava.actions;

/**
 * 
 * @author Javier Paniza
 */

public class FilterAction extends TabBaseAction {
	
	private long configurationId;  
	
	public void execute() throws Exception {
		getTab().setRowsHidden(false);
		getTab().goPage(1);
		if (configurationId == 0) getTab().saveConfiguration(); 
		else getTab().setConfigurationId(getConfigurationId());
	}

	public long getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(long configurationId) {
		this.configurationId = configurationId;
	}

}
