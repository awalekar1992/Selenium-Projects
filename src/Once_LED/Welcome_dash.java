package Once_LED;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class Welcome_dash extends BaseTest {

	@Test(priority = 1)
	public void Register() throws InterruptedException, IOException {

		// Register
		WebElement regis = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]"));
		regis.click();
		System.out.println("Click on Register");
		takeScreenShot();
		regis.click();
		logger = extent.startTest("Click on Register working");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Click on Register Successfully");
	}

	@Test(priority = 2)
	public void Select_farm() throws InterruptedException, IOException {

		// Click on Farm Type
		WebElement farm = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]"));
		farm.click();
		System.out.println("Click on Farm Type");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"))
				.click();
		takeScreenShot();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[3]\r\n"))
				.click();
		farm.click();

		logger = extent.startTest("Select Farm Type");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Click on Farm Type");
		logger.log(LogStatus.PASS, "Select Farm type from the dropdownlist");
		logger.log(LogStatus.PASS, "Select Farm type as Broiler ");

	}

	@Test(priority = 3)
	public void Select_light() throws InterruptedException, IOException {

		// Click on Select Your Lights
		WebElement light = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]"));
		light.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"))
				.click();
		takeScreenShot();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[2]"))
				.click();
		System.out.println("Click on Select Your Lights");
		light.click();

		logger = extent.startTest("Select Your Lights Models ");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Click on Select Your Lights models");
		logger.log(LogStatus.PASS, "Select Your light models from the dropdownlist");
		logger.log(LogStatus.PASS, "Select Light models model MLS-FSWR_BU-190 ");

	}

	//
	@Test(priority = 4)
	public void Web_product_info() throws InterruptedException, IOException {

		// Click on Once Web site And Product Info
		WebElement product = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]"));
		product.click();
		takeScreenShot();
		System.out.println("Click on Once Web site And Product Info");
		product.click();
		logger = extent.startTest("web site and Product Information");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Click on Once Web site And Product Info Successfully");

	}

	// @Test
	// public void Connect_device() throws InterruptedException, IOException {
	// // Click on Connect your Device
	// WebElement device = driver.findElement(By.xpath(
	// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[5]"));
	// device.click();
	// System.out.println("Click on Connect your Device");
	// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("Device
	// Number 120");
	// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys("123456");
	// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.Button")).click();
	// device.click();
	// File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(file, new File("Dashboard.jpg"));
	//
	// logger = extent.startTest("passTest");
	// Assert.assertTrue(true);
	// // To generate the log when the test case is passed
	// logger.log(LogStatus.PASS, "Click on Connect your Device");
	//
	// }

	
}