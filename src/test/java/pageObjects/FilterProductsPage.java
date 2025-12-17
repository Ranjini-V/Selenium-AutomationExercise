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
	
	
	

}
