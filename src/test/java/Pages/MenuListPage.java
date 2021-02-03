package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class MenuListPage extends BasePage{
	
	public MenuListPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Vendors']")
	private WebElement selectVENODRSOption;
	
	@FindBy(xpath = "//*[text()='Plans']")
	private WebElement selectPLANSOption;
	
	public void clicONVendorMenu() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(selectVENODRSOption);
		selectVENODRSOption.click();
	}
	
	public void clicONPLANSMenu() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(selectPLANSOption);
		selectPLANSOption.click();
	}


}
