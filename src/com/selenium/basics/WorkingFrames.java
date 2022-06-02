package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingFrames {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/frame.html");
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.id("Click")).click();
	driver.switchTo().parentFrame();
	
	driver.switchTo().frame(1);
	Thread.sleep(2000);
	driver.switchTo().frame("frame2");
	Thread.sleep(2000);
	driver.findElement(By.id("Click1")).click();
	driver.close();
	
	
	
	
	

	}

}
