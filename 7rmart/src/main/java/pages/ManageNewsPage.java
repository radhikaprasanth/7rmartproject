package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	@FindBy(xpath="//p[text()='Manage News']")private WebElement managenewspagelink;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbuttonclick;
	@FindBy(xpath="//textarea[@name='news']")private WebElement enternewsfield;
	@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss'][1]")private WebElement editnewsicon;
	//@FindBy(xpath="//textarea[@placeholder='Enter the news']")private WebElement editnewsfield;
	@FindBy(xpath="//button[@name='update']")private WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttextnews;
	
	public void verifyTheUserIsAbleToClickOnManageNews()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",managenewspagelink);
		managenewspagelink.click();
	}
	public void verifyTheUserIsAbleToClickOnNewIcon()
	{
		newbuttonclick.click();
	}
	public void verifyTheUserIsAbleToEnterNewsOnNewsField(String news)
	{
		enternewsfield.sendKeys(news);
	}
	public void verifytheUserIsbleToSaveTheDatas()
	{
		savebutton.click();
	}
	public boolean isAlertDisplayed()
	{
		return alerttext.isDisplayed();
	}
	public void verifyTheUserIsAbleToClickTheEditIcon()
	{
		editnewsicon.click();
	
	}
	public void verifyTheUserIsAbleToUpdateTheNews(String editnews)
	{
		
		enternewsfield.sendKeys(editnews);
		
	}
	
	public void verifyTheUserIsAbleToClickOnUpdate() 
	{
		
		updatebutton.click();
	}
	
	public boolean isAlertDisplayedOnNews()
	{
		return alerttext.isDisplayed();
	}
	
	
	
	
	
	
	
}
