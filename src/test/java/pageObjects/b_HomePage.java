package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b_HomePage extends BasePage {

	public b_HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body")
	WebElement HomePageBody;

	@FindBy(xpath = "//a[contains(text(), ' Products')]")
	WebElement productsBtn;

	public boolean isHomePageVisible() {
		return isDisplayed(HomePageBody);
	}

	public void clickProducts() {
		click(productsBtn);
	}

}
