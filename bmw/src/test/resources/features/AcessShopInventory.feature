  Feature: Access inventory from models page
  Background:
    Given user is on models page

  Scenario Outline:
    When user clicks on all models tab
    And user chooses model x3
    And user can click on shp by inventory tab
    And user is navigated to inventory page to enter "<zipcode>"
    And user clicks on shop now button
    Then user is navigated to search offers available in the chosen area

    Examples:
    |zipcode|
    |19525  |
    |19145  |
    |19010  |
    |15568  |
    |19584  |
    Scenario:
      When user clicks on shop by inventory tab on the left upper corner of the models page
      Then user is navigated to offers available in his area by default


