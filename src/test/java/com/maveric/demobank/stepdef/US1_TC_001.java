package com.maveric.demobank.stepdef;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maveric.demobank.common.SeMethods;
import com.maveric.demobank.reports.Reports;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US1_TC_001 extends SeMethods {
	//SeMethods SeObj = TestRunner.tcObjs.get("US1_TC_001");
	SeMethods SeObj= new SeMethods();
	Reports report=new Reports();
	public String account_No=SeMethods.configProp.getProperty("DemoBank_Account_No");
	public String password=SeMethods.configProp.getProperty("DemoBank_PASSWORD");
	public String pin_Num=SeMethods.configProp.getProperty("DemoBank_Pin");
	public  WebElement pin_Number;
	public  WebElement Validate;
	public WebElement loginButton;
	// public ITestResult result;
	 public WebDriver driver;
	@Given("user Navigate to DemoBank Logingpage")
	public void given1() throws Throwable {
		
		driver=SeObj.startBrowser("chrome");
		report.beforeTest();
		report.startReport("Login");
		SeObj.DemoBankLogin();
		
		}
	@When("Title of the Loginpage is DemoBank")
	public void when2() throws Throwable {
		//verify login button is present or not
		 loginButton=SeObj.locateElement("id",SeMethods.objProp.getProperty("DemoBank_Login.btnLoginButton.Id"));
		
		
		if(loginButton.isDisplayed())
		 {
			//SeObj.reportStep("Login Button is present","PASS");
			//SeObj.screenShot(driver, "rest");
			report.failReport("Login Button is present","PASS","Login",driver);
			//report.endExtent();
		 }
		 else
		 {  
			 report.failReport("Login Button is  not present","FAIL","Login",driver);
			 
		 }
	}
	
	@Then("user enters AccountNumber and password")
	public void then4() throws Throwable {
		//report.startReport("Checking_credentials");
		WebElement dBAccount_No=SeObj.locateElement("id",SeMethods.objProp.getProperty("DemoBank_Login.txtAccount_Number.Id"));
		dBAccount_No.sendKeys(account_No);
		WebElement dB_password=SeObj.locateElement("id", SeMethods.objProp.getProperty("DemoBank_Login.txtpassword.Id"));
		 dB_password.sendKeys(password);
		 
			if(dBAccount_No.isDisplayed())
			 {
				
		 		report.failReport("enters AccountNumber and password details","PASS","Account_Num&Password", driver);
			 }
			 else
			 {
				
				 report.failReport("Not enters AccountNumber and password details","FAIL","Account_Num&Password", driver);
			 
			 }
		 
		 WebElement login=SeObj.locateElement("id",SeMethods.objProp.getProperty("DemoBank_Login.btnLoginButton.Id"));
	     login.click();
	     
	      pin_Number=SeObj.locateElement("id",SeMethods.objProp.getProperty("DemoBank_Login.txtpin.Id"));
	 	if(pin_Number.isEnabled())
		 {
			
	 		report.failReport("Landed successfully in PinNumber verification page","PASS","Checking_credentials", driver);
		 }
		 else
		 {
			
			 report.failReport("Not landed in PinNumber verification page","FAIL","Checking_credentials", driver);
		 
		 }
	 		}
	@And("user is on validation pageThen")
	public void and3() throws Throwable {
		
		//report.startReport("Validation");
		
		
		 	if(pin_Number.isEnabled())
			 {
				report.failReport("landed in validation page","PASS","Validation",driver);
			 }
			 else
			 {
				 
				 report.failReport("Not landed in validation page","FAIL","Validation",driver);
				 
			 }
		 
	}
	@Then("user enters PIN Number")
	public void then5() throws Throwable {
    
    pin_Number=SeObj.locateElement("id",SeMethods.objProp.getProperty("DemoBank_Login.txtpin.Id"));
    
    pin_Number.sendKeys(pin_Num.trim());
    System.out.println(pin_Num);
    
    System.out.println(pin_Number);
   Validate=SeObj.locateElement("id",SeMethods.objProp.getProperty("DemoBank_Login.btnValidate_VPin.Id"));
  
    Validate.click();
   
    
   WebElement FunTrans=SeObj.locateElement("xpath", SeMethods.objProp.getProperty("DemoBank_FunTransfer.xpath"));
   
	if(FunTrans.isEnabled())
	 {
		SeObj.reportStep("landed in Account Statement page","PASS");
	 }
	 else
	 {
		 SeObj.reportStep("Not landed in Account Statement page","FAIL");
		 
	 }
		
	}
	
	//FundTransfer
		@Then("user enters FundTransfer details")
		public void user_fill_the_form() throws IOException, InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Fund Transfers')]")).click();
			driver.findElement(By.xpath("//input[@name='rbname']")).sendKeys("ICIC Bank");
			driver.findElement(By.xpath("//input[@name='rname']")).sendKeys("RAVIPATI");
			driver.findElement(By.id("accno")).sendKeys("1122334455");
			driver.findElement(By.xpath("//input[@name='swift']")).sendKeys("876548976");
			driver.findElement(By.id("amt")).sendKeys("-5");
			WebElement fto = driver.findElement(By.xpath("//select[@id='toption']"));
			fto.click();
			Select element = new Select(fto);
			element.selectByVisibleText("Domestic Transfer");
			driver.findElement(By.xpath(" //input[@id='dot']")).sendKeys("01012020");
			driver.findElement(By.xpath(" //textarea[@id='desc']")).sendKeys("Transfering -$5");
			Thread.sleep(1000);
		report.failReport("Transcation Page","PASS","FundTransfer",driver);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(1000);
		String otp = driver.findElement(By.xpath("//h2[contains(text(),'Transaction Authorization Code')]")).getText();
		report.failReport("OTP","PASS","OTP",driver);
		driver.findElement(By.id("token")).sendKeys("123456");
		driver.findElement(By.id("submitButton")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[contains(text(),'International Transaction Successful')]")).getText();
		report.failReport("Transaction Successful","PASS","Transaction Successful",driver);
		}
		
	  @And("Click on SignOut")
	  public void signOut() throws Throwable {
	    WebElement Signout=SeObj.locateElement("xpath", SeMethods.objProp.getProperty("DemoBAnk_btnsignout.xpath"));
	     Signout.click();
	 	report.failReport("Login Button is present","PASS","Login",driver);
	 	 report.endExtent();

	     Thread.sleep(1000);
	    }
	  @And("Close browser") 
	  public void closeBrowser() throws Throwable { 
		  driver.close();
	  }
	
}
