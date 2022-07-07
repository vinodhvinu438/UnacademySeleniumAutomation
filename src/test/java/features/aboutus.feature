Feature: validate Aboutus functionality of unacademy applicantion
  @Aboutus
  Scenario: user should be able to click on Aboutus functionality, Aboutus page should be able opened
    Given Open the apllication URL
    And Navigate to login page
    When User enter valid userid and clicks on login button
    And clicks on verify OTP
    When Home page is displayed and User clicks on Aboutus button
    Then user can see the daily active members used the application