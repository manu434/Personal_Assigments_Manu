package testNG;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assign_4 {
	WebDriver driver;

	@BeforeTest
	public void bt() {
		driver = new EdgeDriver();

	}

	@BeforeMethod
	public void bm() {
		driver.manage().window().maximize();
		driver.get("https://rishiherbalindia.linker.store/");
	}

	@Test
	public void test() throws IOException, InterruptedException {
		// Thread.sleep(10000);
		// sign_up
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement a = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span"));
		a.click();

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input"))
				.sendKeys("gafil24556@bitflirt.com");

		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input"))
				.sendKeys("ASwe12345@");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input"))
				.click();
		driver.navigate().refresh();
		// login
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input"))
				.sendKeys("gafil24556@bitflirt.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("ASwe12345@");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		// search
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster");
		// driver.findElement(By.name("query"));
		driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/ul/li[1]/ul/li[1]/p/a")).click();
		// whistle list
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath(
				"//div[@class='product-block product-thumb transition prod-id-5489330']//div[@class='product-image-block-inner']//span[@class='hidden-xs hidden-sm hidden-md'][normalize-space()='Add to Wishlist']"))
				.click();
		// all ,health,safety click
		driver.navigate().refresh();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		WebElement screenshot1 = driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/a[2]"));
		File sc = screenshot1.getScreenshotAs(OutputType.FILE);
		// FileHandler.copy(sc, new File("D:\\screenshot\\privacypolicy.png"));
		FileHandler.copy(sc, new File("./screenshot/privacypolicy.png"));
		URL ob = new URL("https://rishiherbalindia.linker.store/");
		HttpURLConnection con = (HttpURLConnection) ob.openConnection();
		con.connect();
		if (con.getResponseCode() == 200) {
			System.out.println("Valid URL:");
		} else {
			System.out.println("Invalid URL:");
		}

	}

}
