package com.sira.learning.automation.SeleniumJan23.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}

}
