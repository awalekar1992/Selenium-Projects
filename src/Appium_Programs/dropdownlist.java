package Appium_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class dropdownlist {
 public static void main(String[] args) { 
	 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	//    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
 }
}
