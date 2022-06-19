package com.sample;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/root/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		Thread.sleep(5000);

		driver.close();

	}

}
