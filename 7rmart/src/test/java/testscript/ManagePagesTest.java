package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManagePagesPage;
import utilities.ExcelUtility;

public class ManagePagesTest extends Base {
	
	@Test(retryAnalyzer=retry.Retry.class)
  public void verifyWhetherTheUserIsAbleToDeleteAPage() throws IOException 
  {
	  
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	 
	 ManagePagesPage managepagespage=new ManagePagesPage(driver);
	 
	 managepagespage.verifyTheUserIsAbleToClickOnManagePagesTile();
	 managepagespage.verifyTheUserIsAbleToClickOnDeleteIcon();
	 managepagespage.verifyWhetherAlertButtonIsClicked();
	 boolean isAlertDisplayed2=managepagespage.verifyWhetherAlertTextIsDisplayed();
	 Assert.assertTrue(isAlertDisplayed2,"Alert text is not displayed");
	 
	
	 
	 
}

	  
  }

