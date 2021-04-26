@SearchNewConstruction
Feature: User can search a new construction houses in a selected area
  Background:
    Given User is on BankOfAmerica page
    When  User clicks on HomeLoans
    Scenario:
      When User clicks on Find Home Links
      And  User clicks on New Construction
      And  User switch to a new window
      And  user clicks on Ohio
      And  User clicks Columbus
      And  User select to filter houses by price
      Then User can find how many new construction Houses