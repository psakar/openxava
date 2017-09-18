package org.openxava.web.editors;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.openxava.jpa.XPersistence;
import org.openxava.model.Identifiable;

/**
 * 
 * @author Jeromy Altuna
 * @since  5.8
 */
@Entity
@Table(name="OXFILES", indexes=@Index(columnList="libraryid"))
@NamedQueries({
	@NamedQuery(
		name="Attachment.findAttachmentById", query="FROM Attachment a WHERE a.id = :id"
	),
	@NamedQuery(
		name="Attachment.removeAllAttachments", query="DELETE FROM Attachment a WHERE a.attachmentsId = :attachmentsId" 	
	), 
	@NamedQuery(
		name="Attachment.removeAttachmentById", query="DELETE FROM Attachment a WHERE a.id = :attachmentId"	
	)
})
@NamedNativeQueries({
	@NamedNativeQuery(
		name="Attachment.getAttachmentsData", resultSetMapping="AttachmentVO", query="SELECT id, name, type, size " +
																					 "FROM {h-schema}oxfiles " + 
																					 "WHERE libraryid = :libraryid"
	)					  
})
@SqlResultSetMapping(
	name="AttachmentVO",
	classes= @ConstructorResult(
			     targetClass=Attachment.AttachmentVO.class,
			     columns={
			    	 @ColumnResult(name="id"),	 
			         @ColumnResult(name="name"), 
			         @ColumnResult(name="type"), 
			         @ColumnResult(name="size", type = Long.class)
			     }
			 )
)
public class Attachment extends Identifiable implements Serializable {
	
	private static final long serialVersionUID = 3238643757968050838L;

	@Column(name="name", length=255)
	private String name;
	
	@Column(name="type", length=128)
	private String type;
	
	@Column(name="size")
	private Long size;
		
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name="content", length=1073741824)	
	private Blob content;
	
	@Column(name="libraryid", length=32)
	private String attachmentsId;
	
	public static Attachment findAttachment(String attachmentId) {
		Query query = XPersistence.getManager().createNamedQuery("Attachment.findAttachmentById");
		query.setParameter("id", attachmentId);
		return (Attachment) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked") 
	public static Collection<AttachmentVO> getAttachmentsData(String attachmentsId) {
		Query query = XPersistence.getManager().createNamedQuery("Attachment.getAttachmentsData");
		query.setParameter("libraryid", attachmentsId);
		return query.getResultList();
	}	
	
	public static int removeAttachments(String attachmentsId) {
		Query query = XPersistence.getManager().createNamedQuery("Attachment.removeAllAttachments");
		query.setParameter("attachmentsId", attachmentsId);
		return query.executeUpdate();			
	}
	
	public static int removeAttachment(String attachmentId) {
		Query query = XPersistence.getManager().createNamedQuery("Attachment.removeAttachmentById");
		query.setParameter("attachmentId", attachmentId);
		return query.executeUpdate();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Blob getContent() {
		return content;
	}
	public void setContent(Blob content) {
		this.content = content;
	}

	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
	public String getAttachmentsId() {
		return attachmentsId;
	}
	public void setAttachmentsId(String attachmentsId) {
		this.attachmentsId = attachmentsId;
	}
	
	public static class AttachmentVO {
		public final String id;
		public final String name;
		public final String type;
		public final Long size;		
				
		public AttachmentVO(String id, String name, String type, Long size) {
			this.id = id;
			this.name = name;
			this.type = type;
			this.size = size;
		}
	}
}
