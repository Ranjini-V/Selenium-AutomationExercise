package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b_ProductsDetailsPage extends BasePage {

	public b_ProductsDetailsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[contains(text(), 'Premium Polo T-Shirts')]")
	WebElement poloTshirt;

	// xpath = "//div[@class='productinfo text-center'][.//p[text()='Premium Polo
	// T-Shirts']]/ancestor::div[@class='product-image-wrapper']//div[@class='choose']//a[text()='View
	// Product']"
	@FindBy(xpath = "//div[@class='product-image-wrapper'][.//p[text()='Premium Polo T-Shirts']]//a[normalize-space()='View Product']")
	WebElement viewProductOption;

	@FindBy(xpath = "//div[@class='product-information']//*[contains(text(), 'Category')]")
	WebElement productCategory;

	@FindBy(xpath = "//div[@class='product-information']//*[contains(text(), 'Rs. ')]")
	WebElement productPrice;

	@FindBy(xpath = "//div[@class='product-information']//*[contains(text(), 'Availability:')]")
	WebElement productAvailability;

	@FindBy(xpath = "//div[@class='product-information']//*[contains(text(), 'Condition:')]")
	WebElement productCondition;

	@FindBy(xpath = "//div[@class='product-information']//*[contains(text(), 'Brand:')]")
	WebElement productBrand;

}
