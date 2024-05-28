package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
  @Test (retryAnalyzer=retry.Retry.class,groups={"reggression"})
  public void verifyWhetherTheUserIsAbleToAddNews() throws IOException 
  {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LogInPage loginpage=new LogInPage(driver);
	  loginpage.enterUsernameOnUserNameField(username);
	  loginpage.enterPasswordOnPasswordField(password);
	  loginpage.submitButtonClick();
	 boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
	 Assert.assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
	 
	 //String news="Test News Rod";
	 //String editnews="Editing the news";
	 String news=ExcelUtility.getStringData(1, 0, "ManageNews");
	  String editnews=ExcelUtility.getStringData(1, 1, "ManageNews");
	 ManageNewsPage managenewspage=new ManageNewsPage(driver);
	 managenewspage.verifyTheUserIsAbleToClickOnManageNews();
	 managenewspage.verifyTheUserIsAbleToClickOnNewIcon();
	 managenewspage.verifyTheUserIsAbleToEnterNewsOnNewsField(news);
	 managenewspage.verifytheUserIsbleToSaveTheDatas();
	 boolean isAlertDisplay=managenewspage.isAlertDisplayed();
	 Assert.assertTrue(isAlertDisplay,"Alert not displayed");
	 
	// ManageNewsPage managenewspage=new ManageNewsPage(driver);
	 managenewspage.verifyTheUserIsAbleToClickOnManageNews();
	 managenewspage.verifyTheUserIsAbleToClickTheEditIcon();
	 managenewspage.verifyTheUserIsAbleToUpdateTheNews(editnews);
	 managenewspage.verifyTheUserIsAbleToClickOnUpdate();
	 boolean isAlertThere=managenewspage.isAlertDisplayed();
	 Assert.assertTrue(isAlertThere,"Alert is not displayed");
 }


 
  }
	

