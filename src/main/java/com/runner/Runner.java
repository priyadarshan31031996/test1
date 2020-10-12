package com.runner;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.maveric.demobank.common.SeMethods;

public class Runner  {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravipa\\JAVA\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.rapidtestpro.com/login.php");
		driver.manage().window().maximize();
         WebElement Account_Number=driver.findElement(By.id("accno"));
         Thread.sleep(1000);
         Account_Number.sendKeys("1234556666");
        WebElement password=driver.findElement(By.id("pass"));
               password.sendKeys("MavDemo@01");
      
		driver.findElement(By.id("submitButton")).click();
		 WebElement pin=driver.findElement(By.id("accpin"));
		 pin.sendKeys("12345");
		 driver.findElement(By.id("submitButton")).click();
		//input[@id='accpin']
		//driver.findElement(By.name("q")).sendKeys("selenium");
		/*driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);;*/
		//driver.close();
	}

}
			