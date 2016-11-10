package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logins {
	WebDriver driver;
	
	@Given("^Valid users and Valid passwords$")
	public void testGiven(){
		driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void testWhen() throws InterruptedException{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
	}
	
	@Then("^Logins should  successful$")
	public void testThen(){
		System.out.println("login successful");
	}
}
