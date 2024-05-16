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

public class TC_002_RF_not_enter_MANDATORY_FIELD extends basetest {
	@Test
	public void rf1() throws InterruptedException, TesseractException, IOException {

//		basic details	------------------------------------------------------------------------------------------

		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_click_on_register"))).click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// CLICK ON CONTINUE
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_CONTINUE"))).click();

		// CLICK CONTINUE2
		driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_click_on_continue_2"))).click();

		// CLICK ON REGISTER
		 driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_REGISTER"))).click();
		 driver.findElement(By.xpath(loc.getProperty("TS_001_rf_tc_001_CLICK_ON_REGISTER"))).click();

	}

}
