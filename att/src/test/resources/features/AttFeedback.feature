@Feedback
Feature: User can provide his feedback on Att Services
  Background:
    Given User is on ATT website
    When  User clicks on Internet
    Scenario:
      When User clicks on Feedback Button
      And  User switch to a new tab
      And  User clicks on rate experience
      And  User select Topic to rate
      And  User clicks on submit FeedBack
      Then User close the tab
