package com.aiite.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.selenium.basics.BaseWebElement;


public class AdactinHotelBooking extends BaseWebElement {

	public static void main(String[] args) {

		launchChrome("https://adactinhotelapp.com/index.php");
		//Logging in
		findElementByCssSelector("#username").sendKeys("prajulaaa");
		findElementByCssSelector("#password").sendKeys("test4mm");
		findElementByCssSelector("#login").click();
		//Searching for a hotel
		selectValue(findElementByCssSelector("#location"), "Paris");
		selectIndex(findElementByCssSelector("#hotels"), 2);
		selectVisibleText(findElementByCssSelector("#room_type"), "Super Deluxe");
		selectValue(findElementByCssSelector("#room_nos"), "5");
		selectValue(findElementByCssSelector("#adult_room"), "3");
		selectIndex(findElementByCssSelector("#child_room"), 0);
		findElementByXpath("//input[@value='Search']").click();
		//Selecting the Hotel
		findElementByCssSelector("#radiobutton_0").click();
		findElementByCssSelector("#continue").click();
		//Entering user details
		findElementById("first_name").sendKeys("Prajula");
		findElementById("last_name").sendKeys("Ravichandran");
		findElementById("address").sendKeys("B2/488F,/nBHEL TOWNSHIP, Kailasapuran/nTrichy-620014");
		findElementById("cc_num").sendKeys("1234567890123456");
		selectVisibleText( findElementById("cc_type"), "VISA");
		selectVisibleText(findElementById("cc_exp_month"), "December");
		selectVisibleText(findElementById("cc_exp_year"), "2022");
		findElementById("cc_cvv").sendKeys("123");
		findElementByCssSelector("#book_now").click();
		//getting the order id
		ExplicitlyWait(By.id("order_no"), 25);
		System.out.println(findElementById("order_no").getAttribute("value"));

	}

}
