package org.openxava.web.style;

/**
 * For Liferay 4.1 and 4.2. <p>
 * 
 * 
 * @author Jos� Luis Santiago
 */ 

public class Liferay41Style extends Style {
	
	private static Liferay41Style instance = null;

	
	
	protected Liferay41Style() {
	}
	
	public static Style getInstance() {
		if (instance == null) {
			instance = new Liferay41Style();
		}
		return instance;
	}
		
	public String getModule() {
		//return "portlet-font"; No, because usually link style is ugly, and not coherent with the portal
		return ""; // The portal default style is used
	}
	
	public String getModuleSpacing() {
		return "style='padding: 2px;'";
	}
		
	public String getButtonBar() {
		return "liferay-xava-frame-header"; 
	}
	
	public String getButtonBar2() {
		return "portlet-header-bar";
	}
	
	public String getButtonBarSpacing() {
		return "cellpadding=0 cellspacing=0";
	}	
	
	public String getButtonBarStart(boolean onBottom) {
		return "portlet-header-left";
	}
	
	public String getButtonBarMiddle(boolean onBottom) {
		return ""; 
	}
		
	public String getButtonBarEnd(boolean onBottom) {
		return "portlet-header-right";
	}
	
	public String getButtonBarStyle() {
		return "style='position: static'";
	}
	
	public String getButtonBarStartStyle() {
		return "style='position: static'";
	}
	
	public String getButtonBarMiddleStyle() {
		return "style='position: static'";
	}
	
	public String getButtonBarEndStyle() {
		return "style='position: static'";
	}

		
	public String getMode(boolean onButton) { 
		return "list-info";
	}
	
	public String getDetail() {
		return "";
	}
			
	public String getList() { 
		return "";
	}
	
	public String getListCellSpacing() {
		return "border=0 cellspacing=0 cellpadding=0";
	}
	
	public String getListStyle() { 
		return "style='border-collapse: collapse'"; 
	}	

	
	
	public String getListHeader() { 
		return "portlet-section-header";		
	}
	
	
	
	public String getListHeaderCell() { 		
		return getListCell();
	}
	
	
	public String getListSubheader() {
		return "portlet-section-subheader";		
	}
	
	
	public String getListSubheaderCell() { 
		return getListCell();		
	}
	
	
	public String getListPair() { 
		return "portlet-section-body";		
	}
	
	public String getListPairCell() {
		return getListCell();
	}
	
	public String getListOdd() { 
		return "portlet-section-alternate";		
	}
	
	public String getListOddCell() { 
		return getListCell();		
	}
	
	public String getListPairSelected() { 
		return "portlet-section-selected";
	}
	
	public String getListOddSelected() { 
		return "portlet-section-selected";
	}
	
		
	public String getListInfo() {
		return "list-info";
	}
	
		
	public String getListTitle() {
		return "list-title";
	}
	
	private String getListCell() { 
		return "liferay-xava-cell-wrapper";		
	}
	
		
	protected String getFrame() { 
		return ""; 
	}
	
	protected String getFrameTitle() { 
		return "";
	}
	
	protected String getFrameTitleLabel() { 
		return "liferay-xava-frame-header";
	}
	
	public String getFrameHeaderStartDecoration() {		
		return super.getFrameHeaderStartDecoration() + 
			"<table class='portlet-header-bar' style='position: static' cellpadding=0 cellspacing=0 width=100%><tr><td class='portlet-header-left' style='position: static' width=1>&nbsp;</td><td align='left'>";
	}
	
	public String getFrameHeaderEndDecoration() { 
		return 	"</td><td class='portlet-header-right' style='position: static' width=1>&nbsp;</td></tr></table>"
			+ super.getFrameHeaderEndDecoration();
	}
		
	protected String getFrameContent() { 
		return "liferay-xava-frame-core"; 
	}
	
	protected String getFrameSpacing() { 
		return "cellpadding='0' cellspacing='0'";
	}
		
	public String getEditor() { 
		return "form-text";
	}
	
	public String getSmallLabel() {
		return "''";
	}
	
	public String getErrors() { 
		return "portlet-msg-error";
	}
		

	public String getMessages() { 
		return "portlet-msg-success";
	}

	/**
	 * For messages and errors
	 */
	public String getMessagesWrapper() { 
		return "";
	}
	
	
	public String getProcessing() { 
		return "processing";
	}
			
	public String getButton() {
		return "portlet-form-button";
	}
	
	public String getAscendingImage() {
		return "ascending.gif";
	}
	
	public String getDescendingImage() {
		return "descending.gif";
	}
	
	public String getSection() {
		return "";
	}
	
	public String getSectionTableAttributes() {		
		return "border='0' cellpadding='0' cellspacing='0' width='100%'";
	}
	
	public String getSectionActive() {
		return "";
	}	
	
	public String getSectionLink() {
		return "";
	}
	
	public String getSectionBarStartDecoration() {
		return "<td><ul class='gamma-tab'>";
	}
	public String getSectionBarEndDecoration() {	
		return "</ul></td>";
	}
		
	public String getActiveSectionTabStartDecoration() {
		return "<li class='current'>";
	}
	
	public String getActiveSectionTabEndDecoration() {
		return "</li>";		
	}
	
	public String getSectionTabStartDecoration() {
		return "<li>";
	}
	
	public String getSectionTabEndDecoration() {
		return "</li>";		
	}	
		
	public String getCollectionListActions() {
		return "";
	}
	
	public String getRestoreImage() {
		return "/html/themes/brochure/images/portlet/minimize.gif";
	}
	
	public String getMaximizeImage() {
		return "/html/themes/brochure/images/portlet/maximize.gif";
	}
	
	public String getRemoveImage() {
		return "/html/themes/brochure/images/portlet/close.gif";
	}
	
	public boolean isApplySelectedStyleToCellInList() {
		return false;
	}
	
	public boolean isNeededToIncludeCalendar() {
		return false;
	}
		
	public String getLoadingModuleImage() { // tmp 
		return "/html/themes/classic/images/progress_bar/loading_animation.gif";
	}
	
}
