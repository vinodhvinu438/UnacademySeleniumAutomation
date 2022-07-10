Feature: validate Aboutus functionality of unacademy applicantion
  @ravi @all
  Scenario: user should be able to click on Aboutus functionality, Aboutus page should be able opened
    Given Open the apllication URL-aboutus
    And Navigate to login page-aboutus
    When User enter valid userid and clicks on login button-aboutus
    And clicks on verify OTP-aboutus
    When Home page is displayed and User clicks on Aboutus button-aboutus
    Then user can see the daily active members used the application-aboutus