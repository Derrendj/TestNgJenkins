package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingConfirmationPage extends LibGlobal {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "order_no")
	private WebElement txtOrderNo;
	
	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	public String bookingConfirmation(WebElement Element) {
		return getattributevalue(Element);	
	}

}
