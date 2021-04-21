Feature: user should be able to access and read accurate content on Financial Page

  Background:
    Given user is on BMW Financial Services Page

  @Smoke
  Scenario:
    When user hovers over a question mark
    Then help box content should be displayed

  Scenario:
    When user hovers over a question mark
    Then content of the help box should be accurate

