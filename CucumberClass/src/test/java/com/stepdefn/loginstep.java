
package com.stepdefn;

import java.util.concurrent.TimeUnit;


import cucumber.api.java.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstep {
	WebDriver driver;
//	@Given("to enter into the facebook url")
//	public void to_enter_into_the_facebook_url() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//	    
//	}
//
//	@When("to enter login credentials")
//	public void to_enter_login_credentials() {
//	   
//	}
//
//	@When("to click the login button")
//	public void to_click_the_login_button() {
//	    
//	}
//
//	@Then("check the success status of the login")
//	public void check_the_success_status_of_the_login() {
//	    
//	}
	
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	
	@Given("to enter into the adactin url")
	public void to_enter_into_the_adactin_url() {
		driver.get("https://adactinhotelapp.com/");
	}
	

	@When("to enter login {string} and {string}")
	public void to_enter_login_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	    
	}
	
	@When("to click the login button")
	public void to_click_the_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@When("enter the {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		driver.findElement(By.id("location")).sendKeys(string);
		driver.findElement(By.id("hotels")).sendKeys(string2);
		driver.findElement(By.id("room_type")).sendKeys(string3);
		driver.findElement(By.id("room_nos")).sendKeys(string4);
		driver.findElement(By.id("datepick_in")).sendKeys(string5);
		driver.findElement(By.id("datepick_out")).sendKeys(string6);
		driver.findElement(By.id("adult_room")).sendKeys(string7);
		driver.findElement(By.id("child_room")).sendKeys(string8);
		driver.findElement(By.id("Submit")).click();
	}

	@When("select hotel and click continue")
	public void select_hotel_and_click_continue() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}

	@When("enter the {string},{string},{string},{string},{string},{string},{string} and {string}.")
	public void enter_the_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		driver.findElement(By.id("first_name")).sendKeys(string);
		driver.findElement(By.id("last_name")).sendKeys(string2);
		driver.findElement(By.id("address")).sendKeys(string3);
		driver.findElement(By.id("cc_num")).sendKeys(string4);
		driver.findElement(By.id("cc_type")).sendKeys(string5);
		driver.findElement(By.id("cc_exp_month")).sendKeys(string6);
		driver.findElement(By.id("cc_exp_year")).sendKeys(string7);
		driver.findElement(By.id("cc_cvv")).sendKeys(string8);
		driver.findElement(By.id("book_now")).click();
	}

	@Then("user should get the order id")
	public void user_should_get_the_order_id() {
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println(order.getAttribute("value"));
	}
	


}
