package selenium1;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesExample {
	public static void main(String arg[]){
		WebDriver d = null;
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability("setUntrustedCert", true);
		c.setCapability("addcert", "");
		Proxy p = new Proxy();
		p.setProxyAutoconfigUrl("url");
		FirefoxProfile pr = new FirefoxProfile();
		//FirefoxBinary b = new FirefoxBinary("path to firefox.exe");
		
		d = new FirefoxDriver();
	}
	

}
