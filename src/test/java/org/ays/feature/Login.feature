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
    When Enter invalid "<emailAddress>" and "<password>"
    And Click on the Login button
    Then User should be able to see invalid email error message
    Examples:
      | emailAddress | password |
      | user         | password |
      | 123          | password |
      | .....        | password |
      | !'^+%&/*#    | password |
      | user@ays.o   | password |
      | user@aysorg  | password |
      | userays.org  | password |
      | @user.org    | password |

  Scenario: Login with a blank email address
    When Sets the email address to "   " and enters "password"
    And Click on the Login button
    Then User should be able to see invalid email error message

  Scenario Outline: Login with invalid password
    When Enter invalid "<emailAddress>" and "<password>"
    And Click on the Login button
    Then User should be able to see password errorMessage
    Examples:
      | emailAddress  | password |
      | user@email.us | pass     |

  Scenario: Login with valid email address invalid password
    When Enter valid emailAddress and invalid password
    And Click on the Login button
    Then Error pop-up message should be displayed

  Scenario: Login with invalid email address valid password
    When Enter invalid emailAddress and valid password
    And Click on the Login button
    Then Error pop-up message should be displayed

  Scenario: Login with blank email address and password
    And Click on the Login button
    Then User should be able to see errorMessage under email and password input box

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
    And Select the "Turkish" option
    Then The user should be able to see all texts compatible with the Turkish language
    And Click on the language button
    And Select the "İngilizce" option
    Then The user should be able to see all texts compatible with the English language

  Scenario: Logged-in user visits login URL

  As a logged-in user, I should not see the login page again when I navigate to the login URL
  Instead, I should be redirected to the dashboard page.

    When Enter the email address and password
    And Click on the Login button
    Then The username should be displayed on the homepage after successful login
    And The user navigates to the login URL in a new tab
    Then The user should be able to see dashboard page

  Scenario: Dashboard page access without login

  As a user, I should not be able to access the dashboard page without logging in
  Instead, I should be redirected to the login page.

    When The user navigates to the dashboard page
    Then The user should see the login page

  Scenario: Refresh Token expiration triggers logout
    When Enter the email address and password
    And Click on the Login button
    And accessToken and refreshToken should be stored in localStorage
    And The "refreshToken" expires using mock expiration
    Then The user should see the login page

