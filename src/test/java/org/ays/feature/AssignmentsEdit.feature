@Ignored
Feature: Testing Assignments

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Editing Assignments
    When Click on the assignments tab
    And Click on the filter icon
    And Select the available option from the status menu
    Then Click on the filter button
    And Click on the pencil icon with the edit button
    And Edit each input in the assignment form
    Then Click on the save edit button
