@Regression
Feature: Emergency Evacuation Applications Screen UI and Filtering Functionality

  Background:
    Given Open the institution login page
    When Enter super admin email address and password
    And Click on the Login button
    And Click on the Emergency Evacuation Applications button from left  navigation bar

  @Smoke
  Scenario: Language verification for all supported languages on the Emergency Evacuation Applications page
    Then User should be able to see all texts on emergency evacuation application page compatible with the language

  @Smoke
  Scenario: Language verification for all supported languages in the Application Status dropdown on the Emergency Evacuation Applications page
    When User opens the Application Status dropdown
    Then User should see all application status options compatible with the selected language