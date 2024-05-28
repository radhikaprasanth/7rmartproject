package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategory {
	WebDriver driver;
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		
			PageFactory.initElements(driver , this);
			
		}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")private WebElement categorytile;
	
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement newbutton;
	@FindBy(xpath="//input[@class='form-control']") private WebElement categoryfield;
	@FindBy(xpath="//li[@id='134-selectable']") private WebElement drag1;
	@FindBy(xpath="//li[@id='134-selection']") private WebElement drag2;
	@FindBy(xpath="//input[@id='main_img']") private WebElement uploadimage;
	@FindBy(xpath="//input[@value='no']") private WebElement radio1;
	@FindBy(xpath="//input[@value='yes'][1]") private WebElement radio;
	@FindBy(xpath="//button[@type='submit']") private WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alerttext;

	public void verifyTheUserIsAbleToClickOnCategoryTile()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",categorytile);	
	}
	public void verifyTheUserIsAbleToClickOnNewIcon()
	{
		newbutton.click();
	}
	public void verifyTheUserIsAbleToClickOncategoryfield(String category)
	{
		categoryfield.sendKeys(category);
	}
	public void verifyTheUserIsAbleToClickOnDiscount()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.singleClick(drag1, driver);
		pageutility.doubleClick(drag1, driver);
		pageutility.dragAndDrop(drag1, drag2, driver);
	}
	public void uploadImage()
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(uploadimage, Constants.CATEGORYIMAGE);
	}
	public void verifyTheUserIsAbleToClickOnRadioNo()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.javaSriptClick(driver, radio);
		
	}
	public void verifyTheUserIsAbleToClickOnRadioYes()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.javaSriptClick(driver, radio1);	
		
	}
	public void verifyTheUserIsAbleToClickOnSave()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",save);	
	}
	public boolean isAlertDisplayed()
	{
		return alerttext.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
}
