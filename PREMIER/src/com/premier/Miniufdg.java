package com.premier;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Miniufdg {

	public static void main(String[] args) throws InterruptedException {
		
	
	   System.setProperty("webdriver.chrome.driver",
		    "C:\\Users\\Welcome\\eclipse-workspace\\PREMIER\\Driver\\chromedriver.exe");
	   ChromeOptions SP = new ChromeOptions();
		SP.addArguments("incognito");
		WebDriver driver = new ChromeDriver(SP);
		driver.manage().window().maximize();  
		
				driver.get("http://automationpractice.com/index.php");
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		Actions v = new Actions(driver);
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		v.moveToElement(Signin).build().perform();
		v.click(Signin).build().perform();
		
        driver.findElement(By.id("email")).sendKeys("selvampanner94@gmail.com.com");
        driver.findElement(By.id("passwd")).sendKeys("Selvam@666");
        
        WebElement email = driver.findElement(By.xpath("//input[@id='passwd']//following::button[1]"));
        email.click();
        
        WebElement ts = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]//following::a[text()='T-shirts']"));
        ts.click();
        
        JavascriptExecutor vs = (JavascriptExecutor) driver;
        vs.executeScript("window.scrollBy(0,500)");
        
        driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")).click();
        WebElement frames = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
        driver.switchTo().frame(frames);
        driver.findElement(By.name("Submit")).click();
        
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	    
        driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	    driver.findElement(By.name("processAddress")).click();
	    
	    driver.findElement(By.name("cgv")).click();
	    driver.findElement(By.name("processCarrier")).click();
	    
	    driver.findElement(By.xpath("//a[@class='cheque']")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    
	    vs.executeScript("window.scrollBy(0,500)");
	    
	    TakesScreenshot Ss = (TakesScreenshot) driver;
        File source = Ss.getScreenshotAs(OutputType.FILE);
	 //   File destination = new File("C:\\Users\\Welcome\\eclipse-workspace\\Miniproject\\SCREENSHOT\\snap5.png");
	    File destination = new File("C:\\Users\\Welcome\\eclipse-workspace\\Miniproject\\SCREENSHOT\\snap5.png");
	   // fileutils
}
	}