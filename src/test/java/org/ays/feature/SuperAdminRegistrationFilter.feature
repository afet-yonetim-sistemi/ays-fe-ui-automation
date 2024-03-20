@Regression @Smoke
Feature: Testing Super Admin Registration List

  Background:
    Given Open the institution login page
    When Enter the super admin username and password
    And Click the Login button

  Scenario: Testing registration list by super admin user
    When Click on the registration-application
    When Click filter icon
    And  Select available option from the status menu
    Then Click filter button
    And All status row can show "Waiting"