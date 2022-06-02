package com.aiite.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePageActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		driver.findElement(By.cssSelector("#nav-xshop")).click();
		
		//actions functions
WebElement account = driver.findElement(By.cssSelector("#nav-link-accountList"));
action.moveToElement(account).build().perform();
WebElement account_recommendations = driver.findElement(By.xpath("//span[text()='Recommendations']"));
action.click(account_recommendations).build().perform();

WebElement languageChange = driver.findElement(By.id("glow-ingress-line2"));
action.click(languageChange).build().perform();
		
	
		
		

	}

}
