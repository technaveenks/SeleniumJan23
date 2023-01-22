package com.sira.learning.automation.SeleniumJan23.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sira.learning.automation.SeleniumJan23.pages.HomePage;
import com.sira.learning.automation.SeleniumJan23.pages.SearchResultsPage;
import com.sira.learning.automation.SeleniumJan23.utils.BaseTest;

public class WindowsHandlingTest extends BaseTest {
	HomePage homePage;
	SearchResultsPage searchResultsPage;

	@Test
	public void verifySelectionOfDropDownValues() {
		homePage.selectDropdownValues("Amazon Pharmacy");
		//homePage.enterSearchItem("iPhone");
	}

	@Test
	public void validateSearch() throws InterruptedException {
		homePage.enterSearchItem("iPhone");
		searchResultsPage=  homePage.clickOnSearchButton();
		searchResultsPage.clickOnProduct();
		Thread.sleep(3000);
	}
	
	@Test
	public void validateBestSeller() {
		
	}

	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());

	}

}
