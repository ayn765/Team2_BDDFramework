Feature: user should be able to access and read accurate content on Financial Page

  Background:
    Given user is on BMW Financial Services Page

  Scenario:
    When user hovers over a question mark
    Then help box content should be displayed

  Scenario:
    When user hovers over a question mark
    Then content of the help box should be accurate

  Scenario:
    Then titles of Frequently Asked Questions should be displayed correctly

  Scenario:
    When user clicks on plus symbol for each topic in Frequently Asked Questions Section
    Then the answer expands so that the user can read it

  Scenario:
    When user clicks on plus symbol for each topic in Frequently Asked Questions Section to view the answers
    Then content of answers to the Frequently Asked Questions should be accurate



