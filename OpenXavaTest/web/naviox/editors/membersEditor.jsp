<%@ include file="../../xava/imports.jsp"%>

<%@ page import="org.openxava.model.meta.MetaProperty" %>
<%@ page import="org.openxava.model.meta.MetaModel" %>
<%@ page import="org.openxava.model.meta.MetaMember" %>
<%@ page import="org.openxava.view.View" %>
<%@ page import="org.openxava.application.meta.MetaApplications" %>

<%@ page import="org.openxava.controller.meta.MetaControllers" %>

<%@page import="org.openxava.application.meta.MetaModule"%><%@ page import="org.openxava.controller.meta.MetaAction" %>

<jsp:useBean id="style" class="org.openxava.web.style.Style" scope="request"/>
<jsp:useBean id="context" class="org.openxava.controller.ModuleContext" scope="session"><%@page import="org.openxava.controller.meta.MetaController"%></jsp:useBean>

<%
String propertyKey = request.getParameter("propertyKey");
String [] fvalues = (String []) request.getAttribute(propertyKey + ".fvalue");
java.util.Collection members = java.util.Arrays.asList(fvalues);
boolean editable="true".equals(request.getParameter("editable"));
String disabled=editable?"":"disabled";
String script = request.getParameter("script");
String agent = (String) request.getAttribute("xava.portlet.user-agent");
if (null != agent && agent.indexOf("MSIE")>=0) {
    script = org.openxava.util.Strings.change(script, "onchange", "onclick");
}
String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
View view = (View) context.get(request, viewObject);
String moduleName = view.getValueString("module.name");
String applicationName = request.getParameter("application"); 
MetaModule module = MetaApplications.getMetaApplication(applicationName).getMetaModule(moduleName);
int i=0;
%>
<input type="hidden" name="<%=propertyKey%>" value="<%=module.getModelName()%>">
<table width="100%"><tr>
<%
MetaModel model = MetaModel.get(module.getModelName());
for (String memberName: model.getMembersNames()) {
	MetaMember member = model.getMetaMember(memberName);
	if (member.isHidden()) continue;
	String checked = members.contains(memberName)?"checked='true'":"";		
%>
	<td>
	<INPUT name="<%=propertyKey%>" type="checkbox" class="<%=style.getEditor()%>" 
		tabindex="1" 
		value="<%=memberName%>" 
		<%=checked%>
		<%=disabled%>
		<%=script%>
	/>		
	<%=member.getLabel()%> 
	<% if (++i % 4 == 0) { %></tr><tr><% } %>
	</td>
<%		
}
%>
</tr></table>
<% 
if (!editable) { 
	for (i=1; i<fvalues.length; i++) {
%>
		<input type="hidden" name="<%=propertyKey%>" value="<%=fvalues[i]%>">		
<%
	}
} 
%>	
