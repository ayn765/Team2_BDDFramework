@smartTv
Feature: User should be able to shop multiple tv's brand in smart home link
  Background:
    Given User is on Ebay website
    When  User clicks on Home&Garden page
    Scenario Outline:
      When user clicks on Smart Home
      And  User clicks on Smart tv's
      And  select the "<tvBrand>" in shop by brand
      Then user should navigate to "<pageTitle>" page
      Examples:
        | tvBrand | pageTitle                         |
        |Samsung  |Samsung TVs with Downloadable Apps |
        |LG       |LG TVs with Downloadable Apps      |
        |Visio    |Visio TVs with Downloadable Apps   |
        |TCL      |TCL TVs with Downloadable Apps     |
        |Sony     |Sony TVs with Downloadable Apps    |
