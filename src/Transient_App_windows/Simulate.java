package Transient_App_windows;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class Simulate extends BaseClass{

    @Test(priority=1)
    public void Model()
    {
        driver.findElementByName("Stimulate").click();
       System.out.println("Successfully click on Model");
     //  takeScreenShot();	
       logger = extent.startTest("Successfully click on Model");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Model");
    }

    
    
}



