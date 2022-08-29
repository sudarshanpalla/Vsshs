package com.Dalvkot.vsshhms_GenericUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationClass implements ITestListener {
	
	public void onTestStart(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		
		System.out.println(methodName+"---Starts");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--Execution succussfully");
	}
	
	public void onTestFailure(ITestResult result)
	{
	 String methodName = result.getMethod().getMethodName();
	 System.out.println(methodName+"--execution failure");
	 System.out.println(result.getThrowable());
	   try{
		 String path=new WebDriverUtility().takeScreenShot(BaseClass.sdriver, methodName);
	      } catch (Throwable e){
		     e.printStackTrace();
	      }
	}
	public  void onTestSkipped(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--execution Skipped");
		System.out.println(result.getThrowable());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		result.getMethod().getMethodName();
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		result.getMethod().getMethodName();
	}
	public void onStart(ITestResult context)
	{
		System.out.println("execution Started");
		
	}
	public void onFinish(ITestResult context)
	{
		System.out.println("executionFinished");
		
	}

}
