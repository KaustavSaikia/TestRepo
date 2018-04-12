package com.ge.corporate.testing.test;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ge.corporate.testing.page.GEPage;
import com.ge.digital.itops.browser.BrowserAction;
import com.ge.digital.itops.webdriver.BaseWebDriver;

public class BaseTest extends BaseWebDriver {

	private static final Logger log = Logger.getLogger(BaseTest.class);

	@BeforeSuite
	@Parameters({ "url" })
	public void setUp(String url) throws Exception {
		log.info("Opening URL: " + url);
		BrowserAction.openBrowser(url);
		System.out.println(url+" launched");
		GEPage.loginToSSOPageIfDisplayed();
	}
}