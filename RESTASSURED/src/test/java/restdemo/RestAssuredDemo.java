package restdemo;
 
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
 
public class RestAssuredDemo {
	
	public int assert_status() {
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).get("https://automationexercise.com/api/productsList");
		
		int statusCode = res.getStatusCode();
		
		return statusCode;
		
	}
	
	public String assert_statusLine() {
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).get("https://automationexercise.com/api/productsList");
		
		String statusLine = res.getStatusLine();
		
		return statusLine;
	}
	
	public String assert_statusContentType() {
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).get("https://automationexercise.com/api/productsList");
		
		String con = res.getContentType();
		
		return con;
		
	}
	
	@SuppressWarnings("rawtypes")
	public ResponseBody assert_Body() {
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).get("https://automationexercise.com/api/productsList");
		
		ResponseBody r = res.getBody();
		
		return r;
		
	}
	
	public String assert_sessionid() {
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).get("https://automationexercise.com/api/productsList");
		
		String r = res.getSessionId();
		
		return r;
		
	}
	
	public int assert_postRequest() {
		
		RestAssured.baseURI="https://reqres.in";
		
		String endPoint = "/api/users";
		
		String requestbody = "{\"name\":\"morphesus1\",\"job\":\"leader56\"}";
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header("x-api-key","reqres-free-v1").body(requestbody).post(endPoint);
		
		int statusCode = res.getStatusCode();
		
		return statusCode;
		
	}
	
	public String assert_postStatusLine() {
		
		RestAssured.baseURI="https://reqres.in";
		
		String endPoint = "/api/users/2";
		
		String requestbody = "{\"name\":\"morphesus1\",\"job\":\"leader56\"}";
		
//		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header("x-api-key","reqres-free-v1").body(requestbody).post(endPoint);  // post method
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header("x-api-key","reqres-free-v1").body(requestbody).put(endPoint);   //put method 
		
		String reqbody = res.getBody().asString();
		
		return reqbody;
		
	}
	
	public String assert_GitHub() {
		
		Response res = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header("","").get(""); //Provide your header key as BearerToken and value as bearertoken and enter URI
		
		String statusLine = res.getStatusLine();
		
		return statusLine;
		
	}
	
}