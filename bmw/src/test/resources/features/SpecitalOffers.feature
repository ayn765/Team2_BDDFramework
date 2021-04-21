Feature: user should be able to look up special offers based on local zipcode

Background:
  Given user is on BMW Financial Services Page

  Scenario Outline:
    When user clicks Special Offers button under Leasing Section
    And user enters "<zipcode>" into the input field
    Then user is able to view current offers in specified zipcode location

    Examples:
      | zipcode |
      | 20165   |
      | 90245   |

  Scenario Outline:
    When user clicks Special Offers button under Leasing Section
    And user enters "<zipcode>" into the input field
    And user selects type of the vehicle from the dropdown
    And user selects body style from the dropdown
    And user selects model year from the dropdown
    And user selects fuel type from the dropdown
    Then search result populates correct vehicle

    Examples:
    | zipcode |
    | 20165   |
    | 90245   |
#    | 21208   |


