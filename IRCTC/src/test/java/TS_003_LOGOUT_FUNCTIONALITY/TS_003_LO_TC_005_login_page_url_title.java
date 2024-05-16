package TS_003_LOGOUT_FUNCTIONALITY;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LF_VALID_MANDATORY_FIELD.TC_001_LF_VALID_MANDATORY_FIELD;
import net.sourceforge.tess4j.TesseractException;

public class TS_003_LO_TC_005_login_page_url_title extends TC_001_LF_VALID_MANDATORY_FIELD {
	@Test
	public void logout() throws InterruptedException, TesseractException, IOException {
		TS_003_LO_TC_005_login_page_url_title a = new TS_003_LO_TC_005_login_page_url_title();
		a.get_cap();
		
		//click on logout
		driver.findElement(By.xpath(loc.getProperty("TS_003_LO_TC_001_click_on_logout"))).click();


		//verify title
		// get the actual title
		String actual_title = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title);
		// expected title from locator properties
		String expected_title = (loc.getProperty("expected_titletc_005_lo_irctc"));
		// verifying the title
	//	Assert.assertEquals(actual_title, expected_title, "title not matched");

//verify url
		// get the actual url
		String actual_url = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url);
		// expected url from locator properties
		String expected_url = (loc.getProperty("expected_url_005_lo_irctc"));
		// verifying the url
	//	 Assert.assertEquals(actual_url, expected_url, "url not matched");
		
		
      

		
	}

}
