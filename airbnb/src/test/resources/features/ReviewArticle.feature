@ReviewArticle
Feature: User should be able to click on the link,open new window,read article and give Thumb up
  Background:Navigate to become host page
     Given User is on airbnb website
     When  user clicks on become a host button
  Scenario:
    When User clicks on the link "How we support host"
    And  User switch to a new window
    Then User clicks on Thumb up Icon