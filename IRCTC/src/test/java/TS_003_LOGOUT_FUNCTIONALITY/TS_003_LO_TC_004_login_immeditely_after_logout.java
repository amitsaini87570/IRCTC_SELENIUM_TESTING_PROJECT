package TS_003_LOGOUT_FUNCTIONALITY;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LF_VALID_MANDATORY_FIELD.TC_001_LF_VALID_MANDATORY_FIELD;
import net.sourceforge.tess4j.TesseractException;

public class TS_003_LO_TC_004_login_immeditely_after_logout extends TC_001_LF_VALID_MANDATORY_FIELD {
	@Test
	public void logout() throws InterruptedException, TesseractException, IOException {
		TS_003_LO_TC_004_login_immeditely_after_logout a = new TS_003_LO_TC_004_login_immeditely_after_logout();
		a.get_cap();
		
		//click on logout
		//driver.findElement(By.xpath(loc.getProperty("TS_003_LO_TC_001_click_on_logout"))).click();

       //again login
		//a.get_cap();

		
	}

}
