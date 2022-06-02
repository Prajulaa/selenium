package com.selenium.basics;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RobotEx {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Robot mo = new Robot();
//		mo.keyPress(KeyEvent.VK_CONTROL);
		mo.keyPress(KeyEvent.VK_SHIFT);
		mo.keyPress(KeyEvent.VK_N);
		
		mo.keyRelease(KeyEvent.VK_CONTROL);
		mo.keyRelease(KeyEvent.VK_SHIFT);
		mo.keyRelease(KeyEvent.VK_N);
		Thread.sleep(3000);
		
		File ss =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File ("desktop\\Screenshot.png"));
//		driver.close();
//		driver.quit();

	}

}
