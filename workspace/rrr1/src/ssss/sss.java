package ssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sss {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("ragahvendra.3545");
	}

}
