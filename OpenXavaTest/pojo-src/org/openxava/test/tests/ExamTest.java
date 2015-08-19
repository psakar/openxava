package org.openxava.test.tests;

import java.util.*;

import org.hibernate.envers.*;
import org.hibernate.envers.query.*;
import org.openxava.test.model.*;
import org.openxava.tests.*;
import org.openxava.util.*;

import static org.openxava.jpa.XPersistence.*;

/**
 *
 * @author Jeromy Altuna
 */
public class ExamTest extends ModuleTestBase {
	
	private AuditReader reader;
	
	public ExamTest(String testName) {
		super(testName, "Exam");
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		resetAuditTables();
	}
	
	public void testCreateExamWithAtLeastOneQuestion() throws Exception {
		assertListRowCount(0);
		execute("CRUD.new");
		setValue("name", "ADMISSION");
		execute("CRUD.save");
		assertError("It's required at least 1 element in Questioning of Exam");
		execute("Collection.new", "viewObject=xava_view_questioning");
		setValue("name", "QUESTION 1");
		execute("Collection.save");
		assertMessagesCount(2);
		assertMessage("Exam created successfully");
		assertMessage("Question created successfully");
		execute("Mode.list");
		assertListRowCount(1);
		execute("Mode.detailAndFirst");
		assertValue("name", "ADMISSION");
		assertValueInCollection("questioning", 0, "name", "QUESTION 1");
		execute("CRUD.delete");
		assertMessage("Exam deleted successfully");
	}
	
	public void testRemoveElementsFromQuestioningAndLeaveAtLeastOneQuestion() throws Exception {
		assertListRowCount(0);
		execute("CRUD.new");
		setValue("name", "ADMISSION");
		execute("Collection.new", "viewObject=xava_view_questioning");
		for (int i = 1; i <= 3; i++){
			setValue("name", "" + i);
			execute("Collection.saveAndStay");
			assertMessage("Question created successfully"); 
		}
		execute("Collection.hideDetail");
		assertValue("name", "ADMISSION");
		assertCollectionRowCount("questioning", 3);
		
		checkAllCollection("questioning");
		execute("Collection.removeSelected", "viewObject=xava_view_questioning");
		assertError("It's required at least 1 element in Questioning of Exam"); 
		uncheckRowCollection("questioning", 0);
		uncheckRowCollection("questioning", 1);
		execute("Collection.removeSelected", "viewObject=xava_view_questioning");
		assertMessage("Question deleted from database");
		assertCollectionRowCount("questioning", 2);
		execute("Collection.edit", "row=1,viewObject=xava_view_questioning");
		execute("Collection.remove");
		assertMessage("Question deleted from database");
		assertCollectionRowCount("questioning", 1);
		execute("Collection.removeSelected", "row=0,viewObject=xava_view_questioning");
		assertError("It's required at least 1 element in Questioning of Exam");
		execute("Collection.edit", "row=0,viewObject=xava_view_questioning");
		execute ("Collection.remove");
		assertError("It's required at least 1 element in Questioning of Exam");
		execute("Collection.hideDetail");
		assertCollectionRowCount("questioning", 1);
		
		execute("CRUD.delete");
		assertNoErrors();
	}
	
	public void testAudit() throws Exception {
		execute("CRUD.new");
		setValue("name", "ADMISSION");
		execute("Collection.new", "viewObject=xava_view_questioning");
		setValue("name", "QUESTION 1");
		execute("Collection.save");
		assertNoErrors();
		Number rn = getLastRevisionNumber();
		assertValueInAuditTable("name", "ADMISSION", Exam.class, rn);
		assertValueInAuditTable("name", "QUESTION 1", Question.class, rn);
		assertRevTypeInAuditTable(RevisionType.ADD, Exam.class, rn);
		assertRevTypeInAuditTable(RevisionType.ADD, Question.class, rn);
		
		execute("Collection.edit", "row=0,viewObject=xava_view_questioning");
		setValue("name", "QUESTION 2");
		execute("Collection.save");
		rn = getLastRevisionNumber();
		assertValueInAuditTable("name", "QUESTION 2", Question.class, rn);
		assertRevTypeInAuditTable(RevisionType.MOD, Question.class, rn);
		
		execute("CRUD.delete");
		rn = getLastRevisionNumber();
		assertValueInAuditTable("name", null, Exam.class, rn);
		assertValueInAuditTable("name", null, Question.class, rn);
		assertRevTypeInAuditTable(RevisionType.DEL, Exam.class, rn);
		assertRevTypeInAuditTable(RevisionType.DEL, Question.class, rn);
	}
	
	private void assertValueInAuditTable(String name, String value, Class<?> clazz, Number revision) throws Exception {
		Object object = getRevisionOfEntity(clazz, revision)[0];
		PropertiesManager pm = new PropertiesManager(object);
		assertEquals(value, pm.executeGet(name));
	}
	
	private void assertRevTypeInAuditTable(RevisionType revType, Class<?> clazz, Number revision) throws Exception {
		RevisionType type = (RevisionType) getRevisionOfEntity(clazz, revision)[2];
		assertTrue(type.equals(revType));		
	}
	
	private Object[] getRevisionOfEntity(Class<?> clazz, Number revision) throws Exception {
		AuditQuery query = getAuditReader().createQuery()
		   		           .forRevisionsOfEntity(clazz, false, true)
		                   .add(AuditEntity.revisionNumber().eq(revision));
		return (Object[]) query.getSingleResult();
	}
	
	private Number getLastRevisionNumber() throws Exception {
		return getAuditReader().getRevisionNumberForDate(new Date());
	}
	
	private AuditReader getAuditReader() throws Exception {
		if (reader == null) {
			reader = AuditReaderFactory.get(getManager());
		}
		return reader;
	}

	private void resetAuditTables() {
		String[] queries = {
			"delete from XAVATEST.EXAM_AUD", 
			"delete from XAVATEST.QUESTION_AUD", 
			"delete from XAVATEST.REVINFO", 
			"alter table XAVATEST.REVINFO alter column REV restart with 1"
		}; 		
		for (String query : queries) {
			getManager().createNativeQuery(query).executeUpdate();
		}
		commit();
	}
}
