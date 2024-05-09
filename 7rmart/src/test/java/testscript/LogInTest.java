package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;



public class LogInTest extends Base {
  @Test
  public void verifyTheUserIsAbleToLoginUsingValidCredentials() {
	  String username="admin";
	  String password="admin";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	
  }
  @Test
  public void verifyTheUserIsAbleToLoginUsingInvalidUsernameameAndValidPassword()
  {
	 
		  String username="demo";
		  String password="admin";
		  LogInPage loginpage=new LogInPage(driver);
		  loginpage.enterUsernameOnUserNameField(username);
		  loginpage.enterPasswordOnPasswordField(password);
		  loginpage.submitButtonClick();
		 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
		 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
		
	  }
	  
  
  @Test
  public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() 
  {
	  String username="admin";
	  String password="demo";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	
  }
  @Test
  public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword() 
  {
	  String username="demo";
	  String password="test";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	
  }
  
  
  
 
 

}
