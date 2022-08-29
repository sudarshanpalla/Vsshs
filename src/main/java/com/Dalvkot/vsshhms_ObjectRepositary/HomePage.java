package com.Dalvkot.vsshhms_ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	
	//intilization f the WebElements
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")
    private WebElement	button;
	
	
	
	public void setButton(WebElement button) {
		this.button = button;
	}

	@FindBy(partialLinkText=" Appointment Booking ")
	private WebElement appointmentButton;
	
	
	
	public WebElement getButton() 
	{
		return button;
	}
	
	public WebElement getAppointmentButton()
	{
		return appointmentButton;
	}
	
	
	//Businees Logic
	public void button()
	{
		button.click();
	}
	public void AppointmentButton()
	{
		appointmentButton.click();
	}
	
	
	
	

}
