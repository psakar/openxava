package org.openxava.web.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openxava.controller.ModuleContext;
import org.openxava.jpa.XPersistence;
import org.openxava.util.Is;
import org.openxava.util.XavaResources;
import org.openxava.web.editors.Attachment;

/**
 * 
 * @author Jeromy Altuna
 * @since  5.8
 */
public class AttachmentsServlet extends HttpServlet {

private static final long serialVersionUID = -5367904862488034396L;

private static Log log = LogFactory.getLog(AttachmentsServlet.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		InputStream in = null;
		OutputStream out = null;
				
		try {
			String attachmentId = (String) request.getParameter("attachmentId");
			if (Is.emptyString(attachmentId)) return;
			
			setDefaultSchema(request);
			Attachment attachment = Attachment.findAttachment(attachmentId);
			if (attachment == null) return;
			
			response.setContentType(attachment.getType());
			response.setHeader("Content-Length", String.valueOf(attachment.getSize()));;
			response.setHeader("Content-Disposition", "inline; filename=\""	+ attachment.getName() + "\"");
							
			in  = attachment.getContent().getBinaryStream();
			out = response.getOutputStream();
			long count = IOUtils.copyLarge(in, out);
			
			String format = "Attachment { name: %s, type: %s, size: %d, transfer: %d }";
			log.info(String.format(format, attachment.getName(),
					                        attachment.getType(),
					                        attachment.getSize(), count));

		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new ServletException(XavaResources.getString("attachments_servlet_error"));
			
		} finally {
			IOUtils.closeQuietly(in);
			IOUtils.closeQuietly(out);
		}
	}

	private void setDefaultSchema(HttpServletRequest request) {
		String organization = (String) request.getSession().getAttribute("naviox.organization");
		if (!Is.emptyString(organization)) { 
			XPersistence.setDefaultSchema(organization);
			return;
		}
		ModuleContext context = (ModuleContext) request.getSession().getAttribute("context");
		String defaultSchema = (String) context.get(request, "xava_defaultSchema");
		if (!Is.emptyString(defaultSchema)) XPersistence.setDefaultSchema(defaultSchema);
	}
}
