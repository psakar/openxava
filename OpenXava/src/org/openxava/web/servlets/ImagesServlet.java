package org.openxava.web.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.openxava.controller.*;
import org.openxava.util.*;
import org.openxava.view.*;


/**
 * @author Javier Paniza
 */

public class ImagesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		try {			
			ModuleContext context = (ModuleContext) request.getSession().getAttribute("context");
			View view = (View) context.get(request, "xava_view");
			String property=request.getParameter("property");
			if (property == null) {
				throw new Exception(XavaResources.getString("image_property_required"));
			}
			byte [] image = (byte []) view.getValue(property); 
			if (image != null) {					
				response.getOutputStream().write(image);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new ServletException(XavaResources.getString("image_error"));
		}		
	}

}
