import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ExtentReporting {

    public static ExtentHtmlReporter extenthtmlreports;
    public static ExtentReports extentreports;
    public static ExtentTest extentTest;


    public static void SetExtent()
    {
        extenthtmlreports = new ExtentHtmlReporter("target/ExtentReports/TEST2.html");
        extenthtmlreports.config().setDocumentTitle("Automation Report");
        extenthtmlreports.config().setReportName("TESTING OF DIVISION");
        extenthtmlreports.config().setTheme(Theme.DARK);

        extentreports = new ExtentReports();
        extentreports.attachReporter(extenthtmlreports);

        extentreports.setSystemInfo("Tester Name","USER3");
        extentreports.setSystemInfo("OS","Windows 10");



    }


    public  static void ExtentLogger(String Name)
    {
        extentTest = extentreports.createTest(Name);
    }
    public static  void endReport()
    {
        extentreports.flush();
    }



}
