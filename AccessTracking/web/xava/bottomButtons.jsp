<%@ include file="imports.jsp"%>

<%@ page import="org.openxava.controller.meta.MetaAction" %>

<jsp:useBean id="context" class="org.openxava.controller.ModuleContext" scope="session"/>

<%
org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
%>

<button name="xava.DEFAULT_ACTION" 
	onclick="openxava.executeAction('', false, '<%=manager.getDefaultActionQualifiedName()%>')"
	style="padding: 0; border: none; background-color:transparent; size: 0"></button>

<%
java.util.Iterator it = manager.getMetaActions().iterator();
while (it.hasNext()) {
	MetaAction action = (MetaAction) it.next();
	if (action.isHidden()) continue;
	if (!action.hasImage()) { 
	%>
	<xava:button action="<%=action.getQualifiedName()%>"/>
	<%
	}
}
%>
