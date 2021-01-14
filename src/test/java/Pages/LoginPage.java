package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	

	
	@FindBy(id = "exampleInputEmail1")
	private WebElement emailID;
	
	@FindBy(id = "exampleInputPassword")
	private WebElement password;
	
	@FindBy(id = "exampleInputphassphrase")
	private WebElement passcode;
	
	@FindBy(xpath = "//button[@class='submit anchorcreatenew']")
	private WebElement clickonLoginbutton;
	
	public void  enterEmailID(String email) throws InterruptedException
	{
		Thread.sleep(500);
		waitTillTheElementVisible(emailID);
		emailID.sendKeys(email);
		
	}
	
	public void  enterPassword(String pass) throws InterruptedException
	{
		Thread.sleep(500);
		waitTillTheElementVisible(password);
		password.sendKeys(pass);
	}
	
	public void  enterPassCode(String passPhrase) throws InterruptedException
	{
		Thread.sleep(500);
		waitTillTheElementVisible(passcode);
		passcode.sendKeys(passPhrase);
	}
	
	public void  clickOnLoginButton() throws InterruptedException
	{
		Thread.sleep(2000);
		waitTillTheElementVisible(clickonLoginbutton);
		clickonLoginbutton.click();
	}

}
