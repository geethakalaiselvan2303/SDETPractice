package mandatoryHomeWork.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class CreateIncident extends BaseClass {
	
	@Test
	public void create() {
		Response response = RestAssured.given().contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"TES\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in RA project\",\r\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}")
		.post("/rest/api/2/issue/");
		response.then()
		.statusCode(201);
		key=response.jsonPath().get("key");
		response.then().assertThat().body("key",Matchers.equalTo(key));
		System.out.println(key);
	
	}

}
