package com.Dalvkot.vsshhms_GenericUtility;

import java.util.Calendar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * 
 * @author Sudarshan Palla
 *
 */
public class ListenerImp implements ITestListener {

    public class java {
	
	}

	ExtentReports report;
    ExtentTest test;

	public void onTestStart(ITestResult result) 
	{
		test=report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		//log the pass method
		test.log(Status.PASS,result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result)
	{
		//log fail method ,take screenshot, attch screen shot to Extent report
		//Add execption Logs
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		String path=null;
		WebDriverUtility wutil=new WebDriverUtility();
		try {
			
		}
		catch (Throwable e)
		{
		   e.printStackTrace();
		}
		test.addScreenCaptureFromBase64String(path);
	}

	public void onTestSkipped(ITestResult result)
	{
		//log the Skip method(test case name and exception logs)
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onStart(ITestContext context) 
	{
		String dateAndTime = Calendar.getInstance().getTime().toString().replace(":", "_");
		ExtentSparkReporter htmlreporter=new ExtentSparkReporter("./ExtentReport"+dateAndTime+".html");
		htmlreporter.config().setDocumentTitle("Camcast Automation Execution Report");
		htmlreporter.config().setReportName("Regression Execution Report");
		htmlreporter.config().setTheme(Theme.DARK);
		
		//Attach the Physical reposrt and do the system
		report=new ExtentReports();
		report.attachReporter(htmlreporter);
		report.setSystemInfo("Environment","TestEnvironment");
		report.setSystemInfo("URL", "http://111.93.140.107/vsshhms-demo/login");
		report.setSystemInfo("ReporterName", "SudarshanPalla");
	}
    
	public void onFinish(ITestContext context)
	{
		report.flush();
	}
	

}
