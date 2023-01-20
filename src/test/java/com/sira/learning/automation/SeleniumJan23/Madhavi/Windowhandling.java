package com.sira.learning.automation.SeleniumJan23.Madhavi;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {
	public static void main1(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       
        
        //walmart assignment
        
       
      //Navigate to Home page of AUT
        driver.get("https://www.walmart.com/");
        // window maximize
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        driver.findElement(By.name("search")).sendKeys("whole milk");
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/main/div/div[2]/div/div/div[1]/div[1]/div/section/div/div[1]/div/div/a")).click();
	
        driver.findElement(By.linkText("//*[@id=\"maincontent\"]/main/div/div[2]/div/div/div[1]/div[1]/div/section/div/div[1]/div/div/a")).click();
	
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(2000);
        
        
        //new window
        
        
        
        //
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
