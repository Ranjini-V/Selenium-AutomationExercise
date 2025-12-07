package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {

	protected WebDriver driver;
	private WebDriverWait wait;

	public BasePage(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	protected void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	protected void type(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(text);
	}

	protected boolean isDisplayed(WebElement element) {
		try {
			return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	protected String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		return element.getText();
	}

}
