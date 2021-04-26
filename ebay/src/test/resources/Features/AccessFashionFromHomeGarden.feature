@WomenClothing
Feature:User should access fashion link from home and Garden page
  Background:
    Given User is on Ebay website
    When  User clicks on Home&Garden page
    Scenario:
      When User clicks on shopByCategory drop down
      And  User mouse hover fashion
      And  User  clicks on women
      Then User should navigate to women fashion page