@Regression @Smoke
Feature: Testing Assignments

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: View the Location of the Current Assignment
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Validate that the location has been displayed


  Scenario: Open the Location of the Current Assignment on Google Maps
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Open in Google Maps in the popped-up windows

  Scenario: Copy the Details of the Current Assignment Location
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Click on the copy details of the location button

  Scenario: Open the Location of the Existing Assignment on the Phone
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Click on the open location on the phone button