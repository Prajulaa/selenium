package com.selenium.basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class RsWindowHandles extends BaseWebElement {

	public static void main(String[] args) {

		launchEdge("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> handle = handles.iterator();
		String parentHandle= handle.next();
		String childHandle = handle.next();
		driver.switchTo().window(childHandle);	
		String url= driver.getCurrentUrl();
		String mailId = url.split("/")[2];
		System.out.println(mailId);
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("username")).sendKeys(mailId);
		}

}
