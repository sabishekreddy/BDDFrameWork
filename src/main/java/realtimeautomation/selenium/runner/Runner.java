package realtimeautomation.selenium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "realtimeautomation.selenium.stepdefination" },
plugin = { "pretty","html:target/test-report/cucumber-reports","json:target/test-report/cucumber.json"}, features = {
				"src/main/resources/ui/feature" }, tags = { "@US0003" })

public class Runner {

}
