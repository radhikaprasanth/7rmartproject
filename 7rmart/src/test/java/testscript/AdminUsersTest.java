package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LogInPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
  @Test
  public void verifyTheUserIsAbleToSaveUsernameAndPasswordOnAdminUsers() throws IOException
  {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  //String usernametest="rover";
	  //String passwordtest="rovertest";
	  //String text="Staff";
	 String usernametest=ExcelUtility.getStringData(1, 0, "AdminUsersPage");
	  String passwordtest=ExcelUtility.getStringData(1, 1, "AdminUsersPage");
	  String text=ExcelUtility.getStringData(1, 2, "AdminUsersPage");
	  //String num=ExcelUtility.getIntegerData(1, 2, "AdminUsersPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	 
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
