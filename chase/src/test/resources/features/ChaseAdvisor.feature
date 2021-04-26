@ChaseAdvisor
Feature: user should be able to search for a home lending advisor in his area
  Background:
    Given User is on Chase website
    Scenario Outline:
      When User clicks on ATM&Branch
      And  User clicks on Find advisor link
      And  User input "<advisorName>" in search bar
      And  User clicks on search
      Then User will have the list of  all the advisors
      Examples:
        | advisorName   |
        |John P. Grosso |
        |Simon Johnson  |
        |Kelly W. Hering|
