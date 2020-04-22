package restAssuredTests;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import restUtils.RestUtils;
public class CustomerPOST {
	
	public static HashMap map = new HashMap();

	@BeforeClass
	public void postData() {
		map.put("FirstName", RestUtils.getFirstname());
		map.put("LastName", RestUtils.getLastname());
		map.put("UserName", RestUtils.getUsername());
		map.put("Password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());
		
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register";
		
	}
	
	@Test
	public void createCustomer() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(201)
			.and()
			.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
			.and()
			.body("Message", equalTo("Operation completed successfully"));
	}
	
	
}
