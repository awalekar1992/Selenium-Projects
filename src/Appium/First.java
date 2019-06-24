package Appium;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class First {

  WebDriver driver;
  ExtentReports extent;
  ExtentTest logger;
 @BeforeTest
 public void setUp() throws MalformedURLException {
	//File app = new File("C:\\Users\\santosh.awalekar\\Downloads", "onceled.apk");
	 
	 //To create an object of Desired Capabilities
	 DesiredCapabilities capability = new DesiredCapabilities();
	//OS Name
	 capability.setCapability("deviceName","emulator-5554");
	// capability.setCapability("device","emulator-5554");
	// capability.setCapability(CapabilityType.BROWSER_NAME, "");
	//Mobile OS version. In My case its running on Android 4.2
	 capability.setCapability(CapabilityType.VERSION, "9");
	// capability.setCapability("app", app.getAbsolutePath());
	//To Setup the device name

	 capability.setCapability("platformName","Android");
	//set the package name of the app
	capability.setCapability("appPackage", "com.tepl.oneled");
	 //set the Launcher activity name of the app
	capability.setCapability("appActivity", "com.tepl.oneled.MainActivity");
	
 	 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 //ExtentReports(String filePath,Boolean replaceExisting) 
	 //filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
	 //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
	 //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
	 //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
	 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
	 //extent.addSystemInfo("Environment","Environment Name")
	 extent
	                .addSystemInfo("Host Name", "Once LED Application")
	                .addSystemInfo("Environment", "Automation Testing")
	                .addSystemInfo("User Name", "Santosh Awalekar");
	                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
	                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
	                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));

 }
 @Test
 public void Dashboard() throws InterruptedException, IOException
{

	 // Register
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]")).click();
     System.out.println("Click on Register");
     logger = extent.startTest("passTest");
     Assert.assertTrue(true);
     //To generate the log when the test case is passed
     logger.log(LogStatus.PASS, "Click on Register Succssfully");
	 //Click on Farm Type
     WebElement farm = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]"));
     farm.click();
     System.out.println("Click on Farm Type");
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).click();
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[3]\r\n")).getText();
     farm.click();
     logger = extent.startTest("passTest");
     Assert.assertTrue(true);
     //To generate the log when the test case is passed
     logger.log(LogStatus.PASS, "Click on Farm Type");
	  //Clik on Select Your Lights
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]")).click();
	  System.out.println("Clik on Select Your Lights");
	   logger = extent.startTest("passTest");
	     Assert.assertTrue(true);
	     //To generate the log when the test case is passed
	     logger.log(LogStatus.PASS, "Clik on Select Your Lights");
	  //Click on Once Website And Product Info
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]")).click();
	  System.out.println("Click on Once Website And Product Info");
	   logger = extent.startTest("passTest");
	     Assert.assertTrue(true);
	     //To generate the log when the test case is passed
	     logger.log(LogStatus.PASS, "Click on Once Website And Product Info Successfully");
	  //Click on Connect your Device
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[5]")).click();
	 System.out.println("Click on Connect your Device");
	   logger = extent.startTest("passTest");
	     Assert.assertTrue(true);
	     //To generate the log when the test case is passed
	     logger.log(LogStatus.PASS, "Click on Connect your Device");
	 File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("Dashboard.jpg"));
	 
	
//	 
}
 @Test
 public void Home() throws InterruptedException, IOException
{
	// Click on Home
		 driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[1]")).click();
		 
		 //Click on Devices:ouch to
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]")).click();
		 
		 //Schedule
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]")).click();
		 
		 //Schedule Deails
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]")).click();
		 
		 // Once website
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]")).click();
		 File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("Home.jpg"));
}

 @Test
 public void Setting() throws InterruptedException, IOException
{
	//Click on Setting
		 WebElement a = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[2]"));
		 a.click();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 a.click();
		 //Device and Firmware
		 WebElement b = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[1]"));
		 b.click();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 b.click();
		 //schedule
		 WebElement c = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[2]"));
		 c.click();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 c.click();
		 //Ramp Rates
		 WebElement d =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[3]"));
		 d.click();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 d.click();
		 //System
		 WebElement e =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout[4]"));
		 e.click();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 e.click();
		 File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("Setting.jpg"));
}
 
 
 @Test
 public void OnceLED() throws InterruptedException, IOException
{
	 driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Once Led\"])[3]")).click();
	 File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("LED.jpg"));
}
 @AfterMethod
 public void getResult(ITestResult result){
 if(result.getStatus() == ITestResult.FAILURE){
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
 	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
 	}else if(result.getStatus() == ITestResult.SKIP)
 {
 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
 }
 // ending test
 //endTest(logger) : It ends the current test and prepares to create HTML report
 extent.endTest(logger);
 }
@AfterTest
 public void End()
{

  extent.flush();
  //Call close() at the very end of your session to clear all resources. 
  //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
  //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
  //Once this method is called, calling any Extent method will throw an error.
  //close() - To close all the operation
  extent.close();
  driver.close();
}
}
