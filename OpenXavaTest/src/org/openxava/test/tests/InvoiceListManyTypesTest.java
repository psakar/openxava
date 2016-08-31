package org.openxava.test.tests;

import org.openxava.tab.*;

/**
 * 
 * @author Javier Paniza
 */

public class InvoiceListManyTypesTest extends CustomizeListTestBase {
	
	public InvoiceListManyTypesTest(String testName) {
		super(testName, "InvoiceListManyTypes");		
	}
	
	
	// Remove .openxava before execute this test
	public void testListConfigurations() throws Exception {
		// Don't separate in several test (separating in several method would be OK) 
		// because we want test the accumulation of configuration without duplication
		assertListConfigurationsBasicCases();		
		assertListConfigurationsBooleans();
		assertListConfigurationsEmptyNotEmpty();
		assertListConfigurationGroups();
		assertListConfigurationsEnums();	
		assertListConfigurationsYearMonthYearMonth();
		assertListConfigurationsDescriptionsLists();	
		assertListConfigurationsOrdering(); 
		assertListConfigurationsI18n();
		assertListConfigurationsPersistence();		
	}


	private void assertListConfigurationsPersistence() throws Exception {
		resetModule();
		assertListRowCount(9);
		assertListSelectedConfiguration("Todos");
		assertListAllConfigurations("Todos", "Número = 1", "Año = 2004 y número > 10", "Pagada", "No pagada", 
			"No pagada y nombre de cliente empieza por j", "Correo electrónico de cliente no está vacío", "Correo electrónico de cliente no está vacío y no pagada", 
			"Correo electrónico de cliente está vacío", "Año en grupo(2002, 2004)", "Año no en grupo(2002, 2004)", "Tipo de cliente = fijo",
			"Tipo de cliente = normal", "Año de fecha = 2002", "Año/mes de fecha = 2006/11", "Mes de fecha = 1",
			"Comercial de cliente = manuel chavarri", "Ordenado por número", "Ordenado por número descendente",
			"Ordenado por año ascendente y número descendente", "Ordenado por año descendente y número descendente",
			"Año > 2002 ordenado por año descendente y número descendente");				
		selectListConfiguration("Año/mes de fecha = 2006/11"); // Not the first one, to test a case
		assertListSelectedConfiguration("Año/mes de fecha = 2006/11");
		assertListAllConfigurations("Todos", "Número = 1", "Año = 2004 y número > 10", "Pagada", "No pagada", 
			"No pagada y nombre de cliente empieza por j", "Correo electrónico de cliente no está vacío", "Correo electrónico de cliente no está vacío y no pagada", 
			"Correo electrónico de cliente está vacío", "Año en grupo(2002, 2004)", "Año no en grupo(2002, 2004)", "Tipo de cliente = fijo",
			"Tipo de cliente = normal", "Año de fecha = 2002", "Año/mes de fecha = 2006/11", "Mes de fecha = 1",
			"Comercial de cliente = manuel chavarri", "Ordenado por número", "Ordenado por número descendente",
			"Ordenado por año ascendente y número descendente", "Ordenado por año descendente y número descendente",
			"Año > 2002 ordenado por año descendente y número descendente");				
		assertListRowCount(2);
		
		selectListConfiguration("Ordenado por año descendente y número descendente"); // With ordering
		assertListSelectedConfiguration("Ordenado por año descendente y número descendente");
		assertListAllConfigurations("Todos", "Número = 1", "Año = 2004 y número > 10", "Pagada", "No pagada", 
			"No pagada y nombre de cliente empieza por j", "Correo electrónico de cliente no está vacío", "Correo electrónico de cliente no está vacío y no pagada", 
			"Correo electrónico de cliente está vacío", "Año en grupo(2002, 2004)", "Año no en grupo(2002, 2004)", "Tipo de cliente = fijo",
			"Tipo de cliente = normal", "Año de fecha = 2002", "Año/mes de fecha = 2006/11", "Mes de fecha = 1",
			"Comercial de cliente = manuel chavarri", "Ordenado por número", "Ordenado por número descendente",
			"Ordenado por año ascendente y número descendente", "Ordenado por año descendente y número descendente",
			"Año > 2002 ordenado por año descendente y número descendente");				
		assertListRowCount(9);
		assertValueInList(3, "year", "2004");
		assertValueInList(3, "number", "12");
		assertValueInList(4, "year", "2004");
		assertValueInList(4, "number", "11");
		assertValueInList(5, "year", "2004");
		assertValueInList(5, "number", "10");
		assertValueInList(6, "year", "2004");
		assertValueInList(6, "number", "9");
		assertValueInList(7, "year", "2004");
		assertValueInList(7, "number", "2");
	}

