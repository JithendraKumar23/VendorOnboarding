package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.CreateVendorPage;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.MenuListPage;
import Pages.VendorListPage;

public class CreateVendorTest extends BaseTest {
	
	@Test(enabled = true)
	public void createVendor() throws InterruptedException, IOException
	{	
LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmailID(UN);
		loginPage.enterPassword(PW);
		loginPage.enterPassCode(PassCode);
		loginPage.clickOnLoginButton();
		
		Homepage homepage = new Homepage(driver);
		MenuListPage listPage = new MenuListPage(driver);
		VendorListPage vlistPage = new VendorListPage(driver);
		CreateVendorPage createVendorPage = new CreateVendorPage(driver);
		
		homepage.clicONMenuButton();
		listPage.clicONVendorMenu();
		vlistPage.clicONCREATEButton();
		
		createVendorPage.enterVENDORNAME();
		createVendorPage.enterWEBSITE();
		createVendorPage.enterEMAIL();
		createVendorPage.enterPassword();
		createVendorPage.selectTheVendorMODE();
		createVendorPage.selectTheVendorTYPE();
		createVendorPage.selectThePLANIntervals();
		createVendorPage.selectPlan();
		createVendorPage.selectPlanMODE();
		createVendorPage.selectTheAPPAccessMode();
		createVendorPage.enterTheAppName();
		createVendorPage.enterTheSupportEmailAdress();
		createVendorPage.selectStreamEnabled();
		createVendorPage.selectHDEnabled();
		createVendorPage.selectADDEnabled();
		createVendorPage.selectDRMEnabled();
		createVendorPage.selectPaymentEnabled();
		createVendorPage.selectInstituteEnabled();
		createVendorPage.selectLevelEnabled();
		createVendorPage.selectBulkEntrollEnabledEnabled();	
		createVendorPage.clickOnCREATEButton();
	}

}
