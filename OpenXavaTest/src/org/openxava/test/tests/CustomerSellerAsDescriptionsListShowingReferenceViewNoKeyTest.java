package org.openxava.test.tests;

import org.openxava.tests.*;
import com.gargoylesoftware.htmlunit.html.*;

/**
 * @author Javier Paniza
 */

public class CustomerSellerAsDescriptionsListShowingReferenceViewNoKeyTest extends ModuleTestBase {
	
	public CustomerSellerAsDescriptionsListShowingReferenceViewNoKeyTest(String testName) {
		super(testName, "CustomerSellerAsDescriptionsListShowingReferenceViewNoKey");				
	}
	
	public void testDescriptionsListWithShowReferenceViewNoKey() throws Exception { 
		execute("Mode.detailAndFirst");
		assertValue("name", "Javi");
		assertValue("seller.name", "MANUEL CHAVARRI");
		assertNoEditable("seller.name");
		assertNoEditable("seller.level");
		HtmlSelect combo = (HtmlSelect) getHtmlPage().getElementById("ox_OpenXavaTest_CustomerSellerAsDescriptionsListShowingReferenceViewNoKey__seller___number");  
		combo.setSelectedAttribute("2", true);
		combo.blur();
		getWebClient().waitForBackgroundJavaScriptStartingBefore(10000);
		assertValue("seller.name", "JUANVI LLAVADOR");
		assertValue("seller.level.id", "A");
		assertDescriptionValue("seller.level.id", "MANAGER");
		assertNoEditable("seller.name");
		assertNoEditable("seller.level");
	}
		
}
