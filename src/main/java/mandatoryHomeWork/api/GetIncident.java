package mandatoryHomeWork.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GetIncident extends BaseClass {
	
	@Test (dependsOnMethods = "JiraTestcase.CreateIncident.create")
	public void get() {
		Response response = RestAssured.given().contentType("application/json").when()
		.get("/rest/api/2/issue/"+key);
		response.then().statusCode(200);
		
	}

}
