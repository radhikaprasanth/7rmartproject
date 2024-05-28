package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
  @Test
  public void verifyWhetherTheUserIsAbleToAddDatasInCategory() throws IOException {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	  String category=ExcelUtility.getStringData(1, 0, "ManageCategory");
	 ManageCategory managecategory=new ManageCategory(driver);
	 managecategory.verifyTheUserIsAbleToClickOnCategoryTile();
	 managecategory.verifyTheUserIsAbleToClickOnNewIcon();
	 managecategory.verifyTheUserIsAbleToClickOncategoryfield(category);
	 managecategory.verifyTheUserIsAbleToClickOnDiscount();
	 managecategory.uploadImage();
	 managecategory.verifyTheUserIsAbleToClickOnRadioYes();
	 managecategory.verifyTheUserIsAbleToClickOnSave();
	  
	  
	  
	  
	  
	  
  }
}
