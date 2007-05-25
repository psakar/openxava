package org.openxava.test.tests;

import java.rmi.*;

import org.openxava.hibernate.*;
import org.openxava.test.model.*;
import org.openxava.tests.*;


/**
 * @author Javier Paniza
 */

public class SellersTest extends ModuleTestBase {
	
	private Customer customer2;
	private Customer customer1;

	public SellersTest(String testName) {
		super(testName, "Sellers");		
	}
	
	public void testListFeaturesInCollection() throws Exception {
		// The correct elements
		execute("List.viewDetail", "row=1");
		assertValue("number", "2");
		assertValue("name", "JUANVI LLAVADOR");
		assertCollectionRowCount("customers", 0);		
		execute("Navigation.previous");
		assertValue("number", "1");
		assertValue("name", "MANUEL CHAVARRI");
		assertCollectionRowCount("customers", 2);
		
		// The properties in list
		assertLabelInCollection("customers", 0, "Number");
		assertLabelInCollection("customers", 1, "Name");
		assertLabelInCollection("customers", 2, "Remarks");
		assertLabelInCollection("customers", 3, "Relation with seller");
		assertLabelInCollection("customers", 4, "Seller level");
		
		// The values in collection
		assertValueInCollection("customers", 0, "number", "1");
		assertValueInCollection("customers", 0, "name", "Javi");
		assertValueInCollection("customers", 0, "remarks", "");
		assertValueInCollection("customers", 0, "relationWithSeller", "BUENA");
		assertValueInCollection("customers", 0, "seller.level.description", "MANAGER");
		
		assertValueInCollection("customers", 1, "number", "2");
		assertValueInCollection("customers", 1, "name", "Juanillo");
		assertValueInCollection("customers", 1, "remarks", "");
		assertValueInCollection("customers", 1, "relationWithSeller", "");
		assertValueInCollection("customers", 1, "seller.level.description", "MANAGER");
		
		// Order by column, tmp en news-for-programmers
		execute("List.orderBy", "property=number,collection=customers");
		assertValueInCollection("customers", 0, "number", "1");
		assertValueInCollection("customers", 1, "number", "2");
		execute("List.orderBy", "property=number,collection=customers");
		assertValueInCollection("customers", 0, "number", "2");
		assertValueInCollection("customers", 1, "number", "1");
		
		// Hide rows
		assertCollectionRowCount("customers", 2);
		execute("List.hideRows", "collection=customers");
		assertCollectionRowCount("customers", 0);
		
		// Filter tmp en news-for-programmers
		String [] condition = { "1" };
		setConditionValues("customers", condition);
		execute("List.filter", "collection=customers"); 
		assertCollectionRowCount("customers", 1);
		assertValueInCollection("customers", 0, "number", "1");
		assertValueInCollection("customers", 0, "name", "Javi");
		
		// Hide/Show rows
		execute("List.hideRows", "collection=customers");
		assertCollectionRowCount("customers", 0);
		execute("List.showRows", "collection=customers");
		assertCollectionRowCount("customers", 1);
		
		// tmp Faltan cosas
		//  1. Paginación
		//  2. Revisar todas las acciones de "List"
		//  3. Icono para editar/ver
	}
	
	public void testCustomizeCollection() throws Exception { // tmp
		// tmp fail("Falta hacer");
	}
	
	public void testMembersOfReferenceToEntityNotEditable() throws Exception {
		execute("Mode.detailAndFirst");
		execute("Collection.edit", "row=0,viewObject=xava_view_customers");
		assertEditable("customers.number");
		assertNoEditable("customers.name");
	}
	
	public void testOverwriteCollectionControllers() throws Exception {
		execute("CRUD.new");
		setValue("number", "1");
		execute("CRUD.search");
		assertValue("name", "MANUEL CHAVARRI");
		execute("Collection.edit", "row=0,viewObject=xava_view_customers");
		execute("Collection.hideDetail", "viewObject=xava_view_customers");
		assertMessage("Detail is hidden");
	}

	
	
