package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;	
import java.awt.AWTException;



public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Prajula-50628\\eclipse-workspace\\Selenium\\Essentials\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://muslimmatch.com//login");
		Actions action = new Actions(driver);

		WebElement loginButton = driver.findElement(By.xpath("//*[text()='Login']"));
		action.click(loginButton);
		WebElement emailInput = driver.findElement(By.id("loginemail"));
		action.moveToElement(emailInput).click().keyDown("XOXO").build().perform();
		emailInput.sendKeys(" ");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		emailInput.sendKeys("prajulara");

		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_A);












	}

}
