package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Page_Automation {
	FirefoxDriver driver;

	@Before
	public void before() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		// driver.navigate().back();

	}

	@Test
	public void test2() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("manu");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manu");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// WebElement fail =
		// driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));

	}

}
