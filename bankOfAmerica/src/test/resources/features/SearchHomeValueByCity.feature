@SearchByCity
Feature:Feature: User should be able to search home prices
  Background:
    Given User is on BankOfAmerica page
    When  User clicks on HomeLoans
  Scenario Outline:User should be able to search for home prices
  by entering Zip code in search box
    When User clicks on Find Home Links
    And  User clicks on Value tab
    And  User input "<city>" in search box
    And  User clicks on search button
    Then User should see "<city>" in filter tag next to search bar in the new open window
    Examples:
    |city         |
    | Dublin      |
    | Charlotte   |
    | Cleveland   |
    | nashville   |