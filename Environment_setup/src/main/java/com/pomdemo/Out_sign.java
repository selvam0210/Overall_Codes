package com.pomdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Out_sign {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;

	public Out_sign(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
