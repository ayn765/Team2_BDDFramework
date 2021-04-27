Feature: Expedia HomePage Functionality check

  @SmokeTest
  Scenario: Expedia stay option Functionality check
    Given User is at Expedia home page
    When User clicks on stay Button
    And User selects the location value NewYork
    And User enters value on the going to search box
    Then User clicks on search

  @SmokeTest
  Scenario: Expedia book flight option Functionality check
    Given User is at Expedia home page
    When User clicks on stay Button
    Then User enters value on the going to search box
    And User selects the location value NewYork
    And User enters value on the leaving from search box
    And User clicks on search

  @SmokeTest
  Scenario: Expedia cruise option Functionality check
    Given User is at Expedia home page
    When User clicks on Cruise button
    Then User clicks on Going To box

  @SmokeTest
  Scenario: Expedia more travel option Functionality check
    Given User is at Expedia home page
    When User clicks More Travel
    Then User selects Packages