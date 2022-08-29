package com.Dalvkot.vsshhms_ObjectRepositary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.vsshhms_GenericUtility.WebDriverUtility;

public class AppointmentBookingPage extends WebDriverUtility{
	
	public AppointmentBookingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()=' Appointment Booking ']")
	private WebElement appointmentType;
	
	@FindBy(xpath = "//label[text()='Appointment Type ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']")
	private WebElement appointmentTypeDW;
	
	@FindBy(xpath = "//label[text()='Booking Date ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input")
	private WebElement bookingDate;
	
	@FindBy(xpath="//label[text()='Booking Time ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input")
	private WebElement bookingTime;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	
	@FindBy(xpath="//label[text()='Gender']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']")
	private WebElement gender;
	
	@FindBy(xpath="//label[text()='Date Of Birth']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input")
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@formcontrolname='phoneNo']")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@placeholder='Email Id']")
	private WebElement emailId;
	
	@FindBy(xpath="//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']")
	private WebElement departmentDropDown;
	
	@FindBy(xpath="//label[text()=' Doctor Name ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']")
	private WebElement doctorName;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-round btn-simple']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round']")
	private WebElement bookNowButton;

	public WebElement getAppointmentType() {
		return appointmentType;
	}

	public WebElement getAppointmentTypeDW() {
		return appointmentTypeDW;
	}

	public WebElement getBookingDate() {
		return bookingDate;
	}

	public WebElement getBookingTime() {
		return bookingTime;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getDepartmentDropDown() {
		return departmentDropDown;
	}

	public WebElement getDoctorName() {
		return doctorName;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
		}
	
	
	//
	public void AppointmentType() {
		appointmentType.click();
	}
	public void AppointmentTypeDW(String text) {
	 selectElementInDropDown(appointmentTypeDW,"Telephonic");
	}
	public void BookingDate(String text) {
		bookingDate.sendKeys("28072022");
	}
	public void BookingTime(String text)
	{
		bookingTime.sendKeys("1230");
	}
	public void Name(String text)
	{
		name.sendKeys("rajarani");
	}
	public void Gender(WebElement element,String text) {
		selectElementInDropDown(gender, "FEMALE");
	}
	public void DateOfBirth(String text)
	{
		dateOfBirth.sendKeys("19081998");
	}
	public void MobileNumber(String text)
	{
		mobileNumber.sendKeys("9999999999");
	}
	public void EmailId(String text) {
		emailId.sendKeys("palla@gmail.com");
		
	}
	public void DepartmentDropDown(int num) {
		selectEelementDropDown(appointmentType, 3);
		
	}
	public void DoctorName() {
		
	}
	public void BookNowButton()
	{
		
	}
	
	
	

	

}
