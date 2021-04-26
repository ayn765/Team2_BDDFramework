@search
Feature: User should be able to search for any Internet related question
  Background:
    Given User is on ATT website
    When  User clicks on Internet
    Scenario Outline: User should search for Internet deals packages,etc in search bar
      And  User input "<search>" in Search bar
      And  User clicks on search icon
      And  user clicks on Learn More
      Then User should navigate to "<pageTitle>" page
      Examples:
        | search         | pageTitle                                          |
        |Internet plans  |  Our best internet for our lowest price ever       |
        |Internet deals  |  Amazing savings and the AT&T network. What a deal!|