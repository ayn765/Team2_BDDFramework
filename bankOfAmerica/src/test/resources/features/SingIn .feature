Feature: User should be able to sing in
Given user is at Bank Of  America home page
  Scenario Outline:

    When user click on input bar
    And user inputs "<email>" in input box Online ID
    And user inputs "<passcode>" in input box PassCode
    And user clicks on Sing in button
    Then user should have an error message

    Examples:
      | email             | passcode  |
      | neila@gmail.com   | 12uji     |
      | mouloud@gmail.com | 123edgt   |
      | massyl@gmail.com  | 23456gffs |
      | sarah@gmail.com   | qwer567   |
      | baby@gmail.com    | kjlo098   |