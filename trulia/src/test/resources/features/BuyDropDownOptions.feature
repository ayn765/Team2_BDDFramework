Feature: User can hover over Buy tab and select option from multiple options in dropDown
  Background:
    Given user is on Trulia website
    When  user mouse hover Buy

  Scenario:
    When user clicks on Open house link
    Then user should navigate to open houses page

  Scenario:
    When user clicks on New listings house
    Then user navigate to all the newest houses on the market

    Scenario Outline:
      When user clicks on homes for sale
      And  user can clicks on Agents Listings
      And  user clicks on Price
      And  user select "<minPrice"> in min price drop down
      And  user select "<maxPrice"> in max price drop down
      And  user select "<homeType>" in All home type dropdown
      Then user should see Homes for sale available
      Examples:
        | minPrice" | maxPrice" | homeType |
        | 130       |  180      | condo    |
        | 180       |  250      | house    |
        | 150       |  300      | townHouse|

