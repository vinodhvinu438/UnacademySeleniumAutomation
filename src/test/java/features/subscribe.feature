Feature: Subscription
  @subscribe @all @gagan
  Scenario: Avail Subscription to a particular course
    Given Open the application URL
    And User performs login operation and Home page is displayed
    When User clicks on get subscription and Choose plan page is displayed
    And User clicks on plan and clicks on proceed to pay
    Then User is sucessfully able to reach payment page