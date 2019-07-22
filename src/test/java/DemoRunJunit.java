//import com.vimalselvam.cucumber.listener.ExtentProperties;
//import com.vimalselvam.cucumber.listener.Reporter;
//import com.cucumber.listener.ExtentProperties;
//import com.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * @desc: XXXX
 * @version:1.0.0
 * @author:Ding
 * @Date: 2019/6/21
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json","html:target/cucumber-report.html"}
//        format = {"json:target/cucumber-report.json","pretty"},
//        glue = {"com.vimalselvam.cucumber.stepdefinitions"},
//        tags = {
//                "~@performance","~@skip"
//        }
        )
public class DemoRunJunit {
    @BeforeClass
    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("target/extent-report/report.html");
        //  extentProperties.setExtentXServerUrl("http://localhost:1337");
        extentProperties.setProjectName("xxx");
    }

    @AfterClass
    public static void tearDown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));//1
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }

//    @Test(groups = "examples-testng", description = "Example of using TestNGCucumberRunner to invoke Cucumber")
//    public void runTest() {
//        new TestNGCucumberRunner(getClass());
//    }
}