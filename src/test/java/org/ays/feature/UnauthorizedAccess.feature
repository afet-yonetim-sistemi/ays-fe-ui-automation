@Regression
Feature:Testing Unauthorized Accesses

  Scenario: Unauthorized user cannot access the Admin Registration Pre-Application page
    Given Open the institution login page
    When Enter the email address and password
    And Click on the Login button
    Then User should not be able to access the Admin Registration Pre-Application page
