Feature: user should be able to view the accurate content of the homepage and use its functionality


  Scenario: user should be able to view the video on homepage

    Given user clicks the play to view the video
    Then video is playing

  Scenario: user should be able to pause video

    Given user clicks the play to view the video
    Then video is paused

  Scenario Outline: user should be able to sign up for emails

    Given user clicks on account button and register
    When user enters "<email address>" into email address field
    And user enters "<first name>" into first name field
    And user enters "<last name>" into last name field
    And user enters "<password>" into password field
    And user check terms checkbox and clicks Create Account
    Then users "<email address>" is displayed in the body of the confirmation message

    Examples:
      | email address        | first name | last name | password   |
      | stan@someemail.com   | stan       | green     | fjkeD!@123 |
      | robbie@someemail.com | robbie     | gray      | pov&^34jMd |
      | katrin@someemail.com | katrin     | purple    | vmd9&Hmd9* |
      | tom@someemail.com    | tom        | yellow    | zxf12@#Bsi |
      | maya@someemail.com   | maya       | red       | oi*Yre4@fl |


  Scenario: user should be able to click links in Shopping Tools Section and navigate to correct pages

    Then user clicks each links in Shopping Tools Section and lands on the correct page for each link
  @Smoke
  Scenario: titles of the articles in Spotlight Section should be displayed correctly

    Then titles of the articles in Spotlight Section are displayed correctly

  @Smoke
  Scenario: text of the articles in Spotlight Section should be displayed correctly

    Then text of the articles in Spotlight Section are displayed correctly
