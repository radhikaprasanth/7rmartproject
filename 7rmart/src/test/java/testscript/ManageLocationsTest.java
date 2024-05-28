package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageLocationsPage;
import utilities.ExcelUtility;

public class ManageLocationsTest extends Base {
  @Test
  public void VerifyWhetherTheUserIsAbleToAddLocation() throws IOException
  {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  
	 
	 //String country="United Kingdom";
	 //String location="Navancentre";
	 //int deliverycharges=20;
	 
	 String country=ExcelUtility.getStringData(1, 0, "ManageLocation");
	 String num=ExcelUtility.getIntegerData(1, 1, "ManageLocation");
	 String location=ExcelUtility.getStringData(1, 2, "ManageLocation");
	 String deliverycharges=ExcelUtility.getIntegerData(1, 3, "ManageLocation");
	 
	 ManageLocationsPage managelocationspage=new ManageLocationsPage(driver);
	 managelocationspage.verifyUserIsAbleToClickOnManageLocation();
	 managelocationspage.verifyUserIsAbleToClickOnNewButton();
	 managelocationspage.verifyUserIsAbleToSelectCountry(country);
	 managelocationspage.verifyUserIsAbleToSelectState();
	 managelocationspage.verifyUserIsAbleToEnterLocation(location);
	 managelocationspage.verifyUserIsAbleToEnterDeliveryCharge(deliverycharges);
	 managelocationspage.verifyUserIsAbleToSaveTheDatas();
	 boolean isAlertDisplayed=managelocationspage.isAlertDisplayed();
	 Assert.assertTrue(isAlertDisplayed,"Alert is not displayed");
	 
	
	  
	  
	  
	  
	  
  }
}
