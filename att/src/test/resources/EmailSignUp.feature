Feature: user should be able to sign up for AT&T emails

  Background:
    Given user is on AT&T wireless page

  Scenario Outline:
    When user enters "<email>" into input field
    And user clicks Sign me up
    Then confirmation message is displayed indicating that user is successfully signed up

    Examples:
      | email                |
      | gary78@someemail.com |
      | bob09@someemail.com  |
      | lori31@someemail.com |
      | jean85@someemail.com |