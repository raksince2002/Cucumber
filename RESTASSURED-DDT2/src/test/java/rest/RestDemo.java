package rest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestDemo {
	
//	public int post_demo() throws IOException {
//		
//		String path="./TestData/testbody.properties";
//		FileReader fr = new FileReader(path);
//		Properties p = new Properties();
//		p.load(fr);
//		
//		RestAssured.baseURI="https://reqres.in";
//		
//		String endPoint = "/api/users/2";
//		
//		String reqbody=p.getProperty("bd1");
//		Response res = RestAssured.given().relaxedHTTPSValidation().header("x-api-key","reqres-free-v1").body(reqbody).put(endPoint);
//		
//		return res.getStatusCode();
//		
//	}
	
	public void Github_Rest() { // change return type to int after uncommenting the code below
		
//		RestAssured.baseURI="https://api.github.com";
//		String endPoint="/users/raksince2002";
		
//		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header("","").get(endPoint); //Provide your header key as BearerToken and value as bearertoken and URI
//		
//		return res.getStatusCode();
		
		
		
	}
	
	public int basic_Auth() {
		RestAssured.baseURI="https://postman-echo.com";
		String endpoint = "/basic-auth";
		String username="postman",password="password";
		String basicAuth=Base64.getEncoder().encodeToString((username+":"+password).getBytes());
		Response res = RestAssured.given().relaxedHTTPSValidation().header("BasicAuth",basicAuth).get(endpoint);
		return (res.getStatusCode());
	}
	
	public void oauth1() {
		
	}
	
	
	

}
