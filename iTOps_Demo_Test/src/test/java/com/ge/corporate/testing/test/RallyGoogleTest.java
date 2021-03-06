package com.ge.corporate.testing.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ge.digital.itops.browser.BrowserAction;
import com.ge.digital.itops.browser.BrowserWait;
import com.ge.digital.itops.listner.UserStoryNumber;
import com.ge.digital.itops.testng.Documentation;
import com.ge.digital.itops.testng.FailureMessage;
import com.ge.corporate.testing.map.GE;
import com.ge.corporate.testing.page.GEPage;

public class RallyGoogleTest extends BaseTest {

	@Test(alwaysRun = true, priority=0)
	@Documentation(step = "Verify Google Home Page is displayed", expected = "Google Home page should be displayed")
	@FailureMessage("Google Home Page is not displayed")
	@UserStoryNumber(UserStoryNumber = "US257571")
	public void TestGoogleHomePage_1() throws Exception {		
		Assert.assertTrue(GEPage.verifySGoogleHomePage(), "Googole Home Page is not displayed");
	}

	@Test(alwaysRun = true, priority=1)
	@Documentation(step = "Verify Terms Link clickable", expected = "Terms page should be displayed")
	@FailureMessage("Terms Page is not displayed")
	@UserStoryNumber(UserStoryNumber = "US257571")
	public void TestGoogleTerms_1() throws Exception {		
		BrowserAction.enterFieldValue(GE.GOOGLE_SEARCH_BOX_XPATH, "GE");
		BrowserWait.waitUntilElementIsDisplayed(GE.GOOGLE_TERMS_XPATH);
		BrowserAction.click(GE.GOOGLE_TERMS_XPATH);
		System.out.println("Clicked Terms");
		Assert.assertTrue(false);
	}
	
	@Documentation(step = "Verify Home ", expected = "Google Home Page should be displayed")
	@FailureMessage("Home Page is not displayed")
	@Test(alwaysRun = true, priority=2)
	@Parameters({ "url" })
	@UserStoryNumber(UserStoryNumber = "US257571")
	public void LaunchGoogleHome(String url) throws Exception {		
		BrowserAction.openBrowser(url);
	}
}
