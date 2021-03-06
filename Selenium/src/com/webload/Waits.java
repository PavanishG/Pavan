package com.webload;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit wait
		
		
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("i love u");
		System.out.println("============================");
		
		
		WebElement explic = driver.findElement(By.name("login"));// Explicit Wait
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(explic));
	
	}

}
