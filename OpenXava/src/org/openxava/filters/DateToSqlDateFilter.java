package org.openxava.filters;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Convert all <code>java.util.Date</code> arguments in <code>java.sql.Date</code>. <p> 
 * 
 * @author Javier Paniza
 */
public class DateToSqlDateFilter implements IFilter {

	private static Log log = LogFactory.getLog(DateToSqlDateFilter.class);

	/**
	 * @see org.openxava.filters.IFilter#filter(Object)
	 */
	public Object filter(Object o) throws FilterException {
		if (o == null) return null;
		if (!(o instanceof java.util.Date)) {
			throw new FilterException("filter_invalid_argument_type", getClass().getName(), "java.util.Date");
		}
		java.util.Date d = (java.util.Date) o;
		return new java.sql.Date(d.getTime());
	}

}
