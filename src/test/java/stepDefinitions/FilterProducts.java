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
import pageObjects.FilterProductsPage;
import utilities.ConfigReader;

public class FilterProducts {
	
	FilterProductsPage filterProductsPage;
	

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user selects {string} category")
	public void user_selects_category(String string) {
		filterProductsPage.selectCategory();
	}

	@When("user selects {string} subcategory")
	public void user_selects_subcategory(String string) {
	    
	}

	@Then("women's tops products should be displayed")
	public void women_s_tops_products_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
