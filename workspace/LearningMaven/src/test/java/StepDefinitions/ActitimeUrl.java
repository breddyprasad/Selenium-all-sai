package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActitimeUrl {
	WebDriver driver;
	@Given("^Browser$")
	public void launchBrowser(){
	//To launch the Broser
	 driver=new FirefoxDriver();
	}
	
	@When("^I pass the url$")
	public void passurl(){
		driver.get("http://demo.actitime.com");
	}
	
	@Then("^Browser should be launched$")
	public void verifyTitle(){
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	}
	

}
