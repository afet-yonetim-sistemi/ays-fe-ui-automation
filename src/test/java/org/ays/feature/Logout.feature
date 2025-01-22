Feature: Testing Logout

  Background:
    Given Open the institution login page
    When Enter the email address and password
    And Click on the Login button

  Scenario: Validating logout functionality
    When Click on the profile button
    And  Click on the logout button
    Then the admin user should land on the Login page after logging out.
    And The localStorage should not contain accessToken or refreshToken

  Scenario: Attempt to access restricted page after logout
    When Click on the profile button
    And  Click on the logout button
    Then the admin user should land on the Login page after logging out.
    When The user navigates to a restricted URL directly
    Then The user should be redirected to the login page


  Scenario: Logout from multiple tabs
    Given The user is logged in on multiple browser tabs
    When The user logs out from one tab
    Then The user should be logged out on the second tab after refreshing

