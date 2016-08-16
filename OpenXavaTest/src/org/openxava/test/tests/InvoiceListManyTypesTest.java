package org.openxava.test.tests;

import java.util.*;

import org.openxava.tab.*;

import com.gargoylesoftware.htmlunit.html.*;

/**
 * 
 * @author Javier Paniza
 */

public class InvoiceListManyTypesTest extends CustomizeListTestBase {
	
	public InvoiceListManyTypesTest(String testName) {
		super(testName, "InvoiceListManyTypes");		
	}
	
	public void testListConfigurations() throws Exception {	
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


	private void selectListConfiguration(String title) throws Exception {  
		HtmlOption option =  getSelectListConfigurations().getOptionByText(title);
		option.click();
		getWebClient().waitForBackgroundJavaScriptStartingBefore(10000);
	}

	private void assertListSelectedConfiguration(String expectedTitle) {   
		String title = getSelectListConfigurations().getSelectedOptions().get(0).asText();
		assertEquals(expectedTitle, refineListConfigurationTitle(title));
	}
	
	private String refineListConfigurationTitle(String title) {
		return title.substring(0, title.length() - 4);
	}
	
	private void assertListAllConfigurations(String ... expectedTitles) {   
		List<String> titles = new ArrayList<String>();
		for (HtmlOption option: getSelectListConfigurations().getOptions()) {
			String title = titles.isEmpty()?refineListConfigurationTitle(option.asText()):option.asText();
			titles.add(title);
		}
		Collections.sort(titles);
		List<String> expectedTitleList = Arrays.asList(expectedTitles);
		Collections.sort(expectedTitleList);
		assertEquals(expectedTitleList, titles);
	}
	
	private HtmlSelect getSelectListConfigurations() { 
		HtmlBody body = (HtmlBody) getHtmlPage().getElementsByTagName("body").get(0); 
		HtmlElement listTitle = body.getOneHtmlElementByAttribute("td", "class", "ox-list-title"); // This class depend on the style
		return (HtmlSelect) listTitle.getFirstElementChild(); // We assume that the configuration combo is the first element
	}
	
}