package com.Dec_Project;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base_class.Basedemo;
import com.Sdp_Automation.Object_page;
import com.helperdemo.File_readerdemo;
import com.pomdemo.Homepage;
import com.pomdemo.Log_page;
import com.pomdemo.Out_sign;

public class testdemo extends Basedemo {
	public static WebDriver driver = getbrowser("chrome");
//	public static Homepage h = new Homepage(driver);
//	public static Log_page l = new Log_page(driver);
//	public static Out_sign s = new Out_sign(driver);
	public static Object_page op = new Object_page(driver);
	public static Logger logg = Logger.getLogger(testdemo.class);// new keyword irukathu


	public static void main(String[] args) throws Throwable {
		//Logger logg = Logger.getLogger(testdemo.class);
		PropertyConfigurator.configure("log4j.properties");// --properties path
		
	// Logger logg  = Logger.getLogger(testdemo.class); // Logger -- class

		// driver =getbrowser("chrome");
		
	//driver=getbrowser("chrome");
		
		
	
	//	System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\Welcome\\eclipse-workspace\\Environment_setup\\driverr\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", 
		//		System.getProperty("user.dir")+"\\drive\\chromedriver.exe");
		
		// WebDriver driver = new ChromeDriver();
		 
		//driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php");
		//url("http://automationpractice.com/index.php");
		String ur = File_readerdemo.getfrc().getcr().geturl();
		url(ur);
		
		logg.info("url passed");
		
		
		
		//WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		//login.click();
		//Homepage h = new Homepage(driver);// connectiivity in pom
		//h.getLogin();
		
	//	Object_page op = new Object_page(driver);
		
		
		clickmethod(op.getinstanceH().getLogin());
	
		//WebElement email = driver.findElement(By.name("email"));
		//email.sendKeys("ganeshkumar9416@gmail.com");
		//Loginpage_btn l = new Loginpage_btn(driver);
		//l.getEmail();
		String getusername = File_readerdemo.getfrc().getcr().getusername();
		sendkeysmethod(op.getL().getEmail(), getusername);
		
		//WebElement passwd = driver.findElement(By.id("passwd"));
		//passwd.sendKeys("Ganesh@123");
		//l.getPasswd();
		/*String getpasswd = File_readerdemo.getfrc().getcr().getpasswd();
		sendkeysmethod(op.getL().getPasswd(), getpasswd);*/
		sendkeysmethod(op.getL().getPasswd(), File_readerdemo.getfrc().getcr().getpasswd());
		//Signpage_out s = new Signpage_out(driver);
		
		//WebElement login_btn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		//login_btn.click();
		clickmethod(op.getL().getLogin_btn());
		
		//WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		//logout.click();
		clickmethod(op.getS().getLogout());
		
		logg.info("signout passed");
		
		
		//driver.close();
		//quit();
		
			
		
	}

}


