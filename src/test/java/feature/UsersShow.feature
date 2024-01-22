@regression
Feature: Testing Users

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  Scenario: Display Users Information
    When Click on the users tab
    And Click on the eye icon
    Then Validate that the "Username" has appeared in the users information