package org.openxava.test.tests;

import java.util.*;

import org.hibernate.envers.*;
import org.hibernate.envers.query.*;
import org.openxava.jpa.*;
import org.openxava.test.model.*;
import org.openxava.tests.*;
import org.openxava.util.*;

/**
 * 
 * @author Jeromy Altuna
 */
abstract public class ExamBaseTest extends ModuleTestBase {
	
	private String controllerName;
	
	private Datasource datasource;
	public enum Datasource { REAL, SIMULATION }
	
	public ExamBaseTest(String testName, String module) {
		super(testName, module);
		controllerName = module;
	}
	
	protected abstract String getPersistenceUnit();
	protected abstract String getDefaultSchema();
	
	public void testChangeDatasource() throws Exception {
		// Real data source
		setDatasource(Datasource.REAL);
		assertListRowCount(0);
		execute("CRUD.new");
		setValue("name", "REAL");
		execute("Collection.new", "viewObject=xava_view_questioning");
		setValue("name", "REAL QUESTION 1");
		execute("Collection.save");
		Number rn = getLastRevisionNumber();
		assertValueInAuditTable("name", "REAL", Exam.class, rn);
		assertValueInAuditTable("name", "REAL QUESTION 1", Question.class, rn);
		execute("Mode.list");
		assertListRowCount(1);
		// Change to Simulation data source
		setDatasource(Datasource.SIMULATION);
		assertListRowCount(0);
		execute("CRUD.new");
		setValue("name", "SIMULATION");
		execute("Collection.new", "viewObject=xava_view_questioning");
		setValue("name", "SIMULATION QUESTION 1");
		execute("Collection.save");
		rn = getLastRevisionNumber();
		assertValueInAuditTable("name", "SIMULATION", Exam.class, rn);
		assertValueInAuditTable("name", "SIMULATION QUESTION 1", Question.class, rn);
		execute("Mode.list");
		assertListRowCount(1);
		// Change to Real data source
		setDatasource(Datasource.REAL);
		assertListRowCount(1);
		assertValueInList(0, 0, "REAL");
		rn = getLastRevisionNumber();
		assertValueInAuditTable("name", "REAL", Exam.class, rn);
		assertValueInAuditTable("name", "REAL QUESTION 1", Question.class,rn);
		execute("CRUD.deleteRow", "row=0");
		assertListRowCount(0);
		rn = getLastRevisionNumber();
		assertRevTypeInAuditTable(RevisionType.DEL, Exam.class, rn);
		assertRevTypeInAuditTable(RevisionType.DEL, Question.class, rn);
		// Change to Simulation data source
		setDatasource(Datasource.SIMULATION);
		assertListRowCount(1);
		assertValueInList(0, 0, "SIMULATION");
		rn = getLastRevisionNumber();
		assertValueInAuditTable("name", "SIMULATION", Exam.class, rn);
		assertValueInAuditTable("name", "SIMULATION QUESTION 1", Question.class, rn);
		execute("List.viewDetail", "row=0");
		execute("CRUD.delete");
		assertNoErrors();
		rn = getLastRevisionNumber();
		assertRevTypeInAuditTable(RevisionType.DEL, Exam.class, rn);
		assertRevTypeInAuditTable(RevisionType.DEL, Question.class, rn);
		// Change to Real data source
		setDatasource(Datasource.REAL);
		getLastRevisionNumber();
	}
	
	protected void assertValueInAuditTable(String name, String value, Class<?> clazz, Number revision) 
			throws Exception 
	{
		Object object = getRevisionOfEntity(clazz, revision)[0];
		PropertiesManager pm = new PropertiesManager(object);
		assertEquals(value, pm.executeGet(name));
	}

	protected void assertRevTypeInAuditTable(RevisionType revType, Class<?> clazz, Number revision) 
			throws Exception 
	{
		RevisionType type = (RevisionType) getRevisionOfEntity(clazz, revision)[2];
		assertTrue(type.equals(revType));		
	}
	
	protected Number getLastRevisionNumber() throws Exception {
		return getAuditReader().getRevisionNumberForDate(new Date());
	}
	
	private Object[] getRevisionOfEntity(Class<?> clazz, Number revision) throws Exception {
		AuditQuery query = getAuditReader().createQuery()
		   		           .forRevisionsOfEntity(clazz, false, true)
		                   .add(AuditEntity.revisionNumber().eq(revision));
		return (Object[]) query.getSingleResult();
	}	

	private AuditReader getAuditReader() throws Exception {
		XPersistence.commit();
		XPersistence.reset();
		XPersistence.setPersistenceUnit(getPersistenceUnit());
		XPersistence.setDefaultSchema(getDefaultSchema());
		return AuditReaderFactory.get(XPersistence.getManager());
	}
	
	public Datasource getDatasource() {
		return datasource;
	}
	private void setDatasource(Datasource datasource) throws Exception {
		this.datasource = datasource;
		execute(controllerName + ".changeTo" + Strings.firstUpper(datasource.name().toLowerCase()));
	}
}