Feature: User should not be able to sign in to his/her account with invalid credentials

  Background:
    Given user is on AT&T wireless page

  Scenario Outline:

    When user clicks on Account tab
    And user enters "<UserID>"
    And user enters invalid "<Password>"
    And user clicks Sign In
    Then user is not allowed to sign in and the error message is displayed

    Examples:
    | UserID  | Password |
    | snow43  | dfli123& |
    | rein789 | fov875!( |
    | fog07   | xoj*^kj  |
    | mist999 |  fdk%#fp |
