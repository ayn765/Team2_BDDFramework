Feature: user should be able to search for homes using search bar

  Background:

    Given user is on find home page



  Scenario Outline:

   When user types in town "<Town>"
    And  user types in state "<State>"
    And  user clicks on search button
    Then user is navigated to homes search result

    Examples:
    |Town          |State |
    |Gilbertsville |PA    |
    |Philadelphia  |PA    |
    |Richmond      |VA    |
    |Syracuse      |NY    |
    |Austin        |TX    |

  Scenario Outline:
    When  user types in zipcode "<zipcode>" bar
    And  user clicks on search button
    Then user is navigated to search homes result page
    Examples:
    |zipcode|
    |19525  |
    |19145  |
    |15246  |
    |12568  |
    |16584  |


