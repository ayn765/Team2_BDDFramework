Feature: user should be able to look up special offers based on local zipcode

  Background:
    Given user is on BMW Financial Services Page
    When user clicks Special Offers button under Leasing Section

  Scenario Outline:
    And user enters "<zipcode>" into the input field
    Then user is able to view current offers in specified zipcode location

    Examples:
      | zipcode |
      | 20165   |
      | 90245   |
      | 21208   |
      | 75011   |
      | 30003   |


  Scenario Outline:
    And user enters "<zipcode>" into the input field
    And user selects "<type of the vehicle>" from the dropdown
    And user picks "<body style>" from the dropdown
    And user chooses "<model year>" from the dropdown
    And user selects fuel type from the dropdown
    Then search result populates "<correct vehicle>"

    Examples:
      | zipcode |   model year    |      body style        | type of the vehicle   |    correct vehicle   |
      | 20165   | All Model Years | Convertible            |  2 Series             | 2021 230i Convertible|
      | 90245   | 2021            | Sedan                  |  All Vehicles         | 2021 330i Sedan      |
      | 21208   | All Model Years | Sports Activity Vehicle|  X1 Series            | 2021 X1 sDrive28i    |
      | 75011   | 2021            | Sports Activity Coupe  |  X4 Series            | 2021 X4 xDrive30i    |
      | 30003   | All Model Years | Roadster               |  Z4                   | 2021 Z4 sDrive30i    |


