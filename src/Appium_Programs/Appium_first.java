package Appium_Programs;

import io.appium.java_client.remote.MobileCapabilityType;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class Appium_first {
 
 private static RemoteWebDriver driver;
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
 //File classpathRoot = new File(System.getProperty("user.dir"));
 //File appDir = new File(classpathRoot, "/Apps/Amazon/");
 //File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk");

 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
 //capabilities.setCapability("app", app.getAbsolutePath());
 //capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
 capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
 
 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
 Thread.sleep(10000);
 driver.quit();
 
 }
 
}