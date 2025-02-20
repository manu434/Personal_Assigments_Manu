package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_Prompt_Alert {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	@Test
	public void test() {
		WebElement a = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		a.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Manu is the man of god");
		alert.accept();

	}

}
