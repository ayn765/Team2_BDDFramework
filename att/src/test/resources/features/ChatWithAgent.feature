@chat
Feature: User should be able to chat with an Att Agent
  Background:
    Given User is on ATT website
    When  User clicks on Internet
    Scenario:
      When User clicks on chat icon
      And  User input a question in input box
      And  User clicks on send Chat
      Then User receive an answer from agent