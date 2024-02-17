Feature: Testing Assignments

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  Scenario: Delete the Existing Assignment
    When Click on the assignments tab
    And Click on the filter icon
    And Select the available option from the status menu
    Then Click on the filter button
    And Click on the trash bin icon for the top assignment
    And Click on the delete button
    Then Validate the success message