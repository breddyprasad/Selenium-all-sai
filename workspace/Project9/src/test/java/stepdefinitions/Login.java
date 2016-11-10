package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^Valid user and Valid password$")
	public void testGiven(){
		driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
	}
	
	@When("^I entered username and password$")
	public void testWhen() throws InterruptedException{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
	}
	
	@Then("^Login should be successful$")
	public void testThen(){
		System.out.println("login successful");
	}
}
