package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(enabled = true)
	public void loginPageTest() throws InterruptedException, IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmailID(UN);
		loginPage.enterPassword(PW);
		loginPage.enterPassCode(PassCode);
		loginPage.clickOnLoginButton();
		
		
	}

}
