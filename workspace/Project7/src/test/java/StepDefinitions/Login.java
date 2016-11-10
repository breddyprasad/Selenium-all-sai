package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberUsageReporting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^Browser url and credentials$")
	public void testGiven() throws Exception{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com");
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
	
	@When("^we enter credentials$")
	public void testWhen(){
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pw")).sendKeys("manager");
	}
	
	@Then("^login should be successful$")
	public void testThen(){
		driver.findElement(By.linkText("Login")).click();
	}
	
	@When("^we clicked on logout button$")
	public void testWhen2(){
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Then("^logout should be successful$")
	public void testThen2(){
		System.out.println("logout is successful");
	}
}
