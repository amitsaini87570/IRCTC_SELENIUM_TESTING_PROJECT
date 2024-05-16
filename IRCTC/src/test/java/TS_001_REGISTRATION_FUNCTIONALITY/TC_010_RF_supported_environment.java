
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
import org.testng.Assert;
import org.testng.annotations.Test;

import READ_CAPTCHA.READ__CAPTCHA;
import base_package.basetest;
import interfaceclass.readCaptcha;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class TC_010_RF_supported_environment extends TC_001_RF_VALID_MANDATORY_FIELD  {
	@Test
	public void validate_title_url() throws InterruptedException, TesseractException, IOException {
		TC_010_RF_supported_environment tc_008 = new TC_010_RF_supported_environment();
      tc_008.registration1();
		


		
		// 'Register Account' functionality is working in all the supported environments

		
	}

}
