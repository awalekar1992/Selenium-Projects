package Negative_Testing;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;

    @DataProvider(name="login")
    public Object[][] getData() {
        return new Object[][] {
        	  {"Oren@email.com", "test",false},
              {"test@email.com", "abcabc",true}
        };
    }

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Jar Files\\chromedriver_win32 (1)\\chromedriver.exe");
    	driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com");
    }

    @Test(dataProvider="login")
    public void letsKodeIt(String usernameEmail, String password, boolean shouldSucceed) throws InterruptedException {
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("user_email"));
        emailField.sendKeys(usernameEmail);
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.name("commit"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Invalid email or password.')]"));
        WebElement userSettings = driver.findElement(By.xpath("//div[@id='navbar']//img[@alt='test@email.com']"));

        if (shouldSucceed) {
            Assert.assertFalse(errorMessage.isDisplayed());      
            Assert.assertTrue(userSettings.isDisplayed());
        } else {
            Assert.assertTrue(errorMessage.isDisplayed());      
            Assert.assertFalse(userSettings.isDisplayed());
        }
    }

    @AfterMethod
    public void afterEachMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
