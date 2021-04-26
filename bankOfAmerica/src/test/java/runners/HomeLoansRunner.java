package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"step_definition"},
        tags = "@SearchNewConstruction",
        monochrome = true,
        plugin = {"pretty"}
)
public class HomeLoansRunner {
}
