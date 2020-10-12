package com.maveric.demobank.common;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.maveric.demobank.reports.Reporter;
import com.maveric.demobank.reports.Reports;


public class SeMethods extends Reporter {
	public WebDriver driver;
	public String demoBank_Url;
	public int waitTime = 20;
	public static Properties configProp;
	public static Properties objProp;
	Reports report;
	public static WebDriver d;
	public SeMethods() {
		configProp = new Properties();
		objProp = new Properties();
	
		try {
			configProp.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			objProp.load(new FileInputStream(new File("./src/main/resources/object.properties")));
			
			demoBank_Url = configProp.getProperty("DemoBank_URL");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public  String screenShot(WebDriver driver,String img) throws IOException
	{
		//System.out.println("*************************************"+img);
	  String picture=null;
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int Second=calendar.get(Calendar.SECOND);
		img =img+ hour + "_"+ minute +"_"+Second+".png";
		System.out.println("image@@@@@@"+img);
		//System.out.println("driver;;;;;;;;;;;;;;;"+driver);
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("scr file*************"+SrcFile.getAbsolutePath());
		//System.out.println("driver>>>>>>>>>>>>>>>>>>>>>>>>"+driver);
		picture="C:/Users/ravipa/JAVA/DemoBank/src/test/java/"+img;
		try{
		FileUtils.copyFile(SrcFile, new File(picture));
		}
		
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return picture;
	}
	
	public WebDriver startBrowser(String browser) {
		try {

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				;
				System.setProperty("webdriver.ie.driver", "./drivers/iedriver.exe");
				driver = new InternetExplorerDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
						// driver.get(url);
			// reportStep("The browser: "+browser+" launched successfully", "PASS");
		} catch (WebDriverException e) {
			// reportStep("The browser: "+browser+" could not be launched", "FAIL");
			e.printStackTrace();
		}
		return driver;

	}
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case ("id"):
				return FluentWaitCall(driver.findElement(By.id(locValue)));
			case ("link"):
				return FluentWaitCall(driver.findElement(By.linkText(locValue)));
			case ("xpath"):
				return FluentWaitCall(driver.findElement(By.xpath(locValue)));
			case ("name"):
				return FluentWaitCall(driver.findElement(By.name(locValue)));
			case ("class"):
				return FluentWaitCall(driver.findElement(By.className(locValue)));
			case ("tag"):
				return FluentWaitCall(driver.findElement(By.tagName(locValue)));
			}
		} catch (NoSuchElementException e) {
			reportStep("The element with locator " + locValue + " not found.", "FAIL");
			throw e;
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while finding " + locator + " with the value " + locValue, "FAIL");
			throw e;
		}
		return null;
	}
	public boolean verifyEnabled(WebElement ele) {
		try {
			//waitForVisibility(ele, waitTime);
			if (ele.isEnabled()) {
				reportStep("The element " + ele + " is visible", "PASS");
				return true;
			} else {
				reportStep("The element " + ele + " is not visible", "FAIL");
				return false;
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : " + e.getMessage(), "FAIL");
			throw e;
		}
	}
	public WebElement FluentWaitCall(WebElement ele) {

		FluentWait waitTime = new FluentWait(ele);
		waitTime.withTimeout(30, TimeUnit.SECONDS);
		waitTime.pollingEvery(250, TimeUnit.MILLISECONDS);
		waitTime.ignoring(NoSuchElementException.class);
		return ele;

	}

	public void DemoBankLogin() throws InterruptedException {

		driver.get(demoBank_Url);
		System.out.println("DemoBank url is " +demoBank_Url );
		/*if (driver.getTitle().contains("")) {
			
      
		}*/
}
	public boolean verifyDisplayed(WebElement ele) {
		try {
			//waitForVisibility(ele, waitTime);
			if (ele.isDisplayed()) {
				reportStep("The element " + ele + " is visible", "PASS");
				return true;
			} else {
				reportStep("The element " + ele + " is not visible", "FAIL");
				return false;
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : " + e.getMessage(), "FAIL");
			throw e;
		}
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
