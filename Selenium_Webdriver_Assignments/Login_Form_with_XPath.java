package assignment;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Form_with_XPath {
	FirefoxDriver driver;

	@Before
	public void before() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		WebElement success = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		assertTrue(success.getText().contains("You logged into a secure area!"));

	}

}
