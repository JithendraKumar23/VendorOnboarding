package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class EditVendorPage extends BasePage{

	public EditVendorPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	

}
