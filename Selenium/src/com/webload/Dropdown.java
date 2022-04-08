package com.webload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\JavaTraining\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Pavanish");
		
		WebElement surename = driver.findElement(By.xpath("//input[@name='lastname']"));
		surename.sendKeys("raj");
		
		WebElement number = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		number.sendKeys("123456");
		
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
        password.sendKeys("ashu");
		
        //date of birth//
        
       WebElement bdate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
       Select date = new Select(bdate);
       date.selectByIndex(6);

       WebElement bmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
       Select month = new Select(bmonth);
       month.selectByValue("8");
       
       WebElement byear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
       Select year = new Select(byear);
       year.selectByVisibleText("1994");
       
       /* radio button*/
       
       WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
       gender.click();
       
       // submitt //
       
       WebElement submitt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
       submitt.click();
       
		
		
		
		
		
	
	}

}
