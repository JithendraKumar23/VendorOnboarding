package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class Homepage extends BasePage{

	public Homepage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//*[@id='Combined-Shape4']")
	private WebElement clickONMenu;
	
	public void clicONMenuButton() throws InterruptedException 
	{
		Thread.sleep(10000);
		waitTillTheElementVisible(clickONMenu);
		clickONMenu.click();
	}

}
