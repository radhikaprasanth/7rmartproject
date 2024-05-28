package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageMobileSliderPage;
import utilities.ExcelUtility;

public class ManageMobileSliderTest extends Base {
  @Test
  public void VerifyWhetherTheUserIsAbleToAddANewitemOnMobileslider() throws IOException 
  {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	 
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  
	 //String category="Apple";
	 String category=ExcelUtility.getStringData(1, 0, "MobileSlider");
	 ManageMobileSliderPage manademobilesliderpage=new ManageMobileSliderPage(driver);
	 manademobilesliderpage.verifyTheUserIsAbleToClickOnMobilesliderTile();
	 manademobilesliderpage.verifyTheUserIsAbleToClickOnNewIcon();
	 manademobilesliderpage.verifyTheUserIsAbleToSelectTheCategory(category);
	 manademobilesliderpage.verifyTheUserIsAbleToSaveTheItem();
	 boolean isAlertDisplayed=manademobilesliderpage.isAlertDisplayed();
	 Assert.assertTrue(isAlertDisplayed,"Alert not displayed");
	 manademobilesliderpage.verifyTheUserIsAbleToClickOnMobilesliderTile();
	 manademobilesliderpage.verifyTheUserIsAbleToClickOnDeleteIcon();
	 boolean isDeleteAlertDisplayed=manademobilesliderpage.isAlertDisplayedAfterDelete();
	 Assert.assertTrue(isDeleteAlertDisplayed,"Delete alert not displayed");
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
