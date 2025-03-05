package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assign_6 {
	WebDriver driver;

	@BeforeTest
	public void bt() {
		driver = new EdgeDriver();

	}

	@BeforeMethod
	public void bm() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	}

	@Test
	public void test() throws IOException {
		File f = new File("D:\\Book2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println("No of Rows in Excel sheet: "+sh.getLastRowNum());

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			String password = sh.getRow(i).getCell(1).getStringCellValue();

			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

			// login validation
			String actual = driver.getCurrentUrl();
			String expected = "https://www.saucedemo.com/v1/inventory.html";
			if (actual.equals(expected)) {
				System.out.println("Login validation is Success");
			} else {
				System.out.println("Login validation Failed");
			}
		}

	}

}
