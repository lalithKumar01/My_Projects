package restAssure.io.RestAssuredApiAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class Main {
	String baseuri = "https://reqres.in";
	@Test
    public void test1() {
    
    String getresponse = given()
    		.baseUri(baseuri)
    		.queryParam("page","2")
    		.when()
    		.get("api/users")
    		.asString();
    System.out.println(getresponse);
    }
	@Test
	public void test2() {
		String postresponse = given()
				.baseUri(baseuri)
				.contentType("application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}")
				.when()
				.post("api/users")
				.asString();
		System.out.println(postresponse);
	}
}
