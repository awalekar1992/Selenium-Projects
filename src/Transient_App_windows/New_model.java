package Transient_App_windows;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class New_model extends BaseClass {
	

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
    public void New_model2()
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
    public void Setup_data()
    {

//    	//Model Description
    	driver.findElementByAccessibilityId("txtModelName").sendKeys("Santosh Awalekar");
    	//driver.findElementByClassName("TextBox").sendKeys("Santosh Awalekar");
    	//driver.findElementById("7.3608.2B10BB1").sendKeys("Santosh Awalekar");
//    	//Ceramic Plate Type
		driver.findElementByAccessibilityId("cmbCeramicType").click();
		driver.findElementByName("BEO").click();
		
		//Number of Stages
		driver.findElementByAccessibilityId("txtNoOfStages").sendKeys("1");
		
		//Exposed Cold plates
		driver.findElementByAccessibilityId("rdoExposeColdPlateYes").click();
		
		//Conduction Losses between Stages
		driver.findElementByAccessibilityId("rdoConductanceLossesPlateYes").click();
		
		
		//Operating environment
		driver.findElementByAccessibilityId("cmbEnyType").click();
		driver.findElementByName("Argon").click();
    }
    @Test(priority=4)
    public void Cooler_Geometry()
    {

    	driver.findElementByAccessibilityId("btnCoolerGeometry").click();

		driver.findElementByAccessibilityId("CPLS").sendKeys("53452");
		
		
		driver.findElementByAccessibilityId("TEMPTLP").click();
		driver.findElementByName("Material Data 2 N").click();
		
		
		
		driver.findElementByAccessibilityId("TEWP").sendKeys("97892");
		
	
		driver.findElementByAccessibilityId("TELP").sendKeys("89872");
    
		driver.findElementByAccessibilityId("TEMPTLN").click();
		driver.findElementByName("Material2").click();
		
    
		driver.findElementByAccessibilityId("TEWN").sendKeys("2789");
		
		
		driver.findElementByAccessibilityId("TELN").sendKeys("9872");
		
		
		driver.findElementByAccessibilityId("TABW").sendKeys("7892");
		
		
		driver.findElementByAccessibilityId("TABL").sendKeys("6452");
		
		
		driver.findElementByAccessibilityId("TABT").sendKeys("7892");
		
		
		driver.findElementByAccessibilityId("METW").sendKeys("782");
		
		
		driver.findElementByAccessibilityId("METL").sendKeys("289");
		
		

		driver.findElementByAccessibilityId("METT").sendKeys("2879");
		
		
		driver.findElementByAccessibilityId("CERW").sendKeys("298");
		
		
		driver.findElementByAccessibilityId("CERL").sendKeys("289");
		
		
		driver.findElementByAccessibilityId("CERT").sendKeys("122");
			
		
    }
    @Test(priority=5)
    public void Nodes()
    {

    	driver.findElementByAccessibilityId("btnNodesData").click();

		driver.findElementByAccessibilityId("txtPower").sendKeys("53452");

    
		driver.findElementByAccessibilityId("txtTemp").sendKeys("2789");
		
		
		//Click on Add Node
//		driver.findElementByName("Add Node").click();
//		
//
//		driver.findElementByAccessibilityId("txtNodeNumber").sendKeys("78");
//
//    
//		driver.findElementByAccessibilityId("txtNodeName").sendKeys("78");
//		
//		
//		driver.findElementByAccessibilityId("txtThermalMass").sendKeys("78");
//		
//		
//		driver.findElementByAccessibilityId("txtPower").sendKeys("78");
//		
//		
//		driver.findElementByAccessibilityId("txtTemp").sendKeys("78");
		
		//Delete Button
	//	driver.findElementByAccessibilityId("btnNodeDelete").click();
		
    }
    @Test(priority=6)
    public void Convection_Radiation_nodes()
    {

    	driver.findElementByAccessibilityId("btnConRadNodes").click();

    	driver.findElementByAccessibilityId("convection").click();
		driver.findElementByName("3").click();
		
		driver.findElementByAccessibilityId("radiation").click();
		driver.findElementByName("4").click();
    }
    
    @Test(priority=7)
    public void Inter_Nodel_Conductances()
    {

    	driver.findElementByAccessibilityId("btnInterNodelConduct").click();

//    	driver.findElementByAccessibilityId("convection").click();
//		driver.findElementByName("3").click();
//		
//		driver.findElementByAccessibilityId("radiation").click();
//		driver.findElementByName("4").click();
    }
    
    @Test(priority=8)
    public void Inter_nodel_Raidances()
    {

    	driver.findElementByAccessibilityId("btnInterNodelRad").click();

//    	driver.findElementByAccessibilityId("convection").click();
//		driver.findElementByName("3").click();
//		
//		driver.findElementByAccessibilityId("radiation").click();
//		driver.findElementByName("4").click();
    }
    
    
    @Test(priority=9)
    public void Node_Averaging()
    {

    	driver.findElementByAccessibilityId("btnNodeAveraging").click();

     	driver.findElementByAccessibilityId("Node1").click();
    	driver.findElementByName("3").click();
    		
    	driver.findElementByAccessibilityId("Node2").click();
    	driver.findElementByName("1").click();
    	
    	driver.findElementByAccessibilityId("Node3").click();
    	driver.findElementByName("3").click();
    		
    	driver.findElementByAccessibilityId("Node4").click();
    	driver.findElementByName("2").click();
    	
    	driver.findElementByAccessibilityId("Node5").click();
    	driver.findElementByName("3").click();
    		
    	driver.findElementByAccessibilityId("Node6").click();
    	driver.findElementByName("3").click();
    	
    	driver.findElementByAccessibilityId("Node7").click();
    	driver.findElementByName("3").click();
    		
    	driver.findElementByAccessibilityId("Node8").click();
    	driver.findElementByName("1").click();
    	
    	driver.findElementByAccessibilityId("Node9").click();
    	driver.findElementByName("4").click();
    		
    	driver.findElementByAccessibilityId("Node10").click();
    	driver.findElementByName("2").click();
    }
    @Test(priority=10)
    public void Node_To_Monitor()
    {

    	driver.findElementByAccessibilityId("btnNodesToMonitor").click();

    	//Click on Add Node
		driver.findElementByName("Add Node").click();
		
    	driver.findElementByAccessibilityId("Node1").click();
		driver.findElementByName("3").click();
		
		//Click on Add Node
		driver.findElementByName("Add Node").click();
		
		driver.findElementByAccessibilityId("Node2").click();
		driver.findElementByName("4").click();
    }
    @Test(priority=11)
    public void Maultiple_case_Setup()
    {

    	driver.findElementByAccessibilityId("btnMultipleCaseSetup").click();

    	//Click on Add Node
		//driver.findElementByName("Add Node").click();
    	
    	driver.findElementByAccessibilityId("InitTemp").sendKeys("256.00");
    	
    	
    	driver.findElementByAccessibilityId("SourceValue").sendKeys("235.2");
    	driver.findElementByAccessibilityId("SourceType").click();
		driver.findElementByName("W").click();
		
		driver.findElementByAccessibilityId("HeatLoad").sendKeys("52.23");
		
		driver.findElementByAccessibilityId("Recording").sendKeys("58.2");
		driver.findElementByAccessibilityId("RecordingType").click();
		driver.findElementByName("Temp").click();
		
		driver.findElementByAccessibilityId("MaxTime").sendKeys("5689.235");
		
		driver.findElementByAccessibilityId("MaxTemp").sendKeys("124.542");
		
		driver.findElementByAccessibilityId("Reset").click();
		driver.findElementByName("True").click();
		
		driver.findElementByAccessibilityId("Time").sendKeys("178752.55");
		
    }
    
    
    @Test(priority=12)
    public void output_Routing_options()
    {

    	driver.findElementByAccessibilityId("btnOutputRoutingOptions").click();

    	//Model data
    	driver.findElementByAccessibilityId("rdoMScreenYes").click();
			
		driver.findElementByAccessibilityId("rdoMPrinterNo").click();
		
		driver.findElementByAccessibilityId("rdoMFileYes").click();
		
		//Trasient Data
		driver.findElementByAccessibilityId("rdoTScreenNo").click();
		
		driver.findElementByAccessibilityId("rdoTPrinterYes").click();
		
		driver.findElementByAccessibilityId("rdoTFileNo").click();
	
    }
    @Test(priority=12)
    public void Simulate_and_SaveModel()
    {
    	//Save Model
    	driver.findElementByName("Save Model").click();
    	
    	//Simulate
    	driver.findElementByName("Simulate").click();

	
    }
    
    
}
