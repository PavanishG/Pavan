package com.webload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotpractice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("E:\\JavaTraining\\Selenium\\Screenshot\\2.png");
		FileUtils.copyFile(source, target);
		
		
		
		
		
	}
	
	

}
