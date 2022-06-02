package com.aiite.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.basics.BaseWebElement;

public class RsAssignment2 extends BaseWebElement {

	public static void main(String[] args) {
		launchChrome("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//label[text()='Name']//following-sibling::input")).sendKeys("Prajula");
		driver.findElement(By.xpath("//label[text()='Email']//following-sibling::input")).sendKeys("prajularavi@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input")).sendKeys("1234");
		driver.findElement(By.xpath("//label[contains(text(),'Love IceCreams')]/preceding-sibling::input")).click();
		
		Select gender = new Select(driver.findElement(By.xpath("//label[contains(text(),'Gender')]/following-sibling::select")));
		gender.selectByVisibleText("Female");
		driver.findElement(By.xpath("//label[text()='Student']/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//input[@type='date']")).click();
		
		
		
		
	}

}
