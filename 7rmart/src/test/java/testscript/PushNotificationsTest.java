package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.PushNotificationsPage;

public class PushNotificationsTest extends Base {
	
	@Test
	public void VerifyTheUserIsAbleToEnterDetailsOnPushNotificationInformations() {
		  String username="admin";
		  String password="admin";
		  LogInPage loginpage=new LogInPage(driver);
		  loginpage.enterUsernameOnUserNameField(username);
		  loginpage.enterPasswordOnPasswordField(password);
		  loginpage.submitButtonClick();
		 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
		 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
		
		 
		  String title="Hai";
		  String description="Hello Test";
		  PushNotificationsPage pushnotificationspage=new PushNotificationsPage(driver);
		  pushnotificationspage.verifyTheUserIsAbleToClickOnPushNotifications();
		  pushnotificationspage.verifyTheUserIsAbleToEnterTitleOnTitleField(title);
		  pushnotificationspage.verifyTheUserIsAbleToEnterDescriptionOnDescriptionField(description);
		  pushnotificationspage.verifyTheUserIsAbleToClickOnSendButton();
		  boolean isAlertDisplayed=pushnotificationspage.verifyTheAlertMsgIsDisplayed();
		  Assert.assertTrue(isAlertDisplayed, "alert is not displayed");
	  }
 
  
  
  
}
