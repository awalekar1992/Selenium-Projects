package Appium_Programs;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileCapabilityType;
public class Appium_second {
  public static URL url;
  public static DesiredCapabilities capabilities;
  public static RemoteWebDriver driver;
  //1
  @BeforeSuite
  public void setupAppium() throws MalformedURLException {
    //2
    final String URL_STRING = "http://0.0.0.0:4723/wd/hub";
    url = new URL(URL_STRING);
//3
    capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
    capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk");
    //capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    //4
    driver = new RemoteWebDriver(url, capabilities);
   // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   //driver.resetApp();
  }
  //5
  @AfterSuite
  public void uninstallApp() throws InterruptedException {
    //driver.removeApp("com.example.android.contactmanager");
  }
  //6
  @Test (enabled=true) public void myFirstTest() throws InterruptedException {
   // driver.resetApp();
  }
}