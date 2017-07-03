package org.openxava.test.tests;

import org.openxava.tests.*;

/**
 * 
 * @author Javier Paniza
 */
public class NetMachineWithoutNewTest extends ModuleTestBase {

	public NetMachineWithoutNewTest(String testName) {
		super(testName, "NetMachineWithoutNew");
	}
	
	public void testNoRecordsWithoutNewStartsInList_goDetailWithNoRecordsAndNoNewAction() throws Exception {
		assertListRowCount(0);
		assertNotExists("name");
		assertNotExists("mac");
		
		execute("Mode.detailAndFirst");
		assertError("Impossible to go to detail mode, there are no elements in list");
		assertListRowCount(0);
		assertNotExists("name");
		assertNotExists("mac");
	}
		
}
