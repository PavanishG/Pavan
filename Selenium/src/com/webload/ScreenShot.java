package com.webload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.annauniv.edu/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts = (TakesScreenshot) driver;
    File starting = ts.getScreenshotAs(OutputType.FILE);
    File ending = new File("E:\\JavaTraining\\Selenium\\Screenshot\\error1.png");
    FileUtils.copyFile(starting, ending);
}
	
	
	
	}

