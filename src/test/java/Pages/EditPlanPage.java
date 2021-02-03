package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Constant.BasePage;
import Constant.BaseTest;
import Generics.ExcelUserData;

public class EditPlanPage extends BasePage{

		public EditPlanPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(BaseTest.driver, this);
		}
		
		@FindBy(xpath ="//*[@name='planname']")
		private WebElement enterPlanName;

		@FindBy(id ="plantype")
		private WebElement enterPlanType;
		
		@FindBy(id ="monthlyprice")
		private WebElement monthlyPlanPrice;
		
		@FindBy(id ="monthlydiscountedprice")
		private WebElement monthlyDiscountedPlanPrice;
		
		@FindBy(id ="yearlyprice")
		private WebElement yearlyPlanPrice;
		
		@FindBy(id ="yearlydiscountedprice")
		private WebElement yearlyDiscountedPlanPrice;
		
		@FindBy(xpath="//*[@placeholder='Enter Total Duration']")
		private WebElement enterTotalContentIngestionDurationForVendorinMIN;
		
		@FindBy(xpath="//*[@placeholder='Enter Monthly Watch Secs']")
		private WebElement enterMonthlyWatchDurationForVendorinMIN;
		
		@FindBy(xpath="//*[@placeholder='Enter Max Active Channels']")
		private WebElement enterTotalNumberOfLiveChannel;
		
		@FindBy(id="description")
		private WebElement description;
		
		@FindBy(xpath="//*[@placeholder='Enter Trial Period']")
		private WebElement enterTrailPeriod;
		
		@FindBy(xpath="//*[@class='inside-btn pullup']")
		private WebElement clickOnCreateButton;
		
		private static String Excelsheetname = "EditPlan";
		public static int row = 0;
		public static int col = 0;
		
		
		public void enterPlanName() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(enterPlanName);
			Thread.sleep(3000);
			enterPlanName.click();
			Thread.sleep(1000);
			enterPlanName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String vendorName = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,1,1);
			enterPlanName.sendKeys(vendorName);	
		}
		
		public void enterPlanType() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(enterPlanType);
			enterPlanType.click();
			Thread.sleep(1000);
			
			Select select = new Select(enterPlanType);
			String vendorType = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,2,1);
			select.selectByVisibleText(vendorType);
		}
		
		public void enterMonthlyPrice() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(monthlyPlanPrice);
			monthlyPlanPrice.click();
			Thread.sleep(2500);
			monthlyPlanPrice.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String monthlyPlan = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,3,1);
			monthlyPlanPrice.sendKeys(monthlyPlan);	
		}
		
		public void enterMonthlyDiscountedPrice() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(monthlyDiscountedPlanPrice);
			monthlyDiscountedPlanPrice.click();
			Thread.sleep(1700);
			monthlyDiscountedPlanPrice.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			String monthlyDiscountedPlan = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,4,1);
			monthlyDiscountedPlanPrice.sendKeys(monthlyDiscountedPlan);	
		}
		
		public void enterYearlyPrice() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(yearlyPlanPrice);
			yearlyPlanPrice.click();
			Thread.sleep(1000);
			yearlyPlanPrice.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String YearlyPlan = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,5,1);
			yearlyPlanPrice.sendKeys(YearlyPlan);	
		}
		
		public void enterYearlyDiscountedPrice() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(yearlyDiscountedPlanPrice);
			yearlyDiscountedPlanPrice.click();
			Thread.sleep(1000);
			yearlyDiscountedPlanPrice.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String yearlyDiscountedPlan = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,6,1);
			yearlyDiscountedPlanPrice.sendKeys(yearlyDiscountedPlan);	
		}
		
		public void vendorContentDuration() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(enterTotalContentIngestionDurationForVendorinMIN);
			enterTotalContentIngestionDurationForVendorinMIN.click();
			Thread.sleep(1000);
			enterTotalContentIngestionDurationForVendorinMIN.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String contentDuration = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,7,1);
			enterTotalContentIngestionDurationForVendorinMIN.sendKeys(contentDuration);	
		}
		
		public void enterMonthlyWatchMin() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(enterMonthlyWatchDurationForVendorinMIN);
			enterMonthlyWatchDurationForVendorinMIN.click();
			Thread.sleep(1000);
			enterMonthlyWatchDurationForVendorinMIN.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String monthlyWatchMin = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,8,1);
			enterMonthlyWatchDurationForVendorinMIN.sendKeys(monthlyWatchMin);	
		}
		
		public void enterLiveChannelCount() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(enterTotalNumberOfLiveChannel);
			JavascriptExecutor js7 = (JavascriptExecutor)driver;
			js7.executeScript("arguments[0].scrollIntoView();",enterTotalNumberOfLiveChannel);
			enterTotalNumberOfLiveChannel.click();
			Thread.sleep(1000);
			enterTotalNumberOfLiveChannel.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String liveChannel = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,9,1);
			enterTotalNumberOfLiveChannel.sendKeys(liveChannel);	
		}
		
		public void enterDiscription() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(description);
			JavascriptExecutor js8 = (JavascriptExecutor)driver;
			js8.executeScript("arguments[0].scrollIntoView();",description);
			description.click();
			Thread.sleep(1000);
			description.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String enterDescription = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,10,1);
			description.sendKeys(enterDescription);	
		}
		
		public void enterTrailPeriod() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(enterTrailPeriod);
			JavascriptExecutor js9 = (JavascriptExecutor)driver;
			js9.executeScript("arguments[0].scrollIntoView();",enterTrailPeriod);
			Thread.sleep(1000);	enterTrailPeriod.click();
			waitTillTheElementVisible(enterTrailPeriod);
			enterTrailPeriod.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			Thread.sleep(1000);
			String tPeriod = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,11,1);
			enterTrailPeriod.sendKeys(tPeriod);
		}
		
		
		public void clickOnCREATEbutton() throws InterruptedException, IOException 
		{
			waitTillTheElementVisible(clickOnCreateButton);
			JavascriptExecutor j10 = (JavascriptExecutor)driver;
			j10.executeScript("arguments[0].scrollIntoView();",clickOnCreateButton);
			waitTillTheElementVisible(clickOnCreateButton);
			Thread.sleep(1000);
			clickOnCreateButton.click();
		}
		
			
		}
