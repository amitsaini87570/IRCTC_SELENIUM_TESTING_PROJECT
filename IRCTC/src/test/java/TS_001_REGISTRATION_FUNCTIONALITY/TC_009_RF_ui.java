
package TS_001_REGISTRATION_FUNCTIONALITY;

import java.io.IOException;

import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;

public class TC_009_RF_ui extends TC_001_RF_VALID_MANDATORY_FIELD {
	@Test
	public void validate_title_url() throws InterruptedException, TesseractException, IOException {
		TC_009_RF_ui tc_ = new TC_009_RF_ui();
		tc_.registration1();

		// Proper and good UI are displayed on the 'Register Account' page

	}

}
