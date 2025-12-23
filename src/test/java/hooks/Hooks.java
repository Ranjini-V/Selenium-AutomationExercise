package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import pageObjects.BasePage;
import pageObjects.a_LoginPage;
import utilities.ConfigReader;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void setUp(Scenario scenario) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failure screenshot");
		}

		if (driver != null) {
			driver.quit();
		}
	}

	@Before("@loggedIn")
	public void loginScenario() {
		a_LoginPage loginPage = new a_LoginPage(driver);
		loginPage.navigateTo();
		loginPage.enterEmail(ConfigReader.getProperty("validEmail"));
		loginPage.enterPassword(ConfigReader.getProperty("validPassword"));
		loginPage.clickLoginBtn();

	}
}
