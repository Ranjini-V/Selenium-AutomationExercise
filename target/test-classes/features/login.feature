Feature: Login

  Scenario: Unsuccessful Login - wrong credentials
    Given user is on login page
    When user enters wrong username and wrong password
    And clicks on Login button
    Then error message should be displayed

  Scenario Outline: Successful login with valid credentials
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on Login button
    Then user should be redirected to home page

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