	public void testCustomEditorWithMultipleValuesFormatter() throws Exception {
		String [] emptyRegions = {};
		String [] regions = { "1", "3" };
		String [] oneRegion = { "2" };
		
		execute("CRUD.new");
		assertValues("regions", emptyRegions);
		setValue("number", "66");
		setValue("name", "SELLER JUNIT 66");
		setValue("level.id", "A");
		setValues("regions", regions);
		assertValues("regions", regions);
		
		execute("CRUD.save");
		assertNoErrors();
		assertValues("regions", emptyRegions);		
		
		setValue("number", "66");
		execute("CRUD.search");
		assertValues("regions", regions);
		
		setValues("regions", oneRegion);
		execute("CRUD.save");
		assertNoErrors();
		assertValues("regions", emptyRegions);

		setValue("number", "66");
		execute("CRUD.search");
		assertValues("regions", oneRegion);
		
		execute("CRUD.delete");
		assertMessage("Seller deleted successfully");
	}
	
	public void testCollectionOfEntityReferencesElementsNotEditables() throws Exception {
		execute("Mode.detailAndFirst");
		execute("Collection.edit", "row=0,viewObject=xava_view_customers");
		assertEditable("customers.number");
		assertNoEditable("customers.name");
		assertNoAction("Collection.new"); // of deliveryPlaces
	}
	
	public void testCustomizeListSupportsRecursiveReferences() throws Exception {
		execute("List.customize");
		execute("List.addColumns");
		assertAction("AddColumns.addColumns");
	}
	
	public void testOnChangeListDescriptionReferenceWithStringSingleKey() throws Exception {
		execute("CRUD.new");
		setValue("level.id", "A");
		assertNoErrors();
		setValue("level.id", "");
		assertNoErrors();
	}
	
	public void testEntityReferenceCollections() throws Exception {
		createSeller66();
		createSeller67();
		verifySeller66();
		deleteCustomers(); 
		deleteSeller("66");
		deleteSeller("67");					
	}
	
	public void testSearchElementInReferencesCollectionUsingList() throws Exception {
		execute("CRUD.new");
		execute("Collection.new", "viewObject=xava_view_customers");
		execute("Reference.search", "keyProperty=xava.Seller.customers.number"); 
		String name = getValueInList(1, 0);
		execute("ReferenceSearch.choose", "row=1");
		assertValue("customers.name", name);
	}
	
	public void testCreateElementInReferencesCollectionUsingList() throws Exception {
		execute("CRUD.new");
		execute("Collection.new", "viewObject=xava_view_customers");
		execute("Reference.createNew", "model=Customer,keyProperty=xava.Seller.customers.number");
		assertAction("NewCreation.saveNew");
		assertAction("NewCreation.cancel");
	}
	
	private void createSeller66() throws Exception {
		execute("CRUD.new");
		setValue("number", "66");
		setValue("name", "SELLER JUNIT 66");
		setValue("level.id", "A");
		execute("Collection.new", "viewObject=xava_view_customers");
		assertEditable("customers.number");
		assertNoEditable("customers.name");
		setValue("customers.number", getCustomerNumber1());
		// Comparing name with ignore case because a formatter in customer name		
		assertValueIgnoringCase("customers.name", getCustomer1().getName()); 
		assertCollectionRowCount("customers", 0);
		execute("Collection.save", "viewObject=xava_view_customers");
		assertMessage("Customer associated to Seller");
		assertCollectionRowCount("customers", 1);
		
		execute("Collection.new", "viewObject=xava_view_customers");
		assertEditable("customers.number");
		assertNoEditable("customers.name");
		setValue("customers.number", getCustomerNumber2());		
		assertValueIgnoringCase("customers.name", getCustomer2().getName());
		execute("Collection.save", "viewObject=xava_view_customers");
		assertCollectionRowCount("customers",2);
				
		XHibernate.getSession().refresh(getCustomer1());
		XHibernate.getSession().refresh(getCustomer2());		
		
		assertValueInCollection("customers", 0, 0, getCustomerNumber1());
		assertValueInCollectionIgnoringCase("customers", 0, 1, getCustomer1().getName());
		assertValueInCollection("customers", 0, 2, getCustomer1().getRemarks());
		assertValueInCollection("customers", 0, 3, getCustomer1().getRelationWithSeller());
		assertValueInCollection("customers", 0, 4, getCustomer1().getSeller().getLevel().getDescription());
		
		assertValueInCollection("customers", 1, 0, getCustomerNumber2());
		assertValueInCollectionIgnoringCase("customers", 1, 1, getCustomer2().getName());
		assertValueInCollection("customers", 1, 2, getCustomer2().getRemarks());
		assertValueInCollection("customers", 1, 3, getCustomer2().getRelationWithSeller());
		assertValueInCollection("customers", 1, 4, getCustomer2().getSeller().getLevel().getDescription());
	}
	
