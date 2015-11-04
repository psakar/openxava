package org.openxava.test.tests;

/**
 * 
 * @author Jeromy Altuna
 */
public class ExamChangeDBTest extends ExamBaseTest {
	
	public ExamChangeDBTest(String nameTest) {
		super(nameTest, "ExamChangeDB");
	}
	
	@Override
	protected String getPersistenceUnit() {
		if (getDatasource() == Datasource.REAL) return "junit";
		if (getDatasource() == Datasource.SIMULATION) return "junit2";
		return null;
	}

	@Override
	protected String getDefaultSchema() {
		if (getDatasource() == Datasource.REAL) return "XAVATEST";
		if (getDatasource() == Datasource.SIMULATION) return "PUBLIC";
		return null;
	}
}
