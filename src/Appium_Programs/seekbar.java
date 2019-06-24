package Appium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class seekbar 
{
     public static void main(String[] args)
     
     {         
     System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://jqueryui.com/slider/");
     driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
     WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
     Actions move = new Actions(driver);
     Action action = (Action) move.dragAndDropBy(slider, 150, 0).build();
     action.perform();
     driver.close();
}
}