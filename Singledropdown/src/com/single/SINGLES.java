package com.single;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class SINGLES {
	
//public static void main(String[] args) throws Throwable {
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\Welcome\\eclipse-workspace\\PREMIER\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		WebElement acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		acc.click();
//		
//		Thread.sleep(5000);   //*(nosuchelementexception vantha
//		//add throwable/interruped exception for parentclass of exception*/
//		
//		WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		first.sendKeys("Automation");
//		
//		driver.findElement(By.name("lastname")).sendKeys("Testing");
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("253434343");
//		
//		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sgdgd@12s");
//		
//		WebElement date = driver.findElement(By.id("day"));
//		
//		Select s = new Select(date);
//		
//		s.selectByValue("2");
//		
//		WebElement month = driver.findElement(By.id("month"));
//		
//		Select s1 = new Select(month);
//		
//		s1.selectByIndex(10);
//		
//	//	s1.deselectByIndex(10);
//		
//		WebElement year = driver.findElement(By.id("year"));
//		
//		Select s2 = new Select(year);
//		
//		s2.selectByVisibleText("2020");
//		
//		boolean multi = s.isMultiple();   // to check single or multiple Dropdown
//		
//		System.out.println("Is multiple or not:" +multi); // concordination
//		
//		List<WebElement> opt = s1.getOptions();  // s.getoption enter panna dates list varum
//		
//		for (WebElement webElement : opt) {   // foreach select pannanum
//			
//			String text = webElement.getText();
//			
//			System.out.println(text);	
//		}
//		
//		System.out.println("---------------");
//		
//		WebElement fso = s2.getFirstSelectedOption(); 
//		// s1.getfirstslectedoption enter panna nov varum
//		String text = fso.getText();
//		System.out.println(text);
//		//System.out.println(fso.getText());		
//		
//	}
//
//}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Welcome\\eclipse-workspace\\PREMIER\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
	
    driver.get("http://leafground.com/pages/table.html");
    System.out.println("--------------------------------full table--------------------");
    List<WebElement> full_table = driver.findElements(By.xpath("//table/tbody/tr/td"));
    for (WebElement webElement : full_table) {
        String text = webElement.getText();
        System.out.println(text);
      	
	}
    
    System.out.println("------------------------------rows----------------------------");
    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
    for (WebElement row : rows) {
    	String text = row.getText();
    	System.out.println(text);
    	
	}
    
    System.out.println("-----------------------------columns--------------------------");
    List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
    for (WebElement column : columns) {
    	String text = column.getText();
    	System.out.println(text);
		
	}
    
    System.out.println("-------------------------------particular_data------------------");
    WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
    String text = particular.getText();
    System.out.println(text);
	
    
    
    System.out.println("----------------------------title--------------------------");
    List<WebElement> titles = driver.findElements(By.xpath("//table/tboby/tr/th"));
    for (WebElement title : titles) {
    	String text1 = title.getText();
    	System.out.println(text1);
		
	}
	}}
     

