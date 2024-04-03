@Smoke @Regression
Feature: Testing Users

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Editing Users
    When Click on the users tab
    And Click on the pencil icon
    And Edit the status section in the user form
    Then Click on the save edit button
    And "Successful" success message is displayed