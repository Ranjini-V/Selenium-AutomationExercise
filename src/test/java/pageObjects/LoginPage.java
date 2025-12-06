package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	private static final String PAGE_URL = "https://automationexercise.com/login";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void navigateTo() {
		driver.get(PAGE_URL);
	}

	// Locators using PageFactory

	@FindBy(xpath = "//div[@class='login-form']//input[@type='email']")
	WebElement email_input;

	@FindBy(xpath = "//div[@class='login-form']//input[@type='password']")
	WebElement password_input;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement login_btn;

	@FindBy(xpath = "//p[contains(text(),'Yours email or password is incorrect!')]")
	WebElement invalidLogin_msg;

	@FindBy(xpath = "//a[contains(text(),'Logged in as')]")
	WebElement loggedInUserText;

	// Action Methods
	public void enterEmail(String email) {
		email_input.clear();
		email_input.sendKeys(email);
	}

	public void enterPassword(String password) {
		password_input.clear();
		password_input.sendKeys(password);
	}

	public void clickLoginBtn() {
		login_btn.click();
	}

	// Verification methods
	public boolean isLoginSuccessful() {
		try {
			wait.until(ExpectedConditions.visibilityOf(loggedInUserText));
			return loggedInUserText.isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

	public boolean isLoginErrorDisplayed() {
		try {
			wait.until(ExpectedConditions.visibilityOf(invalidLogin_msg));
			return invalidLogin_msg.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
