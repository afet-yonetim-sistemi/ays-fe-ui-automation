@Regression @Smoke
Feature: Login Functionality

  Scenario: Login with a valid username and password
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button
    Then The user should be able to successfully log in
