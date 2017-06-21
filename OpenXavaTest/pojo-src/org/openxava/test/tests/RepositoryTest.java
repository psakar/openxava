package org.openxava.test.tests;

import org.openxava.tests.ModuleTestBase;

/**
 * 
 * @author Jeromy Altuna
 */
public class RepositoryTest extends ModuleTestBase {

	public RepositoryTest(String testName) {
		super(testName, "Repository");
	}
	
	public void testAttachmentsEditor() throws Exception {
		assertListRowCount(1);
		assertListColumnCount(1); //Attachments is not show
		
		execute("Mode.detailAndFirst");
		setValue("name", "JUNIT REPOSITORY");
		
		assertAttachmentsCount("archives", 1);
		assertExistsAttachmentName("archives", "Forrest Gump Trailer.webm");
		
		execute("CRUD.save");
		execute("Mode.list");		
		assertListRowCount(1);		
	}	
}
