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
	preLabel="<tr><td colspan=4>" + style.getFrameHeaderStartDecoration() + style.getFrameTitleStartDecoration();
	postLabel="";
	preIcons="";
	postIcons="&nbsp;" + style.getFrameTitleEndDecoration() + style.getFrameHeaderEndDecoration(); 
	preEditor=style.getFrameContentStartDecoration();
	postEditor=style.getFrameContentEndDecoration() + "</td>";	
}
else if (first && !view.isAlignedByColumns()) { 
	preLabel="<td style='vertical-align: middle;text-align: left' class='" + style.getLabel() + "' id=" + labelKey + " >";
	postLabel="</td>";
	preIcons="<td style='vertical-align: middle'>";
	postIcons="</td>";	
	boolean firefox = request.getHeader("user-agent").indexOf("Firefox") >= 0;
	// width: 99%  is for label and data not very separated when only one row, 
	//				but it produces no good layout of frames in Firefox.
	String width = firefox?"":"width: 99%";
	preEditor="<td style='vertical-align: middle; "  + width + "'><table border='0' cellpadding='" + org.openxava.util.XavaPreferences.getInstance().getFormLineSpacing() + "' cellspacing='0'><tr><td style='vertical-align: middle'>";
	postEditor="</td>";
} 
else {
	preLabel="<td style='vertical-align: middle;text-align: left' class='" + style.getLabel() + "' id=" + labelKey + " >&nbsp;&nbsp;";
	postLabel="</td>";
	preIcons="<td style='vertical-align: middle'>";
	postIcons="</td>";
	preEditor="<td style='vertical-align: middle'>";
	postEditor="</td>";
}
%>