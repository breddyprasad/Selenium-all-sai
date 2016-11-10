package selenium1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fileHandling.propertiesReader;

public class class1 {
	
	public static void main(String arg[]) throws Throwable{
		WebDriver d = null;
		propertiesReader p = new propertiesReader();
		String browser = p.getValue("browser");
		String url = p.getValue("url");
		if(browser.equalsIgnoreCase("firefox")){
			d = new FirefoxDriver();
		}else{  // chrome 
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			d = new ChromeDriver();
		}
		d.manage().window().maximize();
		d.get(url);
		WebElement e = d.findElement(By.id("loginsubmit"));
		/*e.sendKeys("Ipad");
		d.findElement(By.xpath("//input[@type='submit']")).click();*/
		e.click();
		Thread.sleep(2000);
		Set<String> handles = d.getWindowHandles();
		String[] handle = new String[handles.size()];
		int i = 0;
		for (String s:handles){
			handle[i] = s;
			i++;
		}
		System.out.println(Arrays.toString(handle));
		
		d.switchTo().window(handle[1]);
		System.out.println("d = > "+d.getTitle());
		d.findElement(By.xpath("//img[contains(@alt,'Continue')]")).click();
		
		
		

	}

}
