@Ignored
Feature: Testing Users

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Display Users Information
    When Click on the users tab
    And Click on the eye icon
    Then Validate that the "Username" has appeared in the users information