package PDF_repo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import reporter.JyperionListener;

//Add listener for pdf report generation

//@Listeners(JyperionListener.class)

public class PDF_report extends BaseClass {

    WebDriver driver;

    //Testcase failed so screen shot generate

    @Test

    public void testPDFReportOne(){

        driver = BaseClass.getDriver();

        driver.get("http://google.com");

        Assert.assertTrue(false);

    }

    

    //Testcase failed so screen shot generate

    @Test

    public void testPDFReporTwo(){

        driver = BaseClass.getDriver();

        driver.get("http:/guru99.com");

        Assert.assertTrue(false);

    }

    

    //Test test case will be pass, so no screen shot on it

    @Test

    public void testPDFReportThree(){

        driver = BaseClass.getDriver();

        driver.get("http://demo.guru99.com");

        Assert.assertTrue(true);

    }
}
