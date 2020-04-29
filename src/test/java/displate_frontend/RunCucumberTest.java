package displate_frontend;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/displate_frontend/features"},
        plugin = {"pretty", "html:target/cucumberReport"},
        glue = {"displate_frontend.steps", "displate_frontend.infrastructure_driver"}
)
public class RunCucumberTest {
}
