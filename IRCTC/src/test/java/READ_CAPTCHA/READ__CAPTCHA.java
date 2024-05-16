package READ_CAPTCHA;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import base_package.basetest;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class READ__CAPTCHA extends basetest {
	@Test
	public void read_captch() throws InterruptedException {

		driver.manage().window().maximize();
		
	
		// click on login
		driver.findElement(By.xpath(loc.getProperty("click_on_login00"))).click();

		// username
		driver.findElement(By.xpath(loc.getProperty("username00"))).sendKeys((loc.getProperty("enter_username00")));

	
		// password
		driver.findElement(By.xpath(loc.getProperty("password00"))).sendKeys((loc.getProperty("enter_password00")));

		
	}
	

	public void getCaptcha(String imagexpath00,String enter_captcha_box00 ) throws InterruptedException {
		
		READ__CAPTCHA b = new READ__CAPTCHA();
		b.read_captch();
		
		WebElement imageElement = driver.findElement(By.xpath(imagexpath00));
				try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File src = imageElement.getScreenshotAs(OutputType.FILE);
		String path = "E:\\selenium_projects\\rtcs\\IRCTC\\src\\test\\resources\\captcha_image\\captcha.png";

		try {
			FileHandler.copy(src, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);

		ITesseract image = new Tesseract();

		String str;
		try {
			str = image.doOCR(new File(path));

			System.out.println("image ocr done");
			System.out.println(str);

			String Captcha = str.split("below")[0].replaceAll("[^a-zA-Z0-9]", "");
			String Captcha1 = Captcha.replaceAll(" ", "");

			System.out.println(Captcha);
			System.out.println(Captcha1);


			
			driver.findElement(By.xpath(enter_captcha_box00)).sendKeys(Captcha1);
		}
		catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void get_cap() throws InterruptedException {
		READ__CAPTCHA a = new READ__CAPTCHA();
		a.getCaptcha((loc.getProperty("image_xpath001")),(loc.getProperty("enter_captcha_box1")));
		
	}
	
	
	
	

}
