package com.sira.learning.automation.SeleniumJan23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(id="searchDropdownBox")
	private WebElement _dropDownSearch;
	
	//Actions
	public void selectDropdownValues(String value) {
		Select select = new Select(_dropDownSearch);
        select.selectByVisibleText(value);
	}
	
	

}

/*
 * WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
 * Select select = new Select(selectElement);
 * select.selectByVisibleText("Amazon Pharmacy");
 */
 
/*
 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
 * driver.findElement(By.id("nav-search-submit-button")).click();
 * driver.findElement(By.xpath(
 * "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"
 * )) .click();
 * 
 * String originalWindow = driver.getWindowHandle(); for (String windowHandle :
 * driver.getWindowHandles()) { if(!originalWindow.contentEquals(windowHandle))
 * { driver.switchTo().window(windowHandle); break; } }
 * 
 * 
 * String desc = driver.findElement(By.id("productTitle")).getText();
 * System.out.println(desc);
 */
