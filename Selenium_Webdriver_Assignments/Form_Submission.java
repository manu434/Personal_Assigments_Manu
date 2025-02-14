package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Submission {

	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@Test
	public void test() {
		driver.findElement(By.id("firstName")).sendKeys("manu");
		driver.findElement(By.id("lastName")).sendKeys("shibu");
		driver.findElement(By.id("submit")).click();

	}
}
