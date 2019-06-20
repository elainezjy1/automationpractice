
Feature: Test My Store web site

  Scenario Outline: As a user, he can select category and add product to cart
    Given user navigate to "http://automationpractice.com"
    And user click <category> category
    And user click <subcategory> subcategory
    And user click <dressname> product
    When user click 'Add to cart' button
    Then cart page is displayed
    And verify quantity is <quantity>
    And verify product title is <title>
    And verify price is <price>

    Examples:
      |category| subcategory    | dressname            | quantity | title                | price  |
      |Dresses| Summer Dresses | Printed Chiffon Dress | 1        | Printed Chiffon Dress | $16.40 |


