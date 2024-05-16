
package TS_001_REGISTRATION_FUNCTIONALITY;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import READ_CAPTCHA.READ__CAPTCHA;
import base_package.basetest;
import interfaceclass.readCaptcha;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TC_004_RF_PTOVIDE_INVALID_MOBILE_NO extends basetest {
	@Test
	public void rf1() throws InterruptedException, TesseractException, IOException {

//		basic details	------------------------------------------------------------------------------------------
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_click_on_register"))).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// USER NAME
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_USERNAME1")))
				.sendKeys(loc.getProperty("ENTER_TS_001_rf_tc_001_USERNAME"));
		// password
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_PASSWORD")))
				.sendKeys(loc.getProperty("ENTERTS_001_rf_tc_001_PASSWORD"));

		// confirm password
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CONFIRM_PASSWORD")))
				.sendKeys(loc.getProperty("ENTERTS_001_rf_tc_001_CONFIRM_PASSWORD"));

		// CLICK ON language
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_PREFFERD_LANG"))).click();

		// CLICK ON ENGLISH
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_ENGLISH"))).click();

		// CLICK ON QUESTION
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_SECURITY_QUESTION"))).click();

		// CLICK ON PET NAME
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_SECURITY_ANSWERE"))).click();

		// question answere
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_YOUR_PET_NAME")))
				.sendKeys(loc.getProperty("ENTERTS_001_rf_tc_001_SECURITY_ANSWERE"));

		// CLICK ON CONTINUE
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_CONTINUE"))).click();

		// PERSONAL_DETAILS------------------------------------------------------------------------------------------------------------------------
		// first name
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_FIRST_NAME")))
				.sendKeys(loc.getProperty("enterTS_001_rf_tc_001_FIRST_NAME"));

		// last name

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_LAST_NAME")))
				.sendKeys(loc.getProperty("ENTERTS_001_rf_tc_001_LAST_NAME"));

		// click occupation

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_SELECT_OCCUPATION"))).click();

		// click on self employed
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_SELF_EMPLOYED"))).click();

		// CLICK ON dob

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_DATE_OF_BIRTH"))).click();

		// CLICK ON 1999
		WebElement yw = driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_YEAR")));
		Select select = new Select(yw);
		select.selectByVisibleText(loc.getProperty("TS_001_rf_tc_001SELECTED_YEAR"));

		// driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_SELF_EMPLOYED"))).click();

		// CLICK ON MONTH
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_MONTH"))).click();

		// CLICK ON OCT
		driver.findElement(By.xpath(loc.getProperty("ENTER_TS_001_rf_tc_001_MONTH"))).click();

		// click on day
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_DAY"))).click();

		// CLICK ON 13
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_click_on_day"))).click();

		// clcik ON MALE
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_MALE"))).click();

		// CLICK ON UNMARRIED
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_UINMARRID_RADIO_BUTTON"))).click();

		// ENTER EMAIL
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_EMAIL")))
				.sendKeys(loc.getProperty("TS_001_rf_tc_001_ENTER_EMAIL"));

		// ENTER MOBILE
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_mobile")))
				.sendKeys(loc.getProperty("TS_001_rf_tc_004_enter_mobile"));

		// CLICK NATIONALITY
		WebElement nat = driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_select_nationality")));

		// SELECT NATIONALITY

		Select select1 = new Select(nat);
		select1.selectByVisibleText(loc.getProperty("TS_001_rf_tc_001_india_xpath1"));

		// CLICK CONTINUE2
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_click_on_continue_2"))).click();

		// address:------------------------------------------------------------------
		// -------------------------------------------------------------

		// ENTER FLAT NO

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_FLAT_NO")))
				.sendKeys(loc.getProperty("TS_001_rf_tc_001_ENTER_FLAT_NO"));

		// ENTER PIN
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_PINCOAD")))
				.sendKeys(loc.getProperty("TS_001_rf_tc_001_ENTER_PINCOAD"));

		// CLICK ONCITY
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_SELECT_CITY"))).click();

		// CLICK ON ALWAR
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_ALWAR"))).click();

		// SELECT POSTAL ADDRESS
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_SELECT_POST_OFFICE"))).click();

		// SELECT POSTAL ADDRESS
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_ALWAR_postal"))).click();

		// ENTER PHONE
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_PHONE")))
				.sendKeys(loc.getProperty("TS_001_rf_tc_001_ENTER_PHONE"));

		// CLICK ON YES COPY
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_YES_COPY_ADDRESS"))).click();

	
		// ENTER CAPTCHA

		WebElement imageElement = driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_image_xpath001")));

		Thread.sleep(2000);

		File src = imageElement.getScreenshotAs(OutputType.FILE);
		String path = "E:\\selenium_projects\\rtcs\\IRCTC\\src\\test\\resources\\captcha_image\\captcha.png";

		FileHandler.copy(src, new File(path));

		Thread.sleep(2000);

		ITesseract image = new Tesseract();

		String str;

		str = image.doOCR(new File(path));

		System.out.println("image ocr done");
		System.out.println(str);

		String Captcha = str.split("below")[0].replaceAll("[^@#$%&*=+-_)(a-zA-Z0-9]", "");
		String Captcha1 = Captcha.replaceAll(" ", "");

		System.out.println(Captcha);
		System.out.println(Captcha1);

		Thread.sleep(2000);

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_enter_captcha_box1"))).sendKeys(Captcha1);

		// CLICK ON I HAVE READ
		//	driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_I_HAVE_READ1"))).click();

		
		// CLICK ON REGISTER
	//	driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_REGISTER"))).click();

	}

}
