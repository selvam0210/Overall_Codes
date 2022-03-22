package com.setproperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1Start {

	public static void main(String[] args)  {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Welcome\\eclipse-workspace\\Selenium_Home\\Driver\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

String title = driver.getTitle("sfsfs");
System.out.println("title");
String currentUrl = driver.getCurrentUrl();
System.out.println("currentUrl");



	}

}
