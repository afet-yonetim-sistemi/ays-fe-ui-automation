@Regression @Smoke
Feature: Testing Assignments

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Display Assignment Information
    When Click on the assignments tab
    And Click on the eye icon with the show button
    Then Validate that the assignment information has appeared
