<%@page import="org.openxava.util.XavaPreferences"%>

<%if (view.isEditable() || 
		!(!view.isEditable() && !XavaPreferences.getInstance().isShowIconForViewReadOnly())
	) { %>
	<i class='<%=style.getRequiredIcon()%> <%=p.isRequired()?"mdi mdi-marker-check":""%>'></i> 
<%} %>

<span id="<xava:id name='<%="error_image_" + p.getQualifiedName()%>'/>"> 
<% if (errors.memberHas(p)) { %>
<i class='<%=style.getErrorIcon()%> mdi mdi-alert-circle'></i> <%-- If modify this we have to change dwr.Module too --%>
<% } %>
</span>

