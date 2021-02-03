package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.EditPlanPage;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.MenuListPage;
import Pages.PlansListingPage;

public class EditPlanTest extends BaseTest{
	
	@Test(enabled = true)
	private void editPlan() throws InterruptedException, IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterEmailID(UN);
		loginPage.enterPassword(PW);
		loginPage.enterPassCode(PassCode);
		loginPage.clickOnLoginButton();
		
		Homepage homepage = new Homepage(driver);
		MenuListPage listPage = new MenuListPage(driver);
		PlansListingPage listingPage = new PlansListingPage(driver);
		EditPlanPage editPlan = new EditPlanPage(driver);
		
		homepage.clicONMenuButton();
		listPage.clicONPLANSMenu();
		listingPage.clickEditButton();
		
		editPlan.enterPlanName();
		editPlan.enterPlanType();
		editPlan.enterMonthlyPrice();
		editPlan.enterMonthlyDiscountedPrice();
		editPlan.enterYearlyPrice();
		editPlan.enterYearlyDiscountedPrice();
		editPlan.vendorContentDuration();
		editPlan.enterMonthlyWatchMin();
		editPlan.enterLiveChannelCount();
		editPlan.enterDiscription();
		editPlan.enterTrailPeriod();
		//editPlan.clickOnCREATEbutton();
	}
}
