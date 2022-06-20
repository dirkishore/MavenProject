package com.sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample1Test {
	@Test
	public void sample() {
		System.setProperty("webdriver.gecko.driver", "/root/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
	}
}