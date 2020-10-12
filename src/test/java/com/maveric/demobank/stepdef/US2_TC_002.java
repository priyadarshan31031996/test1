package com.maveric.demobank.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.maveric.demobank.common.SeMethods;
import com.maveric.demobank.reports.Reports;

import io.cucumber.java.en.*;


public class US2_TC_002 {
	static WebDriver driver;
	SeMethods SeObj= new SeMethods();
	Reports report=new Reports();
	public String account_No=SeMethods.configProp.getProperty("DemoBank_Account_No");
	public String password=SeMethods.configProp.getProperty("DemoBank_PASSWORD");
	public String pin_Num=SeMethods.configProp.getProperty("DemoBank_Pin");
	public  WebElement pin_Number;
	public  WebElement Validate;
	US1_TC_001 us=new US1_TC_001();
	@Given("user is on bank page")
	
	public void user_is_on_bank_page() throws InterruptedException {
		
		driver=SeObj.startBrowser("chrome");
		/*report.beforeTest();
		report.startReport("Login");*/
		SeObj.DemoBankLogin();
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravipa\\JAVA\\DemoBank\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.rapidtestpro.com/login.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		System.out.println("The title is "+title);
		SoftAssert ass = new SoftAssert();
		ass.assertEquals( "Online Banking - www.TechZoo.org", title);
		*/
	}

	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {

	driver.findElement(By.id("accno")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		us.then4();
	
	}

	@When("user click login button")
	public void user_click_login_button() {

		driver.findElement(By.id("submitButton")).click();

	}
	
	@Then("user has to enter the \"(.*)\" and Click on Validate PIN")
	public void user_has_to_enter_the_PIN_number_and_Click_on_Validate_PIN(String pin) {
		driver.findElement(By.id("accpin")).sendKeys(pin);
		driver.findElement(By.id("submitButton")).click();
		String welcome = driver.findElement(By.xpath("//strong[contains(text(),'Welcome, TOUSIF KHAN')]")).getText();
		System.out.println(welcome);
		
	}

	@Given("use click the account statement button")
	public void use_click_the_account_statement_button() {

		driver.findElement(By.linkText("Account Statement")).click();
		String accstmt = driver.findElement(By.xpath("//strong[contains(text(),'Account Statement')]")).getText();
		System.out.println(accstmt);

	}

	@Then("transaction statement is displayed")
	public void transaction_statement_is_displayed() throws IOException {
		
		System.out.println("All the transactions of the user is displayed");
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Screenshots\\out1.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
	}

	@Given("user click the account details button")
	public void user_click_the_account_details_button() {
		driver.findElement(By.linkText("Account Details")).click();

	}

	@Then("account details page is displayed")
	public void account_details_page_is_displayed() throws IOException  {
		
		System.out.println("Account Details of the user is displayed");
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Screenshots\\out2.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
}

	@Given("user click the fund transfer button")
	public void user_click_the_fund_transfer_button() {

		driver.findElement(By.xpath("//a[contains(text(),'Fund Transfers')]")).click();
	}

	@When("user fill the form")
	public void user_fill_the_form() {
		driver.findElement(By.xpath("//input[@name='rbname']")).sendKeys("ABCD Bank");
		driver.findElement(By.xpath("//input[@name='rname']")).sendKeys("Lassey");
		driver.findElement(By.id("accno")).sendKeys("9873498321");
		driver.findElement(By.xpath("//input[@name='swift']")).sendKeys("876548976");
		driver.findElement(By.id("amt")).sendKeys("-5");
		WebElement fto = driver.findElement(By.xpath("//select[@id='toption']"));
		fto.click();
		Select element = new Select(fto);
		element.selectByVisibleText("Domestic Transfer");
		driver.findElement(By.xpath(" //input[@id='dot']")).sendKeys("01012020");
		driver.findElement(By.xpath(" //textarea[@id='desc']")).sendKeys("Transfering -$5");
	
	}
	
	@When("click the transfer button")
	public void click_the_transfer_button() {

		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

	}

	@Then("the OTP page is displayed")
	public void the_OTP_page_is_displayed() {

		String otp = driver.findElement(By.xpath("//h2[contains(text(),'Transaction Authorization Code')]")).getText();
		System.out.println(otp);
	}

	@When("user enter the OTP and Clicking validate VAT")
	public void user_enter_the_OTP_and_Clicking_validate_VAT()  {

		driver.findElement(By.id("token")).sendKeys("123456");
		driver.findElement(By.id("submitButton")).click(); 
		
		
	}

	@Then("successful transfer page with transaction details is displayed")
	public void successful_transfer_page_with_transaction_details_is_displayed() throws IOException {
		String success = driver.findElement(By.xpath("//strong[contains(text(),'International Transaction Successful')]")).getText();
		System.out.println(success);
		
		TakesScreenshot scrsht = (TakesScreenshot) driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Screenshots\\out3.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
	
	}

	@Given("user click the sign out button")
	public void user_click_the_sign_out_button() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Signed Out Successfully");
		driver.quit();
	}
	
}
