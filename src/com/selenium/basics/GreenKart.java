package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> cartValue = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		System.out.println(cartValue);

		List<WebElement> allProducts = driver.findElements(By.cssSelector(".product-name"));
		for(WebElement product : allProducts) {




		}
	}
}