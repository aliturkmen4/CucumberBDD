package TestRunners;

import Utils.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions","Utils"},
        tags = "",
        plugin = {"summary","pretty","html:Reports/CucumberReport/Reports.html"}
)


public class Runner extends AbstractTestNGCucumberTests {
    static WebDriver driver= DriverFactory.getDriver();

}
