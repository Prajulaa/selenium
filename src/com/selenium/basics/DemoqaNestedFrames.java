package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaNestedFrames {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/nestedframes");
	
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/sampleiframe']"));
	driver.switchTo().frame(frame1);
	driver.switchTo().frame(0);

	}

}
