package com.Dalvkot.vsshhms_GenericUtility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Dalvkot.vsshhms_ObjectRepositary.HomePage;
import com.Dalvkot.vsshhms_ObjectRepositary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver=null;
	public static WebDriver sdriver;
	public FileUtility futil=new FileUtility();
	public ExcelUtility eutil=new ExcelUtility();
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
	
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.print("DatabaseConnection");
	}
	
	@BeforeTest
	public void btest()
	{
		System.out.print("Execute the Scripts in parallel mode");
	}
	
	@BeforeClass
	public void bclass() throws Throwable 
	{
		String browserName=futil.getProperyKeyValue("browser");
		String url=futil.getProperyKeyValue("url");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.print("launch the browser is "+browserName);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("launch the browser "+browserName);
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sdriver=driver;
	}
	
	@BeforeMethod
	public void bmethod() throws Throwable
	{
		String username=futil.getProperyKeyValue("username");
		String password=futil.getProperyKeyValue("password");
		LoginPage page=new LoginPage(driver);
		page.login(username,password);
		
	}
	
	@AfterMethod
	public void amethod()
	{
		HomePage pg=new HomePage(driver);
		//pg.logout(driver);
	}
	
	@AfterClass
	public void aclass()
	{
		driver.quit();
	}
	
	@AfterTest
	public void atest()
	{ 
		System.out.println("close parallel Execution");
	}
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("close the DataBase");
	}

}