	private void createSeller67() throws Exception {
		execute("CRUD.new");
		setValue("number", "67");
		setValue("name", "SELLER JUNIT 67");
		setValue("level.id", "B");
		execute("Collection.new", "viewObject=xava_view_customers");
		assertEditable("customers.number");
		assertNoEditable("customers.name");
		setValue("customers.number", getCustomerNumber2());
		assertValueIgnoringCase("customers.name", getCustomer2().getName());
		assertCollectionRowCount("customers",0);
		execute("Collection.save", "viewObject=xava_view_customers");
		assertCollectionRowCount("customers",1);
		
		XHibernate.getSession().refresh(getCustomer2());
		
		assertValueInCollection("customers", 0, 0, getCustomerNumber2());
		assertValueInCollectionIgnoringCase("customers", 0, 1, getCustomer2().getName());
		assertValueInCollection("customers", 0, 2, getCustomer2().getRemarks());
		assertValueInCollection("customers", 0, 3, getCustomer2().getRelationWithSeller());
		assertValueInCollection("customers", 0, 4, getCustomer2().getSeller().getLevel().getDescription());
	}
	
	private void verifySeller66() throws Exception {
		execute("CRUD.new");
		setValue("number", "66");
		execute("CRUD.search");
		assertNoErrors();
		assertCollectionRowCount("customers", 1);
		assertValueInCollection("customers", 0, 0, getCustomerNumber1());
		assertValueInCollectionIgnoringCase("customers", 0, 1, getCustomer1().getName());
		assertValueInCollection("customers", 0, 2, getCustomer1().getRemarks());
		assertValueInCollection("customers", 0, 3, getCustomer1().getRelationWithSeller());
		assertValueInCollection("customers", 0, 4, getCustomer1().getSeller().getLevel().getDescription());
		
		execute("Collection.edit", "row=0,viewObject=xava_view_customers");
		execute("Collection.remove", "viewObject=xava_view_customers");
		assertMessage("Association between Customer and Seller has been removed, but Customer is still in database");
		assertNoErrors();
		assertCollectionRowCount("customers", 0);		
	}
		
	private void deleteSeller(String number) throws Exception {
		execute("CRUD.new");
		setValue("number", number);
		execute("CRUD.search");
		assertNoErrors();

		execute("CRUD.delete");											
		assertNoErrors();
		assertMessage("Seller deleted successfully");
		assertExists("number"); // A bug did that the screen remained in blank after delete		
	}
	
	private void deleteCustomers() throws RemoteException, Exception {
		XHibernate.getSession().delete(getCustomer1());
		XHibernate.getSession().delete(getCustomer2());
		XHibernate.commit();
	}

	
	
	private ICustomer getCustomer1() throws Exception {
		if (customer1 == null) {
			createCustomers();
		}
		return customer1;
	}
	
	private ICustomer getCustomer2() throws Exception {
		if (customer2 == null) {
			createCustomers();
		}
		return customer2;
	}
	
		
	private void createCustomers() throws Exception {
		customer1 = new Customer();
		customer1.setNumber(66);
		customer1.setName("CUSTOMER JUNIT 66");
		customer1.setAddress(createAddress());
		customer1.setRemarks("REMARKS JUNIT 66");
		customer1.setRelationWithSeller("RELATION JUNIT 66");
		XHibernate.getSession().save(customer1);		

		customer2 = new Customer();
		customer2.setNumber(67);
		customer2.setName("CUSTOMER JUNIT 67");
		customer2.setAddress(createAddress());
		customer2.setRemarks("REMARKS JUNIT 67");
		customer2.setRelationWithSeller("RELATION JUNIT 67");
		XHibernate.getSession().save(customer2);
		
		XHibernate.commit();
	}
	
	private Address createAddress() { 
		Address address = new Address();
		address.setCity("EL PUIG");
		address.setStreet("MI CALLE");
		address.setZipCode(46540);
		State state = new State();
		state.setId("CA");
		address.setState(state);
		return address;
	}

	private String getCustomerNumber1() throws Exception {
		return String.valueOf(getCustomer1().getNumber());
	}
	
	private String getCustomerNumber2() throws Exception {
		return String.valueOf(getCustomer2().getNumber());
	}
			
}
