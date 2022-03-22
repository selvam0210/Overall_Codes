package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_class;

import io.cucumber.junit.Cucumber;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith( Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src\\test\\java\\com\\automation\\feature\\Automation.feature",

		glue = "com.sd",
		
		monochrome = true,
		
		dryRun = false,
		
		publish = true,
		
		plugin = {
				
				"html:Report/Html_Report",
				"pretty", //  ---console
				"json:Jreport/JsonReport.json"
				
		}
		
		
		)
public class Cucumber_Runner {
	
	public static WebDriver driver; // --null

	@BeforeClass
	public static void get_Up() {
		
		// class kulla irukura method ah run panna public pothum
		// class full ah run panna static venum
		
		 driver = Base_class.getBrowser("chrome");
		

	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();

	}

}
