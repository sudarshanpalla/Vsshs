package com.Dalvkot.vsshhms_TESTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderForLoginPageTest {
	
	@Test(dataProvider = "dataproviderforLoginPage")
	public void loginPage(String username, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']")).click();
	}
	@DataProvider
	public Object[][] dataproviderforLoginPage()
	{
		Object[][] obj=new Object[5][2];
		
		//Verify by Giving invalid username and valid password
		obj[0][0]="sudarsha@dalvkot.com";
		obj[0][1]="suda123";
		
		//Verify by Givivng Valid username and invalid password
		obj[1][0]="sudarshan@dalvkot.com";
		obj[1][1]="suda2";
		
		//Verify by Giving invalid username and invalid password
		obj[2][0]="sudarsha@dalvkot.com";
		obj[2][1]="su123";
		
		//Verify by Giving valid username and valid password
		obj[2][0]="sudarshan@dalvkot.com";
		obj[2][1]="suda123";
		
		//Verify the Case sensitive of Username 
		obj[2][0]="SuDArshan@dalvkot.com";
		obj[2][1]="suda123";
		
		return obj;
		
		
	}
	

}
