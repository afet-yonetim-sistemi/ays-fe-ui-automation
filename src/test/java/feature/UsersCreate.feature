@regression
Feature: Testing Users Section

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  @smoke
  Scenario: Create a New Users
    When Click on the users tab
    And Click on the create button
    And Fill out the users form
    Then Click on the save button
    And "Successful" success message is displayed

  Scenario: Create an Users with an Invalid First Name
    When Click on the users tab
    And Click on the create button
    And Enter invalid characters in the name field while filling out the users form
    Then Click on the save button
    And "This field is required" error massage is displayed

  Scenario: Create an Users with an Invalid Last Name
    When Click on the users tab
    And Click on the create button
    And Enter invalid characters in the last name field while filling out the users form
    Then Click on the save button
    And "This field is required" error massage is displayed

  Scenario: Create an Users with an Invalid Phone Number
    When Click on the users tab
    And Click on the create button
    And Enter invalid characters in the phone number field while filling out the users form
    Then Click on the save button
    And "Invalid phone number" massage is displayed