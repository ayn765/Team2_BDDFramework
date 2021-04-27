Feature: User should be able to find the ATM near him by inputing the Zipcode.
Given user is in Chase home page.
  Scenario Outline:

    When user click on button HomeLoans
    And user click on Home loans button
    And user inputs "<ZipCode>" in input location in the search zipCodeBox
    And user clicks on Search button
    Then user should get the all the adress of ATM nearBy.

    Examples:
      | ZipCode|
      | 18074  |
      | 18075  |
      | 18078  |
      | 18077  |
      | 18075  |