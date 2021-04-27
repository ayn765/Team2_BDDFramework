
Feature: navigate to Depth tabs on college page

  Background:
    Given user is on college page
    When user clicks on search Tab

  Scenario:

    When user input  bill pay in search bar
    And user click on search button
    Then user is able to access payment options

  Scenario:
    When user input  open an account in search bar
    And user clicks on search button
    Then user is able to access process of opening an account

  Scenario:

   When user selects routing number from search bar drop down
    Then user is able to access routing number field

  Scenario:
    When user clicks on search Tab
    And user selects billing dispute from search bar drop down
    Then user is able to access billing dispute field

  Scenario:
    When user clicks on search Tab
    And user selects erica from search bar drop down
    Then user is able to access erica field
