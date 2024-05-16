package TS_006_HOME_PAGE;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.basetest;

public class TS_006_HP_TC_006_URL_TITLE extends basetest {
	@Test
	public void TS_006_HP_TC_001_NAVIGATE_TO_HOME_PAGE() {
		
		

		//verify title
		// get the actual title
		String actual_title = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title);
		// expected title from locator properties
	//	String expected_title = (loc.getProperty("expected_titletc_TS_006_HP_TC_006___irctc"));
		// verifying the title
	//	Assert.assertEquals(actual_title, expected_title, "title not matched");

	//verify url
		// get the actual url
		String actual_url = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url);
		// expected url from locator properties
	//	String expected_url = (loc.getProperty("expected_url_TS_006_HP_TC_006__irctc"));
		// verifying the url
	//	 Assert.assertEquals(actual_url, expected_url, "url not matched");
		
		
		
	}

}
