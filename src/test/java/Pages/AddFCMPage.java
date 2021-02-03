package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;
import Generics.ExcelUserData;

public class AddFCMPage extends BasePage{

	public AddFCMPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id = "fcmcredentials")
	private WebElement enterfcmCredentials;
	
	@FindBy(id = "stripecredentials")
	private WebElement enterSTRIPECredentials;
	
	@FindBy(id = "fortumocredentials")
	private WebElement enterFortumoCredentials;
	
	@FindBy(id = "paypalcredentials")
	private WebElement enterPayPalCredentials;
	
	@FindBy(id = "paytmcredentials")
	private WebElement enterPayTmCredentials;
	
	@FindBy(id = "braintreecredentials")
	private WebElement enterBraintreeCredentials;
	
	@FindBy(id = "inappcredentials")
	private WebElement enterInAppCredentials;
	
	@FindBy(id = "firetvcredentials")
	private WebElement enterFireTvCredentials;
	
	@FindBy(id = "submit_button")
	private WebElement clickOnSUBMITbutton;
	
	private static String Excelsheetname = "ADDFCM";
	public static int row = 0;
	public static int col = 0;
	
	public void enterFCM_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterfcmCredentials);
		Thread.sleep(2000);
		enterfcmCredentials.click();
		Thread.sleep(1000);
		String fcmCredentials = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,1,1);
		enterfcmCredentials.sendKeys(fcmCredentials);
	}
	
	public void enterSTRIPE_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterSTRIPECredentials);
		Thread.sleep(2000);
		enterSTRIPECredentials.click();
		Thread.sleep(1000);
		String stripe = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,2,1);
		enterSTRIPECredentials.sendKeys(stripe);
	}
	
	public void enterFORTUMO_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterFortumoCredentials);
		Thread.sleep(2000);
		enterFortumoCredentials.click();
		Thread.sleep(1000);
		String fortumo = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,3,1);
		enterFortumoCredentials.sendKeys(fortumo);
	}
	
	public void enterPayPal_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterPayPalCredentials);
		Thread.sleep(2000);
		enterPayPalCredentials.click();
		Thread.sleep(1000);
		String paypal = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,4,1);
		enterPayPalCredentials.sendKeys(paypal);
	}
	
	public void enterPayTm_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterPayTmCredentials);
		Thread.sleep(2000);
		enterPayTmCredentials.click();
		Thread.sleep(1000);
		String paytm = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,5,1);
		enterPayTmCredentials.sendKeys(paytm);
	}
	
	public void enterBrainTree_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterBraintreeCredentials);
		Thread.sleep(2000);
		enterBraintreeCredentials.click();
		Thread.sleep(1000);
		String braintree = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,6,1);
		enterBraintreeCredentials.sendKeys(braintree);
	}
	
	public void enterInAPP_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterInAppCredentials);
		Thread.sleep(2000);
		JavascriptExecutor js8 = (JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",enterInAppCredentials);
		Thread.sleep(1000);
		enterInAppCredentials.click();
		Thread.sleep(1000);
		String inApp = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,7,1);
		enterInAppCredentials.sendKeys(inApp);
	}
	
	public void enterFireTv_Credentials() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterFireTvCredentials);
		Thread.sleep(2000);
		JavascriptExecutor js9 = (JavascriptExecutor)driver;
		js9.executeScript("arguments[0].scrollIntoView();",enterFireTvCredentials);
		Thread.sleep(1000);
		enterFireTvCredentials.click();
		Thread.sleep(1000);
		String firetv = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,8,1);
		enterFireTvCredentials.sendKeys(firetv);
	}
	
	
	public void clickOnSaveButton() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(clickOnSUBMITbutton);
		JavascriptExecutor js10 = (JavascriptExecutor)driver;
		js10.executeScript("arguments[0].scrollIntoView();",enterFireTvCredentials);
		Thread.sleep(2000);
		clickOnSUBMITbutton.click();
	}
	
	
	
	
	
	
	

}
