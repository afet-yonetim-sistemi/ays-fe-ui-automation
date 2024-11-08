@Regression
Feature: Login Functionality

  Background:
    Given Open the institution login page

  @Smoke
  Scenario: Login with valid email address and password
    When Enter the email address and password
    And Click on the Login button
    Then The username should be displayed on the homepage after successful login
    And accessToken and refreshToken should be stored in localStorage

  Scenario Outline: Login with unauthorized user
    When Enter unauthorized "<emailAddress>" and "<password>"
    And Click on the Login button
    Then Error pop-up message should be displayed
    Examples:
      | emailAddress          | password |
      | unauthorized@email.us | password |

  Scenario Outline: Login with invalid emailAddress
    When Sets the page language
    When Enter invalid "<emailAddress>" and "<password>"
    And Click on the Login button
    Then User should be able to see invalid email error message
    Examples:
      | emailAddress  | password |
      | user          | password |
      | 123           | password |
      | .....         | password |
      | !'^+%&/*#     | password |
      | !user@ays.org | password |
      | user@aysorg   | password |
      | userays.org   | password |

  Scenario: Login with a blank email address
    When Sets the page language
    When Sets the email address to "   " and enters "password"
    And Click on the Login button
    Then User should be able to see invalid email error message

  Scenario Outline: Login with invalid password
    When Sets the page language
    When Enter invalid "<emailAddress>" and "<password>"
    And Click on the Login button
    Then User should be able to see password errorMessage
    Examples:
      | emailAddress  | password |
      | user@email.us | pass     |

  Scenario: Login with valid email address invalid password
    When Sets the page language
    When Enter valid emailAddress and invalid password
    And Click on the Login button
    Then Error pop-up message should be displayed

  Scenario: Login with invalid email address valid password
    When Sets the page language
    When Enter invalid emailAddress and valid password
    And Click on the Login button
    Then Error pop-up message should be displayed

  @Smoke
  Scenario: Password hiding checking
    When Enter hiding password
    And Click on the eye icon
    Then The password should be displayed without being hidden
    And Click on the eye icon
    Then The password should be displayed hidden

  @Smoke
  Scenario: Theme checking
    When Click on the theme icon
    Then User should be able to see dark theme
    And Click on the theme icon
    Then User should be able to see light theme

  @Smoke
  Scenario: Language selection checking
    When Click on the language button
    And Select the Turkish option
    Then User should be able to see the Turkish page
    And Click on the language button
    And Select the English option
    Then User should be able to see the English page


