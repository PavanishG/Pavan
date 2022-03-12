package com.webload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEOTECH\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
}}