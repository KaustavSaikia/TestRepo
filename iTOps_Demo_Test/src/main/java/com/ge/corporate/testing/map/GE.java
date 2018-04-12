package com.ge.corporate.testing.map;

public enum GE {

	GE_SSO_ID("username"),
	GE_PASSWORD_ID("password"),
	LOGIN_SHARED_COMPUTER_ID("submitFrmShared"),
	
	PAGE_NAV_BUTTONS_XPATH("//div[@class='ge-moduel module-sticky-nav']/ul/li/a"),
	MISSIONS_PAGE_NAV_XPATH("//div[@class='ge-moduel module-sticky-nav']/ul/li[1]/a"),
	MISSION_PAGE_CSS(".hero-pane"),
	SOLUTIONS_PAGE_NAV_XPATH("//div[@class='ge-moduel module-sticky-nav']/ul/li[2]/a"),
	SOLUTIOND_PAGE_CSS(".module-tab-slider"),
	STORIES_PAGE_NAV_XPATH("//div[@class='ge-moduel module-sticky-nav']/ul/li[3]/a"),
	STORIES_PAGE_CSS(".module-filter-result"),
	ECOSYSTEM_PAGE_NAV_XPATH("//div[@class='ge-moduel module-sticky-nav']/ul/li[4]/a"),
	ECOSYSTEM_PAGE_CSS(".module-block"),
	HAMBURGER_XPATH("//li[@data-type='hamburger']/a"),
	SIDE_NAVIGATION_ACTIVE_XPATH("//nav[@class='ge-sidebar is-active']"),
	
	SEARCH_BOX_XPATH("//div[@class='search-bar__field']/input"),
	SEARCH_RESULTS_COUNT_ID("results-count"),
	SEARCH_RESULTS_MAIN_RESULTS_HEADER_CSS("#main-results>h3"),
	SEARCH_RESULTS_MAIN_RESULTS_LISTS_XPATH("//div[@id='all-results']/section[@id='main-results']/div/ul/li"),
	
	GOOGLE_SEARCH_BTN_XPATH("//input[@name='btnK']"),
	GOOGLE_SEARCH_WRONG_BTN_XPATH("//input[@name='btn']"),
	GOOGLE_SEARCH_BOX_XPATH("//input[@id='lst-ib']"),
	GOOGLE_TERMS_XPATH("//a[@class='_Gs'][text()='Terms']"),
	
	GOOGLE_LOGO_HOME_XAPTH("//a/img[@alt='Google']"),
		
	;

    GE(String enumValue) {
        this.enumValue = enumValue;
    }

    private String enumValue;

    public String getEnumValue() {
        return toString();
    }

    public String toString() {
        return this.enumValue;
    }
}