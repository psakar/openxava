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
	
	public void testListConfigurations() throws Exception {
		// Don't separate in several test (separating in several method would be OK) 
		// because we want test the accumulation of configuration without duplication
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
		
		selectListConfiguration("All");
		assertListSelectedConfiguration("All");
		assertListAllConfigurations("All", "Number = 1", "Year = 2004 and number > 10"); 
		assertListRowCount(9);
		
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
		
		// Empty/not empty
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
		
		// Groups
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
				
		// Enums
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
		
		// Year, month and year/month
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
		
		// Descriptions list
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
	
}