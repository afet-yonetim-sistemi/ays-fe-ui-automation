Feature: Testing Assignments

  Scenario: View the Location of the Current Assignment
    Given Log into the system
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Validate that the location has been displayed


  Scenario: Open the Location of the Current Assignment on Google Maps
    Given Log into the system
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Open in Google Maps in the popped-up windows

  Scenario: Copy the Details of the Current Assignment Location
    Given Log into the system
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Click on the copy details of the location button

  Scenario: Open the Location of the Existing Assignment on the Phone
    Given Log into the system
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Click on the open location on the phone button