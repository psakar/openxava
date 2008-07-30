package org.openxava.web.portlets;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

import javax.portlet.*;
import javax.servlet.http.*;

import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.portlet.*;
import org.apache.commons.logging.*;

import org.openxava.util.*;
import org.openxava.web.style.*;

/**
 * Allows define an OpenXava as a standard JSR-168 portlet. <p>
 * 
 * You only need to define the OpenXava application and module.<br> 
 * In this way:
 *
 * <pre>
 *  <!-- Portlet Preferences -->
 *  <portlet-preferences>
 *    <preference>
 *      <description>OpenXava application name</description>
 *      <name>Application</name>
 *      <value>MyApplication</value>
 *      <non-modifiable/>
 *    </preference>
 *    <preference>
 *      <description>OpenXava module name</description>
 *      <name>Module</name>
 *      <value>MyModule</value>
 *      <non-modifiable/>
 *    </preference>
 *  </portlet-preferences>
 * </pre>
 *
 * @author  Javier Paniza
 * @author  Guy de Pourtal�s
 */

public class XavaPortlet extends GenericPortlet {
	
	
	
	private static Log log = LogFactory.getLog(XavaPortlet.class);

	/**
	 * Name of portlet preference for OpenXava application. 
	 */
	public static final String PARAM_APPLICATION = "Application";
	
	/**
	 * Name of portlet preference for OpenXava module. 
	 */
	public static final String PARAM_MODULE = "Module";
	
	
	private static Style style;
	private String moduleURL;
	
	
	
	public void init(PortletConfig config) throws PortletException {
		super.init(config);		
		// Calling directly to module.jsp does not work well in Liferay (see portlet.jsp doc)		
		this.moduleURL = "/WEB-INF/jsp/xava/portlet.jsp?xava.portlet.application=" +		
			config.getInitParameter(PARAM_APPLICATION) + "&xava.portlet.module=" +			
			config.getInitParameter(PARAM_MODULE);
	}

	/**
	 * Executes the OpenXava module as defined by the init parameters PARAM_APPLICATION
	 * and PARAM_MODULE.
	 * 
	 * @throws PortletException
	 * @throws IOException
	 */
	public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {		
		Object style = getStyle(request);		
		request.setAttribute("style", style);
				
		request.setAttribute("xava.portlet.renderURL", response.createRenderURL());
		request.setAttribute("xava.portlet.actionURL", createActionURL(request, response)); 
		request.setAttribute("xava.portlet.uploadActionURL", response.createActionURL()); 
		request.setAttribute("xava.upload.fileitems", request.getPortletSession().getAttribute("xava.upload.fileitems")); 
		request.setAttribute("xava.upload.error", request.getPortletSession().getAttribute("xava.upload.error"));
		request.getPortletSession().removeAttribute("xava.upload.fileitems");
		request.getPortletSession().removeAttribute("xava.upload.error");
		
		request.removeAttribute("xava.portal.user");
		request.removeAttribute("xava.portal.userinfo");
		Map userInfo = (Map) request.getAttribute(PortletRequest.USER_INFO);			
		if (userInfo != null) {
			UserInfo user = new UserInfo();
			String email = (String) userInfo.get("user.home-info.online.email");			
			if (XavaPreferences.getInstance().isEMailAsUserNameInPortal()) {							
				if (!Is.emptyString(email)) {
					request.setAttribute("xava.portal.user", email);
					user.setId(email);
				}			
			}			
			else {
				user.setId(request.getRemoteUser());
			}			
			user.setGivenName((String) userInfo.get("user.name.given"));
			user.setFamilyName((String) userInfo.get("user.name.family"));
			user.setEmail(email);
			request.setAttribute("xava.portal.userinfo", user);
		}
				
		
		
		/*
		 * In Liferay 5.0.1, the MimeHeaders are not correctly dispatched in the JSP request,
		 * so we put the required headers in request attributes
		 */		
		if (request.getClass().getCanonicalName().equals("com.liferay.portlet.RenderRequestImpl")) {
			try {
				// Implementation tries to resolve the servlet request without a formal dependency to Liferay's libraries
				HttpServletRequest servletRequest = (HttpServletRequest) request.getClass().getMethod("getHttpServletRequest", null).invoke(request, null);
				if (servletRequest != null) {
					String userAgent = servletRequest.getHeader("user-agent");
					if (userAgent != null) {
						request.setAttribute("xava.portlet.user-agent", userAgent);
					}
				}
			} catch (IllegalArgumentException e) {
				// Do nothing and assume that the headers will be resolved normally
			} catch (SecurityException e) {
//				 Do nothing and assume that the headers will be resolved normally
			} catch (IllegalAccessException e) {
//				 Do nothing and assume that the headers will be resolved normally
			} catch (InvocationTargetException e) {
//				 Do nothing and assume that the headers will be resolved normally
			} catch (NoSuchMethodException e) {
//				 Do nothing and assume that the headers will be resolved normally
			}
		}
		
		
		PortletContext context = getPortletContext();
		PortletRequestDispatcher rd = context.getRequestDispatcher(moduleURL);		
		rd.include(request, response);		
	}
	
	
	
