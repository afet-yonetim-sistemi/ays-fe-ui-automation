Feature: Testing Assignments

  Scenario: Create Filtering for Assignments Based on Status
    Given Log into the system
    When Click on the assignments tab
    And Click on the filter icon
    And Select the available option from the status menu
    Then Click on the filter button

  Scenario: Create Filtering for Assignments Based on Phone Number
    Given Log into the system
    When Click on the assignments tab
    And Click on the filter icon
    And Filter by phone number
    Then Click on the filter button
