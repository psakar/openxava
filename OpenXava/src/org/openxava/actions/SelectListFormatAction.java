package org.openxava.actions;

import java.util.*;

import javax.inject.*;

import org.openxava.session.*;
import org.openxava.util.*;
import org.openxava.web.*;

/**
 * 
 * @author Javier Paniza
 */
public class SelectListFormatAction extends TabBaseAction {
	
	private String editor;

	@Inject
	private Chart chart;
	
	public void execute() throws Exception {
		getTab().setEditor(editor);
		getView().setModelName("Chart");
		getView().setEditable(true);
		loadLastNode();
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
		
	protected void loadLastNode() throws Exception {
		String nodeName = Charts.INSTANCE.getLastNodeNameUsed(getTab());
		if (chart == null) {
			chart = new Chart();
		}
		List<String> charts = Charts.INSTANCE.getAllChartNodeNames(getTab());
		if (Is.emptyString(nodeName) || !charts.contains(nodeName)) {
			if (!charts.isEmpty()) {
				nodeName = charts.get(0);
			} else {
				nodeName = null;
			}
		}
		Charts.INSTANCE.loadChart(getTab(), chart, nodeName);
		Charts.INSTANCE.updateView(getRequest(), getView(), getTab(), chart);
	}

}
