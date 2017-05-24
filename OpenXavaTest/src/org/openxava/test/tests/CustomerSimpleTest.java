package org.openxava.test.tests;

import org.openxava.tests.*;

import com.gargoylesoftware.htmlunit.html.*;

/**
 * @author Javier Paniza
 */

public class CustomerSimpleTest extends ModuleTestBase {
	
	
	public CustomerSimpleTest(String testName) {
		super(testName, "CustomerSimple");		
	}
	
	public void testSearchReferenceInsideAggregate() throws Exception {
		execute("CRUD.new");
		execute("Reference.search", "keyProperty=xava.Customer.address.state.id");
		assertNoErrors();
	}
	
	public void testFormatterUsedWhenEditorOnProperty() throws Exception {
		assertValueInList(0, 0, "Xavi");
		execute("Mode.detailAndFirst");
		assertValue("name", "Xavi"); 
	}
			
}
