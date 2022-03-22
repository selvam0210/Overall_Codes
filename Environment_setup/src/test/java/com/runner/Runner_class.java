package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Environment_setup.Basedemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) // api.junit varanum

@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\auto.feature",

glue = "com.sdf"



)




public class Runner_class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		
		driver  = Basedemo.getbrowser("chrome");
		
		

	}
	@AfterClass
	public static void tear_down() {
		
		
		driver.close();
		
		
		

	}
	
	
	
	

}
