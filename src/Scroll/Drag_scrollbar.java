package Scroll;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Drag_scrollbar {

	AndroidDriver<WebElement> driver;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "emulator-5554");
		capability.setCapability(CapabilityType.VERSION, "9");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.tepl.oneled");
		capability.setCapability("appActivity", "com.tepl.oneled.MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void Manual_mode1() throws InterruptedException, IOException {

		WebElement Manual_mode1 = driver
				.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[3]"));
		Manual_mode1.click();
		System.out.println("Click on Home button");
	}

	@Test(priority = 2)
	public void Manual_settings() throws InterruptedException, IOException {

		WebElement seekBar = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.SeekBar\r\n"));
		seekBar.click();
		
		 
//		  //Get start point of seekbar.
//		  int startX = seekBar.getLocation().getX();
//		  System.out.println(startX);
//		  //Get end point of seekbar.
//		  int endX = seekBar.getSize().getWidth();
//		  System.out.println(endX);
//		  //Get vertical location of seekbar.
//		  int yAxis = seekBar.getLocation().getY();
//		  
//		  //Set sllebar move to position. 
//		  //endX * 0.6 means at 60% of seek bar width.
//		  int moveToXDirectionAt = (int) (endX * 0.6);
//		  System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
//		  
//		  //Moving seekbar using TouchAction class.
//		  TouchAction act=new TouchAction(driver);  
//		  act.press(startX,yAxis).moveTo(moveToXDirectionAt,yAxis).release().perform();  
		 
		// Timeout = null;

		// for (int i = 1; i <= 100 ; i++) {
		// Timeout.sendKeys(Keys.ARROW_RIGHT);
		// }
		// Actions move = new Actions(driver);
		// move.moveToElement(e).clickAndHold().moveByOffset(0,250).release().perform();
		// Thread.sleep(3500);
		// Actions act = new Actions(driver);
		// act.dragAndDropBy(Timeout, 50, 5).perform();
		// Reporter.log("Drag and Drop action is performed by Pixel at " + 50 + "to" + 5
		// + " Position");

		// Actions dragger = new Actions(driver);
		// //Element draggablePartOfScrollbar = driver.findElement(By.xpath("**xpath of
		// slider**"));
		// int numberOfPixelsToDragTheScrollbarDown = 500;
		// dragger.moveToElement(Timeout).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
	}
}
