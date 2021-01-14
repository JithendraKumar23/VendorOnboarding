package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class VendorListPage extends BasePage{

	public VendorListPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//button[@class='create_btn fileUpload btn-sm table_button_link' and text()='CREATE NEW']")
	private WebElement clickONCREATEBUTTON;
	
	public void clicONCREATEButton() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(clickONCREATEBUTTON);
		clickONCREATEBUTTON.click();
	}

}
