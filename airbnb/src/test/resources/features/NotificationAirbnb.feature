@Notification
Feature: user should be able to receive notification email from Airbnb
  Background:
    Given User is on Airbnb home page
    When  user clicks on become a host button
    Scenario Outline:
      When user input "<email>" in email box
      And  user input "<phoneNumber>" in phone box
      And  user clicks on check box
      And  user clicks on continue button
      Then a Thank you message displays

      Examples:
      |   email           |phoneNumber  |
      |lamiab20@gmail.com |614778987    |
      |az2019@gmail.com   |2045585827   |
      |Anrayan@gmail.com  |5182094756   |
