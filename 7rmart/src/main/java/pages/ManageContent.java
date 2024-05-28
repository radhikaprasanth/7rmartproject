package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageContent {
	WebDriver driver;
	public ManageContent(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	@FindBy(xpath="//p[contains(text(),'Content')]")private WebElement managecontent;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']") private WebElement managecontact;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")private WebElement editbutton;
	@FindBy(xpath="//input[@id='phone']")private WebElement phonenumberfield;
	@FindBy(xpath="//input[@name='email']")private WebElement emailfield;
	@FindBy(xpath="//textarea[@name='address']")private WebElement addressfield;
	@FindBy(xpath="//textarea[@name='del_time']")private WebElement deliverytimefield;
	@FindBy(xpath="//input[@name='del_limit']")private WebElement deliverychargefield;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")private WebElement updatebutton;
	
	public void verifyUserIsAbleToClickOnManageContent()
	{
		managecontent.click();
	}
	public void verifyUserIsAbleToClickOnManageContact()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.javaSriptClick(driver, managecontact);
	}
	public void verifyUserIsAbleToClickOnEdit()
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",editbutton);
		
	}
	public void verifyUserIsAbleToEnterPhoneNumber(String phone)
	{
		phonenumberfield.clear();
		phonenumberfield.sendKeys(phone);
	}
	public void verifyUserIsAbleToEnterEmail(String email)
	{
		emailfield.clear();
		emailfield.sendKeys(email);
	}
	public void verifyUserIsAbleToEnterAddress(String address)
	{
		addressfield.clear();
		addressfield.sendKeys(address);
	}
	public void verifyUserIsAbleToEnterDeliveryTime(String deliverytime)
	{
		deliverytimefield.clear();
		deliverytimefield.sendKeys(deliverytime);
	}
	public void verifyUserIsAbleToEnterDeliveryCharge(String deliverycharge)
	{
		deliverychargefield.clear();
		deliverychargefield.sendKeys(deliverycharge);
	}
	public void verifyUserIsAbleToUpdate()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.javaSriptClick(driver, updatebutton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
