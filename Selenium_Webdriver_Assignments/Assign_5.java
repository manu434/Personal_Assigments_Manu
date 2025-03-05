package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assign_5 {
	WebDriver driver;

	@BeforeTest
	public void bt() {
		driver = new EdgeDriver();
	}

	@BeforeMethod
	public void bm() {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@Test
	public void test1() throws InterruptedException {
		// Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones", Keys.ENTER);
		String actual = driver.getTitle();
		String expedted = "Amazon.in : Mobile phones";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expedted, "Title does not match");
		soft.assertAll();
		// Assert.assertEquals(actual, expedted, "Title does not match");

		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 16e 128 GB: Built for Apple Intelligence, A')]"))
				.click();

		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(30000);
				driver.findElement(By.xpath(
						"//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"))
						.click();
				driver.findElement(By.xpath(
						"//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"))
						.click();
				// break;
			}
		}

	}

}
