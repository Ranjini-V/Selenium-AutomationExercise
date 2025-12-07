package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;

public class LoginPage extends BasePage {


	public static String PAGE_URL = ConfigReader.getProperty("baseUrl");

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateTo() {
		driver.get(PAGE_URL);
	}

	// Locators using PageFactory
	@FindBy(xpath = "//img[@alt=\"Website for automation practice\"]")
	WebElement logo;

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
	
	public boolean logoPresent() {
		return isDisplayed(logo);
	}
	public void enterEmail(String email) {
		type(email_input, email);
	}

	public void enterPassword(String password) {
		type(password_input, password);
	}

	public void clickLoginBtn() {
		click(login_btn);
	}

	// Verification methods
	public boolean isLoginSuccessful() {
		return isDisplayed(loggedInUserText);

	}

	public boolean isLoginErrorDisplayed() {
		return isDisplayed(invalidLogin_msg);

	}
}