@Regression @Smoke
Feature: Testing Logout

  Background:
    Given Open the institution login page
    When Enter the username and password
    And Click the Login button

  Scenario: Validating logout functionality
    Given Click on the admins button
    When Click on the profile button
    And  Click on the logout button
    Then the admin user should land on the Login page after logging out.
