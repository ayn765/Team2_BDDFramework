@AccountDropDown
Feature: User should be able to navigate to account drop Down
  Background:
    Given User is on Espn website
    When  user clicks on Account dropdown

  Scenario:
    When User clicks on video settings
    And  user switch to a new tab
    And  user clicks on auto play button
    Then user should navigate to all the videos page


    Scenario Outline:
    When  user click on add favorite
    And   user switch to a new tab
    And   select a "<team>" to follow in the list of Suggested teams
    Then  user should see the followed teams on Favorites on the right of the page
      Examples:
        | team             |
        |Los Angles Lakers |
        |Dallas Cowboys    |
        |Barcelona         |


    Scenario Outline:
      When user clicks on Tv provider
      And  user switch to a new window
      And  user select "<tvProvider>" from the list of providers
      Then user should navigate to "<pageTitle>" page
      Examples:
        | tvProvider | pageTitle               |
        | AT&T       |  https://www.att.com/   |
        | Dish       |  https://www.dish.com/  |
        | Hulu       |  https://www.hulu.com/  |



