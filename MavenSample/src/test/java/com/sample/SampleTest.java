package com.sample;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	@Test
	public void login() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/home/kishore/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