	private void assertListConfigurationsI18n() throws Exception {
		setLocale("es");
		assertListSelectedConfiguration("Ordenado por número");
		assertListAllConfigurations("Todos", "Número = 1", "Año = 2004 y número > 10", "Pagada", "No pagada", 
			"No pagada y nombre de cliente empieza por j", "Correo electrónico de cliente no está vacío", "Correo electrónico de cliente no está vacío y no pagada", 
			"Correo electrónico de cliente está vacío", "Año en grupo(2002, 2004)", "Año no en grupo(2002, 2004)", "Tipo de cliente = fijo",
			"Tipo de cliente = normal", "Año de fecha = 2002", "Año/mes de fecha = 2006/11", "Mes de fecha = 1",
			"Comercial de cliente = manuel chavarri", "Ordenado por número", "Ordenado por número descendente",
			"Ordenado por año ascendente y número descendente", "Ordenado por año descendente y número descendente",
			"Año > 2002 ordenado por año descendente y número descendente");		
		assertListRowCount(9);
		
		selectListConfiguration("Año/mes de fecha = 2006/11");
		assertListSelectedConfiguration("Año/mes de fecha = 2006/11");
		assertListAllConfigurations("Todos", "Número = 1", "Año = 2004 y número > 10", "Pagada", "No pagada", 
			"No pagada y nombre de cliente empieza por j", "Correo electrónico de cliente no está vacío", "Correo electrónico de cliente no está vacío y no pagada", 
			"Correo electrónico de cliente está vacío", "Año en grupo(2002, 2004)", "Año no en grupo(2002, 2004)", "Tipo de cliente = fijo",
			"Tipo de cliente = normal", "Año de fecha = 2002", "Año/mes de fecha = 2006/11", "Mes de fecha = 1",
			"Comercial de cliente = manuel chavarri", "Ordenado por número", "Ordenado por número descendente",
			"Ordenado por año ascendente y número descendente", "Ordenado por año descendente y número descendente",
			"Año > 2002 ordenado por año descendente y número descendente");				
		assertListRowCount(2);
	}

	private void assertListConfigurationsOrdering() throws Exception { 
		clearCondition();
		execute("List.orderBy", "property=number");
		assertListSelectedConfiguration("Ordered by number");
		assertListRowCount(9);
		assertValueInList(0, "number", "1");
		assertValueInList(8, "number", "14");
		
		execute("List.orderBy", "property=number");
		assertListSelectedConfiguration("Ordered by number descending");
		assertListRowCount(9);
		assertValueInList(0, "number", "14");
		assertValueInList(8, "number", "1");
		
		execute("List.orderBy", "property=year");
		assertListSelectedConfiguration("Ordered by year ascending and number descending");
		assertListRowCount(9);
		assertValueInList(1, "year", "2004");
		assertValueInList(1, "number", "12");
		assertValueInList(2, "year", "2004");
		assertValueInList(2, "number", "11");
		assertValueInList(3, "year", "2004");
		assertValueInList(3, "number", "10");
		assertValueInList(4, "year", "2004");
		assertValueInList(4, "number", "9");
		assertValueInList(5, "year", "2004");
		assertValueInList(5, "number", "2");
		
		execute("List.orderBy", "property=year");
		assertListSelectedConfiguration("Ordered by year descending and number descending");
		assertListRowCount(9);
		assertValueInList(3, "year", "2004");
		assertValueInList(3, "number", "12");
		assertValueInList(4, "year", "2004");
		assertValueInList(4, "number", "11");
		assertValueInList(5, "year", "2004");
		assertValueInList(5, "number", "10");
		assertValueInList(6, "year", "2004");
		assertValueInList(6, "number", "9");
		assertValueInList(7, "year", "2004");
		assertValueInList(7, "number", "2");		
	
		setConditionComparators(">");
		setConditionValues("2002");
		execute("List.filter");
		assertListSelectedConfiguration("Year > 2002 ordered by year descending and number descending");
		assertListRowCount(8);
		assertValueInList(3, "year", "2004");
		assertValueInList(3, "number", "12");
		assertValueInList(4, "year", "2004");
		assertValueInList(4, "number", "11");
		assertValueInList(5, "year", "2004");
		assertValueInList(5, "number", "10");
		assertValueInList(6, "year", "2004");
		assertValueInList(6, "number", "9");
		assertValueInList(7, "year", "2004");
		assertValueInList(7, "number", "2");
		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1",
			"Seller of customer = manuel chavarri", "Ordered by number", "Ordered by number descending",
			"Ordered by year ascending and number descending", "Ordered by year descending and number descending",
			"Year > 2002 ordered by year descending and number descending"
		);
		
