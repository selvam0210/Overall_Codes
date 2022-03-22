package com.sdf;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Environment_setup.Basedemo;
import com.Environment_setup.Object_page;
import com.Environment_setup.testdemo;
import com.helperdemo.File_readerdemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Step_def extends Basedemo {

	public static WebDriver driver = testdemo.driver;
	public static Object_page op = new Object_page(driver);
	

	@Given("^User launch The Application$")
	public void user_launch_The_Application() throws Throwable {
	}

	@When("^user Click On The Signin Button and It Navigates to the Login Page$")
	public void user_Click_On_The_Signin_Button_and_It_Navigates_to_the_Login_Page() throws Throwable {
	}

	@When("^user Enter The Email In Email Text Box$")
	public void user_Enter_The_Email_In_Email_Text_Box() throws Throwable {
	}

	@When("^user Enter The Password In Password Text Box$")
	public void user_Enter_The_Password_In_Password_Text_Box() throws Throwable {
	}

	@Then("^user Click On The Login Button It Navigates to the My Store Page$")
	public void user_Click_On_The_Login_Button_It_Navigates_to_the_My_Store_Page() throws Throwable {
	}

	@When("^user Click On The Signout Button and It Navigates to the Home Page$")
	public void user_Click_On_The_Signout_Button_and_It_Navigates_to_the_Home_Page() throws Throwable {
	}



}
