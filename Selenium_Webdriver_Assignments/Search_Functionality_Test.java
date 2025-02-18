package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search_Functionality_Test {
	FirefoxDriver driver;

	@Before
	public void before() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

	}

	@Test
	public void test() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobliles", Keys.ENTER);

	}

}
