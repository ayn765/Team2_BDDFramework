package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/WomenClothing.feature"},
        glue = {"step_definition"},
        tags = "Smoke",
        monochrome = true,
        plugin = {"pretty"}
)
public class FashionPageRunners {
}
