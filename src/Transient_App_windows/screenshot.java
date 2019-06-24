package Transient_App_windows;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
public class screenshot {
	public static String destDir;
	public static DateFormat dateFormat;
    public static String capture(WebDriver driver,String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        destDir = "TransientScreenShot";
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// Create folder under project with name "screenshots" provided to destDir.
		new File(destDir).mkdirs();
		// Set file name using current date time.
		String destFile = dateFormat.format(new Date()) + ".png";
        
        String dest = System.getProperty("user.dir") +"\\TransientScreenShot\\"+destFile+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                            
        return dest;
    }
}
