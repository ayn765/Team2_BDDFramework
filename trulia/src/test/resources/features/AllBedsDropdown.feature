Feature: user should be able to choose the number of bedrooms

  Background:

    Given user is on find home page
    @Smoke
    Scenario Outline:
      When user clicks on all beds dropdown
      And user selects the number of bedrooms "<Bedrooms>" in the house
      Then user is lands in  search homes result page

      Examples:
      |Bedrooms|
      |Studio+ |
      |1+      |
      |2+      |
      |3+      |
      |4+      |


