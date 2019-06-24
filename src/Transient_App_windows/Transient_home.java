package Transient_App_windows;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class Transient_home extends BaseClass{

    @Test(priority=1)
    public void File()
    {
        driver.findElementByName("File").click();
       System.out.println("Successfully click on File");
      // takeScreenShot();	
       logger = extent.startTest("Successfully click on File ");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on File");
    }
//    
    @Test(priority=2)
    public void Home()
    {
        //driver.findElementByName("Home").click();
    	Actions action3 = new Actions(driver);
        action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
         //   takeScreenShot();
       System.out.println("Successfully click on File");
       logger = extent.startTest("Home button");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on home button");
    }
    @Test(priority=3)
    public void File1()
    {
        driver.findElementByName("File").click();
        
       System.out.println("Successfully click on File ");
     //  takeScreenShot();	
      // logger = extent.startTest("Successfully click on File");
		//Assert.assertTrue(true);
		// To generate the log when the test case is passed
		//logger.log(LogStatus.PASS, "Successfully click on File");
    }

	@Test(priority = 4)
	public void Exit_app() throws InterruptedException {
		// driver.findElementByName("Exit").click();
		// driver.findElementByAccessibilityId("mnuExit");
		// driver.findElementByXPath("//*[contains(@AutomationId,'mnuExit')]");
		Actions action4 = new Actions(driver);
		action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ESCAPE).build()
				.perform();
		System.out.println("Exit from system.");
		logger = extent.startTest("Successfully exit from the Application");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully exit from the Application");
	}
    
    
}


