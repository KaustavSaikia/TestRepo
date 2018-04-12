package com.ge.corporate.testing.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ge.digital.itops.testng.Documentation;
import com.ge.digital.itops.testng.FailureMessage;
import com.ge.corporate.testing.page.GEPage;

public class GESampleTest extends BaseTest {

	@Test(alwaysRun = true, priority=0)
	@Documentation(step = "Verify side navigation section is displayed", expected = "GE Side Navigation section should be displayed succesfully on clicking the Hamburger")
	@FailureMessage("GE Side Navigation is not displayed")
	public void TestGE_SideNavSection() throws Exception {
		GEPage.clickSideHamburger();
		Assert.assertTrue(GEPage.verifySideBarisActive(), "On clicking Hamburger Side navigation section is not displayed");
	}
	
	@Test(alwaysRun = true, priority=1)
	@Documentation(step = "Verify performing search", expected = "Search results should be displayed with expected data")
	@FailureMessage("Search functionality is not working")
	@Parameters({"searchtext"})
	public void TestGE_SearchFunctionality(String searchtext) throws Exception {
		GEPage.performSearch(searchtext);
		Assert.assertTrue(GEPage.verifySearchResultsDisplayed(), "Main Search Results not displayed");
	}
}
