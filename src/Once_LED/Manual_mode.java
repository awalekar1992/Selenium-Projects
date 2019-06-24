package Once_LED;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
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
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class Manual_mode  extends BaseTest {

	@Test(priority = 1)
	public void Manual_mode1()  throws InterruptedException, IOException  {
		
		WebElement Manual_mode1 = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[3]"));
		Manual_mode1.click();
		System.out.println("Click on Home button");
		takeScreenShot();
		logger = extent.startTest(" Home button");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " Home button Successfully");
		
	}
	@Test(priority = 2)
	public void Manual_settings()  throws InterruptedException, IOException  {
		
		WebElement Timeout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.SeekBar\r\n"));
	Timeout.click();
		//Timeout = null;
		new TouchAction(driver).press(PointOption.point(263, 417)).waitAction().moveTo(PointOption.point(540, 417)).release().perform();

		WebElement A_R = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.SeekBar"));
		A_R.click();
		new TouchAction(driver).press(PointOption.point(267, 594)).waitAction().moveTo(PointOption.point(403, 594)).release().perform();

		WebElement B_G = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.SeekBar"));
		B_G.click();
		new TouchAction(driver).press(PointOption.point(267, 774)).waitAction().moveTo(PointOption.point(493, 774)).release().perform();
		

		WebElement C_B = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.SeekBar"));
		C_B.click();
		new TouchAction(driver).press(PointOption.point(267, 954)).waitAction().moveTo(PointOption.point(616, 954)).release().perform();

		System.out.println("Click on Manual_settings");
		takeScreenShot();
		logger = extent.startTest(" Manual_settings");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " Home button Successfully");
		
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

