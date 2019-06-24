package Transient_App_windows;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class Model_Menu extends BaseClass{

    @Test(priority=1)
    public void Model()
    {
        driver.findElementByName("Model").click();
       System.out.println("Successfully click on Model");
     //  takeScreenShot();	
       logger = extent.startTest("Successfully click on Model");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Model");
    }
//    
    @Test(priority=2)
    public void New_model()
    {
        //driver.findElementByName("Home").click();
    	Actions action3 = new Actions(driver);
        action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
          //  takeScreenShot();
       System.out.println("Successfully click on New Model");
       logger = extent.startTest("New Model");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on New Model");
    }
    @Test(priority=3)
    public void Model1()
    {
        driver.findElementByName("Model").click();
        
       System.out.println("Successfully click on Model");
       //takeScreenShot();
       
       logger = extent.startTest("Successfully click on Model");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Model");
    }

    @Test(priority=4)
    public void Import_model() throws InterruptedException
    {
    	Actions action4 = new Actions(driver);
        action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys("D:\\12.MTL").sendKeys(Keys.ENTER).build().perform();
       // takeScreenShot();
        //WebElement fileInput = driver.findElement(By.name("uploadfile"));
        //fileInput.sendKeys("D:\\12.MTL");
	    System.out.println("Exit from system.");
       logger = extent.startTest(" Import_model Successfully ");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Import_model Successfully");
    }
    
    @Test(priority=5)
    public void Model2()
    {
        driver.findElementByName("Model").click();
        
       System.out.println("Successfully click on Model is");
     //  takeScreenShot();	
       logger = extent.startTest("Successfully click on Model");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Model");
    }

    @Test(priority=6)
    public void Export_model() throws InterruptedException
    {
    	Actions action4 = new Actions(driver);
        action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
     ///   takeScreenShot();
	    System.out.println("Export_model.");
       logger = extent.startTest("Export_model Successfully");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Export_model Successfully");
    }
    
    
}



