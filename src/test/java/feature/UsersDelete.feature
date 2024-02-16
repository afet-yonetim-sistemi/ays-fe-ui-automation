Feature: Testing Users

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  Scenario: Delete the Existing Users
    When Click on the users tab
    And Click on the trash bin icon for the top users
    And Click on the delete button for the top users
    Then Validate the success message