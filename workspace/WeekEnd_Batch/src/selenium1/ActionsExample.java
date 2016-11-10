package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {
	public static void main(String arg[]){
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		Actions a = new Actions(d);
		WebElement e = d.findElement(By.id("u_0_j"));
		a.moveToElement(e).doubleClick().build().perform();
		a.keyDown(Keys.ENTER);
		
	}

}
