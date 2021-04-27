package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.FindReservation;
import page.LoginPage;
import page.WelcomePage;
import util.BrowserFactory;

public class FindReservationTest {
 
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
		 
		FindReservation findreservation = PageFactory.initElements(driver, FindReservation.class);
		
		findreservation.clickOnFindButton();
		
		findreservation.clickOnReservationButton();
		
		findreservation.enterLastName("Lyon");
		
		findreservation.enterFirstName("Dwayne");
		
		findreservation.clickOnStartDateCalenderbutton();
		
		findreservation.selectMonth("Jan");
		
		findreservation.selectDate();
		
		findreservation.statusField("Checked Out");
		
		findreservation.RoomTypeField("SNK2");
		
		findreservation.clickOnSearchButton();
		
		
		// BrowserFactory.tearDown();

	}
}