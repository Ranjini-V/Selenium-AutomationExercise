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
	
	WebDriver driver;
	FilterProductsPage filterProductsPage;
	

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	    driver = Hooks.driver;
	    filterProductsPage = new FilterProductsPage(driver);
	    
	}

	@When("user selects {string} category")
	public void user_selects_category(String category) {
		filterProductsPage.selectCategory(category);
	}

	@When("user selects {string} subcategory")
	public void user_selects_subcategory(String string) {
		filterProductsPage.selectSubCategory();
	}

	@Then("women's tops products should be displayed")
	public void women_s_tops_products_should_be_displayed() {
		Assert.assertTrue(filterProductsPage.visibleProducts());
	}
}
