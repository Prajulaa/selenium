package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsFramesAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");
		//swithching to the top frame
		driver.switchTo().frame("frame-top");
		//switching to the middle frame in the top frame
		driver.switchTo().frame(1);
		//getting the text in the middle frame
		WebElement middleText = driver.findElement(By.xpath("//div[text()='MIDDLE']"));
		System.out.println(middleText.getText());
		driver.close();

	}

}
