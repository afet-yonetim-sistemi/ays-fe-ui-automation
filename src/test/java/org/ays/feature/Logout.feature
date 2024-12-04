Feature: Testing Logout

  Background:
    Given Open the institution login page
    When Enter the email address and password
    And Click on the Login button

  Scenario: Validating logout functionality
    When Click on the profile button
    And  Click on the logout button
    Then the admin user should land on the Login page after logging out.
