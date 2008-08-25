package org.openxava.test.tests;

import java.net.*;

import org.openxava.tests.*;
import org.openxava.util.*;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;



/**
 * @author Javier Paniza
 */

public class FormulaTest extends ModuleTestBase {
	
	public FormulaTest(String testName) {
		super(testName, "Formula");		
	}
	
	public void testImageInsideCollection() throws Exception {
		execute("CRUD.new");		
		execute("Collection.new", "viewObject=xava_view_section0_ingredients");
		execute("ImageEditor.changeImage", "newImageProperty=xava.Formula.ingredients.image");
		assertNoErrors();
		assertAction("LoadImage.loadImage");		
		String imageUrl = System.getProperty("user.dir") + "/test-images/cake.gif";
		setFileValue("newImage", imageUrl);
		execute("LoadImage.loadImage");
		assertNoErrors();
		
		HtmlPage page = (HtmlPage) getWebClient().getCurrentWindow().getEnclosedPage();		
		URL url = page.getWebResponse().getUrl();
		
		String urlPrefix = url.getProtocol() + "://" + url.getHost() + ":" + url.getPort();

		HtmlImage image = (HtmlImage) page.getHtmlElementsByName("xava.Formula.ingredients.image").get(0);		
		String imageURL = null;
		if (image.getSrcAttribute().startsWith("/")) {
			imageURL = urlPrefix + image.getSrcAttribute();
		}
		else {
			String urlBase = Strings.noLastToken(url.getPath(), "/");
			imageURL = urlPrefix + urlBase + image.getSrcAttribute();
		}		
		WebResponse response = getWebClient().getPage(imageURL).getWebResponse();		
		assertTrue("Image not obtained", response.getContentAsString().length() > 0);
		assertEquals("Result is not an image", "image", response.getContentType());		
	}
	
	public void testDependentReferencesAsDescriptionsListWithHiddenKeyInCollection_aggregateCanHasReferenceToModelOfContainerType() throws Exception {		
		execute("CRUD.new");		
		execute("Collection.new", "viewObject=xava_view_section0_ingredients");
		assertExists("ingredients.anotherFormula.oid"); // Reference to a model of 'Formula' type, the same of the container
		
		String [][] ingredients = {
			{ "", "" },
			{ "03C5C64CC0A80116000000009590B64C", "AZUCAR" },
			{ "03C59CF0C0A8011600000000618CC74B", "CAFE" },
			{ "03C6E1ADC0A8011600000000498BC537", "CAFE CON LECHE" },
			{ "03C6B61AC0A8011600000000AB4E7ACB", "LECHE" }, 
			{ "03C6C61DC0A801160000000076765581", "LECHE CONDENSADA"} 
		};
		
		String [][] empty = {
			{ "", "" }
		};
		
		String [][] cafeConLeche = {
				{ "", "" },
				{ "03C5C64CC0A80116000000009590B64C", "AZUCAR" },
				{ "03C59CF0C0A8011600000000618CC74B", "CAFE" },		
				{ "03C6B61AC0A8011600000000AB4E7ACB", "LECHE" }, 		 				
		};
		
		assertValidValues("ingredients.ingredient.oid", ingredients);
		assertValidValues("ingredients.accentuate.oid", empty);
		
		setValue("ingredients.ingredient.oid", "03C6E1ADC0A8011600000000498BC537");
		assertValidValues("ingredients.ingredient.oid", ingredients);
		assertValidValues("ingredients.accentuate.oid", cafeConLeche);
	}
	
	public void testHtmlTextStereotype() throws Exception {		
		execute("Mode.detailAndFirst");
		assertValue("name", "HTML TEST");
		execute("Sections.change", "activeSection=1");
		assertTrue("Expected HTML token not found", getHtml().indexOf("Y largo</strong>,<span style=\"background-color: rgb(153, 204, 0);\"> verde </span>") >= 0);
	}
		
}
