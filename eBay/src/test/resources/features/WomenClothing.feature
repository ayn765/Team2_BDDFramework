Feature: navigate women clothing
  Background:
    Given user is on fashion page
    When user clicks on Women Clothing
  @Smoke
  Scenario Outline:
    When user selects shop women clothing
    And user clicks dresses
    And user brand able to  pick brand "<Shop by Brand>"
    And user brand able to pick size "<Shop by Size>"
    And user brand able to  pick type "<Shop by Type>"
    Examples:

      |Shop by Brand|Shop by Size |Shop by Type|
      |Zara         |Medium       |Regular     |
      |Kate Spa     |Small        |Petite       |
      |Free People  |XL           |Plus        |
      |Anthropologie|Large        |Long        |


  Scenario Outline:
    When user selects shop women clothing
    And user clicks activewear
    And user should be able to pick "<Shop by Category>"
    And user should be able to pick "<Shop Top Brands>"
    Examples:
      |Shop by Category|Shop Top Brands|
      |Tops            |Lululemon      |
      |Bottoms         |Athleta        |
      |Jackets         |Adidas         |
      |Sports Brands   |Nike           |
      |Hoodies SweatShirts|Rebook      |