package com.ge.corporate.testing.page;

import org.openqa.selenium.Keys;
import org.testng.log4testng.Logger;

import com.ge.digital.itops.browser.BrowserAccess;
import com.ge.digital.itops.browser.BrowserAction;
import com.ge.digital.itops.browser.BrowserWait;
import com.ge.corporate.testing.map.GE;

public class GEPage {
	private static final Logger log = Logger.getLogger(GEPage.class);

	public static void loginToSSOPageIfDisplayed(){
		try {
			BrowserWait.waitUntilElementIsDisplayed(GE.LOGIN_SHARED_COMPUTER_ID);
			log.info("GE SSO Login Page displayed");
			BrowserAction.enterFieldValue(GE.GE_SSO_ID, "502558702");
			BrowserAction.enterFieldValue(GE.GE_PASSWORD_ID, "Admin123test");
			BrowserAction.click(GE.LOGIN_SHARED_COMPUTER_ID);
			Thread.sleep(6000);
		} catch (Exception e) {}
	}
	public static void clickSideHamburger() throws Exception {
		BrowserWait.waitUntilElementIsDisplayed(GE.HAMBURGER_XPATH);
		BrowserAction.click(GE.HAMBURGER_XPATH);
		Thread.sleep(1000);
	}
	public static boolean verifySGoogleHomePage() throws Exception {
		boolean displayed = false;
		try {
			log.info("Waiting for Google HomePage");
			BrowserWait.waitUntilElementIsDisplayed(GE.GOOGLE_SEARCH_BTN_XPATH);
			log.info("Google Home Page os displayed");
			displayed = true;
		} catch (Exception e) {
			displayed = false;
			log.info("Google Home Page is not displayed");
		}
		return displayed;
	}
	
	public static boolean verifyGoogleHomePage() throws Exception {
		boolean displayed = false;
		try {
			log.info("Waiting for Google HomePage");
			BrowserWait.waitUntilElementIsDisplayed(GE.GOOGLE_SEARCH_WRONG_BTN_XPATH);
			log.info("Google Home Page os displayed");
			displayed = true;
		} catch (Exception e) {
			displayed = false;
			log.info("Google Home Page is not displayed");
		}
		return displayed;
	}
	
	public static boolean verifySideBarisActive() throws Exception {
		boolean displayed = false;
		try {
			log.info("Waiting for GE Sidebar to active");
			BrowserWait.waitUntilElementIsDisplayed(GE.SIDE_NAVIGATION_ACTIVE_XPATH);
			log.info("GE Sidebar is active");
			displayed = true;
		} catch (Exception e) {
			displayed = false;
			log.info("GE Sidebar is not active on clicking the Hamburger");
		}
		return displayed;
	}
	
	
	public static void performSearch(String searchString) throws Exception {
		BrowserWait.waitUntilElementIsDisplayed(GE.SEARCH_BOX_XPATH);
		BrowserAction.enterFieldValue(GE.SEARCH_BOX_XPATH, searchString);
		BrowserAccess.getElement(GE.SEARCH_BOX_XPATH).sendKeys(Keys.RETURN);
		BrowserWait.waitUntilElementIsDisplayed(GE.SEARCH_RESULTS_COUNT_ID);
	}
	
	public static boolean verifySearchResultsDisplayed() throws Exception {
		boolean displayed = false;
		try {
			log.info("Waiting for Search Results Page to display with Main Results Section");
			BrowserWait.waitUntilElementIsDisplayed(GE.SEARCH_RESULTS_MAIN_RESULTS_LISTS_XPATH);
			BrowserAction.click(GE.SEARCH_RESULTS_MAIN_RESULTS_HEADER_CSS);
			if(BrowserAccess.getElements(GE.SEARCH_RESULTS_MAIN_RESULTS_LISTS_XPATH).size() >=1){
				displayed=true;
				System.out.println("Search Results Main Section displayed with "+BrowserAccess.getElements(GE.SEARCH_RESULTS_MAIN_RESULTS_LISTS_XPATH).size()+" results");
			}			
		} catch (Exception e) {
			displayed = false;
			log.info("GE Sidebar is not active on clicking the Hamburger");
		}
		return displayed;
	}
}