package com.webload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Robodemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("(//input[@autocorrect='off'])[1]"));
		user.sendKeys("Pavanish");
		
		
		
	
		
	}

}
