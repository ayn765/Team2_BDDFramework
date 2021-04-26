@SearchByValue
Feature:Feature: User should be able to search home prices
  Background:
    Given User is on BankOfAmerica page
    When  User clicks on HomeLoans
    Scenario Outline:User should be able to search for home prices
    by entering home address in search bar
      When User clicks on Find Home Links
      And  User clicks on Value tab
      And  User input "<address>" in search box
      And  User clicks on search button
      And  User switch to a new window
      Then user should see "<address>" to the left of the house picture
      Examples:
        | address                              |
        | 2480 Sanford Dr, Columbus, OH        |
        | 1104 E Miller St, Jefferson City, MO |
        | 2719 Hilliard Dr, Charlotte, NC      |


