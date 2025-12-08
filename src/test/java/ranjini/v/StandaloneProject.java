package ranjini.v;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneProject {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://automationexercise.com/login");

		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Robert Browny2");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("robertbrowny2@example.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Robert");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Brown");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABC!@#123");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("XYZ Street");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("ABC City");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("BCD");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("123-098");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("1243-0475-038");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Continue']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// js.executeScript("arguments[0].scrollIntoView(true);",
		// "//a[@href='/product_details/1']");
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		// button[text()='Pay and Confirm Order']//button[text()='Pay and Confirm
		// Order']
		js.executeScript("arguments[0].scrollIntoView(true);", "//a[text()='Place Order']");
		driver.findElement(By.xpath("//a[text()='Place Order']")).click();

		driver.findElement(By.xpath("//input[@data-qa='name-on-card']")).sendKeys("Robert");
		driver.findElement(By.xpath("//input[@data-qa='card-number']")).sendKeys("3823762-204-20298");
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("321");
		driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("08");
		driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2028");
		driver.findElement(By.xpath("//button[text()='Pay and Confirm Order']")).click();

	}

}
