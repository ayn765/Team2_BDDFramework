@ShopPhone
Feature: User should be able to shop for a phone online and Pick it up int a selected store
Background:
  Given User is on ATT website
  When  User clicks on Internet
  Scenario:
    When User clicks on Favorite Icon
    And  User clicks on Start Shopping
    And  User select a Phone
    And  User select color for the phone
    And  User select capacity for the phone
    And  User clicks on availability in store
    And  User switch to a new tab
    Then user select a store