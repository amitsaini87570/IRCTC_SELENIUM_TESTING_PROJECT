package TS_007_CONTACT_US;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base_package.basetest;

public class TS_007_CU_TC_003_URL_TITLECONTECT_US_PAGE2 extends basetest {
	@Test
	public void TS_007_CU_TC_001_NAVIGATE_TO_CONTECT_US_PAGE() {
		
		driver.findElement(By.xpath(loc.getProperty("TS_007_CU_tc_001_click_on_CONTACT_US"))).click();

			

		//verify title
		// get the actual title
		String actual_title = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title);
		// expected title from locator properties
		String expected_title = (loc.getProperty("expected_titletc_TS_007_CU_TC_003_irctc"));
		// verifying the title
	//	Assert.assertEquals(actual_title, expected_title, "title not matched");

	//verify url
		// get the actual url
		String actual_url = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url);
		// expected url from locator properties
		String expected_url = (loc.getProperty("expected_url_TS_007_CU_TC_003___irctc"));
		// verifying the url
	//	 Assert.assertEquals(actual_url, expected_url, "url not matched");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
