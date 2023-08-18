package mandatoryHomeWork.api;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident extends BaseClass {
	
	@Test(dependsOnMethods = "JiraTestcase.CreateIncident.create")
	public void update() {
		Response response = RestAssured.given().contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Geetha Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}")
		.put("/rest/api/2/issue/"+key);
		response.then().statusCode(204);
//		response.then().assertThat().body("key",Matchers.equalTo("Geetha Bug creation Using REST API for testing"));		
	}

}
