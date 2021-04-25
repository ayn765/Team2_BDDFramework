Feature: user should be able to view details of accessories on AT&T website and add them to cart

  Background:
    Given user is on AT&T wireless page
    When user clicks shop all accessories
    And user hovers over Wireless Charging Pad and clicks view details


  Scenario: user should be able to select white color of charging pad
    And user chooses white color
    Then white charging pad is displayed

  Scenario: user should be able to select black color of changing pad
    And user chooses black color
    Then black changing pad is displayed

  Scenario: user should be able to view video about charging pad
    And user expands Video&Images dropdown and clicks on the video
    Then the video is playing

  Scenario: user should be able to pause video about charging pad
    And user expands Video&Images dropdown and clicks on the video
    And user pauses the video
    Then the video is paused

  Scenario: user should be able to use slider to skip part of the video
    And user expands Video&Images dropdown and clicks on the video
    And user moves slider to skip a part of the video
    Then a part of the video is skipped



