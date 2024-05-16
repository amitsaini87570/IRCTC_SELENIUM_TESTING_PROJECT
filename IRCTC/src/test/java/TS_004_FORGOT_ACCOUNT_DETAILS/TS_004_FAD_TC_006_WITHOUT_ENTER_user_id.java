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

public class TS_004_FAD_TC_006_WITHOUT_ENTER_user_id extends TS_004_FAD_TC_010_RESET_EXIXTING_ACCOUNT {

	// mailsour coad for get otp from gmail

	String apiKey = "ALhIdVH3YcfgLnve9tQHuTFclpbUBg9c";
	String serverId = "7soinggk";
	String serverDomain = "7soinggk.mailosaur.net";
	String from = "noreply@groww.in";

	public String getrandomemail() {
		return "user" + System.currentTimeMillis() + "@" + serverDomain;
	}

	@Test
	public void without_entr_userid() throws IOException, MailosaurException, InterruptedException {

		TS_004_FAD_TC_006_WITHOUT_ENTER_user_id D = new TS_004_FAD_TC_006_WITHOUT_ENTER_user_id();
		D.get_cap();
		
		
		 
		 
		// ENTER USERID

		// enter code on recovery email

		String emailid = getrandomemail();
		// WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/login");
		driver.findElement(By.id("login_email1")).sendKeys(emailid);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		MailosaurClient mailosaur = new MailosaurClient(apiKey);
		MessageSearchParams params = new MessageSearchParams();
		params.withServer(serverId);

		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo(emailid);
		criteria.withSentFrom(from);

		Message message = mailosaur.messages().get(params, criteria);

		String subject = message.subject();
		System.out.println(subject);

		System.out.println("getotp");

		Pattern pattern = Pattern.compile("Your email verification OTP is .*([0-9]{6}).*");

		Matcher matcher = pattern.matcher(subject);
		matcher.find();
		System.out.println(matcher.group(1));
		String otp = matcher.group(1);
		// ENTER OTP
		driver.findElement(By.id("TS_004_FAD_tc_0001__OTP")).sendKeys(otp);

		// ENTER NEW PASSWORD
		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_0001NEW_PASSWORD")))
				.sendKeys(loc.getProperty("TS_004_FAD_tc_0001ENTER_NEW_PASSWORD"));

		// ENTER CONFIRM NEW PASSWORD
		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_0001CONFIRM_NEW_PASSWORD")))
				.sendKeys(loc.getProperty("TS_004_FAD_tc_0001ENTER_CONFIRM_NEW_PASSWORD"));

		// ENTER CAPTCHA
		TS_004_FAD_TC_010_RESET_EXIXTING_ACCOUNT C = new TS_004_FAD_TC_010_RESET_EXIXTING_ACCOUNT();
		C.getCaptcha2((loc.getProperty("TS_004_FAD_tc_0001__image_xpath001_2")),
				(loc.getProperty("TS_004_FAD_tc_0001__image_xpath001_2")));

		// click_on_next
		driver.findElement(By.xpath(loc.getProperty("TS_004_FAD_tc_0001_CLICK_UPDATE_PASSWORD"))).click();


	}
}
