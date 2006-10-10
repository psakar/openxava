package org.openxava.test.tests;

import javax.ejb.*;

import org.openxava.hibernate.*;
import org.openxava.test.model.*;
import org.openxava.tests.*;

/**
 * @author Javier Paniza
 */

public class Products2WithFormulaTest extends ModuleTestBase {
	
	public Products2WithFormulaTest(String testName) {
		super(testName, "Products2WithFormula");				
	}
	

	public void testReferenceToEntityAutoOid() throws Exception {
		// Creating product and its formula at once
		execute("CRUD.new");
		setValue("number", "66");
		setValue("description", "JUNIT PRODUCT 66");
		setValue("subfamily.number", "11");
		setValue("unitPrice", "66");
		execute("Reference.createNew", "model=Formula,keyProperty=xava.Product2.formula.name");
		setValue("Formula", "name", "JUNIT FORMULA FROM PRODUCT");
		execute("NewCreation.saveNew");
		assertNoErrors();
		assertValue("formula.name", "JUNIT FORMULA FROM PRODUCT");
		
		execute("CRUD.save");
		assertNoErrors();
		
		// Searching to verify
		assertValue("description", "");
		setValue("number", "66");
		execute("CRUD.search");
		
		assertValue("description", "JUNIT PRODUCT 66");		
		assertValue("formula.name", "JUNIT FORMULA FROM PRODUCT");
				
		// Removing
		execute("CRUD.delete");
		assertNoErrors();
		assertMessage("Product deleted successfully"); 
		
		// Asserting that formula is not removed
		assertProductNotExist(66);
		assertFormulaExist("JUNIT FORMULA FROM PRODUCT");
		deleteFormula("JUNIT FORMULA FROM PRODUCT");
	}


	private void deleteFormula(String name) throws Exception {
		XHibernate.getSession().delete(Formula.findByName(name));		
	}

	private void assertFormulaExist(String name) {
		try {
			Formula.findByName(name);
		}
		catch (ObjectNotFoundException ex) {
			fail("Formula '" + name + "' does not exist, and it should");
		}
	}

	private void assertProductNotExist(int number) {
		try {
			Product2.findByNumber(number);
			fail("Product " + number + " exists, and it shouldn't");
		}
		catch (ObjectNotFoundException ex) {			
		}		
	}
		
}
