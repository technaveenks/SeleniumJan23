package com.sira.learning.automation.SeleniumJan23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	private WebElement _lblProductDescription;
	
	
	public ProductDetailsPage clickOnProduct() {
		_lblProductDescription.click();
		return new ProductDetailsPage(getDriver());
	}
}
