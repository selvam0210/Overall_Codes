package com.pomdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_page {
	public WebDriver driver;
	
	@FindBy(name = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement passwd;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement login_btn;
	
	public Log_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);// -- merge
		
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

}
