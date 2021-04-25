Feature: user should be able to see the content of the help page and use its functionality

  Background:
    Given user is on Redfin Help Page

  Scenario Outline: user should br able to send a request in a search bar and retrieve accurate results
    When user types in "<search request>" and press Enter
    Then user receives accurate search result that correspond to "<search request>"

    Examples:
      | search request          |
      | unsubscribe form emails |
      | buying FQA              |
      | selling FQA             |
      | mortgage rates          |
      | find agent              |


  Scenario Outline: user should be able to send a request in a search  and select a prompt
    When user types in "<search request>" and selects on of the populated prompts
    Then user receives accurate search result that correspond to "<search request>"
    Examples:
      | search request          |
      | unsubscribe form emails |
      | buying FQA              |
      | selling FQA             |
      | mortgage rates          |
      | find agent              |


  Scenario: user should be able to navigate to each menu option on Help Page and land on accurate page
    Then user clicks on each link and navigates to accurate page

  Scenario Outline: user should be able to use Submit A Request functionality
    When user clicks on Submit A Request button
    And user chooses topic of request from dropdown menu
    And user enters "<email address>" into Your Email Address input field
    And user enters "<subject>" into Subject field
    And user enters "<description>" into Description field
    And user add an attachment
    And user submits the request
    Then correct request confirmation is displayed

    Examples:
      | email address        | subject        | description        |
      | bob123@someemail.com | Test 1 Subject | Test 1 Description |
      | ostin8@someemail.com | Test 2 Subject | Test 2 Description |
      | sasha7@someemail.com | Test 3 Subject | Test 3 Description |
      | robby3@someemail.com | Test 4 Subject | Test 4 Description |
      | tom315@someemail.com | Test 5 Subject | Test 5 Description |


