package testNg_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//cross browsing test
public class Assign1 {
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void test(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		}

	}

	@Test
	public void test2() {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@AfterTest
	public void test3() {
		driver.quit();
	}

}
