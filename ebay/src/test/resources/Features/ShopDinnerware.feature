@shopDinnerware
Feature: User should be able to shop for dinnerware in home&garden page
  Background:
    Given User is on Ebay website
    When  User clicks on Home&Garden page
    Scenario Outline:
      When user clicks on dinnerware
      And  User select filter from "<sortBy>" drop down
      And  user select "<color>" from all colors
      And  user select "<brand>" from Brand category
      And  User inputs "<minPrice>" in min price  box
      And  user inputs "<maxPrice>" in max price box
      Then user should be navigated to "<pageTitle>" page
      Examples:
      |sortBy        |color | brand       | minPrice | maxPrice | pageTitle                                                               |
      |best match    |black |lux          |  45      |  100     |Lux Black Dinnerware & Serving Dishes between $45.00 and $100.00         |
      |ending soon   |gray  |222 Fifth    |  100     |  150     |222 Fifth Gray Dinnerware & Serving Dishes between $100.00 and $150.00   |
      |nearest first |brown |Better Homes |  75      |  120     |Better Homes Brown Dinnerware & Serving Dishes between $75.00 and $120.00|
      |newly listed  |white |Nordic Ware  |  35      |  50      |Nordic Ware White Dinnerware & Serving Dishes between $35.00 and $50.00  |


