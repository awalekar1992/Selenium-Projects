package Appium;


import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Technosoft {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");

	// Initialize browser
	WebDriver driver=new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTechnosoft() throws Exception {
    driver.get("https://www.technosofteng.com/");
    driver.findElement(By.linkText("Industry")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Industry'])[3]/following::a[1]")).click();
    driver.findElement(By.linkText("Services")).click();
    driver.findElement(By.linkText("Overview")).click();
    driver.findElement(By.linkText("Contact Us")).click();
    driver.findElement(By.linkText("Careers")).click();
    driver.findElement(By.linkText("CURRENT OPENINGS")).click();
    driver.findElement(By.linkText("India")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
