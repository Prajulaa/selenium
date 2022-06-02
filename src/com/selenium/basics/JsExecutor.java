package com.selenium.basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class JsExecutor {
	public static int screenshotNumber = 0;

	public static void takeScreenshot(WebDriver driver, WebElement element) throws IOException {
		String elementText = element.getText();
		File screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("C:\\Users\\Prajula-50628\\Selenium4.0 Lib\\Screenshots\\"+elementText+".png"));
	}

	public static void takeScreenshot(WebDriver driver) throws IOException {
		File screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("C:\\Users\\Prajula-50628\\Selenium4.0 Lib\\Screenshots\\"+screenshotNumber+".png"));
		screenshotNumber++;	
	}

	public static void jsClickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void jsDrawBorder(WebDriver driver, WebElement element, String borderColour) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='"+borderColour+"'", element);

	}

	//https://www.computerhope.com/htmcolor.htm - all html colours
	public static void jsChangeBackgroundColour(WebDriver driver, WebElement element, String colour) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background='"+colour+"'", element);

	}

	public static void jsDrawBorderChangeBackground(WebDriver driver, WebElement element, String backgroundColour, String borderColour) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:"+backgroundColour+"; border:"+borderColour+";')", element);
	}
	public static void jsGenerateAlerts(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}

	public static void jsRefresh(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}

	public static String  jsPageTitle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//    	String pageTitle = js.executeScript("return document.title;").toString(); //same as the below line
		String pageTitle = (String) js.executeScript("return document.title;");
		return pageTitle;
	}

	//Wow!
	public static String jsEntirePageContent(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pageContent = js.executeScript("return document.documentElement.innerText;").toString();
		return pageContent;
	}

	public static void jsWindowScrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void jsWindowScrollDistance(WebDriver driver, int distance) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+distance+")");
	}

	//try if this is working later 
	public static void jsWindowScrollLeftRight(WebDriver driver, int distance) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo("+distance+",0)");
	}

	public static void jsScrollToElementTrue(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollToElementFalse(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
    public static void jsSetAttribute(WebDriver driver, WebElement element, String attribute, String attributeValue) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('"+attribute+"','"+attributeValue+"')", element);
	}
	
    public static String jsGetAttribute(WebDriver driver, WebElement element, String attribute) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String value = (String)js.executeScript("return arguments[0].getAttribute('"+attribute+"')", element);
		return value;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("http://muslimmatch.com");
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		jsChangeBackgroundColour(driver, loginButton, "#C25A7C");
		WebElement signUpButton = driver.findElement(By.xpath("//div[text()='SIGNUP WITH']"));
		WebElement emailButton = driver.findElement(By.xpath("//button[@name='btn_email']"));
		WebElement facebookButton = driver.findElement(By.xpath("//button[@name='btn_facebook']"));
		jsDrawBorderChangeBackground(driver, facebookButton,"pink", "3px solid orange");
		jsChangeBackgroundColour(driver, emailButton, "#FFFF33");
		jsDrawBorder(driver, emailButton, "3px solid red");
		jsWindowScrollDistance(driver, 1500);
		jsWindowScrollDistance(driver, -1500);
		jsScrollToElementTrue(driver, signUpButton);
		jsWindowScrollDown(driver);
		WebElement footerPrivacyPolicy = driver. findElement(By.linkText("Privacy Policy"));
		jsScrollToElementFalse(driver, footerPrivacyPolicy);
		jsDrawBorder(driver, loginButton, "3px solid pink");
		jsDrawBorder(driver, signUpButton, "3px sold red");
		jsGenerateAlerts(driver, "This browser is automated by Prajula Ravichandran right now");
		driver.switchTo().alert().accept();
		System.out.println("Page Title using JavaScripExecutor: "+jsPageTitle(driver));
		System.out.println("Title using driver.getTitle(): "+driver.getTitle());
		System.out.println("Page Contents:/n/n"+ jsEntirePageContent(driver));
		jsClickElement(driver, loginButton);
		WebElement emailInput = driver.findElement(By.xpath("//input[@id='loginemail']"));
		WebElement passwordInput = driver.findElement(By.xpath("//input[@id='loginpassword']"));
		jsSetAttribute(driver, emailInput, "value", "prajularavi@gmail.com");
		jsSetAttribute(driver, passwordInput, "value", "password");

		System.out.println(jsGetAttribute(driver, emailInput, "placeholder"));
		System.out.println(jsGetAttribute(driver, passwordInput, "placeholder"));

		driver.close();

	}

}
