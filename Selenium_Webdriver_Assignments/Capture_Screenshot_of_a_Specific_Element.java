package assignment;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot_of_a_Specific_Element {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
	}

	@Test
	public void test() throws IOException {
		WebElement a = driver.findElement(By.xpath("//span[@class='navbar-logo']//*[name()='svg']"));
		File sc = a.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File("D:\\screenshot\\selenium_logo.png"));

	}

}
