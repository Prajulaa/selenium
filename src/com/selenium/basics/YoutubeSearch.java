package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		WebElement searchText = driver.findElement(By.xpath("//div[@id= 'search']"));
		searchText.sendKeys("Gokul's Cringe");
		
		WebElement searchIcon = driver.findElement(By.id("search-icon-legacy"));
		searchIcon.click();
	}
}
