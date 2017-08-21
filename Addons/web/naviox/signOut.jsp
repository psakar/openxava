<%@page import="org.openxava.controller.ModuleManager"%>
<%@page import="com.openxava.naviox.model.Configuration"%>
<%@page import="com.openxava.naviox.util.NaviOXPreferences"%>

<%
StringBuilder base = new StringBuilder("..");
if (!"".equals(request.getParameter("organization"))
		&&
	(!NaviOXPreferences.getInstance().isShowOrganizationOnSignIn()
		||
	 Configuration.getInstance().isSharedUsersBetweenOrganizations())) 
{
	base.append("/o/").append(request.getParameter("organization"));				
}
session.invalidate();
%>

<script type="text/javascript">
window.location="<%=String.format("%s/m/SignIn", base)%>";
</script>
