<%@ page import="java.util.Iterator" %>
<%@ page import="org.xavax.component.XavaxComponent" %>
<%@ page import="org.xavax.view.View" %>
<%@ page import="org.xavax.view.meta.MetaGroup" %>
<%@ page import="org.xavax.view.meta.MetaView" %>
<%@ page import="org.xavax.view.meta.PropertiesSeparator" %>
<%@ page import="org.xavax.model.meta.MetaProperty" %>
<%@ page import="org.xavax.model.meta.MetaReference" %>
<%@ page import="org.xavax.model.meta.MetaCollection" %>
<%@ page import="org.xavax.web.WebEditors" %>

<jsp:useBean id="context" class="org.xavax.controller.ModuleContext" scope="session"/>
<%
String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xavax_view":viewObject;
org.xavax.view.View view = (org.xavax.view.View) context.get(request, viewObject);
String propertyPrefix = request.getParameter("propertyPrefix");
propertyPrefix = (propertyPrefix == null || propertyPrefix.equals(""))?"xavax." + view.getModelName() + ".":propertyPrefix;
%>

<% if (view.isFrame()) { %>
<table>
<tr>
<% } %>


<%
Iterator it = view.getMetaMembers().iterator();
boolean first = true;
boolean lastWasEditor = false;
while (it.hasNext()) {
	Object m = it.next();
	if (m instanceof MetaProperty) {		
		MetaProperty p = (MetaProperty) m;		
		if (!PropertiesSeparator.INSTANCE.equals(m)) {	
			boolean hasFrame = WebEditors.hasFrame(p);		
			lastWasEditor = !hasFrame;
			String propertyKey= propertyPrefix + p.getName();
			String valueKey = propertyKey + ".value";
			request.setAttribute(propertyKey, p);
			request.setAttribute(valueKey, view.getValue(p.getName()));
%>
	<jsp:include page="editor.jsp">
		<jsp:param name="propertyKey" value="<%=propertyKey%>"/>
		<jsp:param name="first" value="<%=first%>"/>
		<jsp:param name="hasFrame" value="<%=hasFrame%>"/>
	</jsp:include>
<%
			first = false;
		}
		else { 
			first = true;						
			if (lastWasEditor) { 
			%>
			</tr></table>			
			<% 
			} 
			lastWasEditor = false;
			%>
			</td></tr>
			<tr>
	<%	}
	}
	else {
		lastWasEditor = false;
	  	if (m instanceof MetaReference) {
			MetaReference ref = (MetaReference) m;
			if (view.displayAsDescriptionsList(ref)) {
				lastWasEditor = true;
				String referenceKey = propertyPrefix +  ref.getName();
				request.setAttribute(referenceKey, ref);			
	%>
		<jsp:include page="descriptionsList.jsp">
			<jsp:param name="referenceKey" value="<%=referenceKey%>"/>
			<jsp:param name="first" value="<%=first%>"/>
		</jsp:include>
	<%
				first = false;		
			}
			else {
				String viewName = viewObject + "_" + ref.getName();
				View subview = view.getSubview(ref.getName());
				context.put(request, viewName, subview);
				String propertyInReferencePrefix = propertyPrefix + ref.getName() + ".";
				boolean withFrame = subview.isFrame() && 
					(!view.isSection() || view.getMetaMembers().size() > 1);
				if (withFrame || (view.isSection() && view.getMembersNames().size() ==1)) {
	%>		
		<tr><td colspan="4">
	<%	
				}
				if (withFrame) { 
	%>				
		<table class=frame width='100%'>
		<tr class=frame><th align='left'><%=ref.getLabel(request)%></th></tr>
		<tr><td class=frame>
	<%
				} // withFrame
	%>	
		<jsp:include page="detail.jsp"> 
			<jsp:param name="viewObject" value="<%=viewName%>" />
			<jsp:param name="propertyPrefix" value="<%=propertyInReferencePrefix%>" />
		</jsp:include>	
	<%
				if (withFrame) {
	%>				
		</td></tr>
		</table>		
	<%	
				} // withFrame
			}
		} else if (m instanceof MetaCollection) {
			MetaCollection collection = (MetaCollection) m;
			String urlCollection = "collection.jsp";
			boolean withFrame = !view.isSection() || view.getMetaMembers().size() > 1;
	%>
		<tr><td colspan="4">		
	<%
			if (withFrame) {
	%>	
		<table class=frame width='100%'>
		<tr class=frame><th align='left'><%=collection.getLabel(request)%></th></tr>
		<tr><td class=frame>		
	<%
			} // conFrame
	%>	
		<jsp:include page="<%=urlCollection%>"> 
			<jsp:param name="collectionName" value="<%=collection.getName()%>"/>
			<jsp:param name="viewObject" value="<%=viewObject%>"/>			
		</jsp:include>
	<%
			if (withFrame) {
	%>			
		</td></tr>
		</table>		
	<%
			} // withFrame
		} else if (m instanceof MetaGroup) {
			MetaGroup grup = (MetaGroup) m;
			String viewName = viewObject + "_" + grup.getName();
			View subview = view.getGroupView(grup.getName());
			context.put(request, viewName, subview);
	%>
		<tr><td colspan="4">
		<table class=frame width='100%'>
		<tr class=frame><th align='left'><%=grup.getLabel(request)%></th></tr>
		<tr><td class=frame>
		<jsp:include page="detail.jsp">
			<jsp:param name="viewObject" value="<%=viewName%>" />
		</jsp:include>
		</td></tr>
		</table>		
	<%
		}
	} // if not is MetaProperty
}
%>
<% if (lastWasEditor) { %>
			</tr></table>
			</td>
<% } %>

<% if (view.isFrame()) { %>
</tr>
</table>
<% } %>

<%
if (view.hasSections()) { 
%>
	<jsp:include page="sections.jsp"/>	
<%
}
%>
