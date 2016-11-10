package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Verify;


public class Selenium2 
{
	public static void main(String arg[]) throws Throwable{
		
		Selenium2Elements ele = new Selenium2Elements();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("day")));

		WebElement day = ele.getDay();
		//doAssertrue("ab", "cd", "note");
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(day);
		Select monthDD = new Select(ele.getMonth());
		select.selectByVisibleText("10");
		/*Assert.assertEquals("ipad", "IPAS");
		Assert.assertTrue("abc".equals("abnc"), "NOT Equal");*/
		monthDD.selectByIndex(2);
		Screenshot s= new Screenshot();
		s.takeScreenshot(driver, "abcd");
	}
	
	public static void doAssertrue(String exp, String act, String msg){
		Assert.assertTrue(exp.equals(act), msg);
	}
}
