package restAssuredTests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EmployeeIdDELETE {
	@BeforeClass
	public void deleteData() {
		//String empId = "8";
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/8";
		
	}
	
	@Test
	public void deleteEmployeeID(){
		
		//To store the response
		Response response =
		given()
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();
		
		//To convert the response from JSON to string
		String jsonResponse = response.asString();
		
		//Assert
		Assert.assertEquals(jsonResponse.contains("successfully! deleted Records"),true);
	}
}
