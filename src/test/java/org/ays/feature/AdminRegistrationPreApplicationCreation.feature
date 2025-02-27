@Regression
Feature: Testing Admin Registration Pre Application Creation

  Background:
    Given Open the institution login page
    When Enter super admin email address and password
    And Click on the Login button
    And Click on the Admin Registration Applications button from left  navigation bar
    And Click on the Create Pre-Application button


  @Smoke
  Scenario Outline: Language verification for all supported languages
    When Click on the language button
    And Select the "<language>" option
    Then User should be able to see all texts on admin registration pre-application page compatible with the "<language>" language

    Examples:
      | language |
      | English  |
      | Turkish  |


  @Smoke
  Scenario: Successfully create an admin registration pre-application with valid inputs
    When Select an institution from the dropdown menu
    And Enter a valid creation reason with text between 40 and 512 characters
    And Click the create button for pre-application form
    Then User should see a success message confirming the pre-application creation
    And User should be redirected to the details page after creation

  @Regression
  Scenario Outline: Admin registration pre-application creation with invalid reasons
    When Select an institution from the dropdown menu
    Then Enter "<invalidReason>" and validate the error message "<errorKey>"

    Examples:
      | invalidReason                                      | errorKey                        |
      | Lorem ipsum dolor sit ameti consectetur            | reason_error.too_short          |
      | 4628742946932863256392563856395839653745           | reason_error.numeric_only       |
      | Lorem ipsum dolor sit amet,... lorem ipsum         | reason_error.special_characters |
      | 123456                                             | reason_error.too_short          |
      | Invalid reason with special characters: !@#$%^&*() | reason_error.special_characters |
      |                                                    | reason_error.too_short          |

  Scenario: Admin registration pre-application creation with excessively long reason
    When Select an institution from the dropdown menu
    Then Enter a reason with more than 512 characters and validate the error message

  Scenario: Attempt to create an admin registration pre-application without selecting an institution
    And Enter a valid creation reason with text between 40 and 512 characters
    When Click the create button for pre-application form
    Then User should see an error message for institution as "Institution is required."

  Scenario: Attempt to create an admin registration pre-application without providing a creation reason
    When Select an institution from the dropdown menu
    And Click the create button for pre-application form
    Then I should see an error message for reason "This field must be at least 40 characters."

  Scenario: Attempt to create an admin registration pre-application with missing institution and reason
    When Click the create button for pre-application form
    Then User should see an error message for institution as "Institution is required."
    And I should see an error message for reason "This field must be at least 40 characters."

  Scenario: Verify first-time created pre-application status is WAITING
    When Select an institution from the dropdown menu
    And Enter a valid creation reason with text between 40 and 512 characters
    And Click the create button for pre-application form
    Then User should see that the application status is "Waiting"