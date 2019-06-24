package WinApp;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Transient extends BaseTest{

    private static final int Home = 0;
//	@Test(priority=1)
//    public void File1()
//    {
//        driver.findElementByName("File").click();
//        takeScreenShot();
//       System.out.println("Successfully click on File is");
//       logger = extent.startTest("Successfully click on File is");
//		Assert.assertTrue(true);
//		// To generate the log when the test case is passed
//		logger.log(LogStatus.PASS, "Successfully click on File is");
//    }

//    @Test(priority=2)
//    public void File()
//    {
//       driver.findElementByName("File").click();
//        takeScreenShot();
//        System.out.println("Successfully click on File is");
//        Actions action3 = new Actions(driver);
//        action3.sendKeys(Keys.ARROW_DOWN).click().build().perform();
        
//       
       // builder.click();
//        System.out.println("New Model");
//        takeScreenShot();
//        Actions action = new Actions(driver);
//        
//        action.moveToElement(element).perform();
// 
//        WebElement subElement = driver.findElement(By.linkText("iPads"));
// 
//        action.moveToElement(subElement);
// 
//        action.click();
// 
//        action.perform();
//       System.out.println("Successfully click on File is");
//       logger = extent.startTest("Successfully click on File is");
//		Assert.assertTrue(true);
//		// To generate the log when the test case is passed
//		logger.log(LogStatus.PASS, "Successfully click on File is");
//    }

//    @Test(priority=3)
//    public void Home()
//    {
//        driver.findElementByClassName("MenuItem").click();
//            takeScreenShot();
//       System.out.println("Successfully click on File is");
//       logger = extent.startTest("Successfully click on File is");
//		Assert.assertTrue(true);
//		// To generate the log when the test case is passed
//		logger.log(LogStatus.PASS, "Successfully click on File is");
//    }
    @Test(priority=4)
    public void New_model()
    {
        driver.findElementByName("Model").click();
        Actions action3 = new Actions(driver);
        action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       // driver.findElementByName("New Model").click();
        takeScreenShot();
       System.out.println("Successfully click on File is");
       logger = extent.startTest("Successfully click on File is");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on File is");
    }
   
//    @Test(priority=3)
//    public void Home1()
//    {
//        driver.findElementByClassName("Home").click();
//            takeScreenShot();
//       System.out.println("Successfully click on File is");
//       logger = extent.startTest("Successfully click on File is");
//		Assert.assertTrue(true);
//		// To generate the log when the test case is passed
//		logger.log(LogStatus.PASS, "Successfully click on File is");
//    }
    
}

