package com.mp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class minion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		    "C:\\Users\\Welcome\\eclipse-workspace\\PREMIER\\Driver\\chromedriver.exe");
		ChromeOptions pn = new ChromeOptions();
				pn.addArguments("incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		WebElement email = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]"));
		email.sendKeys("selvampanner94@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]"));
		pass.sendKeys("Selvam@666");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		WebElement click1 =	driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		Actions v = new Actions(driver);
        v.moveToElement(click1).build().perform();
        v.click(click1).build().perform();
        
        WebElement tt = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
        JavascriptExecutor ar = (JavascriptExecutor) driver;  //narrowing
 		ar.executeScript("arguments[0].scrollIntoView()",tt);
		Thread.sleep(3000);
		//ar.executeScript("window.scrollBy(0,1000)");

	}
}