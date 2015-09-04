package org.openxava.test.tests;

/**
 * 
 * @author Javier Paniza
 */

public class CarTest extends ImageTestBase {
	
	public CarTest(String testName) {
		super(testName, "Car");		
	}
	
	public void testImageInElementCollection() throws Exception { 
		execute("CRUD.new");		
		setValue("make", "ALFA ROMEO");
		setValue("model", "MITO");
		setValueInCollection("photos", 0, "description", "FRONT");
		setValueInCollection("photos", 1, "description", "BACK");
		changeImage("photos.0.photo", "/test-images/foto_javi.jpg");
		changeImage("photos.1.photo", "/test-images/cake.gif");		
		assertImage("photos.0.photo");
		assertImage("photos.1.photo");
				
		reload(); // In order that actions work fine after the above assertImage() usage
		execute("CRUD.save");
		execute("Mode.list");
		execute("Mode.detailAndFirst");
		assertValue("make", "ALFA ROMEO");
		assertValue("model", "MITO");
		assertValueInCollection("photos", 0, "description", "FRONT");
		assertValueInCollection("photos", 1, "description", "BACK");	
		assertImage("photos.0.photo");
		assertImage("photos.1.photo");
		
		reload(); // In order that actions work fine after the above assertImage() usage
		execute("ImageEditor.deleteImage", "newImageProperty=photos.0.photo");
		execute("CRUD.save");
		execute("Mode.list");
		execute("Mode.detailAndFirst");
		assertValueInCollection("photos", 0, "description", "FRONT");
		assertValueInCollection("photos", 1, "description", "BACK");	
		assertNoImage("photos.0.photo");
		assertImage("photos.1.photo");
		
		reload(); // In order that actions work fine after the above assertImage() usage
		setValueInCollection("photos", 1, "description", "");
		execute("CRUD.save");
		execute("Mode.list");
		execute("Mode.detailAndFirst");
		assertValueInCollection("photos", 0, "description", "FRONT");
		assertValueInCollection("photos", 1, "description", "");	
		assertNoImage("photos.0.photo");
		assertImage("photos.1.photo");
		
		reload(); // In order that actions work fine after the above assertImage() usage
		execute("CRUD.delete");
		assertNoErrors();
	}

	
}
