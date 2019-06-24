package Once_LED;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class Create_connection extends BaseTest {

	@Test(priority = 1)
	public void Manual_mode1()  throws InterruptedException, IOException  {
		
		WebElement Manual_mode1 = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[3]"));
		Manual_mode1.click();
		System.out.println("Click on Manual Clik");
		takeScreenShot();
		logger = extent.startTest(" Manual Clik");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " Manual Clik Successfully");
		
	}
	
	@Test(priority = 2)
	public void Setup_wizard()  throws InterruptedException, IOException  {
		
		WebElement Setup_wizard = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[3]"));
		Setup_wizard.click();
		System.out.println("Click on Setup_wizard");
		takeScreenShot();
		logger = extent.startTest(" Setup_wizard");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "On Setup_wizard click Successfully");
		
	}


	@Test(priority = 3)
	public void Connection()  throws InterruptedException, IOException  {
		
		WebElement Name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText"));
		Name.click();
		Name.sendKeys("Device Name Entered");
		driver.navigate().back();
		//new TouchAction (driver).press(PointOption.point(0,924)).waitAction().moveTo(PointOption.point(32,88)).release().perform();
		WebElement Pin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
		Pin.sendKeys("1234");
		driver.navigate().back();
		WebElement Save_GPS = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.Button"));
		Save_GPS.click();
		System.out.println("Click onConnection");
		takeScreenShot();
		logger = extent.startTest(" Connection");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "On Connection click Successfully");
		
	}





public void takeScreenShot() {
	// Set folder name to store screenshots.
	destDir = "screenshots";
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