	private Object createActionURL(RenderRequest request, RenderResponse response) {
		// WebSphere Portal and Liferay work fine with actionURL
		// JetSpeed/2.0 works with actionURL but it fails on navigate at some point
		// 		using Internet Explorer, because state is holded in url, and IE does
		// 		not admit long URLs. Therefore we use renderURL instead.
		// Jetspeed/2.1.2 fails with IE as Jetspeed/2.0, but it does not support renderURL.
		//		That is in Jetspeed/2.1.2 you need to use Firefox. (Or improve OX)
		return isJetspeed20(request)?response.createRenderURL():response.createActionURL();				
	}

	private boolean isJetspeed20(PortletRequest request) {
		return request.getPortalContext().getPortalInfo().indexOf("Jetspeed/2.0") >= 0;
	}

	public void processAction(ActionRequest request, ActionResponse response) throws PortletException {		
		propagateParameters(request, response);
		
		PortletMode mode = request.getPortletMode();
		if (mode.equals(PortletMode.EDIT)) {
			response.setPortletMode(PortletMode.VIEW);
		}		
		
		processMultipartForm(request);
		
		
	}

	private void processMultipartForm(ActionRequest request) {
		String contentType = request.getContentType();		
		if (contentType != null && contentType.indexOf("multipart/form-data") >= 0) {				
			try {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setSizeThreshold(1000000);		
				PortletFileUpload upload = new PortletFileUpload(factory);
				List fileItems = upload.parseRequest(request);					
				request.getPortletSession().setAttribute("xava.upload.fileitems", fileItems); 
				request.getPortletSession().removeAttribute("xava.upload.error"); 
			}
			catch (Exception ex) {
				log.error(ex.getMessage(), ex);
				request.getPortletSession().removeAttribute("xava.upload.fileitems");
				request.getPortletSession().setAttribute("xava.upload.error", "upload_error");				
			}				
		}
	} 	
		
	private void propagateParameters(ActionRequest request, ActionResponse response) {
		// This is needed as indicated in section 11.1.1 of JSR-168
		
		for (Enumeration en = request.getParameterNames(); en.hasMoreElements();) {
			 String name = (String) en.nextElement();
			 String [] values = request.getParameterValues(name);			 
			 for (int i=0; i<values.length; i++) {
				 if ("".equals(values[i])) values[i] = " "; // Jetspeed 2.1.2 does not like empty string
			 }			 
			 response.setRenderParameter(name, values);			 
		 }
	}

	private Style getStyle(RenderRequest request) {
		
		if (style == null) {
			// Maybe moving this to a XML file (as style-portal.xml) could be
			// a good idea
			String portal = request.getPortalContext().getPortalInfo().toLowerCase();
			if (portal.indexOf("liferay") >= 0) {
				if (portal.indexOf("4.1.") >= 0 || portal.indexOf("4.2.") >= 0) style = Liferay41Style.getInstance();
				else style = LiferayStyle.getInstance();
			}
			else if (portal.indexOf("websphere portal/6") >= 0) style = WebSpherePortal6Style.getInstance();
			else if (portal.indexOf("websphere portal/5") >= 0) style = WebSpherePortalStyle.getInstance();			
			else if (portal.indexOf("jetspeed") >= 0) style = JetSpeed2Style.getInstance();
			else style = Style.getInstance();
		}		
		return style;
	}
	
}
