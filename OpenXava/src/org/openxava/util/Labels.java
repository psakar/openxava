package org.openxava.util;

import java.util.*;



import org.apache.commons.logging.*;
import org.openxava.application.meta.*;

/**
 * Utility class for obtain the i18n of the labels. <p>
 * 
 * @author Javier Paniza
 */

public class Labels {

	private static Log log = LogFactory.getLog(Labels.class);
	
	/**
	 * On any error returns the sent <code>id</code> with the first letter in uppercase.
	 */
	public static String get(String id, Locale locale) {
		try {
			return getImpl(id, locale);
		}
		catch (MissingResourceException ex) {
			if (XavaPreferences.getInstance().isI18nWarnings()) {
				log.warn(XavaResources.getString("element_i18n_warning", id));
			}			
			return Strings.firstUpper(id);
		}
		catch (Exception ex) {
			
			if (XavaPreferences.getInstance().isI18nWarnings()) {
				log.warn(XavaResources.getString("element_i18n_warning", id));
			} 
			return Strings.firstUpper(id);
		}		
	}
	
	/**
	 * If <code>id</code> is not found, or other error returns <code>defaultValue</code>
	 */
	public static String get(String id, Locale locale, String defaultValue) {
		try {
			return getImpl(id, locale);
		}
		catch (MissingResourceException ex) {
			if (XavaPreferences.getInstance().isI18nWarnings()) {
				log.warn(XavaResources.getString("element_i18n_warning", id));
			}			
			return defaultValue;
		}
		catch (Exception ex) {
			if (XavaPreferences.getInstance().isI18nWarnings()) {
				log.warn(XavaResources.getString("element_i18n_warning", id));
			} 
			return defaultValue;
		}		
	}		
		
	private static String getImpl(String id, Locale locale) throws MissingResourceException, XavaException {
		if (id == null) return "";
		try {			
			return getResource(id, locale);
		}
		catch (MissingResourceException ex) {			
			int idxPunto = id.indexOf(".");
			if (idxPunto < 0) throw ex;
			String idWitoutQualifier = removeViewOrTab(id);
			if (idWitoutQualifier != null) return get(idWitoutQualifier, locale);
			return get(id.substring(idxPunto + 1), locale);
		}
	} 
	
	
	
	/**
	 * @return null if not contains view or tab
	 */
	private static String removeViewOrTab(String id) {
		String r = removeQualifier(id, ".view.", ".views.");
		if (r != null) return r;
		return removeQualifier(id, ".tab.properties.", ".tabs.");		
	}
	
	private static String removeQualifier(String id, String singular, String plural)
	{
		try {
			int idx = id.indexOf(singular);
			if (idx >= 0) {
				return id.substring(0, idx) + id.substring(idx + singular.length() - 1);
			}
			idx = id.indexOf(plural);
			if (idx >= 0) {
				StringTokenizer st = new StringTokenizer(id.substring(idx + plural.length()), ".");
				if (st.countTokens() == 1) { // es la propia vista, no un miembro
					return id.substring(0, idx) + id.substring(idx + plural.length() - 1);
				}
				else { // it is a member
					String viewName = st.hasMoreTokens()?st.nextToken():"";
					int plus = 0;
					if (".tabs.".equals(plural)) {
						if (id.indexOf("properties") >= 0) plus="properties".length();
						if (id.indexOf("title") >= 0) plus= "title".length();					
					}				
					int c = idx + plural.length() + viewName.length() + plus;
					return id.substring(0, idx) + id.substring(idx + plural.length() + viewName.length() + plus);
				}
			}
			return null;
		}
		catch (Exception ex) {
			if (XavaPreferences.getInstance().isI18nWarnings()) {
				log.warn(XavaResources.getString("label_i18n_warning", id));
			}
			return null;
		}
	}	
	
	public static boolean exists(String id) {
		return exists(id, Locale.getDefault());
	}
	
	public static boolean existsExact(String id) throws XavaException { 
		return existsExact(id, Locale.getDefault());
	}
	
	public static boolean exists(String id, Locale locale) {
		if (id == null) return false;
		try {
			getResource(id, locale);
			return true;
		}
		catch (MissingResourceException ex) {
			int idx = id.indexOf(".");
			if (idx < 0) return false;
			return exists(id.substring(idx + 1));
		}
		catch (Exception ex) {
			log.warn(ex.getMessage(), ex);
			return false;
		}				
	}
	
	public static boolean existsExact(String id, Locale locale) throws XavaException {
		if (id == null) return false;
		try {
			getResource(id, locale);
			return true;
		}
		catch (MissingResourceException ex) {
			return false;
		}
	}
		
	private static String getResource(String id, Locale locale) throws MissingResourceException, XavaException {
		try { 
			return getExactResource(id, locale);
		}
		catch (MissingResourceException ex) {
			try {
				return getExactResource(Strings.firstUpper(id), locale);
			}
			catch (MissingResourceException ex2) {
				try {
					return getExactResource(Strings.firstLower(id), locale);
				}
				catch (MissingResourceException ex3) {
					try {
						return getExactResource(id.toUpperCase(), locale);
					}
					catch (MissingResourceException ex4) {
						return getExactResource(id.toLowerCase(), locale);
					}
				}
			}
		}
	}	
	
	private static String getExactResource(String id, Locale locale) throws MissingResourceException, XavaException {
		String name = "UNKNOW";
		try {
			Iterator it = MetaApplications.getApplicationsNames().iterator();
			while (it.hasNext()) {
				name = (String) it.next();
				try {
					ResourceBundle rb = ResourceBundle.getBundle(name + "-labels", locale);
					return rb.getString(id);
				}
				catch (MissingResourceException ex) {
				}						
				try {
					ResourceBundle rb = ResourceBundle.getBundle("Etiquetas" + name, locale);
					return rb.getString(id);
				}
				catch (MissingResourceException ex) {
				}			
			}		
			ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
			return rb.getString(id);
		}
		catch (Exception ex) {
			log.warn("Error translating " + id + ". We assume that the resource is missing", ex);
			throw new MissingResourceException("Cannot obtain resource, cause: " + ex.getLocalizedMessage(), name, id);
		}
	}
	
	public static String removeUnderlined(String label) {				
		int idx =  label.indexOf('_');
		if (idx < 0) return label;
		String ini = idx > 0?label.substring(0, idx - 1):"";
		String end = idx == label.length() - 1?"":label.substring(idx + 1);
		return ini + end;
	}
		
}
