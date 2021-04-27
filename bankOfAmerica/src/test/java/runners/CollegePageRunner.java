package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"\"src/test/resources/features\" "},
        glue = {"step_definition"},
        tags = "",
        monochrome = true,
        plugin = {"pretty"}
)


public class CollegePageRunner {
}


//"src/test/resources/features"   src/test/resources/features/SearchForServices.feature