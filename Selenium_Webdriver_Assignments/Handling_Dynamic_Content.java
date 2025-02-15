package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Dynamic_Content {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_content");
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]/a")).click();
		driver.navigate().refresh();
	}
}
