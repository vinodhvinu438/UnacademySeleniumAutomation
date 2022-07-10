Feature: UnacademyLogin Application

Unacademy is one of largest indias great learining platform. 
Now here we are going to automate Unacademy WebPage of login module

Background:
Given Open url of unacademy application
Then Click on login option on homepage

@all @login @vinodh
Scenario: Login with valid phone number
And Enter registered mobile number
Then click on login button
And click on veifyotp button option
Then  Verify user able to login successfully
 
@all @email @vinodh
Scenario Outline: Login with valid email
And Click on Continue with email
Then Enter registered "<Email>" email
Then click on login button
And click on veifyotp button option
Then  Verify user able to login successfully
Examples:
|Email                   |
|vinodhvinu438@gmail.com |

@wrong @all @vinodh
Scenario Outline: Login With invalid phone number
When Enter wrong "<mobile number>"  mobile number
And click on login button
Then Verify warning message is displayed
Examples:
|mobile number |
|0000000000    |

@wrong @all @vinodh
Scenario Outline: Login with invalid Email
And Click on Continue with email
Then Enter wrong "<Email>" email
And click on login button
Then Verify warning message of email is displayed

Examples:
|Email         |
|vinodhvinu438 |

 