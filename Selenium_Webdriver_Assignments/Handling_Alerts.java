package assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {
	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement result = driver.findElement(By.id("result"));
		if (result.getText().contains("You successfully clicked an alert")) {
			System.out.println("Alert handled successfully!");

		}
	}

	@After
	public void after() {
		driver.quit();
	}

}
