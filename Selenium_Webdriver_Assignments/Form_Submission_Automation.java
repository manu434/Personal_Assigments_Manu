package assignment;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form_Submission_Automation {
	EdgeDriver driver;

	@Before
	public void before() {
		// Set the path to your EdgeDriver executable
		// System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");

		// Initialize the WebDriver
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		// Open the DemoQA Automation Practice Form
		driver.get("https://demoqa.com/automation-practice-form");

		// Wait for the page to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
	}

	@Test
	public void test() {
		// Fill in the first name
		driver.findElement(By.id("firstName")).sendKeys("Manu");

		// Fill in the last name
		driver.findElement(By.id("lastName")).sendKeys("k shibu");

		// Fill in the email
		driver.findElement(By.id("userEmail")).sendKeys("mksmanu009@gmail.com");

		// Select the gender (Male)
		driver.findElement(By.xpath("//label[text()='Male']")).click();

		// Fill in the mobile number
		driver.findElement(By.id("userNumber")).sendKeys("7474747474");

		// Select the date of birth (May 19, 1999)
		WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
		dateOfBirthField.click();

		// Select the year (1999)
		WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
		yearDropdown.click();
		WebElement yearOption = driver.findElement(By.xpath("//option[text()='1999']"));
		yearOption.click();

		// Select the month (May)
		WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
		monthDropdown.click();
		WebElement monthOption = driver.findElement(By.xpath("//option[text()='May']"));
		monthOption.click();

		// Select the day (19)
		WebElement dayOption = driver
				.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='19']"));
		dayOption.click();

		// Fill in the subjects (BCA)
		WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
		subjectsInput.sendKeys("BCA");
		// driver.findElement(By.id("react-select-2-option-0")).click(); // Select the
		// first suggestion

		// Select hobbies (Sports)
		driver.findElement(By.xpath("//label[text()='Sports']")).click();

		// Upload a picture (if needed)
		// driver.findElement(By.id("uploadPicture")).sendKeys("path/to/your/image.png");

		// Fill in the current address
		driver.findElement(By.id("currentAddress")).sendKeys("kurinjipurayodim");

		// Select the state (NCR)
		driver.findElement(By.id("state")).click();
		driver.findElement(By.xpath("//div[text()='NCR']")).click();

		// Select the city (Delhi)
		driver.findElement(By.id("city")).click();
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();

		// Submit the form
		driver.findElement(By.id("submit")).click();

		// Wait for the submission confirmation dialog to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example-modal-sizes-title-lg")));

		// Print the confirmation message
		String confirmationMessage = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
		System.out.println("Confirmation Message: " + confirmationMessage);
	}

}
