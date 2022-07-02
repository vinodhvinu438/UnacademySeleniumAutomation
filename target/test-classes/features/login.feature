Feature: UnacademyLogin Application

Unacademy is one of largest indias great learining platform. 
Now here we are going to automate Unacademy WebPage of login module

Scenario: Login with valid phone number
 Given Open url of unacademy application
 Then Click on login option on homepage
 And Enter registered mobile number
 Then click on login button
 And click on veifyotp button option
 Then  Verify user able to login successfully

