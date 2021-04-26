@Appointment
Feature: User should be able to access a video that explain the steps to schedule an appointment
  Background:
    Given User is on BankOfAmerica page
    When  User clicks on HomeLoans
    Scenario:
      When User clicks on Schedule appointment link
      And  User clicks on Learn more about scheduling link
      And  User switch to a new tab
      And  User clicks on continue button on the tab
      Then User can access and watch steps to schedule video

