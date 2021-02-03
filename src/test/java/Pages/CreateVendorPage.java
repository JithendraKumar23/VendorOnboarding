package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Constant.BasePage;
import Constant.BaseTest;
import Generics.ExcelUserData;

public class CreateVendorPage extends BasePage {

	public CreateVendorPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//*[@name='vendorname']")
	private WebElement enterVedorname;
	
	@FindBy(xpath="//*[@name='website']")
	private WebElement enterWEBSITEname;
	
	@FindBy(xpath="//*[@name='vendoremail']")
	private WebElement enterVENDOREMAIL;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement enterVENDORPassword;
	
	@FindBy(xpath="//*[@class='col-sm-4 fileUpload btn-sm table_button_link text-center pullup']")
	private WebElement enterlogo;
	
	@FindBy(xpath="//*[@class='col-sm-4 fileUpload btn-sm table_button_link text-center pullup']")
	private WebElement clickOnUPLOADButtonForLoGo;
	
	@FindBy(id="vendormode")
	private WebElement clickOnVendorMODEDropDown;
	//Use the Select Class
	
	@FindBy(id="premieringenabled")
	private WebElement clickOnPremieringEnabled;
	//Use the Select Class

	@FindBy(id="planinterval")
	private WebElement clickOnVendorPLANINTERVALDropDown;
	//Use the Select Class
	
	@FindBy(id="planmode")
	private WebElement clickOnVendorPLANMODEDropDown;
	//Use the Select Classplanid
	
	@FindBy(id="planid")
	private WebElement clickOnVendorPLANdropDown;
	//Use the Select Class
	
	@FindBy(xpath="//*[@name='accessmode']")
	private WebElement clickOnVendorACCESSMODEDropDown;
	//Use the Select Class
	
	@FindBy(xpath="//*[@name='appname']")
	private WebElement clickOnAPPNAME;
	
	@FindBy(xpath="//*[@name='supportemail']")
	private WebElement clickOnSUPPORTEMAIL;
	
