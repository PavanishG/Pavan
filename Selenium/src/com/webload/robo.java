package com.webload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class robo {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	 WebElement user = driver.findElement(By.id("email"));
		
	Actions act = new Actions(driver);
	
	act.sendKeys(user, "vinosizzle@gmail.com").perform();
	
		Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	r.keyRelease(KeyEvent.VK_CONTROL); 
	r.keyRelease(KeyEvent.VK_A); 
	
	act.contextClick(user).perform();
	
	for (int i = 1; i <=5; i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN); 
		
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	WebElement submit = driver.findElement(By.name("login"));
	submit.click();
	
	
	}

}
