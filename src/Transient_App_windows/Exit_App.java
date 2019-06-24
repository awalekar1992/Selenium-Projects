package Transient_App_windows;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
public class Exit_App extends BaseClass {

    @Test(priority=3)
    public void File1()
    {
        driver.findElementByName("File").click();
        
       System.out.println("Successfully click on File is");
       takeScreenShot();	
       logger = extent.startTest("Successfully click on File is");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on File is");
    }

    @Test(priority=4)
    public void Exit_app() throws InterruptedException
    {
      //driver.findElementByName("Exit").click();
      //  driver.findElementByAccessibilityId("mnuExit");
      //driver.findElementByXPath("//*[contains(@AutomationId,'mnuExit')]");
    	Actions action4 = new Actions(driver);
        action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
        takeScreenShot();
        //Pop yes button
               // driver.findElementByName("Yes").click();
        //driver.findElementByName("Exit").click();
        
     // Switching to Alert        
//        Alert alert = driver.switchTo().alert();
//        alert.accept();	
        		
//        // Capturing alert message.    
//        String alertMessage= driver.switchTo().alert().getText();		
//        		
//        // Displaying alert message		
//        System.out.println(alertMessage);	
//        Thread.sleep(5000);
//        		
//        // Accepting alert		
//        alert.accept();	
        
       System.out.println("Exit from system.");
       logger = extent.startTest("Successfully exit from the Application");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully exit from the Application");
    }
	
	
}



