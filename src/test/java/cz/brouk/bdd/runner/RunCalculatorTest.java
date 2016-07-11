package cz.brouk.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "cz.brouk.bdd.steps",
        features = "classpath:cucumber/calculator.feature"
)
public class RunCalculatorTest {
}
