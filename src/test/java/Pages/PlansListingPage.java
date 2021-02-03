package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class PlansListingPage extends BasePage{
	
	public PlansListingPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//button[@class='create_btn fileUpload btn-sm table_button_link' and text()='CREATE NEW']")
	private WebElement clickONCREATEBUTTON;
	
	@FindBy(xpath = "//button[@class='btn-sm anchoredit table_button_link']")
	private WebElement clickONEDITButton;
	
	public void clicONCREATEButtonforPlans() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(clickONCREATEBUTTON);
		clickONCREATEBUTTON.click();
	}

	public void clickEditButton() throws InterruptedException 
	{
		Thread.sleep(1000);
		JavascriptExecutor js8 = (JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",clickONEDITButton);
		waitTillTheElementVisible(clickONEDITButton);
		Thread.sleep(3000);
		clickONEDITButton.click();
	}

}
