package runner;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features/",
        //plugin = {"pretty", "html:target/cucumber-html-report"}
        plugin = { "json:target/cucumber.json", "pretty",
                "html:target/cucumber-reports" }
)
class runCusBank {
}