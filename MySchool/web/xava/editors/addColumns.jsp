<%@ include file="../imports.jsp"%>

<jsp:useBean id="context" class="org.openxava.controller.ModuleContext" scope="session"/>

<%
String tabObject = request.getParameter("tabObject");
tabObject = (tabObject == null || tabObject.equals(""))?"xava_tab":tabObject;
org.openxava.tab.Tab tab = (org.openxava.tab.Tab) context.get(request, "xava_customizingTab");
// tmp ini
String applicationName = request.getParameter("application");
String module = request.getParameter("module");
// tmp fin
%>
<%-- tmp ini --%>
<input type="hidden" id="xava_application" value="<%=applicationName%>" /> 
<input type="hidden" id="xava_module" value="<%=module%>" /> 
<%-- tmp ¿id y clases con prefijos? Puede que sí, porque esto puede ir dentro de un portlet --%>
<div id="xava_search_columns">
<input id="xava_search_columns_text" type="text" size="38" placeholder='<xava:message key="search_columns"/>'/>
</div>
<%-- tmp fin --%>
<div id="xava_add_columns">
<%-- tmp ini --%>
<%-- tmp Hemos borrado el <table/> original, todavía está en OpenXava/web --%>
<jsp:include page="selectColumns.jsp"/>
<%-- tmp fin --%>
</div>