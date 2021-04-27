Feature: User should be able to get all the information about the crdit card
  Background:
Given user is at Bank Of  America home page
When user click on Credit Card button
  Scenario:

    And user click point Reward card button
    Then user should get the option to get the point

  Scenario:
    And user click  student card
    Then user get all credit card option for students

  Scenario:
    And user click lower Interest card
    Then user get all the option of the lower interest card