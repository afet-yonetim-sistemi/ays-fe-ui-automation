Feature: Testing Assignments

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  Scenario: Create Filtering for Assignments Based on Status
    When Click on the assignments tab
    And Click on the filter icon
    And Select the available option from the status menu
    Then Click on the filter button

  Scenario: Create Filtering for Assignments Based on Phone Number
    When Click on the assignments tab
    And Click on the filter icon
    And Filter by phone number
    Then Click on the filter button
