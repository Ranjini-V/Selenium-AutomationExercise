package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePage;
import pageObjects.LoginPage;
import utilities.ConfigReader;



public class LoginSteps {


	WebDriver driver;
	LoginPage loginPage;

	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		driver = Hooks.driver;
		loginPage = new LoginPage(driver);
		loginPage.navigateTo();
 
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) {
		loginPage.enterEmail(ConfigReader.getProperty(email));
		loginPage.enterPassword(ConfigReader.getProperty(password));
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		loginPage.clickLoginBtn();
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
		Assert.assertTrue("Expected invalid login message but not found!", loginPage.isLoginErrorDisplayed());

	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		Assert.assertTrue("Expected success message but not found!", loginPage.isLoginSuccessful());
	}

}
