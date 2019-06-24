package Scroll;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Swipedemo {
 private static final int Prority = 0;
AndroidDriver<WebElement> driver;
 	ExtentReports extent;
	ExtentTest logger;
	Dimension size;
	String destDir;
	DateFormat dateFormat;
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//public AndroidDriver driver1;
	@BeforeTest
	public void setUp() throws MalformedURLException {
		// File app = new File("C:\\Users\\santosh.awalekar\\Downloads", "onceled.apk");
		DesiredCapabilities capability = new DesiredCapabilities();
		// OS Name
		capability.setCapability("deviceName", "emulator-5554");

		capability.setCapability(CapabilityType.VERSION, "9");
		// capability.setCapability("app", app.getAbsolutePath());
		capability.setCapability("platformName", "Android");

		capability.setCapability("appPackage", "com.tepl.oneled");

		capability.setCapability("appActivity", "com.tepl.oneled.MainActivity");

		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		extent = new ExtentReports(System.getProperty("user.dir") + "/OnceLED/STMExtentReport.html", true);
		// extent.addSystemInfo("Environment","Environment Name")
		extent.addSystemInfo("Host Name", "Once LED Application").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Santosh Awalekar");

		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));

		
	}

	@Test(priority = 1)
	public void home_button()  throws InterruptedException, IOException  {
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[1]")).click();
		//home_button.click();
		System.out.println("Click on Home button");
	
	}
 @Test(priority = 2)
 public void ScrollToText() throws InterruptedException {
		WebElement Schedule_details = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]"));
		Schedule_details.click();
		System.out.println("Click on Schedule Details: Touch for Details");
		new TouchAction (driver).press(PointOption.point(0,924)).waitAction().moveTo(PointOption.point(32,88)).release().perform();
		//new TouchAction (driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(0, 60)).release().perform();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")).click();
//		//Select Hrs
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")).click();
//		//Select Min
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")).click();
//		///AM/PM
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.EditText")).click();
//		//click on ok button
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
//		//Click on Intensity
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.TextView")).click();
//		//Select Intensity
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button")).click();
//		// Done button
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
//		//Click on Ramp 
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[4]/android.widget.TextView")).click();
//		//Click on Link to Next Segment
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Switch")).click();
		//Click on Accept button
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button[1]")).click();
//		WebElement grap = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup"));
//		TouchActions action = new TouchActions(driver);
//		action.singleTap(grap);
//		action.perform();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	TouchAction t2 =  new TouchAction (driver).press(PointOption.point(16,188)).waitAction().moveTo(PointOption.point(130,970)).release().perform();
		
//		//TouchAction t3 =  new TouchAction (driver).press(PointOption.point(16,188)).waitAction().moveTo(PointOption.point(130,1050)).release().perform();
//		
		Schedule_details.click();
 }
 @Test(priority = 3)
	public void Once_web_info() throws InterruptedException, IOException {
		
		WebElement Once_web_info = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]"));
		Once_web_info.click();
		System.out.println("Click on Once website and Product Info");
		Once_web_info.click();
	}
 @AfterTest
 public void End() {
  driver.quit();
 }
}