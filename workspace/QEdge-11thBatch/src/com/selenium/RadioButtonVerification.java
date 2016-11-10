package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonVerification {
	public static void main(String[] args) {
		//To launch the Browser
		WebDriver driver=new FirefoxDriver();
		//To pass the url
		driver.get("http://facebook.com");
		//To click on female radio button
		WebElement radioButtonRef=driver.findElement(By.id("u_0_e"));
		boolean radionButtonStatusBC=radioButtonRef.isSelected();
		System.out.println(radionButtonStatusBC);
		radioButtonRef.click();
		boolean radioButtonStatusAC=radioButtonRef.isSelected();
		System.out.println(radioButtonStatusAC);
}

}