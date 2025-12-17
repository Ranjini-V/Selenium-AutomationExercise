package pageObjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.LoggerHelper;

public class FilterProducts extends BasePage{

	private static final Logger log = LoggerHelper.getLogger(FilterProducts.class);
	
	public FilterProducts(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	
	
	
}
