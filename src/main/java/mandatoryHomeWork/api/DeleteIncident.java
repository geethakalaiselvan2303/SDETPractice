package mandatoryHomeWork.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass {

	
	@Test(dependsOnMethods = "JiraTestcase.UpdateIncident.update")
	public void delete() {
		Response response = RestAssured.given().contentType("application/json")
		.when()
		.delete("/rest/api/2/issue/"+key);
		response.then().statusCode(204);
		
		
	}
}
