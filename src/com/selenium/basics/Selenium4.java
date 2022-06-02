package com.selenium.basics;

//import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium4.0\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//using the above() method
		WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
		//String emailLable = driver.findElement(with(By.tagName("label")).above(inputEmail)).getText();
		
		//System.out.println(emailLable);

	}

}
