package com.aiite.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.basics.BaseWebElement;

public class RsPracticeAssignment extends BaseWebElement{

	public static void main(String[] args) {

		launchChrome("https://www.rahulshettyacademy.com//AutomationPractice//");
		
		WebElement selectedOption = driver.findElement(By.xpath("//label[@for='honda']/input"));
		selectedOption.click();
		String selectedOptionText = selectedOption.getAttribute("value").trim();
		System.out.println("The selected option is: "+selectedOptionText);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByValue(selectedOptionText);
		WebElement enterName = driver.findElement(By.name("enter-name"));
		enterName.sendKeys(selectedOptionText);
		driver.findElement(By.id("alertbtn")).click();
		String alertText= driver.switchTo().alert().getText();
		System.out.println(alertText);
		if(alertText.contains(selectedOptionText)) {
			System.out.println("The selected option is present in the alert message");
		}
		
		
	}

}
