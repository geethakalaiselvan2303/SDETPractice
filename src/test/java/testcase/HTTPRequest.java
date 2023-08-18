package testcase;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.hamcrest.Matchers.*;

public class HTTPRequest {
	
	public String key="";
	
	@Test
	void createTicket() 
	{		
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net";
		Response response=RestAssured.given()
			.contentType("application/json")
			.auth().preemptive().basic("feb2023restapi@gmail.com","ATATT3xFfGF0HqLS2OkkQJ5k68KolhpN968I7LfMbbsPezisiOslvSjjhjh-J76OHQCa36-ghdgMPxzI3IjGSXe6zU9UiiMzdC1GsDTzNiTx-FFxsjeEWBygX96bUUSV4jVA81V6CzU14KqQSr-SGSQmU0UhI5I-L5cwGezZQaNFnzXbpphX_cQ=DFD8DB94")
			.body("{\r\n"
					+ "    \"fields\": {\r\n"
					+ "    \"project\":\r\n"
					+ "                {\r\n"
					+ "                    \"key\": \"TES\"\r\n"
					+ "                },\r\n"
					+ "    \"summary\": \"create issue in RA project\",\r\n"
					+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
					+ "    \"issuetype\": {\r\n"
					+ "                    \"name\": \"Bug\"\r\n"
					+ "                }\r\n"
					+ "    }\r\n"
					+ "}\r\n"
					+ "")
		
		.when()
			.post("/rest/api/2/issue/")
		.then()
			.statusCode(201)
			.extract().response();
		
		key=response.jsonPath().get("key");
		response.prettyPrint();
		
	}
	
	@Test(dependsOnMethods = "createTicket")
	void updateTicket() {
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net";
		RestAssured.authentication = RestAssured.preemptive().basic("feb2023restapi@gmail.com","ATATT3xFfGF0HqLS2OkkQJ5k68KolhpN968I7LfMbbsPezisiOslvSjjhjh-J76OHQCa36-ghdgMPxzI3IjGSXe6zU9UiiMzdC1GsDTzNiTx-FFxsjeEWBygX96bUUSV4jVA81V6CzU14KqQSr-SGSQmU0UhI5I-L5cwGezZQaNFnzXbpphX_cQ=DFD8DB94");
		String putEndpoint = "/rest/api/2/issue/" + key;
		RequestSpecification req = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "\r\n"
				+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		Response resPut = req.put(putEndpoint);
		resPut.then().statusCode(204);
		resPut.prettyPrint();

	}

}