		selectListConfiguration("Ordered by number descending");
		assertListSelectedConfiguration("Ordered by number descending");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1",
			"Seller of customer = manuel chavarri", "Ordered by number", "Ordered by number descending",
			"Ordered by year ascending and number descending", "Ordered by year descending and number descending",
			"Year > 2002 ordered by year descending and number descending"
		);		
		assertListRowCount(9);
		assertValueInList(0, "number", "14");
		assertValueInList(8, "number", "1");
		
		selectListConfiguration("All");
		assertListRowCount(9);
		assertValueInList(0, "number", "1");
		assertValueInList(8, "number", "1");
		execute("List.orderBy", "property=number"); // We already have this ordering...
		assertListSelectedConfiguration("Ordered by number"); // ...but is not duplicated 
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1",
			"Seller of customer = manuel chavarri", "Ordered by number", "Ordered by number descending",
			"Ordered by year ascending and number descending", "Ordered by year descending and number descending",
			"Year > 2002 ordered by year descending and number descending"
		);		
		assertListRowCount(9);
		assertValueInList(0, "number", "1");
		assertValueInList(8, "number", "14");		
	}


	private void assertListConfigurationsDescriptionsLists() throws Exception {
		clearCondition();
		setConditionValues("", "", "", "", "", "", "", "1:_:MANUEL CHAVARRI");
		execute("List.filter");
		assertListSelectedConfiguration("Seller of customer = manuel chavarri");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1",
			"Seller of customer = manuel chavarri");
		assertListRowCount(7);		

		selectListConfiguration("All");
		assertListSelectedConfiguration("All");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1",
			"Seller of customer = manuel chavarri");
		assertListRowCount(9);
		
		selectListConfiguration("Seller of customer = manuel chavarri");
		assertListSelectedConfiguration("Seller of customer = manuel chavarri");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1",
			"Seller of customer = manuel chavarri");
		assertListRowCount(7);
	}


	private void assertListConfigurationsYearMonthYearMonth() throws Exception {
		clearCondition();
		setConditionComparators("", "", Tab.YEAR_COMPARATOR); 
		setConditionValues("", "", "2002");
		execute("List.filter");
		assertListSelectedConfiguration("Year of date = 2002");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002");
		assertListRowCount(1);
		
		setConditionComparators("", "", Tab.YEAR_MONTH_COMPARATOR); 
		setConditionValues("", "", "2006/11");
		execute("List.filter");
		assertListSelectedConfiguration("Year/month of date = 2006/11");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11");
		assertListRowCount(2);		

		setConditionComparators("", "", Tab.MONTH_COMPARATOR); 
		setConditionValues("", "", "1");
		execute("List.filter");
		assertListSelectedConfiguration("Month of date = 1");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1");
		assertListRowCount(3);
		
		selectListConfiguration("Year/month of date = 2006/11");
		assertListSelectedConfiguration("Year/month of date = 2006/11");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal", "Year of date = 2002", "Year/month of date = 2006/11", "Month of date = 1");
		assertListRowCount(2);
	}


	private void assertListConfigurationsEnums() throws Exception {
		clearCondition();
		setConditionComparators("", "", "", "", "", "", "="); 
		setConditionValues("", "", "", "", "", "", "1");
		execute("List.filter");
		assertListSelectedConfiguration("Type of customer = steady");		
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady");
		assertListRowCount(5);
		
		setConditionValues("", "", "", "", "", "", "0"); 
		execute("List.filter");
		assertListSelectedConfiguration("Type of customer = normal");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
			"Type of customer = normal");
		assertListRowCount(4);
		
		selectListConfiguration("Type of customer = steady");
		assertListSelectedConfiguration("Type of customer = steady");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
				"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
				"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)", "Type of customer = steady",
				"Type of customer = normal");
		assertListRowCount(5);
	}


	private void assertListConfigurationGroups() throws Exception {
		clearCondition();
		setConditionComparators(Tab.IN_COMPARATOR); 
		setConditionValues("2002, 2004");
		execute("List.filter");
		assertListSelectedConfiguration("Year in group(2002, 2004)");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)");
		assertListRowCount(6);
	
		setConditionComparators(Tab.NOT_IN_COMPARATOR); 
		execute("List.filter");
		assertListSelectedConfiguration("Year not in group(2002, 2004)");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)");
		assertListRowCount(3);	
		
		selectListConfiguration("Year in group(2002, 2004)");
		assertListSelectedConfiguration("Year in group(2002, 2004)");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty", "Year in group(2002, 2004)", "Year not in group(2002, 2004)");
		assertListRowCount(6);
	}


	private void assertListConfigurationsEmptyNotEmpty() throws Exception {
		clearCondition();
		setConditionComparators("=", "=", "=", Tab.NOT_EMPTY_COMPARATOR, "<>"); // To test not empty combined with boolean(false value) because of a bug
		setConditionValues("", "", "", "", "true");
		execute("List.filter");
		assertListSelectedConfiguration("Email of customer is not empty and not paid");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid");
		assertListRowCount(5);
		
		clearCondition();
		setConditionComparators("=", "=", "=", Tab.EMPTY_COMPARATOR); 
		setConditionValues("", "", "", "");
		execute("List.filter");
		assertListSelectedConfiguration("Email of customer is empty");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
			"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
			"Email of customer is empty");
		assertListRowCount(4);
		
		selectListConfiguration("Email of customer is not empty and not paid");
		assertListSelectedConfiguration("Email of customer is not empty and not paid");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", 
				"Not paid and name of customer starts with j", "Email of customer is not empty", "Email of customer is not empty and not paid", 
				"Email of customer is empty");
		assertListRowCount(5);
	}


	private void assertListConfigurationsBooleans() throws Exception {
		setConditionValues("", "", "", "", "true"); 
		setConditionComparators("=", "=", "=", "=", "=");
		execute("List.filter");
		assertListSelectedConfiguration("Paid");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid");
		assertListRowCount(1);		

		setConditionValues("", "", "", "", "true"); 
		setConditionComparators("=", "=", "=", "=", "<>");
		execute("List.filter");
		assertListSelectedConfiguration("Not paid");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid");
		assertListRowCount(8);		
				
		setConditionComparators("=", "=", "=", "=", "<>", Tab.STARTS_COMPARATOR);
		setConditionValues("", "", "", "", "true", "j"); 
		execute("List.filter");
		assertListSelectedConfiguration("Not paid and name of customer starts with j"); // Here the boolean is not the last one
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", "Not paid and name of customer starts with j");
		assertListRowCount(6);
		
		selectListConfiguration("Paid");
		assertListSelectedConfiguration("Paid");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", "Not paid and name of customer starts with j");
		assertListRowCount(1);

		selectListConfiguration("Not paid and name of customer starts with j");
		assertListSelectedConfiguration("Not paid and name of customer starts with j");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10", "Paid", "Not paid", "Not paid and name of customer starts with j");
		assertListRowCount(6);
	}


	private void assertListConfigurationsBasicCases() throws Exception {
		assertListSelectedConfiguration("All");
		assertListAllConfigurations("All");
		assertListRowCount(9);
		
		setConditionValues("", "1"); // We try the second one with the first empty to test a bug
		execute("List.filter");
		assertListSelectedConfiguration("Number = 1");
		assertListAllConfigurations("All", "Number = 1");
		assertListRowCount(3);
		
		setConditionValues("2004", "10"); 
		setConditionComparators("=", ">"); 
		execute("List.filter");
		assertListSelectedConfiguration("Year = 2004 and number > 10");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10");
		assertListRowCount(2);
		
		selectListConfiguration("Number = 1"); 
		assertListSelectedConfiguration("Number = 1");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10"); 
		assertListRowCount(3);	
		assertValue("conditionValue___0", ""); 
		assertValue("conditionValue___1", "1"); 
		assertValue("conditionValue___2", ""); 
		
		selectListConfiguration("All");
		assertListSelectedConfiguration("All");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10"); 
		assertListRowCount(9);
		assertValue("conditionValue___0", ""); 
		assertValue("conditionValue___1", ""); 
		assertValue("conditionValue___2", ""); 
				
		selectListConfiguration("Year = 2004 and number > 10");
		assertListSelectedConfiguration("Year = 2004 and number > 10");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10");
		assertListRowCount(2);

		setConditionValues("", "1"); // To test not duplicated in combo
		setConditionComparators("=", "="); 
		execute("List.filter");
		assertListSelectedConfiguration("Number = 1");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10"); 
		assertListRowCount(3);
		
		setConditionValues("2004", "10"); // To test not duplicated in combo again, curiously it failed the second time
		setConditionComparators("=", ">");
		execute("List.filter");
		assertListSelectedConfiguration("Year = 2004 and number > 10");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10");
		assertListRowCount(2);
	}
	
}