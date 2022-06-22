package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookHotelPage extends LibGlobal {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy (id = "last_name")
	private WebElement txtLastName;
	
	@FindBy (id = "address")
	private WebElement txtAddress;
	
	@FindBy (id = "cc_num")
	private WebElement txtCcNum;
	
	@FindBy (id = "cc_type")
	private WebElement dDnCcType;

	@FindBy (id = "cc_exp_month")
	private WebElement dDnCcExpiryMonth;
	
	@FindBy (id = "cc_exp_year")
	private WebElement dDnCcExpiryYear;
	
	@FindBy (id = "cc_cvv")
	private WebElement txtCcCvv;
	
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcNum() {
		return txtCcNum;
	}
	public WebElement getdDnCcType() {
		return dDnCcType;
	}
	public WebElement getdDnCcExpiryMonth() {
		return dDnCcExpiryMonth;
	}
	public WebElement getdDnCcExpiryYear() {
		return dDnCcExpiryYear;
	}
	public WebElement getTxtCcCvv() {
		return txtCcCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public void bookHotel(String FirstName, String LastName, String Address, String CcNum, String CcType, String CcExpiryMonth, String CcExpiryYear, String CcCvv){
		type(getTxtFirstName(), FirstName);
		type(getTxtLastName(), LastName);
		type(getTxtAddress(), Address);
		type(getTxtCcNum(), CcNum);
		selectoptionbytext(getdDnCcType(), CcType);
		selectoptionbytext(getdDnCcExpiryMonth(), CcExpiryMonth);
		selectoptionbytext(getdDnCcExpiryYear(), CcExpiryYear);
		type(getTxtCcCvv(), CcCvv);
		click(getBtnBookNow());
	}
	

}
