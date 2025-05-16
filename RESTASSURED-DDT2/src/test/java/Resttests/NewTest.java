package Resttests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import rest.RestDemo;

public class NewTest {
	RestDemo r = new RestDemo();
  @Test
  public void gitdemo() {
	  int a = r.Github_Rest();
	  assertEquals(a,200);
  }
  
  @Test
  public void basic() {
	  int a = r.basic_Auth();
	  assertEquals(a,200);
  }
  
  
}
