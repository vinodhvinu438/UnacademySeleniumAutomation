Feature: Registering Account

@register
Scenario: Register with Mandatory fields
Given Enter url of unacademy application
Then click on login buuton on homepage
And click on create your account
Then enter new mobile number to register
And click on continue button to register
Then enter the required fields
And Select state of residence
And click on terms and privacy policy
Then click on submit button
And Verify user able to create account successfully