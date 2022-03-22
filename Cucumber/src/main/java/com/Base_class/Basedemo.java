package com.Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basedemo {
	public static WebDriver driver;
	// webdriver driver = new chromedriver();
	//  ovavaru vattium method call panrathuku kudakamudiathu,driver.quit...initialize driver
	
	
	public static  WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\drive\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\drive\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		

	}
	
	
	public static void clickmethod(WebElement element) {
		element.click();// arguments--namaku kudukura value venum athukaga
		

	}
	
	public static void sendkeysmethod(WebElement element, String val) {
		element.sendKeys(val);
		

	}
	
	public static void quit() {
driver.quit();
	}
	public static void url(String url) {
		driver.get(url);
		

	}

}
