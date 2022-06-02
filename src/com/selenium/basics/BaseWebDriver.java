package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWebDriver {

	public static WebDriver driver;


	public static void launchChrome(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static void launchEdge(String url) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void launchFirefox(String url) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\firefoxdriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//Explicit Wait
	public static void ExplicitlyWait(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
	
	
	public static void close() {
		driver.close();
	}

}
