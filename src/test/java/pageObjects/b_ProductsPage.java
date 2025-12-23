package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b_ProductsPage extends BasePage {

	public b_ProductsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(), 'All Products')]")
	WebElement allProductsHeader;

	@FindBy(xpath = "//div[@class='productinfo text-center']")
	List<WebElement> allProductsList;

//	@FindBy(xpath = "(//a[contains(text(), 'View Product')])[1]")
//	WebElement firstViewProduct;

	public boolean isAllProductsVisible() {
		return isDisplayed(allProductsHeader);

	}

	public boolean isProductsListVisible() {
		return allProductsList.size() > 0;
	}

//	public void clickFirstViewProduct() {
//		click(firstViewProduct);
//	}

}
