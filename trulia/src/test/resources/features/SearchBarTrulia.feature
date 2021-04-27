Feature: User should be able to Search a home for rent, buy or sel by inputing  adress in Seach Box
Background:
  Given user is at trulia home page

  Scenario Outline:

   When user clair the search keys in side the search bar
    And User input  "<city>" in the  search box
    And the User cliCk on the button search.
    Then the user navigate to "<pageTitle>"in this page



    Examples:
      |  city             |  pageTitle |
      |  collegeville     |   Collegeville, PA Homes For Sale & Real Estate         |
      |  perkiomenville   |     Perkiomenville, PA Homes For Sale & Real Estate       |
      |  schwenksville    |    Schwenksville, PA Homes For Sale     |
      |  pottstown        |       Pottstown, PA Homes For Sale & Real Estate   |
      |  lansdale          |       Pottstown, PA Homes For Sale & Real Estate      |



  Scenario Outline:

    When user click on Rent Button above the search bar
    And user clair the search keys in side the search bar
    And User input  "<city>" in the  search box

    And the User cliCk on the button search.
    Then the user navigate to "<pageTitle>"in this page

    Examples:
      |  city             |  pageTitle |
      |  collegeville     |   Collegeville, PA Homes For Rent & Real Estate           |
      |  perkiomenville   | Perkiomenville, PA Homes Fo Rent & Real Estate            |
      |  schwenksville    |  schwenksville   , PA Homes For Rent & Real Estate        |
      |  pottstown        |  Pottstown, PA Homes For Rent & Real Estate               |
      |  lansdale          |  lansdale, PA Homes For Rent & Real Estate               |

  Scenario Outline:

    When user click on sold Button above the search bar
    And user clair the search keys in side the search bar
    And User input  "<city>" in the  search box
    And the User cliCk on the button search.
    Then the user navigate to "<pageTitle>"in this page
    Examples:
      |  city             |  pageTitle |
      |  collegeville     |  Collegeville, PA Homes For Sold & Real Estate          |
      |  perkiomenville   |    Perkiomenville, PA Homes ForSold & Real Estate      |
      |  schwenksville    |       Schwenksville, PA Homes For Sold                  |
      |  pottstown        |      Pottstown, PA Homes For Sold & Real Estate         |
      |  lansdale          |       lansdale, PA Homes For Sold & Real Estate      |
