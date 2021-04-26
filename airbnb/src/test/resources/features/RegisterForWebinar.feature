@RegisterForWebinar
Feature: User should be able to navigate to Webinar page and Register for a session with  host
  Background:
    Given User is on airbnb website
    When  user clicks on become a host button
  Scenario:
    When User clicks on the link Learn From A Real Host
    And  User switch to a new window
    And  User Select a Date
    And  User switch to a new tab
    And  User clicks on Claim Seat
    Then user should see message Changed your mind? Release your seat