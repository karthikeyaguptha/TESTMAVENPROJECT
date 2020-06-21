import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLibrary {


    public static WebDriver driver;


    @BeforeClass
    public  static void OB()
    {
        ExtentReporting.SetExtent();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe"); //Browser Path
        driver = new ChromeDriver();//Selenium Chrome Browser
        driver.get("https://www.google.com");//Opening the URL

    }

    @Test
    public  void TEST1()
    {
        ExtentReporting.ExtentLogger("TEST1");
        System.out.println(driver.getCurrentUrl());
        String URL_INFO = driver.getCurrentUrl();
        String ACT_URL_INFO = "https://www.google.com/";
        try
        {
            Assert.assertEquals(URL_INFO,ACT_URL_INFO);
            ExtentReporting.extentTest.pass("PASSED");
        }
        catch (Throwable e)
        {

            ExtentReporting.extentTest.fail("FAILED");
        }

    }


    @AfterClass
    public  static void CB()
    {
        ExtentReporting.endReport();
        driver.close();//which closes the browser
    }

}
