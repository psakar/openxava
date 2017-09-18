package org.openxava.actions;

import org.openxava.web.editors.Attachment;

/**
 * 
 * @author Jeromy Altuna
 * @since 5.8
 */
public class RemoveAttachmentAction extends BaseAction {
	
	private String attachmentId;
	
	@Override
	public void execute() throws Exception {
		int count = Attachment.removeAttachment(attachmentId);
		addMessage("attachments_removed", count);		
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}	
}
