package Transient_App_windows;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
public class Material_menu extends BaseClass{

	
    @Test(priority=1)
    public void Material()
    {
	
        driver.findElementByName("Material").click();
       System.out.println("Successfully click on Material");
     //  takeScreenShot();	
       logger = extent.startTest("Successfully click on Material");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Material");
    }
    
    @Test(priority=2)
    public void Manage_material()
    {
        //driver.findElementByName("Home").click();
    	    	Actions action3 = new Actions(driver);
        action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
          //  takeScreenShot();
       System.out.println("Successfully click on Manage_material");
       
       driver.findElementByAccessibilityId("txtMaterialName").sendKeys("Material2");
       
       driver.findElementByAccessibilityId("txtMateriala0").sendKeys("12");
       driver.findElementByAccessibilityId("txtMateriala1").sendKeys("13");
       driver.findElementByAccessibilityId("txtMateriala2").sendKeys("14");
       driver.findElementByAccessibilityId("txtMaterialr0").sendKeys("14");
       driver.findElementByAccessibilityId("txtMaterialr1").sendKeys("76");
       driver.findElementByAccessibilityId("txtMaterialr2").sendKeys("56");
       driver.findElementByAccessibilityId("txtMaterialk0").sendKeys("76");
       driver.findElementByAccessibilityId("txtMaterialk1").sendKeys("67");
       driver.findElementByAccessibilityId("txtMaterialk2").sendKeys("67");
       
       
        driver.findElementByName("Add New").click();
      // driver.findElementByName("Reset").click();
       
       //popup
        Actions action8 = new Actions(driver);
        action8.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
       logger = extent.startTest("Manage_material");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Manage_material");
    }
       
    @Test(priority=3)
    public void Edit_material()
    {
    	System.out.println("Edit");
    	//driver.findElementByName("Edit").click();
    	driver.findElementByAccessibilityId("btnEditMaterial").click();
    	logger = extent.startTest("Edit_material");
 		Assert.assertTrue(true);
 		// To generate the log when the test case is passed
 		logger.log(LogStatus.PASS, "Successfully click on Edit_material");
    	driver.findElementByName("Reset").click();
    	//driver.findElementByAccessibilityId("txtMateriala0").sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.findElementByAccessibilityId("txtMaterialName").sendKeys("Materia7871");
        
        driver.findElementByAccessibilityId("txtMateriala0").sendKeys("1782");
        driver.findElementByAccessibilityId("txtMateriala1").sendKeys("1783");
        driver.findElementByAccessibilityId("txtMateriala2").sendKeys("1874");
        driver.findElementByAccessibilityId("txtMaterialr0").sendKeys("1794");
        driver.findElementByAccessibilityId("txtMaterialr1").sendKeys("7786");
        driver.findElementByAccessibilityId("txtMaterialr2").sendKeys("5456");
        driver.findElementByAccessibilityId("txtMaterialk0").sendKeys("7456");
        driver.findElementByAccessibilityId("txtMaterialk1").sendKeys("6457");
        driver.findElementByAccessibilityId("txtMaterialk2").sendKeys("6457");
        
        
         driver.findElementByName("Save").click();
       // driver.findElementByName("Reset").click();
         
        //popup
         Actions action8 = new Actions(driver);
         action8.sendKeys(Keys.ENTER).build().perform();
    }
    
    @Test(priority=4)
    public void Delete_material()
    {
    	System.out.println("Delete");
    	//driver.findElementByName("Edit").click();
    	driver.findElementByAccessibilityId("btnDeleteMaterial").click();
        logger = extent.startTest("Delete_material");
  		Assert.assertTrue(true);
  		// To generate the log when the test case is passed
        Actions action18 = new Actions(driver);
        action18.sendKeys(Keys.ENTER).build().perform();
        action18.sendKeys(Keys.ENTER).build().perform();
    }

    @Test(priority=5)
    public void Material2()
    {
        driver.findElementByName("Material").click();
       System.out.println("Successfully click on Material");
       //  takeScreenShot();	
       logger = extent.startTest("Successfully click on Material");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Material");
    }

   @Test(priority=6)
    public void Import_material() throws InterruptedException
    {
    	Actions action7 = new Actions(driver);
        action7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).sendKeys("D:\\12.MTL").sendKeys(Keys.ENTER).build().perform();
	    System.out.println("Import_material.");
	    logger = extent.startTest(" Import_material Successfully ");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Import_material Successfully");
    }
  
   @Test(priority=7)
   	public void Material3()
  {
  //Mouse over
	  //action.moveToElement(element).perform();

	  //Right Click
	 // action.contextClick(element).perform();
      driver.findElementByName("Material").click();
     System.out.println("Successfully click on Material");
   //  takeScreenShot();	
     logger = extent.startTest("Successfully click on Material");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Successfully click on Material");
  }
   
   @Test(priority=8)
    public void Export_material() throws InterruptedException
    {
    	Actions action4 = new Actions(driver);
        action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
     ///   takeScreenShot();
        driver.findElementByName("Export").click();
        
        driver.findElementByName("Desktop").click();
                
        driver.findElementByName("OK").click();
	    System.out.println("Export_material.");
       logger = extent.startTest("Export_material Successfully");
		Assert.assertTrue(true);
		// To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Export_material Successfully");
    }
        
}



