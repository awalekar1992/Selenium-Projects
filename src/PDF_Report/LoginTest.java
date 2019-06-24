package PDF_Report;

import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginTest {
//define a WebDriver named driver
 private WebDriver driver;
 //create a resultList that will contain number of test cases
 List<String> resultList=new ArrayList<String>();
 //create an instance of PdfUtilityClass
 PdfUtility pdfUtility=new PdfUtility();
 //login test
  @Test
  public void SeleniumMasterLoginTest() {
{
      //open login page
        driver.navigate().to("http://www.seleniummaster.com/seleniummastertestapp/index.php");
        //maximize the window
      driver.manage().window().maximize();
      //type in user name 
      driver.findElement(By.id("login_login_username")).sendKeys("test");
      //type in user password
      driver.findElement(By.id("login_login_password")).sendKeys("XXXXXX"); //here password is omitted
      //click on the submit button
     driver.findElement(By.id("login_submit")).click();
     //within 60 seconds try asserting that user logged on
       for (int second = 0;; second++) {
        if (second >= 60) Assert.fail("timeout");
        try { 
          assertEquals("Online users", driver.findElement(By.cssSelector("#sb-onlineusers > h3")).getText());
          //add test case to the resultList as pass
          resultList.add("2, Login to the site,User should be able to login, User logged in, Pass");
          break; } 
        catch (Exception e) {
          //add test case to the resultList as fail
          resultList.add("2, Login to the site,User should be able to login, User did not logged in, Fail");
        }
           }
         
      }
  }
  @BeforeTest
  public void Setup() {
//add test result header information to the resultList
	  resultList.add("Step Id, Action,Expected Result, Actual Result, Test Result");
try
{
  //initialize Firefox driver
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	// driver=new FirefoxDriver();
  //obtain windows handler name
	String windowsHandle=driver.getWindowHandle();
  //assert that a window has been launched
	assertEquals(true, windowsHandle.length()>0);
  //add a test step string to the resultList as pass after assertion true
	resultList.add("1, Open how trowser,Browser should open, Browser Opened, Pass");
}
catch(Exception e)
{
  //add a test step string to the resultList as fail after assertion true
  resultList.add("1, Open Browser,Browser should open, Browser NOT Opened, Fail");  
}
 
   }

  @AfterTest
  public void TearDown() throws COSVisitorException, IOException {
  //close the driver
 driver.close();
 //define a time stamp string to add to the test result 
 String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
 //add time stamp to the resultList
 resultList.add("Test Ends: " + timeStamp);
 //write the test result pdf file with file name TestResult
  pdfUtility.WriteTestResultToPdfFile("TestResult.pdf", resultList); 
  //quit the driver
 driver.quit();
  }

}
