Feature: user should be able use AT&T features to sign up for emails or log in to account

  Background:
    Given user is on AT&T wireless page

  Scenario Outline:
    When user enters "<email>" into input field
    And user clicks Sign me up
    Then confirmation message is displayed indicating that user is successfully signed up

    Examples:
      | email                |
      | gary78@someemail.com |
      | bob09@someemail.com  |
      | lori31@someemail.com |
      | jean85@someemail.com |

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