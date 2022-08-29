package com.Dalvkot.vsshhms_ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter Email Id'][1]")
	private WebElement userNameText;
	
	@FindBy(xpath = "//input[@placeholder='Password'][1]")
	private WebElement passwordText;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-round btn-lg btn-block']")
	private WebElement submitButton;

	public WebElement getUserNameText() {
		return userNameText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public void login(String username,String password) {
		userNameText.sendKeys("sudarshan@dalvkot.com");
		passwordText.sendKeys("suda123");
		submitButton.click();
		
	}
	 
	
	

}
