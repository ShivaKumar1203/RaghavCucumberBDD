package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/Features",

        glue = "StepDefinitions",
        
        		  tags = "@tc01",

        plugin = {

                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"

        },

        monochrome = true,
        publish = true

)

public class TestRunner extends AbstractTestNGCucumberTests {

}