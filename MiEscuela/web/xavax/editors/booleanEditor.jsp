<%@ page import="org.xavax.model.meta.MetaProperty" %>

<%
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
Object value = (Boolean) request.getAttribute(propertyKey + ".value");
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
String checked=Boolean.TRUE.equals(value)?"checked='true'":"";
boolean editable="true".equals(request.getParameter("editable"));
String disabled=editable?"":"disabled";
String script = request.getParameter("script");
%>

<INPUT type="CHECKBOX" name="<%=propertyKey%>" class=editor
	value="true" 
	title="<%=p.getDescription(request)%>"	
	<%=checked%>
	<%=disabled%>
	<%=script%>
/>

<% if (!editable) { %>
	<input type="hidden" name="<%=propertyKey%>" value="<%=fvalue%>">
<% } %>			
