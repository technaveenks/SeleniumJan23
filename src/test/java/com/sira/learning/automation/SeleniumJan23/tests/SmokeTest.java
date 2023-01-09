package com.sira.learning.automation.SeleniumJan23.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SmokeTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //Navigate to Home page of AUT
        driver.get("http://tutorialsninja.com/demo/index.php");
        // window maximize
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());        
        //Search for an item "iPhone"
        driver.findElement(By.name("search")).sendKeys("iPhone");
        driver.findElement(By.xpath("//*[@class='input-group-btn']/button")).click();
        driver.findElement(By.linkText("iPhone")).click();
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//*[@id='product-product']/div[contains(@class,'alert-success')]")).getText();
        System.out.println(message);
        
        
        //In the Search Results Page click on the item to navigate to items details page
        
        // Click on the "Add to Cart" button in the items details page
        
        //get the success message and print the message in console
        
	}

}
