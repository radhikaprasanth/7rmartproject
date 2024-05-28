package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {

	WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement adminuserslink;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbuttonclick;
	@FindBy(xpath="//input[@name='username']")private WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']")private WebElement passwordfield;
	@FindBy(xpath="//select[@name='user_type']")private WebElement usertypefield;
	@FindBy(xpath="//i[@class='fa fa-save']")private WebElement savefield;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;
	
	public void verifyUserIsAbleToClickOnAdminusers()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",adminuserslink);
		
	}
	public void verifyUserIsAbleToClickOnNewButton()
	{
		newbuttonclick.click();
	}
	
	public void verifyUserIsAbleToEnterUsernameOnUsernameField(String usernametest)
	{
		usernamefield.sendKeys(usernametest);
	}
	
	public void verifyUserIsAbleToEnterPasswordOnPasswordField(String passwordtest)
	{
		passwordfield.sendKeys(passwordtest);
	}
	public void verifyWhtherUserIsAbleToChooseTheUserType(String text)
	{
		Select selects=new Select(usertypefield);
		//selects.selectByIndex(num);
		selects.selectByVisibleText(text);
	}
	
	public void verifyWhetehrTheUserIsAbleToSaveTheDatas()
	{
		savefield.click();
	}
	public boolean isAlertDisplayed()
	{
		return alerttext.isDisplayed();
		
	}
	
	
	
	
	
}
