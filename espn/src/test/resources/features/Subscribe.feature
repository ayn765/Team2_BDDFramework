@Subscribe
Feature: User should be able to subscribe to espn news
  Background:
    Given User is on Espn website
    Scenario Outline:
      When user clicks on subscribe now
      And  user input "<firstName>" in first name box
      And  User input "<lastName>" in last name box
      And  user input "<email>" in email box
      And  user input "<password>" in password box
      And  user clicks on show password check box
      And  user clicks on ESPN, ESPN+ and The Walt Disney Family of Companies
      And  user clicks on sign up
      Then user navigate to payment page
      Examples:
        | firstName | lastName | email                   | password  |
        |lamia      |bedjou    |lamiabedjou20@gmail.com  |Dfv#123    |
        |Neila      |Baileche  |neila@gmail.com          |Asdfe@13   |
        |Amel       |Baileche  |amelb@gmail.com          |outrgy&bn12|
