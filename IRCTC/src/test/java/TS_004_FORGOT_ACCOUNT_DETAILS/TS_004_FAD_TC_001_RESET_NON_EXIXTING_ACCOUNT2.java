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

public class TS_004_FAD_TC_001_RESET_NON_EXIXTING_ACCOUNT2 extends TS_004_FAD_TC_010_RESET_EXIXTING_ACCOUNT {


	public void non_exixting_forgot_account_details() {

		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_001_click_on_LOGIN"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// click on forgot account details
		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_001click_on_forgot_account_details"))).click();

		// enter email

		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_001_EMAIL_USER_ID")))
				.sendKeys(loc.getProperty("ENTER_TS_004_FAD_tc_001_EMAIL_USER_ID"));

		
	}
		
	@Test
	public void get_cap() throws InterruptedException {
		
		TS_004_FAD_TC_001_RESET_NON_EXIXTING_ACCOUNT2 a = new TS_004_FAD_TC_001_RESET_NON_EXIXTING_ACCOUNT2 ();
		a.getCaptcha2((loc.getProperty("TS_004_FAD_tc_001__image_xpath001")),
				(loc.getProperty("TS_004_FAD_tc_001_enter_captcha_box1")));

		// click_on_next
		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_001_ckick_on_next"))).click();

		
		
		
		
		
		
				
				
	}
	
}
