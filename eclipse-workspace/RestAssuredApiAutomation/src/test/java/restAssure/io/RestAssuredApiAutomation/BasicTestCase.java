package restAssure.io.RestAssuredApiAutomation;



import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


import java.io.UnsupportedEncodingException;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.*;
import io.restassured.response.*;
import io.restassured.specification.RequestSpecification;



public class BasicTestCase {
	
	@Test
	public void test01() throws UnsupportedEncodingException {
		String username = "Sarah";
		String password = "Passw0rd";
	String	baseURI= "https://ft.23x.feiran.com.my/3dpassport/login";
		Response getResponse= 
		given().
			    relaxedHTTPSValidation()
			    .header("Connection", "Keep-Alive")
				.queryParam("action", "get_auth_params").
		when().
			get(baseURI);
//	   then().
//		statusCode(200).extract().path("lt","lt");
		//String sessionID=getResponse.andReturn().sessionId();
		String ltToken = getResponse.jsonPath().getString("lt");
		System.out.println(ltToken);
		//System.out.println(sessionID);
		String cookieValue = getResponse.getCookie("JSESSIONID");
		String castgcCookie = getResponse.getCookie("afs");
		System.out.println(castgcCookie);
				System.out.println(cookieValue);
		 String requestBodysam = "lt=" + ltToken + "&username=" + username + "&password=" + password;
	        System.out.println("Request Body: " + requestBodysam);
		
	        String requestBody = String.format("lt=%s&username=%s&password=%s",
                    ltToken, username, password);
	        String request = RestAssured.given().baseUri(baseURI) .log().all()
	        				.contentType("application/x-www-form-urlencoded; charset=UTF-8")
	        				.body(requestBody)
         
    .when()
        .post(baseURI)
    .then()
        .statusCode(200)
        .extract()
       .asString();
		System.out.println("Response ="+ request);
		
		 
		
		
	}
	
}
