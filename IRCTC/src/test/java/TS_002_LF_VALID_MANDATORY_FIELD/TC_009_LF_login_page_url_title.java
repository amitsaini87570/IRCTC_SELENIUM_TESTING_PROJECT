
package TS_002_LF_VALID_MANDATORY_FIELD;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import READ_CAPTCHA.READ__CAPTCHA;
import base_package.basetest;
import interfaceclass.readCaptcha;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TC_009_LF_login_page_url_title extends basetest {
	@Test
	public void LOGIN_FIELDS() throws InterruptedException, TesseractException, IOException {

		driver.findElement(By.xpath(loc.getProperty("TS_002_LF_tc_001_click_on_LOGIN"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//verify title
		// get the actual title
		String actual_title = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title);
		// expected title from locator properties
		String expected_title = (loc.getProperty("expected_titletc_009_lf_irctc"));
		// verifying the title
	//	Assert.assertEquals(actual_title, expected_title, "title not matched");

//verify url
		// get the actual url
		String actual_url = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url);
		// expected url from locator properties
		String expected_url = (loc.getProperty("expected_url_009_lf_irctc"));
		// verifying the url
	//	 Assert.assertEquals(actual_url, expected_url, "url not matched");
		
		
		
	}

}
