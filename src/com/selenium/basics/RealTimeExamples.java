package com.selenium.basics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RealTimeExamples extends BaseWebElement{

	public static void main(String[] args) {

		launchEdge("https://www.rahulshettyacademy.com/AutomationPractice/");

		//1. getting all the links present in the page
		List<WebElement> allTags = findElementsByTagName("a");
		System.out.println("The total number of tags in the page: "+ allTags.size());
//		for(WebElement tag : allTags) {
//			System.out.println(tag.getText());
//		}
		//2. getting all the links in the footer section
		WebElement footerSection = driver.findElement(By.cssSelector("#gf-BIG"));
		List<WebElement> linksInTheFooterSection = footerSection.findElements(By.tagName("a"));
		System.out.println("Links in the footer section: "+linksInTheFooterSection.size());
		
	}
}
