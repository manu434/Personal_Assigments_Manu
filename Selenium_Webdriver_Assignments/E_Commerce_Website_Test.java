package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_Commerce_Website_Test {
	FirefoxDriver driver;

	@Before
	public void before() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void test() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// add to cart
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		// proceed to cart
		driver.findElement(By.className("shopping_cart_link")).click();
		// checkout
		driver.findElement(By.id("checkout")).click();
		// fill info
		driver.findElement(By.id("first-name")).sendKeys("manu");
		driver.findElement(By.id("last-name")).sendKeys("kshibu");
		driver.findElement(By.id("postal-code")).sendKeys("686510");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();

	}

}
