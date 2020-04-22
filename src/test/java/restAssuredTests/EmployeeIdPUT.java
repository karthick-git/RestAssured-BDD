package restAssuredTests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import restUtils.RestUtils;

public class EmployeeIdPUT {

	public static HashMap map = new HashMap();
	String empName = RestUtils.getEmpName();
	String empSalary = RestUtils.getEmpSalary();
	String empAge = RestUtils.getEmpAge();
	//int empId = 20;
	
	@BeforeClass
	public void putData() {
		map.put("name", empName);
		map.put("salary", empSalary);
		map.put("age", empAge);
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/3";
		
	}
	
	@Test
	public void putEmployeeID(){
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.log().all();
	}
}
