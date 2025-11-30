Feature: Login functionality

Background: User is on home page


@Negative
Scenario: Login with invalid credentials
    When user navigates to login page
    And user enters email "wrong@test.com" and password "wrong123"
    And clicks on Login button
    Then error message should be displayed
    
 
@Positive
  Scenario: Login with valid credentials
    When user navigates to login page
    And user enters email "correctemail@example.com" and password "correctpassword"
    And clicks on Login button
    Then user should be logged in successfully