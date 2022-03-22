package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//		"C:\\Users\\Welcome\\eclipse-workspace\\PREMIER\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("singleframe");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]")).click();
//	    WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
//		driver.switchTo().frame(outerframe);
//		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
//		driver.switchTo().frame(innerframe);
//		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MultipleFrames");
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//a[text()='Video']")).click();
//		driver.get("http://leafground.com/pages/frame.html");
//		----driver.switchTo().frame("//*[@id=\"wrapframe\"]/iframe");
//		----WebElement single = driver.findElement(By.xpath("(//div[@id='wrapframe'])[1]"));
//		WebElement singleframe = driver.findElement(By.xpath("(//iframe)[1]"));
//		driver.switchTo().frame(singleframe);
//		driver.findElement(By.xpath("//button[@id='Click']")).click();
//		driver.findElement(By.id("Click")).click();
//		driver.switchTo().defaultContent();
//		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='page.html']"));
//		driver.switchTo().frame(outerframe);
//		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
//		driver.switchTo().frame(innerframe);
//		//	driver.findElement(By.xpath("//button[@id='click1']")).click();
//		driver.findElement(By.id("click1")).click();
//		////*[@id="wrapframe"]/iframe////*[@id="wrapframe"]////*[@id="Click1"]
//		// "//iframe[@src='page.html']") //  "//iframe[@src='nested.html']")
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//iframe[@src='countframes.html']"));
	
		
		
//		 driver.get("http://automationpractice.com/index.php");
//		 WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
// 		 Actions ac = new Actions(driver);
// 		 ac.moveToElement(Dresses).build().perform();
// 		 
// 		 WebElement Summer_Dress = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
// 		 ac.click(Summer_Dress).build().perform();
// 		 
 		 
//		driver.get("http://www.leafground.com/pages/drop.html");
//		WebElement f = driver.findElement(By.id("draggable"));
//		WebElement t = driver.findElement(By.id("droppable"));
//	    Actions a = new Actions(driver);
//	    a.dragAndDrop(f, t).build().perform();
//		
		
		
		
//		driver.get("https://www.amazon.in/");
//		WebElement al = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
//		JavascriptExecutor ar = (JavascriptExecutor) driver;  //narrowing
//		ar.executeScript("arguments[0].scrollIntoView()",al);
//		Thread.sleep(3000);
//		ar.executeScript("window.scrollBy(0,-3000)");
//		Thread.sleep(3000);
//		ar.executeScript("window.scrollBy(0,2000)");
//		
		
//		driver.get("https://www.flipkart.com/");
//		WebElement ab = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[3]"));
//		JavascriptExecutor ag = (JavascriptExecutor) driver;  //narrowing
//		ag.executeScript("arguments[0].scrollIntoView()",ab);
//		Thread.sleep(3000);
//		ag.executeScript("window.scrollBy(0,-3000)");
//		Thread.sleep(3000);
//		ag.executeScript("window.scrollBy(0,2000)");
		
        syso