package com.webload;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webhandling {
	public static void main(String[] args) throws AWTException {
		
		//web browser load
		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Website load
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		Actions ac = new Actions (driver);
		ac.contextClick(mobile).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	   WebElement todaydetials = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	   
	   ac.contextClick(todaydetials).perform();
	   
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   
	   Set<String> windowHandles = driver.getWindowHandles();
	   ArrayList<String> li = new ArrayList<>(windowHandles);
	   
	   String title = driver.switchTo().window(li.get(0)).getTitle();
	   System.out.println(title);
	   
	   String title2 = driver.switchTo().window(li.get(1)).getTitle();
	   System.out.println(title2);
	   
	   String title3 = driver.switchTo().window(li.get(2)).getTitle();
	   System.out.println(title3);
	   
	   driver.close();
	   driver.quit();
	   
	   
	   
	  
	   
	   
		
	   
	   
	   		
	   
	   		
	   		

		
		
	}
}
