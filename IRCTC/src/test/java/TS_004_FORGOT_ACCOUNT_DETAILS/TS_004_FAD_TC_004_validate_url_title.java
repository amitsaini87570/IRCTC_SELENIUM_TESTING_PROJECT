package TS_004_FORGOT_ACCOUNT_DETAILS;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import READ_CAPTCHA.READ__CAPTCHA;
import base_package.basetest;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TS_004_FAD_TC_004_validate_url_title extends TS_004_FAD_TC_010_RESET_EXIXTING_ACCOUNT {

	@Test
	public void url_title_forgot_account_details() throws InterruptedException {
		
		TS_004_FAD_TC_004_validate_url_title a = new TS_004_FAD_TC_004_validate_url_title();
		a.get_cap();
		
		//verify title
		// get the actual title
		String actual_title = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title);
		// expected title from locator properties
		String expected_title = (loc.getProperty("expected_titletc_TS_004_FAD_TC_004_"));
		// verifying the title
		Assert.assertEquals(actual_title, expected_title, "title not matched");

//verify url
		// get the actual url
		String actual_url = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url);
		// expected url from locator properties
		String expected_url = (loc.getProperty("expected_url_TS_004_FAD_TC_004_"));
		// verifying the url
		 Assert.assertEquals(actual_url, expected_url, "url not matched");
		
		
		
		
		
		
		
		
	}
}
