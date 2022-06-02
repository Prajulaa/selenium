package com.aiite.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassFrameChrome {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");

		WebDriver file = new ChromeDriver();
		file.manage().window().maximize();

		file.get("http://leafground.com/");
		file.findElement(By.xpath("//img[@alt='Frame']")).click();

		file.switchTo().frame(0);
		Thread.sleep(2000);
		file.findElement(By.id("Click")).click();
		file.switchTo().parentFrame();

		file.switchTo().frame(1);
		Thread.sleep(2000);
		file.switchTo().frame("frame2");
		Thread.sleep(2000);
		file.findElement(By.id("Click1")).click();
		file.switchTo().defaultContent();

		file.switchTo().frame(2);	
		Thread.sleep(2000);
		file.switchTo().frame("frame2");

		WebElement msg = file.findElement(By.xpath("//*[text()='Find total number of frames.']"));
		System.out.println(msg.getText());
//        file.close();
	}
}
