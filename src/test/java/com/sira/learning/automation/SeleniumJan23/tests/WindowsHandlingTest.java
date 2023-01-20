package com.sira.learning.automation.SeleniumJan23.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sira.learning.automation.SeleniumJan23.pages.HomePage;
import com.sira.learning.automation.SeleniumJan23.utils.BaseTest;

public class WindowsHandlingTest extends BaseTest {
	HomePage homePage;

	@Test
	public void verifySelectionOfDropDownValues() {
		homePage.selectDropdownValues("Amazon Pharmacy");
	}

	@Test
	public void validateSearch() {
		System.out.println(" Search results");
	}

	@BeforeClass
	public void setup() {
		homePage = new HomePage(getDriver());

	}

}
