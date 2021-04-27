@SendKeys_CarsRental


Feature: User should be able to navigate to cars Page

Given user is at Expidia home page
  Scenario Outline:

    When user click on Cras Button
    And User input  "<pickUpLocation>" in the search box pick up
    And user inputs "<DropOffLocation>" in input box Same as pick Up
    And user select "<dateForPickUp>" in the DropDown Calender Pick up
    And  user select"<dateForDropOff>" in the DropDown Calender Drop off
    And user select "<pickUpTime>" in the DropDown time Pick up
    And  user select "<dropOffTime>" in the DropDown time  drop Off
    And the User cliCk on the button search button
    Then the user navigate to "<pageTitle>"

    Examples:
      |  pickUpLocation   | DropOffLocation  |dateForPickUp     | dateForDropOff      |  pickUpTime     |  dropOffTime        |pageTitle |
      |  king Of prussia  | king Of prussia  |     May 11       | May 14              |    7:45 am      |        7:45 am      |          |
      |  Lansdale         |    Lansdale      |     May 11       |  May 14             |    7:45 am      |        7:45 am      |          |
      |  perkiomenville   | perkiomenville   |     May 11       |  May 14             |    7:45 am      |        7:45 am      |          |
      |  vilooo           | perkiomenville   |     May 11       |  May 14             |    7:45 am      |        7:45 am      |          |
      |  hauteville       | perkiomenville   |     May 11       |  May 14             |    7:45 am      |        7:45 am      |          |