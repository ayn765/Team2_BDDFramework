Feature: user should be able to view details of iPhone 12 and have an option to add a line
  or upgrade account in order to purchase the phone

  Background:
    Given user is on AT&T wireless page

    @Smoke
  Scenario:
    When user clicks on iPhone 12 Max to navigate to details
    When user clicks on radio button to select a color
    When user selects capacity
    When user selects pricing option
    And user clicks continue to proceed to purchase
    Then user is given options to upgrade account or add a line


