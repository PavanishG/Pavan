package com.webload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		

		WebElement findElement = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		findElement.click();
		
		
	}

}
