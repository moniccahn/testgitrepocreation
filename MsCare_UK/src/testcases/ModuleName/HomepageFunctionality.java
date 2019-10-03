package testcases.ModuleName;

import org.testng.annotations.Test;

import pageObjects.Homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HomepageFunctionality {
  @BeforeTest
  public void beforeTest() {
	  BeforeAfter.before();
  }

 @Test
  public void f() {
	 Homepage.fromtxtbox().click();
  }
 
   @AfterTest
  public void afterTest() {
	   BeforeAfter.after();
  }

}
