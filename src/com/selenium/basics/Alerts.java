package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		//TO BE NOTED: Line 26
		//https://html.com/input-type-file/  -- file upload
		//https://demoqa.com/alerts - simple, confirmation and prompt alerts
		//https://rahulshettyacademy.com/AutomationPractice/ - RahulShetty alerts practice

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		//performing action on the simple alert
		WebElement alertButton = driver.findElement(By.id("alertbtn"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();//TO BE NOTED: Even when you give dismiss for simple alerts, it will work as alert.accept() only

		//performing action on the confirmation alert
		driver.findElement(By.id("confirmbtn")).click();
		alert.dismiss();

		//getting alert text
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Prajula Ravichandran");
		alertButton.click();
		System.out.println(alert.getText());
		alert.accept();

		driver.close();
	}
}
