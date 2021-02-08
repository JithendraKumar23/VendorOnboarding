package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.AddFCMPage;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.MenuListPage;
import Pages.VendorListPage;

public class ADDfcmTest extends BaseTest {
	

	@Test(enabled = true , groups= {"SmokeTest"})
	private void addFCMCredentials() throws InterruptedException, IOException
	{
        LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmailID(UN);
		loginPage.enterPassword(PW);
		loginPage.enterPassCode(PassCode);
		loginPage.clickOnLoginButton();
		
		Homepage homepage = new Homepage(driver);
		MenuListPage listPage = new MenuListPage(driver);
		VendorListPage vlistPage = new VendorListPage(driver);
		AddFCMPage addFCMPage = new AddFCMPage(driver);
		
		homepage.clicONMenuButton();
		listPage.clicONVendorMenu();
		vlistPage.clicONADDButton();
		
		addFCMPage.enterFCM_Credentials();
		addFCMPage.enterSTRIPE_Credentials();
		addFCMPage.enterFORTUMO_Credentials();
		addFCMPage.enterPayPal_Credentials();
		addFCMPage.enterPayTm_Credentials();
		addFCMPage.enterBrainTree_Credentials();
		addFCMPage.enterInAPP_Credentials();
		addFCMPage.enterFireTv_Credentials();
		addFCMPage.clickOnSaveButton();
	}
}
