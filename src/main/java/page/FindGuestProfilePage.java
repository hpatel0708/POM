package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindGuestProfilePage extends BasePage {

	WebDriver driver;

	public FindGuestProfilePage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//a[@id='act2']")
	WebElement Find_Button_Locator;

	@FindBy(how = How.XPATH, using = "//a[@id='menu3_1']")
	WebElement Find_Guest_Profile_Button_Locator;

	@FindBy(how = How.XPATH, using = "//select[@onchange='GPLswitchSelection();']")
	WebElement Search_Guest_By_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='lastNameSearch']")
	WebElement Last_Name_Field_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='firstNameSearch']")
	WebElement First_Name_Field_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='countrySearch']")
	WebElement Country_Field_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='homeZipSearch']")
	WebElement Postal_Code_Field_Locator;

	@FindBy(how = How.XPATH, using = "//a[@id='GuestSearchFindGuest']")
	WebElement Find_Guest_Button_Locator;

	// Interactive Methods

	public void clickOnFindButton() {

		Find_Button_Locator.click();
	}

	public void clickOnFindGuestProfileButton() {

		Find_Guest_Profile_Button_Locator.click();
	}

	public void selectSearchGuestBy(String guestBy) {

		selectDropDown(Search_Guest_By_Locator, guestBy);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void enterLastName(String lastname) {

		Last_Name_Field_Locator.sendKeys(lastname);
	}

	public void enterFirstName(String firstname) {

		First_Name_Field_Locator.sendKeys(firstname);
	}

	public void enterCountry(String country) {

		Country_Field_Locator.sendKeys(country);
	}

	public void enterPostalCode(String postalcode) {

		Postal_Code_Field_Locator.sendKeys(postalcode);
	}

	public void clickSearchGuestButton() {

		Find_Guest_Button_Locator.click();

	}

}
