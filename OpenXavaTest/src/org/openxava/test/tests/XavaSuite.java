package org.openxava.test.tests;

import org.openxava.tests.*;
import org.openxava.util.*;

import junit.framework.*;

/**
 * @author Javier Paniza
 */
public class XavaSuite extends TestSuite {
	
	
	public static void main(String [] argv) {
		String [] tests = {
			XavaSuite.class.getName()
		};
		junit.swingui.TestRunner.main(tests);	
	}
	
	public XavaSuite() {
		super();
	}
	public XavaSuite(Class theClass) {
		super(theClass);
	}
	public XavaSuite(String name) {
		super(name);
	}
	public static Test suite() {		
		TestSuite suite = new TestSuite();
				
		suite.addTest(new TestSuite(WarehousesTest.class));	
		suite.addTest(new TestSuite(CarriersTest.class));
		suite.addTest(new TestSuite(CarriersWithSpecialSearchTest.class));		
		suite.addTest(new TestSuite(ChangeProductsPrice2Test.class));
		suite.addTest(new TestSuite(ChangeProductsPriceTest.class));
		if (!XavaPreferences.getInstance().isEJB2Persistence()) {			
			suite.addTest(new TestSuite(ColorsOnlyPOJOTest.class));
		}
		suite.addTest(new TestSuite(ColorsTest.class));
		suite.addTest(new TestSuite(ClerksTest.class));
		suite.addTest(new TestSuite(CustomerContactPersonsTest.class));
		suite.addTest(new TestSuite(CustomersNewOnInitInheritedTest.class));
		suite.addTest(new TestSuite(CustomersNewOnInitTest.class));
		suite.addTest(new TestSuite(CustomersReadOnlyTest.class));
		suite.addTest(new TestSuite(CustomersSellerAsAggregateTest.class));
		suite.addTest(new TestSuite(CustomersSimpleTest.class));
		suite.addTest(new TestSuite(CustomersSomeMembersReadOnlyTest.class));
		suite.addTest(new TestSuite(CustomersTest.class));
		suite.addTest(new TestSuite(CustomersTwoSellersInListTest.class));
		suite.addTest(new TestSuite(CustomersTwoSellersNumberInListTest.class));
		suite.addTest(new TestSuite(CustomersWithSectionTest.class));
		suite.addTest(new TestSuite(DeliveriesGroupsInSectionsTest.class));
		suite.addTest(new TestSuite(DeliveriesTest.class));
		suite.addTest(new TestSuite(DeliveryTypesJSPTest.class));
		suite.addTest(new TestSuite(DeliveryTypesTest.class));
		if (ModuleTestBase.isPortalEnabled()) {
			suite.addTest(new TestSuite(DescriptionTest.class));
		}
		if (XavaPreferences.getInstance().isEJB2Persistence()) {
			suite.addTest(new TestSuite(EJBTest.class));
		}
		suite.addTest(new TestSuite(FamiliesListOnlyTest.class));
		suite.addTest(new TestSuite(FamiliesTest.class));
		suite.addTest(new TestSuite(FamiliesWithInheritanceControllerTest.class));
		suite.addTest(new TestSuite(FamilyProductsReportTest.class));
		suite.addTest(new TestSuite(FamilyRangeProductsReportTest.class));
		suite.addTest(new TestSuite(FamilyXProductsReportTest.class));
		suite.addTest(new TestSuite(FormulasTest.class));		
		suite.addTest(new TestSuite(HibernateTest.class));
		suite.addTest(new TestSuite(Invoice20020001Test.class));
		suite.addTest(new TestSuite(Invoices2002Test.class));
		suite.addTest(new TestSuite(Invoices2004Test.class));
		suite.addTest(new TestSuite(InvoicesDeliveriesTest.class));
		suite.addTest(new TestSuite(InvoicesFromCustomersTest.class));
		suite.addTest(new TestSuite(InvoicesFromDeliveriesTest.class));
		suite.addTest(new TestSuite(InvoicesNestedSectionsTest.class));
		suite.addTest(new TestSuite(InvoicesNoListTest.class));
		suite.addTest(new TestSuite(InvoicesTest.class));
		if (XavaPreferences.getInstance().isJPAPersistence()) {
			suite.addTest(new TestSuite(JPATest.class));
		}
		suite.addTest(new TestSuite(MapFacadeTest.class));
		suite.addTest(new TestSuite(NotZeroValidatorTest.class));
		suite.addTest(new TestSuite(Offices2Test.class));
		suite.addTest(new TestSuite(OfficesTest.class));
		suite.addTest(new TestSuite(OnlyEditDetailsInvoiceTest.class));
		suite.addTest(new TestSuite(OnlyReadDetailsInvoiceTest.class));
		suite.addTest(new TestSuite(POJOTest.class));
		suite.addTest(new TestSuite(PositiveValidatorTest.class));
		suite.addTest(new TestSuite(Products2ReferenceAndStereotypeTest.class));
		suite.addTest(new TestSuite(Products2Test.class));
		suite.addTest(new TestSuite(Products2WithFormulaAsAggregateTest.class));
		suite.addTest(new TestSuite(Products2WithFormulaTest.class));
		suite.addTest(new TestSuite(Products3ChangeActionsOnSearchTest.class));
		suite.addTest(new TestSuite(Products3Test.class));
		suite.addTest(new TestSuite(Products3WithDescriptionsListTest.class));
		suite.addTest(new TestSuite(Products3WithGroupTest.class));
		suite.addTest(new TestSuite(ProductsTest.class));
		suite.addTest(new TestSuite(ProductsWithSectionTest.class));
		suite.addTest(new TestSuite(PublicJSPTest.class));
		suite.addTest(new TestSuite(SellersCannotCreateCustomerTest.class));
		suite.addTest(new TestSuite(SellersJSPTest.class));
		suite.addTest(new TestSuite(SellersTest.class));
		suite.addTest(new TestSuite(SellersWithCustomersAsAggregateTest.class));
		suite.addTest(new TestSuite(SellersWithDescriptionsListJSPTest.class));
		suite.addTest(new TestSuite(ServicesTest.class));
		suite.addTest(new TestSuite(ShipmentChargesTest.class));
		suite.addTest(new TestSuite(ShipmentsTest.class));
		if (!XavaPreferences.getInstance().isEJB2Persistence()) {
			suite.addTest(new TestSuite(SizesTest.class));
		}
		suite.addTest(new TestSuite(StateHibernateTest.class));
		if (XavaPreferences.getInstance().isJPAPersistence()) {
			// This test can work with any persistence provider, because it uses direct JPA APIs,
			// but asking 'isJPAPersistence' we are sure that Java 5 is used in server
			suite.addTest(new TestSuite(StateJPATest.class));
		}
		suite.addTest(new TestSuite(Subfamilies2Test.class));
		suite.addTest(new TestSuite(SubfamiliesSelectTest.class));
		suite.addTest(new TestSuite(SubfamiliesTest.class));
		if (ModuleTestBase.isPortalEnabled()) {
			suite.addTest(new TestSuite(TasksTest.class));
		}
		suite.addTest(new TestSuite(TransportCharges2Test.class));		
		suite.addTest(new TestSuite(TransportChargesTest.class));
		suite.addTest(new TestSuite(TransportChargesWithDistanceTest.class));									
			
		return suite;
	}
	
}