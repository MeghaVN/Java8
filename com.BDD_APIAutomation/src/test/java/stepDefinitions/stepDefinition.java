package stepDefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepDefinition {
	
	RequestSpecification requestSpecification;
	Response response;
	
	
	@Given("Header {string} has value {string}")
	public void header_has_value(String key, String value) {
	  System.out.println("Executing Given..");
	 requestSpecification= RestAssured.given().header(key,value);
	}

	@And("Query parameter {string} has value {string}")
	public void query_parameter_has_value(String key, String value) {
	   requestSpecification.queryParam(key, value);
	}

	@And("Query parameter {string} has value {int}")
	public void query_parameter_has_value(String key, Integer value) {
	  requestSpecification.queryParam(key, value);
	}
	

	@When("{string} request is executed")
	public void request_is_executed(String httpMethod) {
		
		System.out.println("Executing when..");
		switch(httpMethod)
		{
		case "GET":
			response=requestSpecification.when().log().all().get("orgs/mvnorg/repos");
			break;
			
		case "POST":
			response=requestSpecification.when().log().all().post("orgs/mvnorg/repos");
			break;
		}
	    
	}

	@Then("Verify the status code as {int}")
	public void verify_the_status_code_as(Integer statusCode) {
	   System.out.println("Executin Then.....");
	   response.then();//print the response headers and body
	}

	





}
