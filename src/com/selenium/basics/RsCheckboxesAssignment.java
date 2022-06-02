package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsCheckboxesAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//checking and unchecking the first option
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		System.out.println("Is he first checkbox selected? "+checkbox1.isSelected());
		checkbox1.click();
		System.out.println("Is he first checkbox unselected? "+checkbox1.isSelected());

		////div[@id='checkbox-example']//label - jay jay suggestion
		////input[@type='checkbox'] - the xpath i used
		//getting all the checkbox elements
		List<WebElement> checkboxes = driver.findElements(By.xpath("div[@id='checkbox-example']//label"));
		System.out.println("The number of checkboxes available in the current page is: "+checkboxes.size());

		for(WebElement checkbox: checkboxes) {//not working. but why?!
			System.out.println(checkbox.getAttribute("value"));
		}

		//select all checkboxes
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
		WebElement checkbox3 = driver.findElement(By.id("checkBoxOption3"));
		String value = checkbox2.getText();
		System.out.println(value);
		checkbox2.click();
		checkbox3.click();
		
		driver.close();


	}

}
