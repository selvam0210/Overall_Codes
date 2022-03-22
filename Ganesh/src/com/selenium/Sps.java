package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sps {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Welcome\\eclipse-workspace\\Ganesh\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		
		
		}

	}
