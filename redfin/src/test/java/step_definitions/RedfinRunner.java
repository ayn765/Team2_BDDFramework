package step_definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/",
        glue = {"step_definitions"},
        /// to generate different type of reporting
        plugin = {"pretty"},

        monochrome = true,

        tags = "(@Smoke) and (not @Regression)"



)
public class RedfinRunner {
}
