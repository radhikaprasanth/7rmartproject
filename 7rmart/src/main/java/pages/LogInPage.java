package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver driver;
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;
	   
	@FindBy(xpath="//input[@placeholder='Password']")private  WebElement passwordfield;
	  
	@FindBy(xpath="//button[@type='submit']")private  WebElement signinfield;
	@FindBy(xpath="//button[@data-dismiss='alert']")private  WebElement alert;
	@FindBy(xpath="//p[text()='Dashboard']")private  WebElement dashboard;
	
		  public void enterUsernameOnUserNameField(String username) 
	  {
		  usernamefield.sendKeys(username);
	  }
	  public void enterPasswordOnPasswordField(String password) {
		  passwordfield.sendKeys(password);
	  }
	  public void submitButtonClick()
	  {
		  signinfield.click();
	  }
	  public boolean alertDisplay()
	  {
		  return alert.isDisplayed();
	  }
	  public boolean isDashBoardLoaded()
	  {
		  return dashboard.isDisplayed();
	  }
}
