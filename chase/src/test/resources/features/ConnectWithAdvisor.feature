Feature: User should be able to connect with advisor
  Background:
    Given User is on Chase website
    Scenario Outline:
      When User clicks on ATM&Branch
      And  User clicks on Connect with Advisor link
      And  User input "<firstName>" in search box
      And  User input "<lastName>" in search box
      And  User input "<email>" in search box
      And  User input "<phoneNumber>" in search box
      And  User input "<zipCode>" in search box
      And  User clicks on amount drop down
      And  User clicks range in Amount range drop down
      And  User clicks on next button
      Then User should navigate to all done window
      Examples:
        | firstName | lastName | email              | phoneNumber| zipCode |
        |lamia      | bedjou   |lamia@gmail.com     | 6145585827 | 43220   |
        |nori       | aslan    |asno@gmail.com      | 6145678903 | 45367   |
        |lucy       | abel     |abel657@gmail.com   | 5678943213 | 45678   |
        |liliane    | betu     |kili87@gmail.c0m    | 6142345678 | 43223   |



