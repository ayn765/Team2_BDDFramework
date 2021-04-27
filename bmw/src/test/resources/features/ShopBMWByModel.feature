Feature: Select BMW model
  Background:
    Given user is on models page

  Scenario Outline:
    When user clicks on sedan tab
    And user selects sedan model "<model>"
    Then user is navigated to search result page

    Examples:
    |model   |
    |X1      |
    |X2      |
    |X3      |
    |X4      |
    |i3      |
    |Z4      |
    |M Models|