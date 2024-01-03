Feature: Testing Assignments

  Background:
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button

  Scenario: Editing Assignments
    When Click on the assignments tab
    And Click on the pencil icon with the edit button
    And Edit each input in the assignment form
    Then Click on the save edit button
