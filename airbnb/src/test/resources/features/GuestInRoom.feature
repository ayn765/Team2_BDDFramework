@GuestInRoom
Feature: User should be able to select Room type and How many guests he wants in the room,and also the location
  by selecting all the options ,user will see how much he will earn in a month
  Background:
    Given User is on airbnb website
    When  user clicks on become a host button
    Scenario:
      When User select Room Type
      And  User select how many Guests in the room
      And  User select the location
      Then User will see how much he will earn in a month