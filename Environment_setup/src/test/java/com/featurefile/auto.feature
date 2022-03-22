Feature: Signin And Signout In Automation Practice

Scenario: Login

Given User launch The Application

When user Click On The Signin Button and It Navigates to the Login Page
And user Enter The Email In Email Text Box
And user Enter The Password In Password Text Box
Then user Click On The Login Button It Navigates to the My Store Page

Scenario: Logout

When user Click On The Signout Button and It Navigates to the Home Page
