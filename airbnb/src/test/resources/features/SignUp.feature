@SignUp
Feature:user should be able to sign up for airbnb website
  Background:
    Given User is on airbnb website
    When  user clicks on become a host button
Scenario Outline:
  When user clicks on Get Started button
  And  user input "<phoneNumber>" in phone number box
  And  user input "<country>" in country dropDown
  Examples:
    | country       | phoneNumber   |
    | Algeria       | +21366789654  |
    | Belgium       | +32812347765  |
    | France        | +33787654305  |