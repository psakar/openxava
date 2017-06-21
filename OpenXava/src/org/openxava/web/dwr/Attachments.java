package org.openxava.web.dwr;

import java.io.File;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openxava.hibernate.XHibernate;
import org.openxava.jpa.XPersistence;
import org.openxava.util.XavaPreferences;
import org.openxava.web.editors.Attachment;

/**
 * 
 * @author Jeromy Altuna
 * @since  5.8
 */
public class Attachments extends DWRBase {
	
	private static Log log = LogFactory.getLog(Attachments.class);
	
	private static final String DIRECTORY = XavaPreferences.getInstance().getFilesPath();
	
	public String uploadData(HttpServletRequest request, HttpServletResponse response, String application, String module, String attachmentName, Long attachmentSize, String attachmentType, String attachmentsId) throws Exception{
		try {
			initRequest(request, response, application, module);			
			Attachment attachment = new Attachment();			
			attachment.setName(attachmentName);
			attachment.setType(attachmentType);
			attachment.setSize(attachmentSize);
			attachment.setAttachmentsId(attachmentsId);
			XPersistence.getManager().persist(attachment);
			return attachment.getId();
			
		} catch(Exception ex) {
			log.error(ex.getMessage(), ex);
			throw ex;
		} finally {
			XPersistence.commit();
			cleanRequest();			
		}
	}
	
	public void uploadContent(HttpServletRequest request, HttpServletResponse response, String application, String module, String attachmentId, byte[] attachmentContent) throws Exception {
		File file = null;
		try {
			initRequest(request, response, application, module);
			file = new File(DIRECTORY,  attachmentId);
			FileUtils.writeByteArrayToFile(file, attachmentContent, true);
			
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			FileUtils.deleteQuietly(file);
			Attachment.removeAttachment(attachmentId);
			throw ex;
		} finally {				
			cleanRequest();			
		}
	}
	
	public void commit(HttpServletRequest request, HttpServletResponse response, String application, String module, String attachmentId) throws Exception {
		File file = null;
		try {			
			initRequest(request, response, application, module);
			file = new File(DIRECTORY, attachmentId);
			fileContentToAttachment(attachmentId, file);
			
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw ex;
		} finally {
			FileUtils.deleteQuietly(file);
			cleanRequest();
		}		
	}
	
	private void fileContentToAttachment(String attachmentId, File file) throws Exception {
		InputStream is = null;
		try {
			XHibernate.setDefaultSchema(XPersistence.getDefaultSchema());
			Attachment attachment = (Attachment) XHibernate.getSession().get(Attachment.class, attachmentId);
			is = FileUtils.openInputStream(file);
			Blob blob = XHibernate.getSession().getLobHelper().createBlob(is, FileUtils.sizeOf(file));
			attachment.setContent(blob);
			XHibernate.getSession().save(attachment);
		} finally {
			XHibernate.commit();
			IOUtils.closeQuietly(is);
		}				
	}	
}
