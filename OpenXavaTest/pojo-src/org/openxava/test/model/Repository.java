package org.openxava.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PreRemove;

import org.openxava.annotations.Stereotype;
import org.openxava.model.Identifiable;
import org.openxava.web.editors.Attachment;

/**
 * 
 * @author Jeromy Altuna
 */
@Entity
public class Repository extends Identifiable {
	
	@Column(name="NAME", length=50)
	private String name;
	
	@Column(name="ARCHIVES_ID", length=32)
	@Stereotype("ATTACHMENTS")
	private String archives;
	
	@PreRemove
	private void removeArchives() {
		Attachment.removeAttachments(archives);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getArchives() {
		return archives;
	}
	public void setArchives(String archives) {
		this.archives = archives;
	}
}
