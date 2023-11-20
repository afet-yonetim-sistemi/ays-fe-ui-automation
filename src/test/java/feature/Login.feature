Feature: Login Functionality
  @Login
  Scenario: Login with a valid username and password
    Given Access the AYOS system
    When Enter the username and password
    And Click the Login button
    Then The user should be able to successfully log in