package org.openxava.test.actions;

import org.apache.commons.lang.*;
import org.openxava.actions.*;
import org.openxava.tab.*;

/**
 * 
 * @author Javier Paniza 
 */
public class SyncCarriersSelectionAction extends OnSelectElementBaseAction {

	public void execute() throws Exception {
		Tab targetTab = getView().getSubview("fellowCarriers").getCollectionTab();
		int [] selected = targetTab.getSelected();		
		if (isSelected()) targetTab.setAllSelected(ArrayUtils.add(selected, getRow()));
		else targetTab.setSelected(ArrayUtils.removeElement(selected, getRow())); // It would be setAllSelected, but we use setSelected to test both methods
	}

}
