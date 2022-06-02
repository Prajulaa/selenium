package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RsCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Actions action = new Actions(driver);
		
		//isEnabled, isDisplayed, isSelected - mandatory first check for radio button and checkbox
			
		//clicking family and friends using findElement(By.id())
		WebElement familyAndFriends = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		familyAndFriends.click();
		
		//isEnabled, isDisplayed, isSelected
		System.out.println("Is family and friends enabled? "+ familyAndFriends.isEnabled());
		System.out.println("Is family and friends displayed? "+ familyAndFriends.isDisplayed());
		System.out.println("Is family and friends selected? "+ familyAndFriends.isSelected());
		
		//clicking students by Actions class
		WebElement student = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		action.click(student).build().perform();
		
		//clicking senior citizen using css regular expression
		WebElement seniorCitizen = driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")); //* acts as contains
		System.out.println("Is senior citizen value selected before click event? "+ seniorCitizen.isSelected());
		seniorCitizen.click();
		System.out.println("Is senior citizen value selected after click event? "+ seniorCitizen.isSelected());
		
		///printing all checkboxes available in the page
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(5000);
		System.out.println("The number of checkboxes available in the current page are: "+ checkboxes.size());
		for(WebElement check: checkboxes) {
			System.out.println("inside the loop");
//			System.out.println(check.getAttribute());
		}
		}
	}

