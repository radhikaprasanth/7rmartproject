package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUploadUtility;
import constants.Constants;

public class ManageOfferPage {
	WebDriver driver;
	public ManageOfferPage(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode']")private WebElement manageoffertile;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newicon;
	@FindBy(xpath="//input[@name='offer_code']")private WebElement offercodeicon;
	@FindBy(xpath="//input[@value='yes']")private WebElement radioyes;
	@FindBy(xpath="//input[@id='offer_per']")private WebElement percentagefield;
	@FindBy(xpath="//input[@id='offer_price']")private WebElement amountfield;
	@FindBy(xpath="//div[@class='note-editable card-block']")private WebElement descriptionfield;
	@FindBy(xpath="//input[@type='file']")private WebElement fileupload;
	@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement homepage;
	@FindBy(xpath="//i[@class='fas fa-trash-alt'][1]")private WebElement deletebutton;
	
	public void verifyTheUserIsAbleToClickOnManageOffer()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",manageoffertile);
		manageoffertile.click();
	}
	public void verifyTheUserIsAbleToClickOnNewIcon()
	{
		newicon.click();
	}
	public void verifyTheUserIsAbleToEnterOfferCode(String offercode)
	{
		offercodeicon.sendKeys(offercode);
	}
	
	public void verifyTheUserIsAbleToClickOnFirstOrderUser()
	{
		radioyes.click();
		System.out.println(radioyes.isSelected());
	}
	public void verifyTheUserIsAbleToEnterPercentage(String percentage)
	{
		
		 percentagefield.sendKeys(percentage);
	}
	public void verifyTheUserIsAbleToEnterAmount(String amount)
	{
		
		amountfield.sendKeys(amount);
	}
	
	public void verifyTheUserIsAbleToEnterDescription(String description)
	{
		descriptionfield.sendKeys(description);
	}
	public void uploadImage() throws AWTException
	{
		fileupload.click();
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.fileuploadUsingRobotClass(fileupload, Constants.MANAGEOFFERCODEIMAGE);
		
	}
	public void verifyTheUserIsAbleToSaveTheDatas()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",savebutton);
	}
	public boolean isAlertDisplayed()
	{
		return alerttext.isDisplayed();
	}
	
	public void verifyTheUserIsAbleToClickOnHomeButton()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",homepage);
	}
	public void verifyTheUserIsAbleToClickOnDeleteIcon()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",deletebutton);
		//deletebutton.click();
		
		
		driver.switchTo().alert().accept();
	}
	
	
	public boolean verifyWhetherAlertTextIsDisplayed()
	{
		return alerttext.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
