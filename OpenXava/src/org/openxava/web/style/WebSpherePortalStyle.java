package org.openxava.web.style;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WebSpherePortalStyle extends Style {
	
	private static WebSpherePortalStyle instance = null;

	private static Log log = LogFactory.getLog(WebSpherePortalStyle.class);
	
	protected WebSpherePortalStyle() {		
	}
	
	public static Style getInstance() {
		if (instance == null) {
			instance = new WebSpherePortalStyle();
		}
		return instance;
	}
	
	public String getModuleSpacing() {
		return "cellpadding=0 cellspacing=0 border=0 width='100%'";
	}	
	
	public String getDetail() {
		return "wpsTable";
	}
		
	public String getList() { 
		return "wpsTable";
	}
	
	public String getListCellSpacing() {
		return "border=0 cellspacing=0 cellpadding=0";
	}
	
	public String getListHeader() {  
		return "wpsTableHead";
	}
	
	public String getListSubheader() {
		return "wpsTableHead";
	}
	
	public String getListPair() { 
		return "wpsTableNrmRow";
	}
	
	public String getListOdd() { 
		return "wpsTableNrmRow";
	}
	
	public String getListPairSelected() { 
		return "portlet-table-selected";
	}
	
	public String getListOddSelected() { 
		return "portlet-table-selected";
	}
				
	public String getListInfo() {	
		return "wpsTable";
	}
	
	public String getListInfoDetail() {
		return "";
	}
	
	public String getListTitle() {
		return "websphere-list-title"; 
	}	
	
	public String getListTitleWrapper() {
		return "wpsTable";
	}	
	
	public String getFrame() {
		return "";
	}
	
	public String getFrameTitle() {
		return "wpsPortletTitle";
	}
	

	public String getFrameTitleLabel() {
		return "websphere-frame-title-label";
	}
	
	public String getFrameContent() {
		return "wpsPortletBorder";
	}
	
	public String getFrameSpacing() {
		return "border=0 cellspacing=0 cellpadding=2";
	}
	
		
	public String getEditor() { 
		return "portlet-form-input-field";
	}
	
	public String getSmallLabel() {
		return "small-label";
	}
	
	public String getErrors() { 
		return "portlet-msg-error";
	}

	public String getMessages() { 
		return "portlet-msg-success"; 
	}
	
	public String getMessagesWrapper() { 
		return "wpsTable";
	}	
				
	public String getMode(boolean onBottom) {	
		return onBottom?"wpsPagingTableFooterMiddle":"wpsPagingTableHeaderMiddle";
	}
	
	public String getButtonBar() {
		return "";
	}
	
	public String getButtonBarSpacing() {
		return "border=0 cellspacing=0 cellpadding=0";
	}		
	
	public String getButtonBarStart(boolean onBottom) {
		return onBottom?"wpsPagingTableFooterStart":"wpsPagingTableHeaderStart";
	}
	
	public String getButtonBarMiddle(boolean onBottom) {
		return onBottom?"wpsPagingTableFooterMiddle":"wpsPagingTableHeaderMiddle";
	}	
	
	public String getButtonBarEnd(boolean onBottom) {
		return onBottom?"wpsPagingTableFooterEnd":"wpsPagingTableHeaderEnd";
	}
	
	
	public String getAscendingImage() {
		return "ascending-white.gif";
	}
	
	public String getDescendingImage() {
		return "descending-white.gif";
	}
	
	public String getSection() {
		return "wpsPageBar";
	}
	
	public String getSectionActive() {
		return "";
	}	
	
	public String getSectionLink() {
		return "wpsUnSelectedPageLink";
	}
	
	public String getSectionBarStartDecoration() {
		return "<td class='wpsPageBar3dShadow'><img width='10' height='16' border='0' src='/wps/images/dot.gif' alt=''></td>";
	}
	
	
	public String getActiveSectionTabStartDecoration() {
		return "<td class='wpsSelectedPage' style='vertical-align: middle; text-align: center;' nowrap='true'>";
	}
	
	public String getActiveSectionTabEndDecoration() {
		return "</td>";		
	}
	
	public String getSectionTabStartDecoration() {
		return "<td class='wpsUnSelectedPage' style='vertical-align: middle; text-align: center;' nowrap='true'>";
	}
	
	public String getSectionTabEndDecoration() {
		return "</td>";		
	}		
		
	public String getCollectionListActions() {
		return "wpsTableNrmRow";
	}
	
	public String getRestoreImage() {
		return "/wps/themes/html/title_alt_restore.gif";
	}
		
	public String getMaximizeImage() {
		return "/wps/themes/html/title_alt_maximize.gif";
	}
	
	public String getRemoveImage() {
		return "/wps/images/icons/Delete.gif";
	}
	
	public String getActionsInFrame() {
		return "wpsPortletTitleIconBackground";
	}
	
	public boolean isAlignHeaderAsData() {
		return true;
	}
	
	public String getBottomButtonsStyle() {
		return "style='padding-top: 4px'";
	}

}
