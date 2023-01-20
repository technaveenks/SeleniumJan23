package com.sira.learning.automation.SeleniumJan23.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sira.learning.automation.SeleniumJan23.utils.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTest extends BaseTest{
	
	WebDriver driver;

	@Test
	public void sampleTest() {
		
		// Navigate to Home page of AUT
		driver.navigate().to("http://tutorialsninja.com/demo/index.php");
		// window maximize
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// Header
		// *[@class='caption'][1]/h4/a
		int count = driver.findElements(By.xpath("//*[@class='caption']")).size();
		System.out.println(count);

		/*
		 * for (int i = 1; i <= count; i++) { String header =
		 * driver.findElement(By.xpath("(//*[@class='caption'])[" + i +
		 * "]/h4/a")).getText(); System.out.println("Header Value = " + header); String
		 * description = driver.findElement(By.xpath("(//*[@class='caption'])[" + i +
		 * "]/p[1]")).getText(); System.out.println("Description Value = " +
		 * description); String price =
		 * driver.findElement(By.xpath("(//*[@class='caption'])[" + i +
		 * "]/p[2]")).getText(); System.out.println("Price Value = " + price);
		 * System.out.println("==================="); }
		 */

		
		  //Search for an item "iPhone"
		  driver.findElement(By.name("search")).sendKeys("iPhone");
		  driver.findElement(By.xpath("//*[@class='input-group-btn']/button")).click();
		  driver.navigate().back();
		  driver.navigate().forward();
		  Cookie cookieDetails = driver.manage().getCookieNamed("domain");
		  System.out.println(" Domain Name of the Cookie "+ cookieDetails);
		  Set<Cookie> cookies = driver.manage().getCookies();
          System.out.println(cookies);
		  /*driver.findElement(By.linkText("iPhone")).click();
		  driver.findElement(By.id("button-cart")).click(); Thread.sleep(2000); String
		  message = driver.findElement(By.xpath(
		  "//*[@id='product-product']/div[contains(@class,'alert-success')]")).getText(
		  ); System.out.println(message);
		  */
		  
		  //In the Search Results Page click on the item to navigate to items details		  page
		  
		  // Click on the "Add to Cart" button in the items details page
		  
		  //get the success message and print the message in console
		 
	}
	@BeforeClass
	public void setup() {
		driver = getDriver();
	}
}
