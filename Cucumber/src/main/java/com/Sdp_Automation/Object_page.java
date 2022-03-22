package com.Sdp_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomdemo.Homepage;
import com.pomdemo.Log_page;
import com.pomdemo.Out_sign;

public class Object_page {
	public WebDriver driver;
	
	private Homepage h;  // ---sdp
	
	private Log_page l;
	private Out_sign s;

	
	
public Object_page(WebDriver driver2) {
	this.driver = driver2;
	}
	//	public Homepage getinstanceHp() {//  ---epudi irukum
//		return hp;
//	}
	public Homepage getinstanceH() { // instance-- objectname
		if (h==null) {
			 h = new Homepage(driver);
			
		}
		return h;
	}
	public Log_page getL() {
		if (l==null) {
			 l = new Log_page(driver);
			
		}
		return l;
	}
	public Out_sign getS() {
		
		if (s==null) {
			 s = new Out_sign(driver);
		}
		return s;
	}
	
}
