package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/ShopBMWByModel.feature"},
        glue = {"step_definition"},
        tags = "",
        monochrome = true,
        plugin = {"pretty"}
)

public class ModelsPageRunnerClass {
}

//"\"src/test/resources/features\""