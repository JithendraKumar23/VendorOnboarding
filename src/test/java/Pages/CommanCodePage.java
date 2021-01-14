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

public class CommanCodePage extends BasePage{

	public CommanCodePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath="//*[@name='streamenabled']")
	private WebElement clickOnSTREAMENABLEDDropDown;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]")
	private WebElement tapConddition;
	
	public void commanCodeForYESandNO(WebElement visibleElement , String tapCondition ) throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		waitTillTheElementVisible(visibleElement);
		JavascriptExecutor js6 = (JavascriptExecutor)driver;
		js6.executeScript("arguments[0].scrollIntoView();",visibleElement);
		
		visibleElement.click();
		Thread.sleep(1000);
		
		Select select = new Select(visibleElement);
		String stream = ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,13,1);
		select.selectByVisibleText(stream);
		Thread.sleep(1000);
		tapConddition.click();
		System.out.println(stream);	
	}
}
