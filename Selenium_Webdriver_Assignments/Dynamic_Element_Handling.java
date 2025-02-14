package assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Element_Handling {
	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//input[1]")).click();

	}

	@Test
	public void test2() {
		WebElement checkbox1 = driver.findElement(By.id("checkboxes"));
		if (checkbox1.isSelected()) {
			System.out.println("Checkbox 1 is selected.");
		} else {
			System.out.println("Checkbox 1 is not selected.");
		}

	}

	@After
	public void after() {
		driver.quit();
	}
}
