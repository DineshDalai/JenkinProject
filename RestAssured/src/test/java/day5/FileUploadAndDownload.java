package day5;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

public class FileUploadAndDownload {

	@Test
	public void singleFileUpload() {

		File myfile = new File("D:\\Api\\text1.txt.txt");
		
		given()
		
		.multiPart("file",myfile)
		
		.contentType("multiPart/form-data")
		
		.when()
		.post("http://localhost:8080/uploadFile")
		
		.then()
		.statusCode(200)
		
		.log().all();
		
		
		
	}
	
}
