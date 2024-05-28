package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.PushNotificationsPage;
import utilities.ExcelUtility;

public class PushNotificationsTest extends Base {
	
	@Test
	public void VerifyTheUserIsAbleToEnterDetailsOnPushNotificationInformations() throws IOException {
		  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		  LogInPage loginpage=new LogInPage(driver);
		  loginpage.enterUsernameOnUserNameField(username);
		  loginpage.enterPasswordOnPasswordField(password);
		  loginpage.submitButtonClick();
		 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
		 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
		
		 
		  //String title="Hai";
		  //String description="Hello Test";
		  String title=ExcelUtility.getStringData(1, 0, "PushNotifications");
		  String description=ExcelUtility.getStringData(1, 1, "PushNotifications");
		  PushNotificationsPage pushnotificationspage=new PushNotificationsPage(driver);
		  pushnotificationspage.verifyTheUserIsAbleToClickOnPushNotifications();
		  pushnotificationspage.verifyTheUserIsAbleToEnterTitleOnTitleField(title);
		  pushnotificationspage.verifyTheUserIsAbleToEnterDescriptionOnDescriptionField(description);
		  pushnotificationspage.verifyTheUserIsAbleToClickOnSendButton();
		  boolean isAlertDisplayed=pushnotificationspage.verifyTheAlertMsgIsDisplayed();
		  Assert.assertTrue(isAlertDisplayed, "alert is not displayed");
	  }
 
  
  
  
}
