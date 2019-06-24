package Once_LED;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Home_menu extends BaseTest {

	@Test(priority = 5)
	public void home_button()  throws InterruptedException, IOException  {
		
		WebElement home_button = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[1]"));
		home_button.click();
		System.out.println("Click on Home button");
		takeScreenShot();
		logger = extent.startTest(" Home button");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " Home button Successfully");
		
	}
	
	@Test(priority = 6)
	public void Devices() throws InterruptedException, IOException {		
		WebElement Devices = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]"));
		Devices.click();
		System.out.println("Click on Devices touch to select device");
		takeScreenShot();
		Devices.click();

		logger = extent.startTest(" Devices touch to select device");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " Devices touch to select device Successfully");
	}
	
	@Test(priority = 7)
	public void Schedule() throws InterruptedException, IOException {
		
		WebElement Schedule = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]"));
		Schedule.click();
		System.out.println("Click onSchedule: Touch to Load Schedule");
		takeScreenShot();
		logger = extent.startTest(" Schedule: Touch to Load Schedule");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " Schedule: Touch to Load Schedule working Successfully");
		Schedule.click();
	}
	
	
	@Test(priority = 8)
	public void Schedule_details() throws InterruptedException, IOException {
		
		WebElement Schedule_details = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]"));
		Schedule_details.click();
		System.out.println("Click on Schedule Details: Touch for Details");

		new TouchAction (driver).press(PointOption.point(0,924)).waitAction().moveTo(PointOption.point(32,88)).release().perform();

				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).click();
//				//((WebElement) e).click();
//				//Click on Channel
//				//e.selectByVisibleText("B");
//				//Select channel C
				//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
				//Click on Time
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")).click();
				//Select Hrs
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")).click();
				//Select Min
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")).click();
				///AM/PM
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.EditText")).click();
				//click on ok button
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
				//Click on Intensity
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.TextView")).click();
				//Select Intensity
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button")).click();
				// Done button
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
				//Click on Ramp 
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[4]/android.widget.TextView")).click();
				//Click on Link to Next Segment
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Switch")).click();
				//Click on Accept button
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button[1]")).click();
				new TouchAction (driver).press(PointOption.point(32,88)).waitAction().moveTo(PointOption.point(0,924)).release().perform();
		//Schedule_details.click();
		
		logger = extent.startTest(" Schedule Details: Touch for Details");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, " chedule Details: Touch for Details working Successfully");
	}
	
//	@Test(priority = 5)
//	public void Once_web_info() throws InterruptedException, IOException {
//		
//		WebElement Once_web_info = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]"));
//		Once_web_info.click();
//		System.out.println("Click on Once website and Product Info");
//		takeScreenShot();
//		//Once_web_info.click();
//
//		logger = extent.startTest(" Once website and Product Info");
//		Assert.assertTrue(false);
//		// To generate the log when the test case is passed
//		logger.log(LogStatus.PASS, " Once website and Product Info working Successfully");
//		Once_web_info.click();
//	}


}

