Feature: User should be able to find the ATM the closest to him.
Given user is at Bank Of  America home page
  Scenario Outline:

    When user click on Find Atm button
    And user inputs "<ZipCode>" in input location box
    And user clicks on Search button
    Then user should get the adress

    Examples:
      | ZipCode|
      | 18074  |
      | 18075  |
      | 18078  |
      | 18077  |
      | 18075  |