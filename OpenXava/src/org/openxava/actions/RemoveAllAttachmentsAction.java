package org.openxava.actions;

import org.openxava.web.editors.Attachment;

/**
 * 
 * @author Jeromy Altuna
 * @since 5.8
 */
public class RemoveAllAttachmentsAction extends ViewBaseAction {
	
	private String newAttachmentsProperty;
	
	@Override
	public void execute() throws Exception {
		String attachmentsId = getView().getValueString(newAttachmentsProperty);
		getView().setValue(newAttachmentsProperty, null);		
		int count = Attachment.removeAttachments(attachmentsId);
		addMessage("attachments_removed", count);		
	}

	public void setNewAttachmentsProperty(String newAttachmentsProperty) {
		this.newAttachmentsProperty = newAttachmentsProperty;
	}	
}
