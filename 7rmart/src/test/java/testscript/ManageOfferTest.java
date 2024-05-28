package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageOfferPage;
import utilities.ExcelUtility;

public class ManageOfferTest extends Base{
  @Test
  public void verifyTheUserISAbleToAddOffers() throws IOException, AWTException
  {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	 String offercode=ExcelUtility.getStringData(1, 0, "ManageOffer");
	 String percentage=ExcelUtility.getIntegerData(1, 1, "ManageOffer");
	 String amount=ExcelUtility.getIntegerData(1, 2, "ManageOffer");
	 String description=ExcelUtility.getStringData(1, 3, "ManageOffer");
	 
	 ManageOfferPage manageofferpage=new ManageOfferPage(driver);
	 manageofferpage.verifyTheUserIsAbleToClickOnManageOffer();
	 manageofferpage.verifyTheUserIsAbleToClickOnNewIcon();
	 manageofferpage.verifyTheUserIsAbleToEnterOfferCode(offercode);
	 manageofferpage.verifyTheUserIsAbleToClickOnFirstOrderUser();
	 manageofferpage.verifyTheUserIsAbleToEnterPercentage(percentage);
	 manageofferpage.verifyTheUserIsAbleToEnterAmount(amount);
	 manageofferpage.verifyTheUserIsAbleToEnterDescription(description);
	 manageofferpage.uploadImage();
	 manageofferpage.verifyTheUserIsAbleToSaveTheDatas();
	 boolean isAlertDisplayed=manageofferpage.isAlertDisplayed();
	 Assert.assertTrue(isAlertDisplayed,"Alert not displayed");
	 //manageofferpage.verifyTheUserIsAbleToClickOnHomeButton();
	 //manageofferpage.verifyTheUserIsAbleToClickOnManageOffer();
	 //manageofferpage.verifyTheUserIsAbleToClickOnDeleteIcon();
	 //boolean isAlertAfterDeleteIsDisplayed=manageofferpage.verifyWhetherAlertTextIsDisplayed();
	 //Assert.assertTrue(isAlertAfterDeleteIsDisplayed,"Alert after delete not displayed");
			}
  }
