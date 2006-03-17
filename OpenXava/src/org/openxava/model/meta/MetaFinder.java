package org.openxava.model.meta;

import java.io.*;
import java.util.*;

import org.openxava.util.*;

/**
 * @author Javier Paniza
 */
public class MetaFinder implements Serializable {
	
	private static Map argumentsJBoss11ToEJBQL;
	private static Map argumentsToHQL;
	private static Map tokensToChangeDollarsAndNL;
	 	
	private String name;
	private String arguments;	
	private boolean collection;
	private String condition;
	private String order;
	private MetaModel metaModel;
	
	public String getArguments() {
		arguments = Strings.change(arguments, "String", "java.lang.String");
		arguments = Strings.change(arguments, "java.lang.java.lang.String", "java.lang.String");
		return arguments;
	}
	
	public Collection getMetaPropertiesArguments() throws XavaException {
		StringTokenizer st = new StringTokenizer(getArguments(), ",");
		Collection result = new ArrayList();
		while (st.hasMoreTokens()) {
			String argument = st.nextToken();
			StringTokenizer argumentSt = new StringTokenizer(argument);
			String type = argumentSt.nextToken().trim();
			String name = argumentSt.nextToken().trim();			
			MetaProperty p = new MetaProperty();
			p.setName(name);
			p.setTypeName(type);
			result.add(p);			
		}
		return result;
	}

	public boolean isCollection() {
		return collection;
	}

	public String getCondition() {
		return condition;
	}

	public String getName() {
		return name;
	}

	public void setArguments(String arguments) {
		this.arguments = arguments;
	}

	public void setCollection(boolean collection) {
		this.collection = collection;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSQLCondition() throws XavaException {		
		if (Is.emptyString(this.condition)) return "1=1";
		return getMetaModel().getMapping().changePropertiesByColumns(this.condition);
	}
	
	public String getEJBQLCondition() throws XavaException {
		StringBuffer sb = new StringBuffer("SELECT OBJECT(o) FROM ");
		sb.append(getMetaModel().getName());
		sb.append(" o");
		if (!Is.emptyString(this.condition)) {
			sb.append(" WHERE ");			
			String attributesCondition = getMetaModel().getMapping().changePropertiesByCMPAttributes(this.condition);			 
			sb.append(Strings.change(attributesCondition, getArgumentsJBoss11ToEJBQL()));
		}
		if (!Is.emptyString(this.order)) {			
			sb.append(" ORDER BY ");
			sb.append(getMetaModel().getMapping().changePropertiesByCMPAttributes(this.order));
		}
		return sb.toString();
	}
	
	public String getHQLCondition() throws XavaException {		
		return getHQLCondition(true);
	}
	
	private String getHQLCondition(boolean order) throws XavaException {		
		StringBuffer sb = new StringBuffer("from ");
		sb.append(getMetaModel().getName());
		sb.append(" as o");
		if (!Is.emptyString(this.condition)) {			
			sb.append(" where ");			
			String condition = Strings.change(getCondition(), getArgumentsToHQL());			
			sb.append(Strings.change(condition, getTokensToChangeDollarsAndNL()));
		}
		if (order && !Is.emptyString(this.order)) { 		
			sb.append(" order by ");
			sb.append(Strings.change(this.order, getTokensToChangeDollarsAndNL()));
		}
		return sb.toString();
	}
	
	
	public String getHQLCountSentence() throws XavaException {
		StringBuffer sb = new StringBuffer("select count(*) ");
		sb.append(getHQLCondition(false));
		return sb.toString();
	}
	
	
	public MetaModel getMetaModel() {
		return metaModel;
	}

	public void setMetaModel(MetaModel metaModel) {
		this.metaModel = metaModel;
	}

	public String getOrder() {
		return order;
	}
	
	public String getSQLOrder() throws XavaException {
		if (Is.emptyString(this.order)) return "";
		return getMetaModel().getMapping().changePropertiesByColumns(this.order);
	}

	public void setOrder(String order) {
		this.order = order;
	}
	
	private static Map getArgumentsJBoss11ToEJBQL() {
		if (argumentsJBoss11ToEJBQL == null) {
			argumentsJBoss11ToEJBQL = new HashMap();
			for (int i=0; i<30; i++) {
				argumentsJBoss11ToEJBQL.put("{" + i+ "}", "?" + (i+1));
			}			
		}
		return argumentsJBoss11ToEJBQL;
	}
	
	private static Map getArgumentsToHQL() {
		if (argumentsToHQL == null) {
			argumentsToHQL = new HashMap();
			for (int i=0; i<30; i++) {
				argumentsToHQL.put("{" + i+ "}", ":arg" + i);
			}			
		}
		return argumentsToHQL;
	}
	
	static Map getTokensToChangeDollarsAndNL() {
		if (tokensToChangeDollarsAndNL == null) {
			tokensToChangeDollarsAndNL = new HashMap();
			tokensToChangeDollarsAndNL.put("${", "o.");
			tokensToChangeDollarsAndNL.put("}", "");
			tokensToChangeDollarsAndNL.put("\n", "");			
		}
		return tokensToChangeDollarsAndNL;
	}
	
	
}
