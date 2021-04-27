package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.WelcomePage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test

	public void login() {

		 driver = BrowserFactory.init();
		 
		 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 
		 loginpage.enterUserId("hpatel.txa01");
		 
		 loginpage.enterPassword("Pooja94");
		 
		 loginpage.clickSignInButton();
		 
		 WelcomePage welcomepage = PageFactory.initElements(driver, WelcomePage.class);
		 
		 welcomepage.validateWelcomePage();
		 
		 BrowserFactory.tearDown();

	}

}
