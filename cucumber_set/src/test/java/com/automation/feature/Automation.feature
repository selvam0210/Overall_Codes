Feature: Order A Dress In Automation Practice Website

Scenario: Login

Given user Launch The Application

When user Click On The Signin Button and It Navigates to the Login Page
And user Enter The Email In Email Text Box
And user Enter The Password In Password Text Box
Then user Click On The Login Button It Navigates to the My Store Page

Scenario: T-Shirts

When user Click On The Tshirts Button and It Navigates To The Tshirts Page
And user Click On The Image View Tshirts Button And Navigates To Faded Short Sleeve Tshirts Page
And user Click Add To Cart Button And Navigates To Shopping Cart Tshirts Order Frame
And user Click Proceecd To Check Out Button And Navigates To Tshirts Order Page
And user Click Proceecd To Check Out Button And Navigates To Address Verify  Tshirts Order Page
And user Click Proceecd To Check Out Button And Navigates To Shipping Verify Tshirts Order Page
And user Click Terms Agree Button In Tshirts Page
And user Click Proceecd To Check Out Button And Navigates To Payment  Tshirts Order Page
And user Click Pay By Bank Out Button And Navigates To Payment Verify Tshirts Page
Then user Click Confirm By Order Button And Navigates To Order Cnfirmation Tshirts  Page


