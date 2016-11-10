package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature"
		,glue={"StepDefinitions"}
		,monochrome=true
		,dryRun=false
		,plugin = {"html:target/html/cucumber-html-report", "pretty"
				, "json:target/Json/cucumber.json"
				,"junit:target/Junit/cucumber.xml"}
		)
public class TestRunner {

}
