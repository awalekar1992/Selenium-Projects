package Report;

import java.io.File;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Learnscreen {

	// Create Webdriver reference
	public WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception {

		// Initiate Firefox browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();

		// Pass application url
		driver.get("http://www.google.com");

		// Here we are forcefully passing wrong id so that it will fail our testcase
		driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");

	}

	// It will execute after every test execution
	@AfterMethod
	public void tearDown(ITestResult arg0) {

		// Here will compare if test is failing then only it will enter into if
		// condition
		if (ITestResult.FAILURE == arg0.getStatus()) {
			try {
				String fileName = String.format("Screenshot-%s.jpg", Calendar.getInstance().getTimeInMillis());
				driver = (WebDriver) arg0.getTestContext().getAttribute("WebDriver");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				String dest = "./screenshot/" + fileName;
				File snapshotDest = new File(dest);
				FileUtils.copyFile(source, snapshotDest);
				Reporter.log("Screen Shots file :  " + dest);
			} catch (Exception e) {
				throw new RuntimeException("Failed to take screenshot !", e);
			}

		}
		// close application
		driver.quit();
	}

}
