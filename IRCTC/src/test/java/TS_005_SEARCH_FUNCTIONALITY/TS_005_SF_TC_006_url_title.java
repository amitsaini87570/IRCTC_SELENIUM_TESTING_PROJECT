package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.basetest;

public class TS_005_SF_TC_006_url_title  extends basetest {
@Test
	public void TS_005_SF_TC_001_EXISTING_PLACE_NAME() {
		
	//FROM
	

	//verify title
	// get the actual title
	String actual_title = driver.getTitle();
	// printing actual title
	System.out.println("actual title is     " + actual_title);
	// expected title from locator properties
	String expected_title = (loc.getProperty("expected_titletc_TS_005_SF_TC_001__irctc"));
	// verifying the title
	Assert.assertEquals(actual_title, expected_title, "title not matched");

//verify url
	// get the actual url
	String actual_url = driver.getCurrentUrl();
	// printing actual url
	System.out.println("actual url is     " + actual_url);
	// expected url from locator properties
	String expected_url = (loc.getProperty("expected_url_TS_005_SF_TC_001_irctc"));
	// verifying the url
	 Assert.assertEquals(actual_url, expected_url, "url not matched");
	
	}
}
