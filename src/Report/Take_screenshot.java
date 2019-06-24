package Report;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Take_screenshot {
	// Create Webdriver reference
	static WebDriver driver;

	@Test
	public static void captureScreenMethod() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Eclipse\\Jar Files\\chromedriver_win32 (1)//chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.navigate().refresh();
		// driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile");
		// //Statement with correct Xpath
		driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); // Statement with incorrect Xpath

	}

	@AfterMethod // AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result) {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
		// condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				// Call method to capture screenshot
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name
				FileUtils.copyFile(src, new File("D:\\" + result.getName() + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
		driver.quit();
	}
}
