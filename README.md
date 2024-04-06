# AYS | Afet Yönetim Sistemi UI Test Automation [![Application Status](https://github.com/afet-yonetim-sistemi/ays-fe-ui-automation/actions/workflows/application-health-checker.yml/badge.svg)](https://github.com/afet-yonetim-sistemi/ays-fe-ui-automation/actions/workflows/application-health-checker.yml)

This repository contains automated UI tests using the Selenium-Cucumber-TestNG framework. The tests are organized into packages for ease of use and maintainability.

## Project Structure

![Framework Flowchart](AYS_FLOWCHART.jpg?raw=true)


src: This is the source directory where your test-related code and resources are stored.

test: This directory contains all your test-related code and resources.

java: Java source code directory for test classes and utility classes.

feature: This directory holds your Gherkin feature files, where define test scenarios in a human-readable format.

pages: Page Object classes are stored here. Each class represents a web page and contains methods to interact with the elements on that page.

runners: Test runners are stored here. These classes configure and run Cucumber tests.

step_definitions: Step definition classes are placed here. These classes contain the actual code to implement the steps defined in feature files.

utilities: Utility classes that assist in various testing tasks, such as WebDriver management and configuration reading, are stored here.

xml_files: XML files, if any, used in tests can be placed here.

resources: This directory contains non-Java resources needed for tests, such as TestNG configuration files (testng.xml), test data files (TestData.xlsx), and more.

reports: This directory is used to store test reports generated by testing framework or tools.

drivers: It contains web browser driver executables (e.g., chromedriver, geckodriver) necessary for browser automation.

pom.xml: This is the Maven project configuration file that specifies dependencies and other project settings.

README.md: A documentation file explaining the project and providing usage instructions.


## Contributing

If you'd like to contribute to this project, please follow these guidelines:
1.Clone this repository to your local machine.
git clone https://github.com/afet-yonetim-sistemi/ays-fe-ui-automation.git

2.Create a new branch for your feature or bug fix.

3. Write test scenarios to feature file.

4. Implement your test automation code based on the test scenarios.

5. Test your changes to ensure they work as expected.

6.Make your changes and commit them.

7.Create a pull request, describing your changes and why they should be merged.

## Running Specific Test Suites

You can run specific test suites by modifying the testng.xml file under the runners package. Add or remove <suite> elements to define the suites you want to run.





