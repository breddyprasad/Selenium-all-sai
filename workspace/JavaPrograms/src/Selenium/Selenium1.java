package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {
	
	public static void main(String a[]){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Ipad");
		System.out.println(ele.getAttribute("text"));
		driver.findElement(By.className("vh79eN")).click();
		
		
	
	}
	

}
