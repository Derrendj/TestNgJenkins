package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class CancelBookingPage extends LibGlobal {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "btn_id_485629")
	private WebElement btnCancellation;
	
	public WebElement getBtnCancellation() {
		return btnCancellation;
	}
	public void bookingCancellation() {
		click(btnCancellation);
		
	}

	

}
