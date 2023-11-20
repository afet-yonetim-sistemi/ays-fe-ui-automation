Feature: Testing Assignments

  Scenario: Display Assignment Information
    Given Log into the system
    When Click on the assignments tab
    And Click on the eye icon with the show button
    Then Validate that the assignment information has appeared
