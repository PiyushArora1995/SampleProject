package APITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApi {
	 
	    @Test
	    void getUserDetailsTest() {
	    	 String someRandomText = "asdhasjdhasdhkj";
	        RestAssured.baseURI = "sample url";
	 
	        RequestSpecification httpRequest = RestAssured.given();
	 
	        Response response = httpRequest.request(Method.GET, "2");
	 
	        int statusCode = response.getStatusCode();
	        Assert.assertEquals(statusCode, 200);
			Assert.assertEquals(response.getBody().asString(), someRandomText);
	    }


}
