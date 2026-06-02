Feature: Search and Add to Cart on Amazon
@tc01
Scenario: Search for a product, add it to the cart, and  the same product is added again\

    Given user open Amazon website
    When user search for a product "<productName>"
    And user opens first non-sponsored product
    Then user validate product title and price are visible
    When user clicks on Add to Cart
    Then user should see Added to Cart message
    When user add same product again
    And user open cart page
    Then user validate quantity is 2 and subtotal should be correct

 Examples:
|productName|
|wireless mouse|