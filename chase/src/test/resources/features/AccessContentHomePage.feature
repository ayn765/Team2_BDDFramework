@ContentHomePage
Feature: User should access and read content on Chase Home Page
  Background:
    Given User is on Chase website
    Scenario:
      When User hover over open an account
      Then User should access all the links
    Scenario:
      When User hover over open an account
      And  User clicks on see all
      Then User navigate to a new page that has all the links and details
    Scenario:
      When User clicks on Language tab English
      And  User clicks on tab Espanol
      Then User should see all the page in Spanish
    Scenario:
      When User clicks on Linkedin Icon
      And  User clicks on Proceed button
      And  User switch to a new window
      Then User should navigate to LinkedIn website
