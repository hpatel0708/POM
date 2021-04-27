package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.FindGuestProfilePage;
import page.LoginPage;
import page.WelcomePage;
import util.BrowserFactory;

public class FindGuestProfileTest {

	WebDriver driver;

	@Test

	public void userShouldBeAbleToFindReservation() {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.enterUserId("hpatel.txa01");

		loginpage.enterPassword("Pooja94");

		loginpage.clickSignInButton();

		WelcomePage welcomepage = PageFactory.initElements(driver, WelcomePage.class);

		welcomepage.validateWelcomePage();

		FindGuestProfilePage guestprofilepage = PageFactory.initElements(driver, FindGuestProfilePage.class);
		
		guestprofilepage.clickOnFindButton();
		
		guestprofilepage.clickOnFindGuestProfileButton();
		
		guestprofilepage.selectSearchGuestBy("Name");
		
		guestprofilepage.enterLastName("Patel");
		
		guestprofilepage.enterFirstName("Hardik");
		
		guestprofilepage.enterCountry("US");
		
		guestprofilepage.enterPostalCode("75220");
		
		guestprofilepage.clickSearchGuestButton();
	}

}
