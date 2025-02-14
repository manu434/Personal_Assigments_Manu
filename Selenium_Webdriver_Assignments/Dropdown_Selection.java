package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection {
	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
	}

	@Test
	public void test() {
		driver.findElement(By.id("dropdown"));
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		dropdown.click();
		WebElement option = driver.findElement(By.xpath("//option[@value='2']"));
		option.click();
		if (option.isSelected()) {
			System.out.println("Option 2 is selected");
		} else {
			System.out.println("not selected:");
		}
	}
}
