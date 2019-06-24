package Report;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class takeScreenShotExample {
	public WebDriver driver;
	Dimension size;
	String destDir;
	DateFormat dateFormat;

	@Test
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://www.google.com");
		try {
			// the below statement will throw an exception as the element is not found,
			// Catch block will get executed and takes the screenshot.
			driver.findElement(By.className("gNO89b")).click();
			// if we remove the below comment, it will not return exception and screen shot
			// method will not get executed.
			// driver.findElement(By.id("gbqfq")).sendKeys("test");
		} catch (Exception e) {
			System.out.println("I'm in exception");
			// calls the method to take the screenshot.
			takeScreenShot();
		}
	}

	public void takeScreenShot() {
		// Set folder name to store screenshots.
		destDir = "D://test1.png";
		// Capture screenshot.
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Set date format to set It as screenshot file name.
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// Create folder under project with name "screenshots" provided to destDir.
		new File(destDir).mkdirs();
		// Set file name using current date time.
		String destFile = dateFormat.format(new Date()) + ".png";

		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}