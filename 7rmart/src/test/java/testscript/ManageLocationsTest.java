package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageLocationsPage;

public class ManageLocationsTest extends Base {
  @Test
  public void VerifyWhetherTheUserIsAbleToAddLocation()
  {
	  String username="admin";
	  String password="admin";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  
	 
	 String country="United Kingdom";
		// String state="Armagh";
		 String location="Navancentre";
		 int deliverycharges=20;
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
