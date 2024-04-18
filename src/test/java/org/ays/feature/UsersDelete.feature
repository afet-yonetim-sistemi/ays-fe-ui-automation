@Smoke @Regression
Feature: Testing Users

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Delete the Existing Users
    When Click on the users tab
    And Click on the create button
    And Fill out the users form using "Test" firstName
    Then Click on the save button
    And Click on the pop up close button
    And Click on the pop up close Ok button
    And Sort Created At column in descending order
    And Click on the trash bin icon for the top users
    And Click on the delete button for the top users
    Then Validate the success message

  Scenario: Delete the Existing Users on the Detail Screen
    When Click on the users tab
    And Click on the create button
    And Fill out the users form using "Test" firstName
    Then Click on the save button
    And Click on the pop up close button
    And Click on the pop up close Ok button
    And Sort Created At column in descending order
    And Click on the eye icon for the top users
    And Click on the delete button on the users detail screen
    And Click on the delete button for the top users
    Then Validate the success message
