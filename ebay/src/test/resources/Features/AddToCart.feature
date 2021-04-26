@AddToCart
Feature: User should be able to shop for products and add them to the cart
  Background:
    Given User is on Ebay website
    When  User clicks on Home&Garden page
    Scenario:
      When user clicks on Smart Home
      And  User clicks on Smart tv's
      And  User clicks on the arrow button till the end to see all the Tv brands
      And  User select a Sony Brand
      And  User select Sony Tv
      And  User clicks on add to cart
      And  User switch to a new tab
      And  user clicks No thanks to decline protection plan
      And  user clicks save for Later
      Then user should navigate to sign in page