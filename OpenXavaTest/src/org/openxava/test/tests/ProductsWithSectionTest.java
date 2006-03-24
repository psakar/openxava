package org.openxava.test.tests;

import org.openxava.test.model.*;


/**
 * @author Javier Paniza
 */

public class ProductsWithSectionTest extends ProductsTest {
		
	public ProductsWithSectionTest(String testName) {
		super(testName, "ProductsWithSection");		
	}
	
	public void testEmptyCombosUsingComposeKeys() throws Exception {
		execute("CRUD.new");
		execute("Products.setLimitZoneTo1"); 
		
		Warehouse key1 = new Warehouse();
		key1.setZoneNumber(1);
		key1.setNumber(1);
		Warehouse key2 = new Warehouse();
		key2.setZoneNumber(1);
		key2.setNumber(2);
		Warehouse key3 = new Warehouse();
		key3.setZoneNumber(1);
		key3.setNumber(3);		
		
		String [][] zone1WarehouseValues = new String [][] {
			{ "", "" },
			{ key1.toString(), "CENTRAL VALENCIA" },
			{ key3.toString(), "VALENCIA NORTE" },
			{ key2.toString(), "VALENCIA SURETE" }
		};
			
		assertValidValues("warehouseKey", zone1WarehouseValues);
		
		execute("Products.setLimitZoneTo0");		
		String [][] zoneEmptyWarehouseValues = new String [][] { 
			{ "", "" },		
		};		
		assertValidValues("warehouseKey", zoneEmptyWarehouseValues);
		
	}
	
}
