package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void selectDropDown(WebElement element, String visibleString) {

		Select sel = new Select(element);

		sel.selectByVisibleText(visibleString);

	}
	
//	public void hoverOver(WebDriver driver) {
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(null, 0, 0).perform();
		
		
		
		
	//}

}
