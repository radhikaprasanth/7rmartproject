package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base{
  @Test
  public void verifyingDeliveryboyDetailsFoundInListDeliveryBoypage() throws IOException 
  {
	  //String username="admin";
	  //String password="admin";
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();  
	  
	  //String name="test";
	  //String str="test";
	  String name=ExcelUtility.getStringData(1, 0, "ManageDeliveryBoy");
	  String str=ExcelUtility.getStringData(1, 1, "ManageDeliveryBoy");
	  ManageDeliveryBoyPage managedeliverboypage=new ManageDeliveryBoyPage(driver);
	  managedeliverboypage.verifyTheUserIsAbleToClickmanageDeliveryboyTile();
	  managedeliverboypage.verifyTheUserIsAbleToClickTheSearchButton();
	  managedeliverboypage.verifyTheUserIsAbleToEnterNameOnNameField(name);
	  managedeliverboypage.verifyTheUserIsAbleToClickTheSearchButtonUnderTheFields();
	  boolean isTableDisplayed=managedeliverboypage.verifyTheTableContainingTheDeliveryBoyNameDetailsAreDisplayed();
	  Assert.assertTrue(isTableDisplayed,"Table is not displayed");
	 boolean isTestDataDisplayed=managedeliverboypage.verifyDataContainingTest(str);
	 Assert.assertTrue(isTestDataDisplayed,"test data not displayed");
	  
	  
  
  }
 
 
 
  
}
