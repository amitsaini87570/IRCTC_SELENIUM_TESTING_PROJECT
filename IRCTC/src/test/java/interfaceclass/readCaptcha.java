package interfaceclass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import READ_CAPTCHA.READ__CAPTCHA;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public interface readCaptcha  {
	
	public default void getCaptcha(String imagexpath00, String enter_captcha_box00)
			throws InterruptedException, TesseractException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		WebElement imageElement = driver.findElement(By.xpath(imagexpath00));
		Thread.sleep(2000);

		File src = imageElement.getScreenshotAs(OutputType.FILE);
		String path = "E:\\selenium_projects\\rtcs\\RSRTC\\src\\test\\resources\\screenshot\\captcha.png";

		FileHandler.copy(src, new File(path));

		Thread.sleep(2000);

		ITesseract image = new Tesseract();

		String str;
		str = image.doOCR(new File(path));

		System.out.println("image ocr done");
		System.out.println(str);

		String Captcha = str.split("below")[0].replaceAll("[^a-zA-Z0-9]", "");
		String Captcha1 = Captcha.replaceAll(" ", "");

		System.out.println(Captcha);
		System.out.println(Captcha1);

		driver.findElement(By.xpath(enter_captcha_box00)).sendKeys(Captcha1);

	}

	public void readcaptch();

}
