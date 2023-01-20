package com.sira.learning.automation.SeleniumJan23.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeSuite
	public void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Navigate to Home page of AUT
		driver.get("https://www.amazon.in");
		// window maximize
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}
