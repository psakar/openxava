<%
String shasFrame = request.getParameter("hasFrame"); 
boolean hasFrame="true".equals(shasFrame)?true:false;
String sfirst = request.getParameter("first"); 
boolean first="true".equals(sfirst)?true:false;

String preLabel=null;
String postLabel=null;
String preIcons=null;
String postIcons=null;
String preEditor=null;
String postEditor=null;


if (hasFrame) {
	preLabel="<tr><td colspan=4><table class=" + style.getFrame() + " width='100%'><tr class=" + style.getFrame() + "><th align='left' id=" + labelKey + " >";
	postLabel="&nbsp;";
	preIcons="";
	postIcons="";
	preEditor="</th></tr><tr><td class=" + style.getFrame() + ">";
	postEditor="</td></tr></table>";
}
else if (first) {
	preLabel="<th align='left' class=" + style.getLabel() + " id=" + labelKey + " >";
	postLabel="</th>";
	preIcons="<td>";
	postIcons="</td>";
	preEditor="<td><table border='0' cellpadding='" + org.openxava.util.XavaPreferences.getInstance().getFormLineSpacing() + "' cellspacing='0'><tr><td valign='middle'>";
	postEditor="</td>";
}
else {
	preLabel="<th align='left' class=" + style.getLabel() + " id=" + labelKey + " >&nbsp;&nbsp;";
	postLabel="</th>";
	preIcons="<td>";
	postIcons="</td>";
	preEditor="<td valign='middle'>";
	postEditor="</td>";
}
%>