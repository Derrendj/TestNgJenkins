package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath ="//td[@class='login_title']")
	private WebElement textSelectHotel;
	
	@FindBy (id = "radiobutton_0")
	private WebElement rdoSelectHotel;
	
	@FindBy (id = "continue")
	private WebElement btnContinue;
	
	
	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}
	public WebElement getRdoSelectHotel() {
		return rdoSelectHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void selectHotel() {
		click(getRdoSelectHotel());
		click(getBtnContinue());
	}
	public void verifySelectHotel(String expectedValueSlectHotel) {
		Assert.assertEquals("verify select hotel text is displayed", expectedValueSlectHotel);
				getAttributevalue(getTextSelectHotel());
	}
	
}


