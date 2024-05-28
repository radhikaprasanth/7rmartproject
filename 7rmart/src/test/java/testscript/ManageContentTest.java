package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageContent;
import utilities.ExcelUtility;

public class ManageContentTest extends Base {
  @Test
  public void verifyWhetherTheUserIsAbleToUpdateTheContactDetails() throws IOException {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  String phone=ExcelUtility.getIntegerData(1, 0, "ManageContent");
	  String email=ExcelUtility.getStringData(1, 1, "ManageContent");
	  String address=ExcelUtility.getStringData(1, 2, "ManageContent");
	  String deliverytime=ExcelUtility.getIntegerData(1, 3, "ManageContent");
	  String deliverycharge=ExcelUtility.getIntegerData(1, 4, "ManageContent");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  ManageContent managecontent=new ManageContent(driver);
	  managecontent.verifyUserIsAbleToClickOnManageContent();
	  managecontent.verifyUserIsAbleToClickOnManageContact();
	  managecontent.verifyUserIsAbleToClickOnEdit();
	  managecontent.verifyUserIsAbleToEnterPhoneNumber(phone);
	  managecontent.verifyUserIsAbleToEnterEmail(email);
	  managecontent.verifyUserIsAbleToEnterAddress(address);
	  managecontent.verifyUserIsAbleToEnterDeliveryTime(deliverytime);
	  managecontent.verifyUserIsAbleToEnterDeliveryCharge(deliverycharge);
	  
	  
	  
	  
	  
	  
  }
}
