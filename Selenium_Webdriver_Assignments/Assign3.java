package testNg_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assign3 {
	WebDriver driver;

	@BeforeTest
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	@Parameters({ "user", "pass" })
	public void test1(String user, String pass) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("Username received: " + user);
		System.out.println("Password received: " + pass);
		WebElement element = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		element.sendKeys(user);
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

}
