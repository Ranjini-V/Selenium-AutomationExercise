package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = new ChromeDriver();
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - User is on login page");
	}

	@When("user enters wrong username and wrong password")
	public void user_enters_wrong_username_and_wrong_password() {
		System.out.println("Inside Step - user enters wrong username and wrong password");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step - clicks on Login button");
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
		System.out.println("Inside Step - error message should be displayed");
	

}}
