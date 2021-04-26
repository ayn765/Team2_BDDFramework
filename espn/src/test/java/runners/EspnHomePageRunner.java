package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps_definitions"},
        tags = "@Subscribe",
        monochrome = true,
        plugin = {"pretty"}
)
public class EspnHomePageRunner {
}
