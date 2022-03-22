package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;// intha login eduthuka mudiathu
	
	

	public Homepage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);//---webdriver,object
		// merge panrom
		
	}



	public WebElement getLogin() {  
		// intha get edthukalam  ----(getter pojo) 
		
		return login;
	}
	
	
	
}
