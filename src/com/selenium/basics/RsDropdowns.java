package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RsDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement currency_drop = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));

		//printing all the elements present in the currency_drop element
		List<WebElement> currency_options = driver.findElements(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		for(int option=0; option<currency_options.size();option++) {
			String element = currency_options.get(option).getText();
			if(!element.equals("Select")) System.out.println(element); //Select will print NO MATTER WHAT!

		}


		//selecting & printing values from a static dropdown
		Select currency = new Select(currency_drop);
		currency.selectByIndex(2);
		System.out.println("The selected currenct value is: "+currency.getFirstSelectedOption().getText());
		currency.selectByVisibleText("INR");
		System.out.println("The selected currenct value is: "+currency.getFirstSelectedOption().getText());
		currency.selectByValue("USD");
		System.out.println("The selected currenct value is: "+currency.getFirstSelectedOption().getText());

		WebElement passengers = driver.findElement(By.id("divpaxinfo"));
		passengers.click();

		//using loops to click an element
		WebElement adultPassengers = driver.findElement(By.id("hrefIncAdt"));
		Thread.sleep(1000);
		adultPassengers.click();
		System.out.println("The passengers count before selecting: " + passengers.getText());
		for(int i=0; i<5; i++) {
			adultPassengers.click();
		}
		System.out.println("The passengers count after selecting values: " + passengers.getText());
		WebElement closePassengers = driver.findElement(By.id("btnclosepaxoption"));
		closePassengers.click();

		//performing actions on dynamic dropdowns
		WebElement from = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		from.click();
		WebElement fromValue = driver.findElement(By.xpath("//a[@value='BLR']"));
		fromValue.click();
		Thread.sleep(1000);
		WebElement toValue = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DXB']"));
		toValue.click();

		//handling auto suggestive dropdowns 
		System.out.println("---Auto suggestive drop-downs---");
		WebElement country = driver.findElement(By.id("autosuggest"));
		country.sendKeys("in");
		Thread.sleep(2000);

		List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		for(WebElement value: countries) {
			if(value.getText().equalsIgnoreCase("India")) {
				value.click();
				break;
			}
		}
		driver.close();
	}

}

