package day5;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

public class FileUploadAndDownload {

	
	@Test(priority=1)
	public void testSingleFileUpload() {
		
		File f = new File("D:\\Api\\text1.txt.txt");
		
		given()
		.multiPart("file",f)
		.contentType("multipart/form-data")
		
		.when()
		.post("http://localhost:8080/uploadFile")
		
		.then()
		.statusCode(200)
		.body("fileName", equalTo("text1.txt.txt"))
		.log().all();
	}
	
	@Test(priority=2)
	public void testMultipleFiles() {
		
		File f1 = new File("D:\\Api\\text1.txt.txt");
		File f2 = new File("D:\\Api\\text2.txt.txt");
		
		given()
		.multiPart("files",f1)
		.multiPart("files",f2)
		.contentType("multipart/form-data")
		
		.when()
		.post("http://localhost:8080/uploadMultipleFiles")
		
		.then()
		.statusCode(200)
		.body("[0].fileName", equalTo("text1.txt.txt"))
		.body("[1].fileName", equalTo("text2.txt.txt"))
		.log().all();
	}
	
	@Test(priority=3)
	public void testFileDownLoad() {
		
		given()
		
		.when()
		.get("http://localhost:8080/downloadFile/text1.txt.txt")
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