	@FindBy(xpath="//*[@name='streamenabled']")
	private WebElement clickOnSTREAMENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='hdenabled']")
	private WebElement clickOnHDENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='adenabled']")
	private WebElement clickOnADDENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='drmenabled']")
	private WebElement clickOnDRMENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='paymentenabled']")
	private WebElement clickOnPAYMENTEENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='subscriptionenabled']")
	private WebElement clickOnSUBSCRIPTIONENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='eventsenabled']")
	private WebElement clickOnEVENTENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='expiryenabled']")
	private WebElement clickOnEXPIRYENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='contentexpirydaycount']")
	private WebElement clickOnEXPIRYDayCount;
	
	@FindBy(xpath="//*[@name='instituteenabled']")
	private WebElement clickOnINSTUTUTEENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='levelenabled']")
	private WebElement clickOnLEVELENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='bulkenrollenabled']")
	private WebElement clickOnBULKROLLENABLEDDropDown;
	
	@FindBy(xpath="//*[@name='rewardsenabled']")
	private WebElement clickOnRewardsENABLEDDropDown;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]")
	private WebElement tapConddition;
	
	@FindBy(xpath="//div[@class='row']")
	private WebElement tapHalf;
	
	@FindBy(xpath="//button[@class='fileUpload btn-sm table_button_link']")
	private WebElement clickOnCREATEButton;
	
	public void enterVENDORNAME() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterVedorname);
		Thread.sleep(2000);
		enterVedorname.click();
		Thread.sleep(1000);
		String vendorName = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,1,1);
		enterVedorname.sendKeys(vendorName);
	}
	
	public void enterWEBSITE() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterWEBSITEname);
		enterWEBSITEname.click();
		Thread.sleep(1000);
		String vendorWEBSITEname = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,2,1);
		enterWEBSITEname.sendKeys(vendorWEBSITEname);
		System.out.println(vendorWEBSITEname);
	}
	
	public void enterEMAIL() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterVENDOREMAIL);
		enterVENDOREMAIL.click();
		Thread.sleep(1000);
		String vendorEmail = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,3,1);
		enterVENDOREMAIL.sendKeys(vendorEmail);
		System.out.println(vendorEmail);
	}
	
	public void enterPassword() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterVENDORPassword);
		enterVENDORPassword.click();
		Thread.sleep(1000);
		String vendorPassword = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,4,1);
		enterVENDORPassword.sendKeys(vendorPassword);
		System.out.println(vendorPassword);
	}

	public void enterLogo() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(enterlogo);
		enterlogo.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Automation AutoITPath\\onboardingAutomation.exe");
		Thread.sleep(3000);
	}
	
	public void selectTheVendorMODE() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(clickOnVendorMODEDropDown);
		clickOnVendorMODEDropDown.click();
		Thread.sleep(2000);
		
		Select select = new Select(clickOnVendorMODEDropDown);
		String vendorMODE = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,10,1);
		select.selectByVisibleText(vendorMODE);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		
		System.out.println(vendorMODE);
	}
	
	public void selectpremieringEnabled() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(clickOnPremieringEnabled);
		clickOnPremieringEnabled.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnPremieringEnabled);
		String premiere = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,12,1);
		select.selectByVisibleText(premiere);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
	}
	
	public void selectThePLANIntervals() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(clickOnVendorPLANINTERVALDropDown);
		clickOnVendorPLANINTERVALDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnVendorPLANINTERVALDropDown);
		String vendorPlanIntervals = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,7,1);
		select.selectByVisibleText(vendorPlanIntervals);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(vendorPlanIntervals);
	}
	
	public void selectPlan() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(clickOnVendorPLANdropDown);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",clickOnVendorPLANdropDown);
		
		clickOnVendorPLANdropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnVendorPLANdropDown);
		String vendorPlan = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,8,1);
		select.selectByVisibleText(vendorPlan);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(vendorPlan);
	}
	
	public void selectPlanMODE() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnVendorPLANMODEDropDown);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",clickOnVendorPLANMODEDropDown);
		

		clickOnVendorPLANMODEDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnVendorPLANMODEDropDown);
		String vendorPlanMode = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,9,1);
		
		select.selectByVisibleText(vendorPlanMode);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(vendorPlanMode);
	}
	
	public void selectTheAPPAccessMode() throws InterruptedException, IOException 
	{

		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnVendorACCESSMODEDropDown);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",clickOnVendorACCESSMODEDropDown);
		
		clickOnVendorACCESSMODEDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnVendorACCESSMODEDropDown);
		String vendorAPPAccessMode = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,11,1);
		select.selectByVisibleText(vendorAPPAccessMode);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(vendorAPPAccessMode);
		
	}
	
	public void enterTheAppName() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnAPPNAME);
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();",clickOnAPPNAME);
		
		String appNAME = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,5,1);
		clickOnAPPNAME.sendKeys(appNAME);
	}
	
	public void enterTheSupportEmailAdress() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnSUPPORTEMAIL);
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView();",clickOnSUPPORTEMAIL);
		
		String support = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,6,1);
		clickOnSUPPORTEMAIL.sendKeys(support);
	}
	
	public void selectStreamEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnSTREAMENABLEDDropDown);
		JavascriptExecutor js6 = (JavascriptExecutor)driver;
		js6.executeScript("arguments[0].scrollIntoView();",clickOnSTREAMENABLEDDropDown);
		
		clickOnSTREAMENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnSTREAMENABLEDDropDown);
		String stream = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,13,1);
		select.selectByVisibleText(stream);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(stream);	
	}
	
	public void selectHDEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnHDENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnHDENABLEDDropDown);
		
		clickOnHDENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnHDENABLEDDropDown);
		String HD = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,14,1);
		select.selectByVisibleText(HD);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(HD);	
	}
	
	public void selectADDEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnADDENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnADDENABLEDDropDown);
		
		clickOnADDENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnADDENABLEDDropDown);
		String ADD = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,24,1);
		select.selectByVisibleText(ADD);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(ADD);	
	}
	
	public void selectDRMEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnDRMENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnDRMENABLEDDropDown);
		
		clickOnDRMENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnDRMENABLEDDropDown);
		String DRM = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,15,1);
		select.selectByVisibleText(DRM);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(DRM);	
	}
	
	public void selectPaymentEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnPAYMENTEENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnPAYMENTEENABLEDDropDown);
		
		clickOnPAYMENTEENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnPAYMENTEENABLEDDropDown);
		String Payment = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,16,1);
		select.selectByVisibleText(Payment);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(Payment);	
	}
	
	public void selectSubscriptionEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnSUBSCRIPTIONENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnSUBSCRIPTIONENABLEDDropDown);
		
		clickOnSUBSCRIPTIONENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnSUBSCRIPTIONENABLEDDropDown);
		String subscription = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,17,1);
		select.selectByVisibleText(subscription);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(subscription);	
	}
	
	public void selectEventEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnEVENTENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnEVENTENABLEDDropDown);
		
		clickOnEVENTENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnEVENTENABLEDDropDown);
		String event = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,18,1);
		select.selectByVisibleText(event);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(event);	
	}
	
	public void selectExpiryEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnEXPIRYENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnEXPIRYENABLEDDropDown);
		
		clickOnEXPIRYENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnEXPIRYENABLEDDropDown);
		String expiry = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,19,1);
		select.selectByVisibleText(expiry);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(expiry);	
	}
	
	public void selectExpiryDayCount() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnEXPIRYDayCount);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnEXPIRYDayCount);
		
		clickOnEXPIRYDayCount.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnEXPIRYDayCount);
		String count = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,20,1);
		select.selectByVisibleText(count);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(count);	
	}
	
	public void selectInstituteEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnINSTUTUTEENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnINSTUTUTEENABLEDDropDown);
		
		clickOnINSTUTUTEENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnINSTUTUTEENABLEDDropDown);
		String Institute = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,21,1);
		select.selectByVisibleText(Institute);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(Institute);	
	}
	
	public void selectLevelEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnLEVELENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnLEVELENABLEDDropDown);
		
		clickOnLEVELENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnLEVELENABLEDDropDown);
		String levle = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,22,1);
		select.selectByVisibleText(levle);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(levle);	
	}
	
	public void selectBulkEntrollEnabledEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnBULKROLLENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnBULKROLLENABLEDDropDown);
		
		clickOnBULKROLLENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnBULKROLLENABLEDDropDown);
		String bulk = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,23,1);
		select.selectByVisibleText(bulk);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(bulk);
	}
	
	public void selectRewardsEnabledEnabled() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnRewardsENABLEDDropDown);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnRewardsENABLEDDropDown);
		
		clickOnRewardsENABLEDDropDown.click();
		Thread.sleep(1000);
		
		Select select = new Select(clickOnRewardsENABLEDDropDown);
		String rewards = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,25,1);
		select.selectByVisibleText(rewards);
		Thread.sleep(1000);
		//tapConddition.click();
		tapHalf.click();
		System.out.println(rewards);
	}
	
	public void clickOnCREATEButton() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(clickOnCREATEButton);
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",clickOnCREATEButton);
		
		clickOnCREATEButton.click();
	}
	
	
}
