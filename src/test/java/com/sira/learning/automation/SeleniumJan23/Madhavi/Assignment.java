package com.sira.learning.automation.SeleniumJan23.Madhavi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //Navigate to Home page of AUT
        driver.get("http://tutorialsninja.com/demo/index.php");
        // window maximize
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        //Header
        //*[@class='caption'][1]/h4/a
        int count=driver.findElements(By.xpath("//*[@class='caption']")).size();
        System.out.println(count);
        
        for (int i =1; i<= count;i++) {
        	String header = driver.findElement(By.xpath("//*[@class='caption']["+ i +"]/h4/a")).getText();
        	System.out.println("Headervalue="+header);
        	
        	String description = driver.findElement(By.xpath("//*[@class='caption']["+ i +"]/p[1]")).getText();
        	System.out.println("Description value="+description);
        	
        	String price = driver.findElement(By.xpath("//*[@class='caption']["+ i +"]/p[2]")).getText();
        	System.out.println("Price value="+price);
        	
        	System.out.println("====================");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //headers
//       driver.findElement(By.xpath("//a(contains)[text()='MacBook]'/../../p/p[@class='price']/span[@class='price-tax']")).getText();
//       System.out.println(driver.findElement(By.xpath("\"//*[text()='MacBook]'/../../p/p[@class='price']/span[@class='price-tax']\"")));
//	
//	   driver.findElement(By.xpath("//*[text()='iPhone]'/../../p/p[@class='price']/span[@class='price-tax']")).getText();
//	   System.out.println(driver.findElement(By.xpath("//*[text()='iPhone]'/../../p/p[@class='price']/span[@class='price-tax']")));
//	   driver.findElement(By.xpath("//*[text()='Apple Cinema 30\"']/../../p/p[@class='price']/span[@class='price-tax']")).getText();
//	   System.out.println(driver.findElement(By.xpath("//*[text()='Apple Cinema 30\"']/../../p/p[@class='price']/span[@class='price-tax']")));
//	   driver.findElement(By.xpath("//*[text()='Canon EOS 5D']/../../p/p[@class='price']/span[@class='price-tax']")).getText();
//	   System.out.println(driver.findElement(By.xpath("//*[text()='Canon EOS 5D']/../../p/p[@class='price']/span[@class='price-tax']")));
//	
//	driver.quit();
//	driver.close();
//	
	}
}