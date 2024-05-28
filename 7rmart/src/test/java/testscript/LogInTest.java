package testscript;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import constants.Constants;
import pages.LogInPage;
import utilities.ExcelUtility;

public class LogInTest extends Base {
	@DataProvider(name="Credentials")
	public Object[][] testData()
	{
		Object[][] input=new Object[3][2];
		input[0][0]="admin";
		input[0][1]="test";
		input[1][0]="admin";
		input[1][1]="demo";
		input[2][0]="admin";
		input[2][1]="admin";
		return input;
	}

@Test(dataProvider="Credentials")
  public void verifyTheUserIsAbleToLoginUsingValidCredentials(String username,String password) throws IOException {
	 
	  //String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  //String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	
  }
@Test(retryAnalyzer=retry.Retry.class,groups={"reggression"}, description = "Verifying that whether the user is able to login using invalid username and password")
  public void verifyTheUserIsAbleToLoginUsingInvalidUsernameameAndValidPassword() throws IOException
  {
	 
		  //String username="demo";
		  //String password="admin";
	  String username=ExcelUtility.getStringData(2, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		  LogInPage loginpage=new LogInPage(driver);
		  loginpage.enterUsernameOnUserNameField(username);
		  loginpage.enterPasswordOnPasswordField(password);
		  loginpage.submitButtonClick();
		 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
		 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
		
	  }
	  
  
  @Test
  public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException 
  {
	  //String username="admin";
	  //String password="demo";
	  String username=ExcelUtility.getStringData(3, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(3, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	
  }
  @Test
  public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword() throws IOException 
  {
	  //String username="demo";
	  //String password="test";
	  String username=ExcelUtility.getStringData(4, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(4, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	
  }
  
  
  
 
 

}
