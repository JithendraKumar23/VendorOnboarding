package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.CreatePlanPage;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.MenuListPage;
import Pages.PlansListingPage;

public class CreatePlanTest extends BaseTest{
	
	@Test(enabled = true)
	private void createPlan() throws InterruptedException, IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmailID(UN);
		loginPage.enterPassword(PW);
		loginPage.enterPassCode(PassCode);
		loginPage.clickOnLoginButton();
		
		Homepage homepage = new Homepage(driver);
		MenuListPage listPage = new MenuListPage(driver);
		PlansListingPage listingPage = new PlansListingPage(driver);
		CreatePlanPage plan = new CreatePlanPage(driver);
		
		homepage.clicONMenuButton();
		listPage.clicONPLANSMenu();
		listingPage.clicONCREATEButtonforPlans();
		
		plan.enterPlanName();
		plan.enterPlanType();
		plan.enterMonthlyPrice();
		plan.enterMonthlyDiscountedPrice();
		plan.enterYearlyPrice();
		plan.enterYearlyDiscountedPrice();
		plan.vendorContentDuration();
		plan.enterMonthlyWatchMin();
		plan.enterLiveChannelCount();
		plan.enterDiscription();
		plan.enterTrailPeriod();
	//	plan.clickOnCREATEbutton();
	

	}

}
