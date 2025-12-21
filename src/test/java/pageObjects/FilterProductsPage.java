package pageObjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerHelper;

public class FilterProductsPage extends BasePage {

	private static final Logger log = LoggerHelper.getLogger(FilterProductsPage.class);

	public FilterProductsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;

	// Locators with Pagefactory
	
	@FindBy(xpath = "//a[@data-toggle='collapse' and @href='#Women']")
	WebElement womenCategory;

	@FindBy(xpath = "//a[normalize-space()='Tops']")
	WebElement topSubCategory;
	
	@FindBy (xpath = "//div[@class='productinfo text-center']//*[normalize-space()='Winter Top']")
	WebElement winterTop ;
	
	@FindBy (xpath = "//a[@data-product-id='5' and contains(@class,'add-to-cart')]")
	WebElement addToCart;
	
	@FindBy (xpath = "//div[@id='cartModal']//a[@href='/view_cart']/u")
	WebElement viewCart;
	
	
	// Action Methods
	public void selectCategory() {
		log.info("Selecting Main Category");
		scrollWindow(womenCategory);
		womenCategory.click();
	}
	
	public void selectSubCategory() {
		log.info("Selection sub-category");
		topSubCategory.click();
	}
	
	public void visibleProducts() {
		 isDisplayed(winterTop);
	}
	

}
