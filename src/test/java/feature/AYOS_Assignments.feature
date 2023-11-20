Feature: Testing Assignments

  Scenario: Create a New Assignment
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Fill out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Name
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid characters in the name field while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Last Name
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid characters in the last name field while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Description
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter an invalid description while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Phone Number
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter an invalid phone number while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with Invalid Coordinates
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid coordinates while filling out the assignment form
    Then Click on the save button

  Scenario: Delete the Existing Assignment
    Given Log into the system
    When Click on the assignments tab
    And Click on the trash bin icon for the top assignment
    And Click on the delete button
    Then Validate the success message

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

  Scenario: Open the Location of the Current Assignment on the Phone
    Given Log into the system
    When Click on the assignments tab
    And Click on the location marker button for the top assignment
    Then Click on the open location on the phone button

