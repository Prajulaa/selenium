package com.aiite.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MuslimMatchLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://stgwww.muslimmatch.com/");
	

		//getting the links in the page
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		int tagsCount = tags.size();
		System.out.println("Total number of tags in the homepage is: "+tagsCount);
		//getting the text of each tag
		for(WebElement tagName: tags) {
			System.out.println(tagName.getText());
		}

		//using Link Text
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();

		System.out.println("Application Name: "+driver.findElement(By.className("reglogotxt")).getText());
		driver.findElement(By.id("loginemail")).sendKeys("prajularavi@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("password");
		driver.findElement(By.className("loginbtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/p")).click();

		//xpath using parent child option
		driver.findElement(By.xpath("//div/p[1]")).click();
		String username = driver.findElement(By.xpath("//div/p[1]")).getText();
		Thread.sleep(5000);
		String selfieVerificationStatus = driver.findElement(By.xpath("//div[text()='   Selfie Verified']"
				+ "")).getText();
		System.out.println("The username of the user is: "+username);
		System.out.println("The username of the user is: "+selfieVerificationStatus);
		
		



	}

}
