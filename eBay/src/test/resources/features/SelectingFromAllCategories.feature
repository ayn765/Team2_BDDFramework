Feature: choose from all categories drop down

  Background:
    Given user is on fashion Page page
    When user clicks on all categories drop down


  Scenario Outline:
    When user select by "<option>"  from all categories dropdown
    Then user can view current offers

 Examples:
    |option  |
    |Crafts  |
    |Antiques|
    |Art     |
    |Baby    |
    |Books   |




























#  Scenario:
#    When user selects
#    And user selects home equity from home ownership dropdown
#    And user clicks on mortgage basics tab
#    Then user is navigated to mortgage options and tips page
#
#  Scenario:
#    When user hovers over auto tab
#    And user selects buying car from auto dropdown
#    And user clicks on auto loan tips
#    Then user is navigated to auto loan tips page