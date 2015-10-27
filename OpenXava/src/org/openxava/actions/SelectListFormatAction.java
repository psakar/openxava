package org.openxava.actions;

import javax.inject.*;
import org.openxava.session.*;
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
		chart = Chart.load(getTab());
		if (chart == null) chart = Chart.create(getTab());
		Charts.updateView(getRequest(), getView(), getTab(), chart); 
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
		
}
