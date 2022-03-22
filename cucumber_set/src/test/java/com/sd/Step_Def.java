package com.sd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.baseclass.Base_class;
import com.helper_propertyfile.File_reader_manager;
import com.runner.Cucumber_Runner;
import com.sdp.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Def extends Base_class{
	
	public static WebDriver driver = Cucumber_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	

	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_reader_manager.getInstanceFRM().getInstanceCR().geturl();
		
		url(url);
		implicitwait(60, TimeUnit.SECONDS);
		
		
		
	
		
	}
	

	@When("^user Click On The Signin Button and It Navigates to the Login Page$")
	public void user_Click_On_The_Signin_Button_and_It_Navigates_to_the_Login_Page() throws Throwable {
	
		clickOnElement(pom.getInstancehp().getLogin());
	
	
	}
	@When("^user Enter The Email In Email Text Box$")
	public void user_Enter_The_Email_In_Email_Text_Box() throws Throwable {
		
		inputValueElement(pom.getInstancelogin().getEmail(), "ganeshkumar9416@gmail.com");
	}

	@When("^user Enter The Password In Password Text Box$")
	public void user_Enter_The_Password_In_Password_Text_Box() throws Throwable {
		
		inputValueElement(pom.getInstancelogin().getPassword(), "ganesh@123");
	
	
	}

	@Then("^user Click On The Login Button It Navigates to the My Store Page$")
	public void user_Click_On_The_Login_Button_It_Navigates_to_the_My_Store_Page() throws Throwable {
	
		clickOnElement(pom.getInstancelogin().getSignin());
	
	}

	@When("^user Click On The Tshirts Button and It Navigates To The Tshirts Page$")
	public void user_Click_On_The_Tshirts_Button_and_It_Navigates_To_The_Tshirts_Page() throws Throwable {
	clickOnElement(pom.getInstancet().getTshirt_page());
	
	}
	@When("user Click On The Image View Tshirts Button And Navigates To Faded Short Sleeve Tshirts Page")
	public void user_click_on_the_image_view_tshirts_button_and_navigates_to_faded_short_sleeve_tshirts_page() {
	clickOnElement(pom.getInstancead().getImgView_Page());
	}
	


@When("user Click Add To Cart Button And Navigates To Shopping Cart Tshirts Order Frame")
public void user_click_add_to_cart_button_and_navigates_to_shopping_cart_tshirts_order_frame() {
clickOnElement(pom.getInstanceaddpage().getAddToCart_Page());

}
@When("user Click Proceecd To Check Out Button And Navigates To Tshirts Order Page")
public void user_click_proceecd_to_check_out_button_and_navigates_to_tshirts_order_page() {
clickOnElement(pom.getInstancepc().getProceedToCart_Page());

}
@When("user Click Proceecd To Check Out Button And Navigates To Address Verify  Tshirts Order Page")
public void user_click_proceecd_to_check_out_button_and_navigates_to_address_verify_tshirts_order_page() {
clickOnElement(pom.getInstancepc1().getProceedToCheckout1_Page());

}
@When("user Click Proceecd To Check Out Button And Navigates To Shipping Verify Tshirts Order Page")
public void user_click_proceecd_to_check_out_button_and_navigates_to_shipping_verify_tshirts_order_page() {
clickOnElement(pom.getInstancepc2().getProceedToCheck2_Page());

}
@When("user Click Terms Agree Button In Tshirts Page")
public void user_click_terms_agree_button_in_tshirts_page() {
clickOnElement(pom.getInstancepc3().getProceedToCheck3_Page());

}
@When("user Click Proceecd To Check Out Button And Navigates To Payment  Tshirts Order Page")
public void user_click_proceecd_to_check_out_button_and_navigates_to_payment_tshirts_order_page() {
clickOnElement(pom.getInstancepc4().getProceedToCheck4_Page());

}
@When("user Click Pay By Bank Out Button And Navigates To Payment Verify Tshirts Page")
public void user_click_pay_by_bank_out_button_and_navigates_to_payment_verify_tshirts_page() {

clickOnElement(pom.getInstancepc5().getPayCheck_Page());
}
@When("user Click Confirm By Order Button And Navigates To Order Cnfirmation Tshirts  Page")
public void user_click_confirm_by_order_button_and_navigates_to_order_cnfirmation_tshirts_page() {
clickOnElement(pom.getInstancecp().getConfirmOrder_Page());

}


}
	




