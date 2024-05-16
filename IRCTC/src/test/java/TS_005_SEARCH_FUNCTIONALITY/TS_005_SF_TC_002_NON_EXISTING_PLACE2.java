package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base_package.basetest;

public class TS_005_SF_TC_002_NON_EXISTING_PLACE2  extends basetest {
@Test
	public void TS_005_SF_TC_001_EXISTING_PLACE_NAME() {
		
	//FROM
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_FROM"))).sendKeys(loc.getProperty("ENTER_TS_005_SF_TC_001_FROM"));

	//TO
	driver.findElement(By.xpath(loc.getProperty("TS_005_SF_TC_001_TO"))).sendKeys(loc.getProperty("ENTER_TS_005_SF_TC_002_TO"));

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
