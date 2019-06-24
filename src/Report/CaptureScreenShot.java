package Report;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
public class CaptureScreenShot {
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd SSS");
	  public static String captureScreen(WebDriver driver, String screenName, ITestResult arg0) throws IOException{
		
		//TakesScreenshot screen = (TakesScreenshot) driver;
		//File src = screen.getScreenshotAs(OutputType.FILE);
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File src = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		//File src = ((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
		 //File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File destiny = new File(fileName);
		   driver = (WebDriver)arg0.getTestContext().getAttribute("webDriver");
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"//Test-ScreenShots//"+screenName+".png";
		
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		
		return dest;
	}
	
	public static String generateFileName(ITestResult result){
		Date date = new Date();
		String fileName = result.getName()+ "_" + dateFormat.format(date);
		return fileName;
		
	}

}
