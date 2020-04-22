package restAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class WeatherGET {

	@Test
	public void getWeatherData() {
		
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Chennai")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City", equalToIgnoringCase("chennai"))
			.header("Content-Type", "application/json");
	}
}
