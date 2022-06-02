package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://stgwww.muslimmatch.com/");
		 driver.manage().window().maximize();
		 System.out.println("Site URL: "+driver.getCurrentUrl());
		 System.out.println("Domain Name: "+ driver.getTitle());
		 
		}


}
