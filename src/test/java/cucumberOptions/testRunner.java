package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// @RunWith(Cucumber.class)
    @CucumberOptions(
            features="/Users/sinanyavas/Documents/E2EProject/src/test/java/features",
            glue = "stepDefinations"
    )

    public class testRunner extends AbstractTestNGCucumberTests {



    }





