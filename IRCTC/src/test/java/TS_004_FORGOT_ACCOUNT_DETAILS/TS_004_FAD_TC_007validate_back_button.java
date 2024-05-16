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

public class TS_004_FAD_TC_007validate_back_button extends TS_004_FAD_TC_010_RESET_EXIXTING_ACCOUNT {

	@Test
	public void url_title_forgot_account_details() throws InterruptedException {
		TS_004_FAD_TC_007validate_back_button a = new TS_004_FAD_TC_007validate_back_button();
		a.get_cap();
		
		//back button
		driver.navigate().back();
	   //login page displayed	

		
		
		
		
		
		
	}
}
