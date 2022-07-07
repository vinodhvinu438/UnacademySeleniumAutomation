Feature: UnacademyLogin Application
  
  @login-search
  Scenario Outline: Login with valid phone number
    Given Open url of unacademy application-search
    Then Click on login option on homepage-search
    And Enter registered valid "<mobilenumber>" into the Text field
    Then click on login button-search
    And Enter otp from your logned number-search
    And click on veifyotp button option-search
    Then Verify user able to login successfully-search
    #Search with ValidData Educator Name
    And Click on Search button before enter educators name
    Then Enter the "<educatorname>" into the search text field
    And Verify the Educators profile
    #Search with InValidData Educator Name
    Then Click on Home Page
    And Click on Search button
    And Enter the Invalid data"<educatornameInvalid>" into the search text field
    And Verify the No result found Text
    #Search with Course
    Then Click on Home Page Again
    And Click on Search button Again
    Then Enter the CourseName"<Name>" into the search text field
    And Verify the courseName
    #Search with Course (Invaid Data)
    Then Click on Home Page Once Again
    And Click on Search button Once Again
    Then Enter the Invalid CourseName "<Name>" into the search text field
    And Verify the CourseName with InvalidData
    
        
    Examples: 
      |mobilenumber |
      |9398854781   |