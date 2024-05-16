
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
import org.testng.annotations.Test;

import READ_CAPTCHA.READ__CAPTCHA;
import base_package.basetest;
import interfaceclass.readCaptcha;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TC_006_LF_validate_PLACEHOLDER extends basetest {
	@Test
	public void LOGIN_FIELDS() throws InterruptedException, TesseractException, IOException {

		driver.findElement(By.xpath(loc.getProperty("TS_002_LF_tc_001_click_on_LOGIN"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//PLACEHOLDERS ARE PRESENT
	}
}
