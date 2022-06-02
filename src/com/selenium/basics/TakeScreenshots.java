package com.selenium.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
//import org.apache.commons.io.FileUtils;

public class TakeScreenshots {
	
	public static void Screenshot(WebDriver driver, String screenshotName) throws IOException {
		File emailError = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(emailError, new File ("C:\\Users\\Prajula-50628\\Selenium4.0 Lib\\"+screenshotName+".png"));
		
	}

	public static void main(String[] args) throws IOException {
		int number = 0;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://muslimmatch.com");
		driver.findElement(By.xpath("//*[text()='Login']")).click();//navigating to the login page
		
		//please enter valid email - screenshot - using screenshot() method
		WebElement emailInput = driver.findElement(By.id("loginemail"));
		emailInput.sendKeys("abcdef");
		WebElement loginButton = driver.findElement(By.xpath("//*[text()='Login']"));
		loginButton.click();
		if(driver.findElement(By.xpath("//div[contains(text(), 'valid email')]")).isEnabled()) { 
			Screenshot(driver, "Please enter valid email");//you can use isEnabled() or isDisplayed()
		}
		
		
		//using screenshot method and calling them whenever needed - please enter email
		emailInput.clear();
		loginButton.click();
		if(driver.findElement(By.xpath("//div[text()='Please enter email']")).isEnabled()) { 
			Screenshot(driver, "Please enter email");//you can use isEnabled() or isDisplayed()
		}
		else {
		//dynamically changing screenshot numbers using  FileUtils
		while(number<1){
	File homepage =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(homepage, new File("C:\\Users\\Prajula-50628\\Selenium4.0 Lib\\Screenshot"+number+".png"));
	number++;
		}
		}
	driver.close();
		
		

	}

}
