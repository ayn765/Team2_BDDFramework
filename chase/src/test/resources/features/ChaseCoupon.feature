@ChaseCoupon
Feature: User should receive a $225 coupon by becoming a Chase customer
  Background:
    Given User is on Chase website
   Scenario Outline:
      When User clicks on Open an account
      And  User input "<email address>" in email box
      And  User clicks on email account
      Then User should see a text to verify his email
      And  User clicks on close button
      And  User navigate back t the home page
     Examples:
       | email address           |
       |lamiabedjou2017@gmail.com|
       |nightwalkers@gmail,com   |
       |algeria061990@gmail.com  |
       |tamouri23@gmail.com      |
