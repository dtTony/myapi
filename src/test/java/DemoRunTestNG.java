//import com.aventstack.extentreports.ResourceCDN;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ResourceCDN;
//import com.cucumber.listener.Reporter;
//import com.vimalselvam.cucumber.listener.Reporter;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ResourceCDN;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import sun.net.NetworkServer;

import java.io.File;
//加入注释语句位置，不能运行所有用例集合
//@RunWith(Cucumber.class)
//@ContextConfiguration("classpath:cucumber.xml")
@CucumberOptions(
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html"},
//        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        features = {"src/test/resources/"}
//        glue = {"com.cucumber.demo","com.po.demo"},
//        monochrome = true
)
public class DemoRunTestNG extends AbstractTestNGCucumberTests {
//    public class DemoRunTestNG {
    @BeforeClass
    public static void setup() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/extent-report/report.html");
        htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
        ExtentReports extent = new ExtentReports();
//        htmlReporter.config().setCSS("../../dist/css/extent.css");
//        htmlReporter.config().setJS("../../dist/js/extent.js");

    }

    @AfterClass
    public static void tearDown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));//1
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }

}