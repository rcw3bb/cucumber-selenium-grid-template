package gradle.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = "pretty",
        glue = "gradle.cucumber.step",
        features = "src/test/resources/features")
public class CucumberRunner {
}
