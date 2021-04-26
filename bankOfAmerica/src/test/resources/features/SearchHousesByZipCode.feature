@SearchByZipCode
Feature:Feature: User should be able to search home prices
  Background:
    Given User is on BankOfAmerica page
    When  User clicks on HomeLoans
  Scenario Outline:User should be able to search for home prices
     by entering Zip code in search box
    When User clicks on Find Home Links
    And  User clicks on Value tab
    And  User input "<zipCode>" in search box
    And  User clicks on search button
    Then User should see "<zipCode>" in filter tag next to search bar in the new open window
    Examples:
      | zipCode |
      |43230    |
      |43206    |
      |43204    |