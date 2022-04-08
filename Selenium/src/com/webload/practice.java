package com.webload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
 driver.get("https://www.zomato.com/");
	
	}

}
