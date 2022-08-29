package com.Dalvkot.vsshhms_TESTS;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppointmenbookingTest {
	
	//Without Entering any manadatory field's Click on Submit
	@Test
	public void withoutEnteringAnythingClickOnSubmit() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("sudarshan@dalvkot.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("suda123");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']"));
	    submit.click();
	    Thread.sleep(1000);
	    //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    for(int i=0; i<=2;i++)
		{
			  try{
		         driver.findElement(By.xpath("//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")).click();
			     break;
			  }
 			  catch(Exception e)
		      {
			   System.out.print(e.getMessage());
			  }
		}
		
	    driver.findElement(By.xpath("//a[text()=' Appointment Booking ']")).click();
	    
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-simple']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round']")).click();
		
	}
	
	
	
	
	//Click on Cancel After filling all Manadatory filed's
	@Test
	public void clickonCancelAfterFillingTheManadatoryFields() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("sudarshan@dalvkot.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("suda123");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']"));
	    submit.click();
	    Thread.sleep(1000);
	   
	    for(int i=0; i<=2;i++)
		{
			  try{
		         driver.findElement(By.xpath("//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")).click();
			     break;
			  }
 			  catch(Exception e)
		      {
			   System.out.print(e.getMessage());
			  }
		}
		
	    driver.findElement(By.xpath("//a[text()=' Appointment Booking ']")).click();
		// WebElement web = driver.findElement(By.xpath("//span[text()='Appointment Type']"));
		 WebElement drop = driver.findElement(By.xpath("//label[text()='Appointment Type ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		 Select sel=new Select(drop);
		 sel.selectByVisibleText("Telephonic");
		 
		 WebElement date = driver.findElement(By.xpath("//label[text()='Booking Date ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		 date.sendKeys("03082022");
         WebElement time = driver.findElement(By.xpath("//label[text()='Booking Time ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
         time.click();
         time.sendKeys("1230");
       
         driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("raji");
       
        WebElement select1 = driver.findElement(By.xpath("//label[text()='Gender']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
        Select sel2=new Select(select1);
        sel2.selectByVisibleText("FEMALE");
     
        WebElement date1 = driver.findElement(By.xpath("//label[text()='Date Of Birth']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
        date1.click();
        date1.sendKeys("19081889");
		
        driver.findElement(By.xpath("//input[@formcontrolname='phoneNo']")).sendKeys("122222222");
		
        driver.findElement(By.xpath("//input[@placeholder='Email Id']")).sendKeys("ra@gmail.com");
		
        WebElement select2 = driver.findElement(By.xpath("//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel3=new Select(select2);
		sel3.selectByIndex(3);
		
		WebElement select3 = driver.findElement(By.xpath("//label[text()=' Doctor Name ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel4=new Select(select3);
		sel4.selectByVisibleText("DR S K MOHANTY");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-simple']")).click();
		
	}
	
	
	
	
	
	//without Entring anything click on Cancel Button
	@Test
	public void withoutenteringAnythingClickOnCancelButton() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("sudarshan@dalvkot.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("suda123");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']"));
	    submit.click();
	    Thread.sleep(1000);
	    for(int i=0; i<=2;i++)
		{
			  try{
		         driver.findElement(By.xpath("//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")).click();
			     break;
			  }
 			  catch(Exception e)
		      {
			   System.out.print(e.getMessage());
			  }
		}
		
	    driver.findElement(By.xpath("//a[text()=' Appointment Booking ']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-simple']")).click();
	    
		
	}
	
	
    @Test
    public void mobileNumberWithSpace() throws Throwable {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("sudarshan@dalvkot.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("suda123");
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']"));
	    submit.click();
	    Thread.sleep(1000);
	   
	    for(int i=0; i<=2;i++)
		{
			  try{
		         driver.findElement(By.xpath("//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")).click();
			     break;
			  }
 			  catch(Exception e)
		      {
			   System.out.print(e.getMessage());
			  }
		}
		
	    driver.findElement(By.xpath("//a[text()=' Appointment Booking ']")).click();
		// WebElement web = driver.findElement(By.xpath("//span[text()='Appointment Type']"));
		 WebElement drop = driver.findElement(By.xpath("//label[text()='Appointment Type ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		 Select sel=new Select(drop);
		 sel.selectByVisibleText("Telephonic");
		 
		 WebElement date = driver.findElement(By.xpath("//label[text()='Booking Date ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		 date.sendKeys("03082022");
         WebElement time = driver.findElement(By.xpath("//label[text()='Booking Time ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
         time.click();
         time.sendKeys("1230");
       
         driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("raji");
       
        WebElement select1 = driver.findElement(By.xpath("//label[text()='Gender']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
        Select sel2=new Select(select1);
        sel2.selectByVisibleText("FEMALE");
     
        WebElement date1 = driver.findElement(By.xpath("//label[text()='Date Of Birth']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
        date1.click();
        date1.sendKeys("19081889");
		
        driver.findElement(By.xpath("//input[@formcontrolname='phoneNo']")).sendKeys("@#$%22222");
		
        driver.findElement(By.xpath("//input[@placeholder='Email Id']")).sendKeys("ra   @gmail.com");
		
        WebElement select2 = driver.findElement(By.xpath("//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel3=new Select(select2);
		sel3.selectByIndex(3);
		
		WebElement select3 = driver.findElement(By.xpath("//label[text()=' Doctor Name ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel4=new Select(select3);
		sel4.selectByVisibleText("DR S K MOHANTY");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-simple']")).click();
    	
    }
	
}
