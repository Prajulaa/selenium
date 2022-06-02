package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseWebElement extends BaseWebDriver {
	//I - Locators
	//#1-id #2-tagName #3-linkText #4-partialLinkText #5-className #6-name #7-cssSelector #8-xpath
	
	public static Select select;

	//#1Find Element by id
	public static WebElement findElementById(String locator) {
		return driver.findElement(By.id(locator));	
	}
	//Find Element by id
	public static List<WebElement> findElementsById(String locator) {
		return driver.findElements(By.id(locator));	
	}
	//#2Find Element by tagName
	public static WebElement findElementByTagName(String locator) {
		return driver.findElement(By.tagName(locator));	
	}
	//Find Elements by tagName
	public static List<WebElement> findElementsByTagName(String locator) {
		return driver.findElements(By.tagName(locator));	
	}

	//#3 Find Element by linkText
	public static WebElement findElementByLinkText(String locator) {
		return driver.findElement(By.linkText(locator));	
	}
	//Find Elements by linkText
	public static List<WebElement> findElementsByLinkText(String locator) {
		return driver.findElements(By.linkText(locator));	
	}

	//#4 Find Element by partialLinkText
	public static WebElement findElementByPartialLinkText(String locator) {
		return driver.findElement(By.partialLinkText(locator));	
	}
	//Find Elements by partialLinkText
	public static List<WebElement> findElementsByPartialLinkText(String locator) {
		return driver.findElements(By.partialLinkText(locator));	
	}

	//#5 Find Element by className
	public static WebElement findElementByClassName(String locator) {
		return driver.findElement(By.className(locator));	
	}
	//Find Elements by className
	public static List<WebElement> findElementsByClassName(String locator) {
		return driver.findElements(By.className(locator));	
	}

	//#6 Find Element by name
	public static WebElement findElementByName(String locator) {
		return driver.findElement(By.name(locator));	
	}
	//Find Elements by className
	public static List<WebElement> findElementsByName(String locator) {
		return driver.findElements(By.name(locator));	
	}

	//#7 Find Element by cssSelector
	public static WebElement findElementByCssSelector(String locator) {
		return driver.findElement(By.cssSelector(locator));	
	}
	//Find Elements by cssSelector
	public static List<WebElement> findElementsByCssSelector(String locator) {
		return driver.findElements(By.cssSelector(locator));	
	}

	//#8 Find Element by xpath
	public static WebElement findElementByXpath(String locator) {
		return driver.findElement(By.xpath(locator));	
	}
	//Find Elements by xpath
	public static List<WebElement> findElementsByXpath(String locator) {
		return driver.findElements(By.xpath(locator));	
	}
//--------------------------------------------------------------
	//II - SelectBy
	public static void selectValue(WebElement element, String value) {
	 select = new Select(element);
		select.selectByValue(value);
	}
	public static void selectVisibleText(WebElement element, String visibleText) {
		select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public static void selectIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	//deSelectBy
	public static void deselectValue(WebElement element, String value) {
		select = new Select(element);
		select.deselectByValue(value);
	}
	public static void deselectVisibleText(WebElement element, String value) {
		select = new Select(element);
		select.deselectByVisibleText(value);
	}
	public static void deselectIndex(WebElement element, int index) {
		select = new Select(element);
		select.deselectByIndex(index);
	}
	
	//------------------------------------------------------
	
	

}
