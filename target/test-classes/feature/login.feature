@smoketest
Feature: Login functionality

  Background: User is on home page

  @Negative
  Scenario: Login with invalid credentials
    Given user navigates to login page
    When user enters email "wrongEmail" and password "wrongPassword"
    And clicks on Login button
    Then error message should be displayed

  @Positive
  Scenario: Login with valid credentials
    Given user navigates to login page
    When user enters email "validEmail" and password "validPassword"
    And clicks on Login button
    Then user should be logged in successfully
