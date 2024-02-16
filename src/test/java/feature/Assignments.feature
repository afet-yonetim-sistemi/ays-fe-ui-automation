@regression
Feature: Testing Assignments

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  @smoke
  Scenario: Create a New Assignment
    When Click on the assignments tab
    And Click on the create button
    And Fill out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Name
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid characters in the name field while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Last Name
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid characters in the last name field while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Description
    When Click on the assignments tab
    And Click on the create button
    And Enter an invalid description while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Phone Number
    When Click on the assignments tab
    And Click on the create button
    And Enter an invalid phone number while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with Invalid Coordinates
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid coordinates while filling out the assignment form
    Then Click on the save button

  @smoke
  Scenario: Delete the Existing Assignment
    When Click on the assignments tab
    And Click on the filter icon
    And Select the available option from the status menu
    Then Click on the filter button
    And Click on the trash bin icon for the top assignment
    And Click on the delete button
    Then Validate the success message

  @smoke
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

  Scenario: Open the Location of the Current Assignment on the Phone
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Click on the open location on the phone button

