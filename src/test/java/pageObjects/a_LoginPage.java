package pageObjects;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.LoggerHelper;

public class a_LoginPage extends BasePage {

	private static final Logger log = LoggerHelper.getLogger(a_LoginPage.class);

	public static String PAGE_URL = ConfigReader.getProperty("baseUrl");

	public a_LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateTo() {
		log.info("Navigating to Login Page: " + PAGE_URL);
		driver.get(PAGE_URL);
	}

	// Locators using PageFactory
	@FindBy(xpath = "//img[@alt=\"Website for automation practice\"]")
	WebElement logo;

	@FindBy(xpath = "//form[@action='/login']//input[@type='email']")
	WebElement email_input;

	@FindBy(xpath = "//div[@class='login-form']//input[@type='password']")
	WebElement password_input;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement login_btn;

	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	WebElement invalidLogin_msg;

	@FindBy(xpath = "//a[contains(text(),'Logged in as')]")
	WebElement loggedInUserText;

	// Action Methods

	public boolean logoPresent() {
		return isDisplayed(logo);
	}

	public void enterEmail(String email) {
		log.info("Entering email: " + email_input);
		type(email_input, email);
	}

	public void enterPassword(String password) {
		log.info("Entering password: " + password_input);
		type(password_input, password);
	}

	public void clickLoginBtn() {
		log.info("Clicking Login button");
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