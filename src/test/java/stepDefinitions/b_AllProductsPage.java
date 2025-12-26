package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.b_HomePage;
import pageObjects.b_ProductsDetailsPage;
import pageObjects.b_ProductsPage;

public class b_AllProductsPage {

	WebDriver driver = Hooks.driver;
	b_HomePage homePage;
	b_ProductsPage productsPage;
	b_ProductsDetailsPage productDetailsPage;

	@Given("user navigates to home page")
	public void user_navigates_to_home_page() {
		homePage = new b_HomePage(Hooks.driver);

	}

	@And("home page is visible")
	public void home_page_is_visible() {
		Assert.assertTrue(homePage.isHomePageVisible());
	}

	@When("user clicks on Products button")
	public void user_clicks_on_products_button() {
		homePage.clickProducts();
	}

	@Then("user should be navigated to All Products Page")
	public void user_should_be_navigated_to_all_products_page() {
		productsPage = new b_ProductsPage(Hooks.driver);
		productsPage.isAllProductsVisible();
		productsPage.clickProductsOption();
		Assert.assertTrue(productsPage.isOnProductsPage());

	}

	@And("products list should be visible")
	public void products_list_should_be_visible() {
		productsPage.isProductsListVisible();
	}

	@When("user clicks on View Products of {string} product")
	public void user_clicks_on_view_products_of_product(String productName) {
		productDetailsPage = new b_ProductsDetailsPage(Hooks.driver);
		productDetailsPage.clickViewProductByName(productName);

	}

	@Then("product detail page should be displayed")
	public void product_detail_page_should_be_displayed() {
		productDetailsPage.isProductDetailPageVisible();
	}

	@And("product details should be visible")
	public void product_details_should_be_visible() {
		productDetailsPage.areProductDetailsVisible();
	}

}
