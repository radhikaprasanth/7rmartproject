package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LogInPage;

public class AdminUsersTest extends Base{
  @Test
  public void verifyTheUserIsAbleToSaveUsernameAndPasswordOnAdminUsers()
  {
	  String username="admin";
	  String password="admin";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  
	  String usernametest="rover";
	  String passwordtest="rovertest";
	  String text="Staff";
	  AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	  adminuserspage.verifyUserIsAbleToClickOnAdminusers();
	  adminuserspage.verifyUserIsAbleToClickOnNewButton();
	  adminuserspage.verifyUserIsAbleToEnterUsernameOnUsernameField(usernametest);
	  adminuserspage.verifyUserIsAbleToEnterPasswordOnPasswordField(passwordtest);
	  adminuserspage.verifyWhtherUserIsAbleToChooseTheUserType(text);
	  adminuserspage.verifyWhetehrTheUserIsAbleToSaveTheDatas();
	  boolean isAlertDisplayed=adminuserspage.isAlertDisplayed();
	  Assert.assertTrue(isAlertDisplayed,"Alert is not displayed");
	  
	  
  }
}
