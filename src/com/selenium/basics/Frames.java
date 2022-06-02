package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
//https://the-internet.herokuapp.com/nested_frames - best nested frames example
//RS - https://jqueryui.com/droppable/
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");	
		
		//working code - but not working
//		driver.switchTo().frame(1);
//		WebElement f2 = driver.findElement(By.xpath("//*[@id='frame2']"));
//		driver.switchTo().frame(f2);
//		WebElement cli = driver.findElement(By.id("Click1"));
//		cli.click();
	
		//switched to frame of index 0
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		driver.findElement(By.id("Click")).click();
		
		//switching to frame of index 1
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame2);
	    //switching to the nested frame of index 1 frame
		WebElement nestedFrame2 = driver.findElement(By.xpath("//iframe[@name='frame2' and @src='nested.html']"));
		Thread.sleep(2000);
		driver.switchTo().frame(nestedFrame2);

//		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
//		System.out.println(totalFrames.size());
//		driver.close();
	}

}
