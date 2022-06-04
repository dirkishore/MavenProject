package com.sample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	@Test
	public void login() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/home/kishore/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#email")).sendKeys("kishorekishore2610@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("smkishore");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
