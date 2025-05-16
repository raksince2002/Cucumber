package restdemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.ResponseBody;

public class RestTest {
	
	RestAssuredDemo r = new RestAssuredDemo();
	
  @Test(priority=1)
  public void status_code() {
	  int i = r.assert_status();
	  assertEquals(i,200);
	  System.out.println("200:Success");
  }
  
  @Test(priority=2)
  public void status_Line() {
	  String j = r.assert_statusLine();
	  assertEquals(j,"HTTP/1.1 200 OK");
	  System.out.println(j);
  }
  
  @Test(priority=3)
  public void status_body() {
	  @SuppressWarnings("rawtypes")
	  ResponseBody j = r.assert_Body();
	  String s = j.toString();
	  assertEquals(s,"io.restassured.internal.RestAssuredResponseImpl@136965e3");  //Mostly fails as Responsebody is dynamic 
	  System.out.println(j);
  }
  
  @Test(priority=4)
  public void status_content() {
	  String j = r.assert_statusContentType();
	  assertEquals(j,"text/html; charset=utf-8");
	  System.out.println(j);
  }
  
  @Test(priority=5)
  public void session_id() {
	  String j = r.assert_sessionid();
	  assertEquals(j,null);
	  System.out.println(j);
  }
  
  @Test(priority=6)
  public void post_request() {
	  int j = r.assert_postRequest();
	  assertEquals(j,201);
	  System.out.println("201:Post Success");
  }
  
  @Test(priority=7)
  public void post_statusLine() {
	  String j = r.assert_postStatusLine();
//	  assertEquals(j,"HTTP/1.1 200 OK");
	  System.out.println(j);
  }
  
  @Test(priority=8)
  public void GitHub() {
	  String j = r.assert_GitHub();
	  assertEquals(j,"HTTP/1.1 201 Created");
	  System.out.println(j);
  }
  
}
