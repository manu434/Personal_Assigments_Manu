package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class File_Upload_and_Download_Test {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");

	}

	@Test
	public void test() {
		driver.findElement(By.id("downloadButton")).click();
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Dell\\Downloads\\sampleFile.jpeg");
	}

}
