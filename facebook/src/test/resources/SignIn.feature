Feature: Login to facebook
  Keywords Summary : This test will verify login related scenarios to FACEBOOK.COM
  Scenario Outline: Login with valid credentials
    Given User navigates to FACEBOOK.COM
    When user enters email as "<email>" and Password "<password>"
    And user clicks on login button
    Then login should be successful

    Examples:

    |         email         |   password   |
    |cutychicka80@yahoo.com | abcd1234!    |


  Scenario Outline: Login with invalid credentials
    Given User navigates to FACEBOOK.COM
    When user enters Username as "<email2>" and Password "<password2>"
    And user clicks on login button
    Then login should not be successful


    Examples:
    |email2| password2|
    |hfdda | djfakja1 |
    |fajjf | ajsdhfkn |



