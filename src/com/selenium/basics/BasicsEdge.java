package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicsEdge {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver" , "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.muslimmatch.com/");
		 driver.manage().window().maximize();
		 System.out.println("Site URL: "+driver.getCurrentUrl());
		 System.out.println("Domain Name: "+ driver.getTitle());
		 System.out.println("Window Handle: "+ driver.getWindowHandle());

	}

}
