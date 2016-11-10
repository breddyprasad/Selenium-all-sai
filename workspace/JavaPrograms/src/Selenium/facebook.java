package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class facebook {
	public static void main(String args[]){
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		WebElement e = d.findElement(By.id("day"));
		Select sel = new Select(e);
		sel.selectByVisibleText("10");
		Assert.assertTrue(condition, "NOT Equal");
		Assert.assertEquals(actual, expected);
		Assert.assertFalse(condition, "Matched..");
		
	}
}
