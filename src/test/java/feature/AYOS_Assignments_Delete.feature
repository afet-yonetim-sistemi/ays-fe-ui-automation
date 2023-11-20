Feature: Testing Assignments


  Scenario: Delete the Existing Assignment
    Given Log into the system
    When Click on the assignments tab
    And Click on the trash bin icon for the top assignment
    And Click on the delete button
    Then Validate the success message