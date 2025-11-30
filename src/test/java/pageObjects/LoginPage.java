package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	private static final String PAGE_URL = "https://automationexercise.com/login";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTO() {
		driver.get(PAGE_URL);
	}

	// Locators using PageFactory

	@FindBy(xpath = "//div[@class='login-form']//input[@type='email']")
	WebElement email_input;
	
	@FindBy(xpath = "//div[@class='login-form']//input[@type='password']")
	WebElement password_input;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement login_btn;
	
	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	WebElement invalidLogin_msg;
	
	
	

}
