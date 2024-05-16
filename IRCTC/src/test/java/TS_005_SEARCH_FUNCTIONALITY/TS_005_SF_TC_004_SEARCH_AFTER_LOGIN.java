package TS_005_SEARCH_FUNCTIONALITY;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TS_002_LF_VALID_MANDATORY_FIELD.TC_001_LF_VALID_MANDATORY_FIELD;
import base_package.basetest;
import net.sourceforge.tess4j.TesseractException;

public class TS_005_SF_TC_004_SEARCH_AFTER_LOGIN  extends TC_001_LF_VALID_MANDATORY_FIELD {
@Test
	public void TS_005_SF_TC_001_EXISTING_PLACE_NAME() throws InterruptedException, TesseractException, IOException {
	
	
	
	TS_005_SF_TC_004_SEARCH_AFTER_LOGIN A = new TS_005_SF_TC_004_SEARCH_AFTER_LOGIN();
	A.get_cap();
		
	//FROM
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_FROM"))).sendKeys(loc.getProperty("ENTER_TS_005_SF_TC_001_FROM"));

	//TO
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_TO"))).sendKeys(loc.getProperty("ENTER_TS_005_SF_TC_001_TO"));

	//click on empty space
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_click_empty"))).click();

	//TICKET TYPE
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_TICKET_TYPE_OPTIONS"))).click();

	//CLICK ON TATKAL
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_CLICK_ON_TATKAL"))).click();

	//CLASS TYPE
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_CLASS_TYPE"))).click();

	//CLICK ON ANUBHUTI
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_CLICK_ON_all_CLASS"))).click();

	//CLICK ON SEARCH
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_CLICK_ON_SEARCH"))).click();	
	
	}
}
