@Regression
Feature: Test Registration Applications Page Details

  Background:
    Given Open the institution login page
    When Enter the super admin username and password
    And Click the Login button

  @Smoke
  Scenario: Verify column headers on registration application list page
    When Click on the registration-application
    Then I should see the following column headers
      | Organization    |
      | Creation Reason |
      | Status          |
      | Created User    |
      | Created At      |
      | Actions         |

  Scenario: Verify action button is not available when application status is WAITING
    When Click on the registration-application
    When Click filter icon
    And Click status bar
    And  Select waiting option from the status menu
    And Click status bar
    When Click filter button
    Then The review button should not be available


