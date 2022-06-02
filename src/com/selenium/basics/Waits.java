package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void explicitWait(WebDriver driver, long timeout, WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");


	}

}
