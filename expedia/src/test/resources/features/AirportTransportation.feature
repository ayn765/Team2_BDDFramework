Feature: User should be able to navigate to AirportTransportation

Given user is at Expidia home page
  Scenario Outline:

    When user click on Cras Button
    And click on button Airport Transportation
    And User input  "<airportName>" in the Airport search box
    And user inputs "<hotel>" in input hotel box
    And  user select"<date>" in the DropDown Calender
    And the User cliCk on the button search in the airport transportation  page
    Then the user navigate to "<pageTitle>"in the airport transportation  page

    Examples:
      |  airportName      |  hotel                         |date               | pageTitle |
      |  jfk              | Deedee's Sky Rise Apartments    |     "3-12-2021"  |           |
      |  newWark          |    Nannas Piano                 |     "4-15-2021"  |           |
      |  jfk              | NY Moore Hostel                 |     "7-2-2021"   |           |
      |  jfk              |   Nannas Piano                  |     "4-1-2021"   |           |
      |  jfk              | Deedee's Sky Rise Apartments   |     "a2-12-2021" |           |