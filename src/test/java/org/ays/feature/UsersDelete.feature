@Ignored
Feature: Testing Users

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Delete the Existing Users
    When Click on the users tab
    And Sort Created At column in descending order
    And Click on the trash bin icon for the top users
    And Click on the delete button for the top users
    Then Validate the success message