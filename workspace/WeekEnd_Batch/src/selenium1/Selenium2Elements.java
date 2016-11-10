package selenium1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selenium2Elements {
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}
	
}
