package com.maveric.demobank.reports;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import com.maveric.demobank.common.SeMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports extends SeMethods{
	
  SeMethods SeObjs=new SeMethods();
  public ExtentReports report;
  public ExtentTest logger;
 
 
public void beforeTest()
  {
	  report=new ExtentReports("C:\\Users\\admin\\Documents\\Maveric Systems\\Materials\\Selenium\\GroupActivity2\\DemoBank\\target\\Reports\\Report.html",true);
  }
	public void startReport(String m)
	{
		System.out.println("before method");
		logger=report.startTest(m);		
	}
	public void failReport(String desc,String status,String methodName,WebDriver driver1) throws IOException
	{
		String datetime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		//System.out.println("After Method failed test case.");
		if(status.equalsIgnoreCase("FAIL"))
		{
			
			logger.log(LogStatus.FAIL,"  Failed Method  "+methodName);
			logger.log(LogStatus.INFO, desc);
			
			String scr=SeObjs.screenShot(driver1,methodName+datetime); 
			logger.log(LogStatus.FAIL,logger.addScreenCapture(scr));
		}
		else if(status.equalsIgnoreCase("PASS"))
		{
			//System.out.println(result.getStatus());
			String scr=SeObjs.screenShot(driver1,methodName+datetime); 
			System.out.println("gggggggggggggggg"+methodName+datetime);
			logger.log(LogStatus.PASS,"  Passed Method  "+methodName);
			System.out.println("image::"+scr);
			logger.log(LogStatus.PASS,logger.addScreenCapture(scr));
		}
		else if(status.equalsIgnoreCase("SKIP"))
		{
			//System.out.println(result.getStatus());
			logger.log(LogStatus.SKIP,"Skipped Method  "+methodName);
		}
		//Pojo.getUtility().screenShot(driver,"ScreenShot"); 
		   report.endTest(logger);
		}
public void endExtent()
	{
		System.out.println("after test");    
		report.flush();
		report.close();		
	}

}
