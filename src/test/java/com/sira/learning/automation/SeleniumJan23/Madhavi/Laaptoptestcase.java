package com.sira.learning.automation.SeleniumJan23.Madhavi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Laaptoptestcase {
	public void Laaptopsearch() {

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //Navigate to Home page of AUT
        driver.get("http://tutorialsninja.com/demo/index.php");
        // window maximize
        driver.manage().window().maximize();
        System.out.println(driver.getTitle()); 
       
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
        driver.findElement(By .linkText("Show All Laptops & Notebooks")).click();
        driver.findElement(By.linkText("HP LP3065")).click();
        
        String content = driver.findElement(By.xpath("//div[@id='content']//div[@class='col-sm-4]'")).getText();
	    System.out.println(content);
	    driver.findElement(By.id("button-cart")).click();
	    
	  
	    String content1 = driver.findElement(By.xpath("//div[@id='product-product']//div[1]")).getText();
	    System.out.println(content1);
	    driver.quit();
	    driver.close();
	}
	
{
}
}
