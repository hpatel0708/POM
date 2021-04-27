package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		
		this.driver = driver; 
	}

	// Element Library

	// WebElement User_Id = driver.findElement(By.xpath("//input[@type='text']"));

	// WebElement Password =
	// driver.findElement(By.xpath("//input[@type='password']"));

	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	WebElement User_Id;

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//a[@id='greenButton']")
	WebElement Sign_In_Button;

	// Interactive Method
	
	public void enterUserId(String userId) {
		
		User_Id.sendKeys(userId);
		
	}
	
	public void enterPassword(String password) {
		
		Password.sendKeys(password);
		
	}
	
	public void clickSignInButton() {
		
		Sign_In_Button.click();
		
	}
	
//	public void login(String userId, String password) {
//		
//		User_Id.sendKeys(userId);
//		
//		Password.sendKeys(password);
//		
//		Sign_In_Button.click();
		
	//}
	
	
}

