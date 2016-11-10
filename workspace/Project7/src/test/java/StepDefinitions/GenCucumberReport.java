package StepDefinitions;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberUsageReporting;

public class GenCucumberReport {
public static void main(String[] args) throws Exception {
	CucumberResultsOverview results = new CucumberResultsOverview();
	results.setOutputDirectory("target");
	results.setOutputName("cucumber-results");
	results.setSourceFile("./target/Json/cucumber.json");
	results.executeFeaturesOverviewReport();
	CucumberUsageReporting report = new CucumberUsageReporting();
	report.setOutputDirectory("target");
	report.setJsonUsageFile("./target/Json/cucumber.json");
	report.executeReport();
}
}
