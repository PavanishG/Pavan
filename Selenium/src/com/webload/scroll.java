package com.webload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		
		WebElement down = driver.findElement(By.xpath("//img[@class='sc-elhb8j-1 ixsoFB']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", down);
	
		
				Thread.sleep(500);
		WebElement up = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", up);
		
	}

}
