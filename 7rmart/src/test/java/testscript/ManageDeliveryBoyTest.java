package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageDeliveryBoyPage;

public class ManageDeliveryBoyTest extends Base{
  @Test
  public void verifyingDeliveryboyDetailsFoundInListDeliveryBoypage() 
  {
	  String username="admin";
	  String password="admin";
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();  
	  
	  String name="test";
	  String str="test";
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
